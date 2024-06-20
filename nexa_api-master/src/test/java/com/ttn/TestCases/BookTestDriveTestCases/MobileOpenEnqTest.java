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
import com.ttn.BusinessLogic.TestDriveBusinessLogic.MobileOpenEnq;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.pojoClasses.MobOpenEnqPojo;

/**
 * @author Akhilesh Kumar
 * @apiNote Test case for MobileOpenEnqTest where input is mobile number and
 *          return sceduled testdrive
 *
 */
public class MobileOpenEnqTest extends BaseLib {

	protected Logger logger = LoggerFactory.getLogger(MobileOpenEnqTest.class);

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "validInput_MobileOpenEnqTest_Positive_Test", dataProviderClass = DataProviderSource.class, enabled = false)
	public void validInput_MobileOpenEnqTest_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);

		MobOpenEnqPojo mobOpenEnqPojo = new MobOpenEnqPojo(Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, mobOpenEnqPojo);
		String bodyData = sw.toString();

		MobileOpenEnq.validInputMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(MobileOpenEnq.message, "SUCCESS");
		logger.info("Ectual message :" + MobileOpenEnq.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "invalidInput_MobileOpenEnqTest_P_FOR_CD_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void invalidInput_MobileOpenEnqTest_P_FOR_CD_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		MobOpenEnqPojo mobOpenEnqPojo = new MobOpenEnqPojo(Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, mobOpenEnqPojo);
		String bodyData = sw.toString();
		MobileOpenEnq.invalidvalidInputMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected message : Data not found for given Dealer Code and For Code");
		Assert.assertEquals(MobileOpenEnq.message, "Data not found for given Dealer Code and For Code");
		logger.info("Ectual message :" + MobileOpenEnq.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "invalidInput_MobileOpenEnqTest_P_PMC_Negative_Test", dataProviderClass = DataProviderSource.class)

	public void invalidInput_MobileOpenEnqTest_P_PMC_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		MobOpenEnqPojo mobOpenEnqPojo = new MobOpenEnqPojo(Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, mobOpenEnqPojo);
		String bodyData = sw.toString();
		MobileOpenEnq.invalidvalidInputMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected message : Data not found for given Dealer Code and For Code");
		Assert.assertEquals(MobileOpenEnq.message, "Data not found for given Dealer Code and For Code");
		logger.info("Ectual message :" + MobileOpenEnq.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "invalidInput_MobileOpenEnq_P_MOBILE_Blank_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void invalidInput_MobileOpenEnq_P_MOBILE_Blank_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		MobOpenEnqPojo mobOpenEnqPojo = new MobOpenEnqPojo(Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, mobOpenEnqPojo);
		String bodyData = sw.toString();
		MobileOpenEnq.invalidvalidInputMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logger.info("Expected status code 200");
		Assert.assertEquals(MobileOpenEnq.codeInBody, 202);
		logger.info("Expected code in body : 202");
		logger.info("Actual code in body :" + MobileOpenEnq.codeInBody);
		logger.info("Expected message : ORA-24338: statement handle not executed\n");
		Assert.assertEquals(MobileOpenEnq.message, "ORA-24338: statement handle not executed\n");
		logger.info("Ectual message :" + MobileOpenEnq.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "invalidInput_MobileOpenEnq_P_MOBILE_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void invalidInput_MobileOpenEnq_P_MOBILE_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		MobOpenEnqPojo mobOpenEnqPojo = new MobOpenEnqPojo(Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, mobOpenEnqPojo);
		String bodyData = sw.toString();
		MobileOpenEnq.invalidvalidInputMobileNumberMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logger.info("Expected status code 200");
		Assert.assertEquals(MobileOpenEnq.codeInBody, 0);
		logger.info("Expected code in body : 0");
		logger.info("Actual code in body :" + MobileOpenEnq.codeInBody);

		logger.info("Test case executed successfully");

	}

}
