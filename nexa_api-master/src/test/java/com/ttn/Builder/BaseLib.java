package com.ttn.Builder;

import java.io.IOException;

/**
 * This Java program demonstrates Base Class of PRISM-API.
 *
 * @author TTN
 */

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.logging.Level;

import java.util.logging.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ttn.CommonUtils.ExtentManager;
import com.ttn.CommonUtils.GlobalVariables;
import com.ttn.CommonUtils.PropertyReader;
import com.ttn.CommonUtils.Utility;

public class BaseLib

{
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public ExtentTest test;
	public static String extentpath;
	public static String globalEnvironment;
	public static String testingType;
	private boolean healthCheck = true;
	public static String drpLaunchValue = System.getProperty("rp.description");
	private String isEmailSend = "";

	private static final Logger LOGGER = Logger.getLogger(BaseLib.class.getName());

	final String emailIdToOnlyWithin = PropertyReader.getProperty_for_baseconfig("emailIdToOnlyWithin",
			"/src/test/resources/localRunEmailConfig.properties");

	String jenkinsHome = System.getenv("JENKINS_HOME");

	@Parameters({ "Environment", "SheetName", "EmailSend" })
	@BeforeSuite(groups = { "Sanity", "Regression" })
	public void setAccessToken(String environment, String sheetName, String emailSend) throws IOException {
		globalEnvironment = environment;
		testingType = sheetName;
		isEmailSend = emailSend;

		// Use below code if you want to set access token before any test run, so that
		// same can be used throughout suite
		// Login_AccessTokenGeneration.login();

	}

	@BeforeSuite(groups = { "Sanity", "Regression" })
	public static ExtentReports before() throws MalformedURLException

	{

		String workingDir = System.getProperty("user.dir");
		extentpath = workingDir + "/ExtentReports/" + "ExtentReport.html";
		htmlReporter = new ExtentHtmlReporter(extentpath);

		htmlReporter.config().setDocumentTitle(drpLaunchValue + " Result");
		htmlReporter.config().setReportName(drpLaunchValue + " Result");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().enableTimeline(false);
		htmlReporter.config().setAutoCreateRelativePathMedia(true);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "TTN-PC");
		extent.setSystemInfo("User Name", "TTN_PRISM");
		extent.setAnalysisStrategy(AnalysisStrategy.CLASS);
		return extent;

	}

//	@BeforeClass(groups = {"Sanity", "Regression"}) 
//	public void beforeClass()
//	{
//		healthCheck=Login_AccessTokenGeneration.isHealthy;
//		Assert.assertTrue(healthCheck, "[SYSTEM HEALTH CHECK] : MSIL Dealer CRM API Base URL IS Down.");
//		LOGGER.info( "[SYSTEM HEALTH CHECK] :MSIL Dealer CRM API Base URL IS and Running.");
//	}

	@BeforeMethod(groups = { "Sanity", "Regression" })
	protected void startReporting(Method method) {
		String testName;

		testName = this.getClass().getSimpleName() + " : " + method.getName();
		test = extent.createTest(testName, method.getAnnotation(Test.class).description());
	}

	@AfterMethod(groups = { "Sanity", "Regression" })
	public void reportClosure(ITestResult result) {

		test.log(Status.INFO, "API information:  " + ExtentManager.getApiInfo());
		test.log(Status.INFO, "Test execution started.");

		if (result.getStatus() == ITestResult.FAILURE) {
			GlobalVariables.TEST_RESULT_COUNT.add("fail");
			StackTraceElement[] st = result.getThrowable().getStackTrace();
			String printErrorLog = result.getThrowable().toString();
			for (int i = 0; i < st.length; i++) {
				printErrorLog += st[i];
				printErrorLog += "<br>";
			}
			test.log(Status.FAIL, "Test Case '" + "<font color=\"red\">" + result.getName() + "</font>" + "' got fail"
					+ "<a class='exception' style='display:block; cursor:pointer; user-select:none' onclick='($(\".exception\").click(function(){ $(this).next().toggle()}))'>Double click to see details of failure </a>"

					+ "<pre style='display:none'>" + printErrorLog + "</pre>");

			test.log(Status.FAIL,
					"<a class='exception' style='display:block; cursor:pointer; user-select:none' onclick='($(\".exception\").click(function(){ $(this).next().toggle()}))'>Double click to see respone body </a>"

							+ "<pre style='display:none'>" + ExtentManager.getResponseBody() + "</pre>");
		}

		else if (result.getStatus() == ITestResult.SUCCESS) {
			GlobalVariables.TEST_RESULT_COUNT.add("pass");
			// test.log(Status.PASS, "Name of Passed Test case is: "+ result.getName());
			test.log(Status.PASS, "Test Case '" + "<font color=\"green\">" + result.getName() + "</font>" + "' got pass"
					+ "<a class='exception' style='display:block; cursor:pointer; user-select:none' onclick='($(\".exception\").click(function(){ $(this).next().toggle()}))'>Double click to see respone body </a>"

					+ "<pre style='display:none'>" + ExtentManager.getResponseBody() + "</pre>");

		}

		else if (result.getStatus() == ITestResult.SKIP)

		{
			GlobalVariables.TEST_RESULT_COUNT.add("skip");
			test.log(Status.SKIP, "Name of Skipped Test case is:  " + result.getName());
		}
		test.log(Status.INFO, "Test execution completed.");
	}

	@AfterTest(groups = { "Sanity", "Regression" })

	public void tearDown()

	{
		extent.flush();

	}

	@AfterSuite(groups = { "Sanity", "Regression" })
	public void setPassword() {
		LOGGER.log(Level.INFO, "Tear down---");
		if (jenkinsHome != null) {
			LOGGER.log(Level.INFO, "====Test is Running on Jenkins ");
			if (isEmailSend.equalsIgnoreCase("Yes")) {
				Utility.sendMail();
			}
		} else {

			if (isEmailSend.equalsIgnoreCase("Yes")) {
				LOGGER.log(Level.INFO,
						"====Test is not Running on Jenkins so email will only sent within TTN , Thank You ..! ");
				Utility.sendMail(emailIdToOnlyWithin);

			}

		}

	}
}