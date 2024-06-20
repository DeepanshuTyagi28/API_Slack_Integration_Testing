package com.ttn.TestCases.BookTestDriveTestCases;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Hashtable;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.TestDriveBusinessLogic.MobileTestdrive;
import com.ttn.BusinessLogic.TestDriveBusinessLogic.ScheduleTestDrive;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.pojoClasses.MobileTestdrivePojo;

/**
 * @author Akhilesh Kumar
 * @param bodyData
 * @apiNote This method is used to Verify Test_DrivE with mobile data with valid
 *          data
 * 
 */

public class MobileTestdriveTest extends BaseLib {

	private static Logger logger = LoggerFactory.getLogger(MobileTestdriveTest.class);

	/**
	 * 
	 * @param bodyData
	 * @apiNote This method is used to Verify Test_DrivE with mobile data with valid
	 *          data
	 */

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "mobile_Testdrive_Test_Positive_Input_Test", dataProviderClass = DataProviderSource.class)
	public void mobile_Testdrive_Test_Positive_Input_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);

			MobileTestdrivePojo mobileTestdriveOPojo = new MobileTestdrivePojo(data.get("P_PMC"), data.get("P_MOBILE"));
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, mobileTestdriveOPojo);
			String bodyData = sw.toString();
			MobileTestdrive.validInputMobileTestdrive(bodyData);
			Assert.assertEquals(MobileTestdrive.code, 200);
			logger.info("Expected status code 200");
			logger.info("Ectual status code :" + MobileTestdrive.code);
			logger.info("Expected message : SUCCESS");
			Assert.assertEquals(MobileTestdrive.result, "SUCCESS");
			logger.info("Ectual message :" + ScheduleTestDrive.result);
			logger.info("Test case executed successfully");
		}

		catch (Exception e) {

			logger.error("Test Case is failing due To error : " + e);

		}
	}

	/**
	 * 
	 * @param bodyData
	 * @apiNote This method is used to Verify Test_DrivE with mobile data with valid
	 *          data
	 */

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "mobile_Testdrive_Test_Negative_P_PMC_Input_Test", dataProviderClass = DataProviderSource.class)
	public void mobile_Testdrive_Test_Negative_P_PMC_Input_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			MobileTestdrivePojo mobileTestdriveOPojo = new MobileTestdrivePojo(data.get("P_PMC"), data.get("P_MOBILE"));
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, mobileTestdriveOPojo);
			String bodyData = sw.toString();
			MobileTestdrive.validInputMobileTestdrive(bodyData);
			MobileTestdrive.inValidInputMobileTestdrive(bodyData);
			Assert.assertEquals(MobileTestdrive.code, 200);
			logger.info("Expected status code 200");
			logger.info("Ectual status code :" + MobileTestdrive.code);
			logger.info("Expected code in body is : 0");
			Assert.assertEquals(MobileTestdrive.codeInBody, 0);
			logger.info("Ectual code in body is :" + MobileTestdrive.codeInBody);
			logger.info("Test case executed successfully");
		}

		catch (Exception e) {

			logger.error("Test Case is failing due To error : " + e);

		}
	}

	/**
	 * 
	 * @param bodyData
	 * @apiNote This method is used to Verify Test_DrivE with mobile data with valid
	 *          data
	 */

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "mobile_Testdrive_Test_Negative_P_MOBILE_Input_Test", dataProviderClass = DataProviderSource.class)
	public void mobile_Testdrive_Test_Negative_P_MOBILE_Input_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			MobileTestdrivePojo mobileTestdriveOPojo = new MobileTestdrivePojo(data.get("P_PMC"), data.get("P_MOBILE"));
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, mobileTestdriveOPojo);
			String bodyData = sw.toString();
			MobileTestdrive.validInputMobileTestdrive(bodyData);
			MobileTestdrive.inValidInputMobileTestdrive(bodyData);
			Assert.assertEquals(MobileTestdrive.code, 200);
			logger.info("Expected status code 200");
			logger.info("Ectual status code :" + MobileTestdrive.code);
			logger.info("Expected code in body is : 0");
			Assert.assertEquals(MobileTestdrive.codeInBody, 0);
			logger.info("Ectual code in body is :" + MobileTestdrive.codeInBody);
			logger.info("Test case executed successfully");
		}

		catch (Exception e) {

			logger.error("Test Case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "mobile_Testdrive_Test_Negative_Blanck_Input_Test", dataProviderClass = DataProviderSource.class)
	public void mobile_Testdrive_Test_Negative_Blanck_Input_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			MobileTestdrivePojo mobileTestdriveOPojo = new MobileTestdrivePojo(data.get("P_PMC"), data.get("P_MOBILE"));
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, mobileTestdriveOPojo);
			String bodyData = sw.toString();
			MobileTestdrive.validInputMobileTestdrive(bodyData);
			MobileTestdrive.blanckInputMobileTestdrive(bodyData);
			Assert.assertEquals(MobileTestdrive.code, 200);
			logger.info("Expected status code 200");
			logger.info("Ectual status code :" + MobileTestdrive.code);
			logger.info("Expected code in body is : 202");
			Assert.assertEquals(MobileTestdrive.codeInBody, 202);
			logger.info("Ectual code in body is :" + MobileTestdrive.codeInBody);
			Assert.assertEquals(MobileTestdrive.result, "ORA-24338: statement handle not executed\n");
			logger.info("Ectual message :" + ScheduleTestDrive.result);
			logger.info("Test case executed successfully");
		}

		catch (Exception e) {

			logger.error("Test Case is failing due To error : " + e);

		}
	}

}
