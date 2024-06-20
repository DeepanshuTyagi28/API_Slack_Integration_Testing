/**
 * 
 */
package com.ttn.TestCases.BookTestDriveTestCases;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.TestDriveBusinessLogic.TestDriveMode;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.pojoClasses.TestDriveModePojo;

/**
 * @author Akhilesh Kumar
 *
 */
public class TestDriveModeTest extends BaseLib {

	protected Logger logger = LoggerFactory.getLogger(TestDriveModeTest.class);

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "validInput_TestDriveModeTest_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_TestDriveModeTest_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);

		TestDriveModePojo testDriveModePojo = new TestDriveModePojo(data.get("P_USER_ID"), data.get("P_MSPIN"),
				Integer.parseInt(data.get("P_PMC")), data.get("P_STATUS"), data.get("P_MODEL"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"), data.get("P_TRANSMISSION_TYPE"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, testDriveModePojo);
		String bodyData = sw.toString();
		TestDriveMode.validInputTestDriveMode(bodyData);
		Assert.assertEquals(TestDriveMode.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(TestDriveMode.message, "SUCCESS");
		logger.info("Ectual message :" + TestDriveMode.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "validInput_TestDriveModeTest_P_USER_ID_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_TestDriveModeTest_P_USER_ID_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		TestDriveModePojo testDriveModePojo = new TestDriveModePojo(data.get("P_USER_ID"), data.get("P_MSPIN"),
				Integer.parseInt(data.get("P_PMC")), data.get("P_STATUS"), data.get("P_MODEL"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"), data.get("P_TRANSMISSION_TYPE"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, testDriveModePojo);
		String bodyData = sw.toString();
		TestDriveMode.validInputTestDriveMode(bodyData);
		TestDriveMode.invalidInputTestDriveMode(bodyData);
		Assert.assertEquals(TestDriveMode.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected codeInBody : 0");
		Assert.assertEquals(TestDriveMode.codeInBody, 0);
		logger.info("Ectual message :" + TestDriveMode.codeInBody);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "validInput_TestDriveModeTest_P_MSPIN_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_TestDriveModeTest_P_MSPIN_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		TestDriveModePojo testDriveModePojo = new TestDriveModePojo(data.get("P_USER_ID"), data.get("P_MSPIN"),
				Integer.parseInt(data.get("P_PMC")), data.get("P_STATUS"), data.get("P_MODEL"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"), data.get("P_TRANSMISSION_TYPE"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, testDriveModePojo);
		String bodyData = sw.toString();
		TestDriveMode.validInputTestDriveMode(bodyData);
		TestDriveMode.invalidInputTestDriveMode(bodyData);
		Assert.assertEquals(TestDriveMode.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected codeInBody : 0");
		Assert.assertEquals(TestDriveMode.codeInBody, 0);
		logger.info("Ectual message :" + TestDriveMode.codeInBody);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "validInput_TestDriveModeTest_P_MSPIN_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		TestDriveModePojo testDriveModePojo = new TestDriveModePojo(data.get("P_USER_ID"), data.get("P_MSPIN"),
				Integer.parseInt(data.get("P_PMC")), data.get("P_STATUS"), data.get("P_MODEL"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"), data.get("P_TRANSMISSION_TYPE"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, testDriveModePojo);
		String bodyData = sw.toString();
		TestDriveMode.validInputTestDriveMode(bodyData);
		TestDriveMode.invalidInputTestDriveMode(bodyData);
		Assert.assertEquals(TestDriveMode.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected codeInBody : 0");
		Assert.assertEquals(TestDriveMode.codeInBody, 0);
		logger.info("Ectual message :" + TestDriveMode.codeInBody);

		logger.info("Test case executed successfully");

	}

}
