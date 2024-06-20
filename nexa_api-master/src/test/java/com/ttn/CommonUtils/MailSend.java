package com.ttn.CommonUtils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import java.util.logging.LogManager;

import org.apache.juneau.internal.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Attachments;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;
import com.ttn.Builder.BaseLib;

/**
 * @author Akhilesh
 * @since 29/04/2023
 * @see BaseLib
 * @implNote For sending the mail with help of sendgrid API
 *
 * 
 */

public class MailSend {
	private static Logger LOGGER = LoggerFactory.getLogger(MailSend.class);

	/**
	 * @author Akhilesh
	 * @since 29/04/2023
	 * @see BaseLib
	 * @implNote Static methos to send mail without attachment
	 * @param recipientEmails , subject ,content
	 * 
	 */
	public static void sendEmail(List<String> recipientEmails, String subject, String content) throws IOException {
		String SENDGRID_API_KEY = PropertyReader.getProperty_for_baseconfig("sendgrid.api.key");
		String senderEmail = PropertyReader.getProperty_for_baseconfig("sender.email");
		Email from = new Email(senderEmail);
		Content emailContent = new Content("text/html", content);
		Mail mail = new Mail();
		mail.setFrom(from);
		mail.setSubject(subject);
		mail.addContent(emailContent);

		for (String recipientEmail : recipientEmails) {
			Personalization personalization = new Personalization();
			personalization.addTo(new Email(recipientEmail.trim()));
			mail.addPersonalization(personalization);
		}

		SendGrid sg = new SendGrid(SENDGRID_API_KEY);
		Request request = new Request();

		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);

			if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				LOGGER.info("Email sent successfully.");
			} else {
				LOGGER.error("Failed to send email. Response: {}", response.getBody());
			}
		} catch (IOException ex) {
			LOGGER.error("Failed to send email. Exception: {}", ex.getMessage());
		}
	}

	/**
	 * @author Akhilesh
	 * @since 29/04/2023
	 * @see BaseLib
	 * @implNote Static methos to send mail with attachment
	 * @param recipientEmails , subject ,content
	 * 
	 */
	public static void sendEmailWithAttachment(List<String> recipientEmails, String subject, String content,
		String attachmentFilePath) throws IOException {
		String SENDGRID_API_KEY = PropertyReader.getProperty_for_baseconfig("sendgrid.api.key");
		String senderEmail = PropertyReader.getProperty_for_baseconfig("sender.email");
		Email from = new Email(senderEmail);
		Content emailContent = new Content("text/html", content);
		Mail mail = new Mail();
		mail.setFrom(from);
		mail.setSubject(subject);
		mail.addContent(emailContent);

		for (String recipientEmail : recipientEmails) {
			Personalization personalization = new Personalization();
			personalization.addTo(new Email(recipientEmail.trim()));
			mail.addPersonalization(personalization);
		}

		/*File attachmentFile = new File(attachmentFilePath);
		Attachments attachments = new Attachments();
		attachments.setFilename(attachmentFile.getName());
		attachments.setType("image/png");
		attachments.setDisposition("attachment");
		attachments.setContentId("screenshot");
		attachments.setContent(Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(attachmentFile)));
		mail.addAttachments(attachments);*/

		SendGrid sg = new SendGrid(SENDGRID_API_KEY);
		Request request = new Request();

		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);

			if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				LOGGER.info("Email sent successfully.");
			} else {
				LOGGER.error("Failed to send email. Response: {}", response.getBody());
			}
		} catch (IOException ex) {
			LOGGER.error("Failed to send email. Exception: {}", ex.getMessage());
		}
	}

	/**
	 * @author Akhilesh
	 * @since 15/06/2023
	 * @see BaseLib
	 * @implNote Static methos to send mail with time date append in Subject to
	 *           avoid same thread
	 * @param recipientEmails , subject ,content
	 * 
	 */

	public static void sendEmailwithTimeAndDateInHeader(List<String> recipientEmails, String subject, String content)
			throws IOException {
		String SENDGRID_API_KEY = PropertyReader.getProperty_for_baseconfig("sendgrid.api.key");
		String senderEmail = PropertyReader.getProperty_for_baseconfig("sender.email");
		Email from = new Email(senderEmail);
		Content emailContent = new Content("text/html", content);
		Mail mail = new Mail();
		mail.setFrom(from);

		// Get current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Format current date and time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = currentDateTime.format(formatter);

		// Append current date and time to the existing subject
		String updatedSubject = subject + " [" + formattedDateTime + "]";
		mail.setSubject(updatedSubject);

		mail.addContent(emailContent);

		for (String recipientEmail : recipientEmails) {
			Personalization personalization = new Personalization();
			personalization.addTo(new Email(recipientEmail.trim()));
			mail.addPersonalization(personalization);
		}

		SendGrid sg = new SendGrid(SENDGRID_API_KEY);
		Request request = new Request();

		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);

			if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				LOGGER.info("Email sent successfully.");
			} else {
				LOGGER.error("Failed to send email. Response: {}", response.getBody());
			}
		} catch (IOException ex) {
			LOGGER.error("Failed to send email. Exception: {}", ex.getMessage());
		}
	}

}
