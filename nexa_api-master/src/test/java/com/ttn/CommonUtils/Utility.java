package com.ttn.CommonUtils;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.util.logging.Logger;
import java.util.logging.Level;

import com.ttn.Builder.BaseLib;

/**
 * @author Ankit Kumar Pathak , Akhilesh
 *
 */
public class Utility {
	
	private static final Logger LOGGER = Logger.getLogger(BaseLib.class.getName());


	public static void sendMail() {
		final String emailIdFrom = PropertyReader.getProperty_for_baseconfig("emailIdFrom");
		final String passwordFrom = PropertyReader.getProperty_for_baseconfig("passwordFrom");
		String emailIdSentTo = PropertyReader.getProperty_for_baseconfig("emailIdTo");
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);

		String fileZipPath = System.getProperty("user.dir") + "/ExtentReports";
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.ssl.checkserveridentity", true);

		Session session = null;
		try {
			session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(emailIdFrom, passwordFrom);
				}
			});
		} catch (Exception e) {
			// logger.info(e);
		}

		try {
			// String ScreenAttached = "";
			String url = PropertyReader.getProperty_for_baseconfig("testURL");
			String rpLaunchURL = PropertyReader.getProperty_for_baseconfig("rpLaunchURL");
			String env = BaseLib.globalEnvironment;
			String testingType = BaseLib.testingType;

			// ScreenAttached = "[With ScreenShot of " +
			// GetPropertyValues.getGenericProperty("snapshotLevel").toUpperCase()
			// + "Steps].";
			Message message = new MimeMessage(session);

			message.setFrom(new InternetAddress(emailIdFrom));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailIdSentTo));
			message.setSubject(BaseLib.drpLaunchValue + " Automation Report" + " [" + formattedDateTime + "]");

			BodyPart messageBodyPart1 = new MimeBodyPart();
			// Set the body of email
			int pass = 0, warning = 0, skip = 0, fail = 0, error = 0;

			for (String value : GlobalVariables.TEST_RESULT_COUNT) {
				if (value.equalsIgnoreCase("pass"))
					pass++;
				if (value.equalsIgnoreCase("warning"))
					warning++;
				if (value.equalsIgnoreCase("skip"))
					skip++;
				if (value.equalsIgnoreCase("fail"))
					fail++;
				if (value.equalsIgnoreCase("error"))
					error++;
			}
			messageBodyPart1.setContent("" + "<h3>Hi,</h3>\n\n" + "\n\n" + "<h3> " + BaseLib.drpLaunchValue + " " + env
					+ " " + testingType + " Test Automation Execution Report</h3> \r\n" + "\r\n" + "\r\n"
					+ "RP Launch URL - " + rpLaunchURL + "<BR><BR>" + "URL - " + url + "<BR><BR>" + "<!DOCTYPE html>\n"
					+ "<html>\n" + "<head>\n" + "<style>\n" + "table { width:30%;    }\n"
					+ "table, th, td { border: 1px solid black;  border-collapse: collapse;}\n"
					+ "td { padding: 2px;  text-align: left;}" + "th {padding: 2px;  text-align: center;}\n"
					+ "table#t01 tr:nth-child(even) {background-color: #eee;}\n"
					+ "table#t01 tr:nth-child(odd) {background-color: #fff;}\n"
					+ "table#t01 th {background-color: lightblue; color: black;}\n" + "</style>\n" + "</head>\n"
					+ "<body>\n" + "<h3>AUTOMATION EXECUTION</h3>\n" + "<table id=\"t01\">\n" + "  <tr>\n"
					+ "    <th colspan=\"2\">TEST EXECUTION SUMMARY</th>\n" + "   </tr>\n" + "  <tr>\n"
					+ "    <td><style=\"color:black;\">TOTAL TEST-SCRIPTS : </td>\n" + "    <td>"
					+ GlobalVariables.TEST_RESULT_COUNT.size() + "</td>\n" + "   </tr>\n" + "  <tr>\n"
					+ "    <td style=\"color:green;\">PASS :</td>\n" + "    <td style=\"color:green;\">" + pass
					+ "</td>\n" + "  </tr>\n" + "  <tr>\n" + "    <td style=\"color:red;\">FAIL :</td>\n"
					+ "    <td style=\"color:red;\">" + fail + "</td>\n" + "  </tr>\n" + "  \n" + "  <tr>\n"
					+ "    <td style=\"color:orange;\">WARNING : </td>\n" + "    <td style=\"color:orange;\">" + warning
					+ "</td>\n" + "  </tr>\n" + "   <tr>\n" + "    <td style=\"color:gray;\">SKIP : </td>\n"
					+ "    <td style=\"color:gray;\">" + skip + "</td>\n" + "  </tr>\n" + "   <tr>\n"
					+ "    <td style=\"color:Tomato;\">ERROR : </td>\n" + "    <td style=\"color:Tomato;\">" + error
					+ "</td>\n" + "  </tr>\n" + "</table>\n" + "</body>\n" + "</html>\n" + "<BR>"
					// + "Thanks!!",
					+ "<h3>Please refer to the attached report for execution details and Kindly unzip attached file.\r\n"
					+ ".</h3>"
					// + " 1) Do Unzip the attached file"+ "<BR>"
					// + " 2) Here you will find the
					// 'ExtentReport_###-##-####,##_##_##_browserName.html' file."+ "<BR><BR>"+
					// "<BR>"
					+ "<BR>" + "Thanks!!", "text/html");

			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			ZipDir.zip(fileZipPath);
//	        logger.info("== Successfully Zip == " + fileZipPath);
			String filename = fileZipPath + ".zip";

			DataSource source = new FileDataSource(filename);
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName("ExtentReport.zip");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart2);
			multipart.addBodyPart(messageBodyPart1);
			message.setContent(multipart);
			Transport.send(message);
			LOGGER.log(Level.INFO,"== Email Sent Successfully to ==" + emailIdSentTo);

		} catch (MessagingException e1) {
			throw new RuntimeException(e1);
		}
	}

	/**
	 * @author TTN
	 * @implNote In case of local run use thois method
	 *
	 */

	public static void sendMail(String emailIdSentToPresnol) {
		final String emailIdFrom = PropertyReader.getProperty_for_baseconfig("emailIdFrom");
		final String passwordFrom = PropertyReader.getProperty_for_baseconfig("passwordFrom");
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);

		String fileZipPath = System.getProperty("user.dir") + "/ExtentReports";
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.ssl.checkserveridentity", true);

		Session session = null;
		try {
			session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(emailIdFrom, passwordFrom);
				}
			});
		} catch (Exception e) {
			// logger.info(e);
		}

		try {
			// String ScreenAttached = "";
			String url = PropertyReader.getProperty_for_baseconfig("testURL");
			String rpLaunchURL = PropertyReader.getProperty_for_baseconfig("rpLaunchURL");
			String env = BaseLib.globalEnvironment;
			String testingType = BaseLib.testingType;

			// ScreenAttached = "[With ScreenShot of " +
			// GetPropertyValues.getGenericProperty("snapshotLevel").toUpperCase()
			// + "Steps].";
			Message message = new MimeMessage(session);

			message.setFrom(new InternetAddress(emailIdFrom));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailIdSentToPresnol));
			message.setSubject(BaseLib.drpLaunchValue + " Automation Report - Local Run" + " [" + formattedDateTime + "]");

			BodyPart messageBodyPart1 = new MimeBodyPart();
			// Set the body of email
			int pass = 0, warning = 0, skip = 0, fail = 0, error = 0;

			for (String value : GlobalVariables.TEST_RESULT_COUNT) {
				if (value.equalsIgnoreCase("pass"))
					pass++;
				if (value.equalsIgnoreCase("warning"))
					warning++;
				if (value.equalsIgnoreCase("skip"))
					skip++;
				if (value.equalsIgnoreCase("fail"))
					fail++;
				if (value.equalsIgnoreCase("error"))
					error++;
			}
			messageBodyPart1.setContent("" + "<h3>Hi,</h3>\n\n" + "\n\n" + "<h3> " + BaseLib.drpLaunchValue + " " + env
					+ " " + testingType + " Test Automation Execution Report</h3> \r\n" + "\r\n" + "\r\n"
					+ "RP Launch URL - " + rpLaunchURL + "<BR><BR>" + "URL - " + url + "<BR><BR>" + "<!DOCTYPE html>\n"
					+ "<html>\n" + "<head>\n" + "<style>\n" + "table { width:30%;    }\n"
					+ "table, th, td { border: 1px solid black;  border-collapse: collapse;}\n"
					+ "td { padding: 2px;  text-align: left;}" + "th {padding: 2px;  text-align: center;}\n"
					+ "table#t01 tr:nth-child(even) {background-color: #eee;}\n"
					+ "table#t01 tr:nth-child(odd) {background-color: #fff;}\n"
					+ "table#t01 th {background-color: lightblue; color: black;}\n" + "</style>\n" + "</head>\n"
					+ "<body>\n" + "<h3>AUTOMATION EXECUTION</h3>\n" + "<table id=\"t01\">\n" + "  <tr>\n"
					+ "    <th colspan=\"2\">TEST EXECUTION SUMMARY</th>\n" + "   </tr>\n" + "  <tr>\n"
					+ "    <td><style=\"color:black;\">TOTAL TEST-SCRIPTS : </td>\n" + "    <td>"
					+ GlobalVariables.TEST_RESULT_COUNT.size() + "</td>\n" + "   </tr>\n" + "  <tr>\n"
					+ "    <td style=\"color:green;\">PASS :</td>\n" + "    <td style=\"color:green;\">" + pass
					+ "</td>\n" + "  </tr>\n" + "  <tr>\n" + "    <td style=\"color:red;\">FAIL :</td>\n"
					+ "    <td style=\"color:red;\">" + fail + "</td>\n" + "  </tr>\n" + "  \n" + "  <tr>\n"
					+ "    <td style=\"color:orange;\">WARNING : </td>\n" + "    <td style=\"color:orange;\">" + warning
					+ "</td>\n" + "  </tr>\n" + "   <tr>\n" + "    <td style=\"color:gray;\">SKIP : </td>\n"
					+ "    <td style=\"color:gray;\">" + skip + "</td>\n" + "  </tr>\n" + "   <tr>\n"
					+ "    <td style=\"color:Tomato;\">ERROR : </td>\n" + "    <td style=\"color:Tomato;\">" + error
					+ "</td>\n" + "  </tr>\n" + "</table>\n" + "</body>\n" + "</html>\n" + "<BR>"
					// + "Thanks!!",
					+ "<h3>Please refer to the attached report for execution details and Kindly unzip attached file.\r\n"
					+ ".</h3>"
					// + " 1) Do Unzip the attached file"+ "<BR>"
					// + " 2) Here you will find the
					// 'ExtentReport_###-##-####,##_##_##_browserName.html' file."+ "<BR><BR>"+
					// "<BR>"
					+ "<BR>" + "Thanks!!", "text/html");

			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			ZipDir.zip(fileZipPath);
//	        logger.info("== Successfully Zip == " + fileZipPath);
			String filename = fileZipPath + ".zip";

			DataSource source = new FileDataSource(filename);
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName("ExtentReport.zip");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart2);
			multipart.addBodyPart(messageBodyPart1);
			message.setContent(multipart);
			Transport.send(message);
			LOGGER.log(Level.INFO,"== Email Sent Successfully to ==" + emailIdSentToPresnol);

		} catch (MessagingException e1) {
			throw new RuntimeException(e1);
		}
	}

	public static void sendEmailInCaseOfDownBaseURL() {
		String statusMessage = "Base URL is not working.";
		int statusCode = Login_AccessTokenGeneration.statusCode;
		String subject = PropertyReader.getProperty_for_baseconfig("email.subject");
		String content = PropertyReader.getProperty_for_baseconfig("email.content");
		String[] recipientEmails = PropertyReader.getProperty_for_baseconfig("recipient.emails").split(",");
		List<String> recipientEmailsList = Arrays.asList(recipientEmails);
		String URL = PropertyReader.getProperty_for_baseconfig("testURL");
		String emailBody = content + "<br>URL :" + URL + "<br>Response Code : <strong>" + statusCode
				+ "</strong><br>Response Message : <strong>" + statusMessage
				+ "</strong><br><br>Thanks<br>TTN Test Automation Team.";
		try {
			MailSend.sendEmailwithTimeAndDateInHeader(recipientEmailsList, subject, emailBody);
			System.out.println("== Email Sent Successfully...");
		} catch (IOException e) {

		}

	}
}
