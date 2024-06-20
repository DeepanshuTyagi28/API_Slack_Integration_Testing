/**
 * 
 */
package com.ttn.TestCases.BookTestDriveTestCases;

import java.io.IOException;
import java.io.StringWriter;
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
import com.ttn.BusinessLogic.GetTestDriveSlot;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.pojoClasses.GetTestDriveSlotPojo;

/**
 * @author Akhilesh Kumar
 *
 */
public class GetTestDriveSlotTest extends BaseLib {
	protected Logger logger = LoggerFactory.getLogger(GetTestDriveSlotTest.class);

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "validInput_With_PVinNum_GetTestDriveSlot_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_With_PVinNum_GetTestDriveSlot_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetTestDriveSlotTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		GetTestDriveSlotPojo getTestDriveSlotPojo = new GetTestDriveSlotPojo(data.get("P_MSPIN"),Integer.parseInt(data.get("P_PMC")),data.get("P_VIN_NUM"),data.get("P_FROM_DATE"),data.get("P_TO_DATE"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, getTestDriveSlotPojo);
        String bodyData=sw.toString();
		
		GetTestDriveSlot.validInputWithPVinNumGetTestDriveSlot(bodyData);
		Assert.assertEquals(GetTestDriveSlot.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + GetTestDriveSlot.code);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.VIN_NUM);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.SLOT_ID);
		Assert.assertEquals(GetTestDriveSlot.VIN_NUM, data.get("P_VIN_NUM"));
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(GetTestDriveSlot.message, "SUCCESS");
		logger.info("Ectual message :" + GetTestDriveSlot.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "validInput_Without_PVinNum_GetTestDriveSlot_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_Without_PVinNum_GetTestDriveSlot_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetTestDriveSlotTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		GetTestDriveSlotPojo getTestDriveSlotPojo = new GetTestDriveSlotPojo(data.get("P_MSPIN"),Integer.parseInt(data.get("P_PMC")),data.get("P_VIN_NUM"),data.get("P_FROM_DATE"),data.get("P_TO_DATE"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, getTestDriveSlotPojo);
        String bodyData=sw.toString();
		GetTestDriveSlot.validInputWithPVinNumGetTestDriveSlot(bodyData);
		Assert.assertEquals(GetTestDriveSlot.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + GetTestDriveSlot.code);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.VIN_NUM);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.SLOT_ID);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(GetTestDriveSlot.message, "SUCCESS");
		logger.info("Ectual message :" + GetTestDriveSlot.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "validInput_Wit_P_MSPIN_GetTestDriveSlot_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_Wit_P_MSPIN_GetTestDriveSlot_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetTestDriveSlotTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		GetTestDriveSlotPojo getTestDriveSlotPojo = new GetTestDriveSlotPojo(data.get("P_MSPIN"),Integer.parseInt(data.get("P_PMC")),data.get("P_VIN_NUM"),data.get("P_FROM_DATE"),data.get("P_TO_DATE"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, getTestDriveSlotPojo);
        String bodyData=sw.toString();
		GetTestDriveSlot.validInputWithPVinNumGetTestDriveSlot(bodyData);
		Assert.assertEquals(GetTestDriveSlot.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + GetTestDriveSlot.code);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.VIN_NUM);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.SLOT_ID);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(GetTestDriveSlot.message, "SUCCESS");
		logger.info("Ectual message :" + GetTestDriveSlot.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "validInput_Without_Date_GetTestDriveSlot_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_Without_Date_GetTestDriveSlot_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetTestDriveSlotTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTestDriveSlotPojo getTestDriveSlotPojo = new GetTestDriveSlotPojo(data.get("P_MSPIN"),Integer.parseInt(data.get("P_PMC")),data.get("P_VIN_NUM"),data.get("P_FROM_DATE"),data.get("P_TO_DATE"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, getTestDriveSlotPojo);
        String bodyData=sw.toString();
		GetTestDriveSlot.validInputWithPVinNumGetTestDriveSlot(bodyData);
		Assert.assertEquals(GetTestDriveSlot.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + GetTestDriveSlot.code);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.VIN_NUM);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.SLOT_ID);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(GetTestDriveSlot.message, "SUCCESS");
		logger.info("Ectual message :" + GetTestDriveSlot.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "validInput_Without_Date_GetTestDriveSlot_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void invalidInput_Date_GetTestDriveSlot_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetTestDriveSlotTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTestDriveSlotPojo getTestDriveSlotPojo = new GetTestDriveSlotPojo(data.get("P_MSPIN"),Integer.parseInt(data.get("P_PMC")),data.get("P_VIN_NUM"),data.get("P_FROM_DATE"),data.get("P_TO_DATE"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, getTestDriveSlotPojo);
        String bodyData=sw.toString();
		GetTestDriveSlot.validInputWithPVinNumGetTestDriveSlot(bodyData);
		Assert.assertEquals(GetTestDriveSlot.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + GetTestDriveSlot.code);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.VIN_NUM);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.SLOT_ID);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(GetTestDriveSlot.message, "SUCCESS");
		logger.info("Ectual message :" + GetTestDriveSlot.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "validInput_Without_Date_GetTestDriveSlot_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void invalidInputGetTestDriveSlot_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetTestDriveSlotTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTestDriveSlotPojo getTestDriveSlotPojo = new GetTestDriveSlotPojo(data.get("P_MSPIN"),Integer.parseInt(data.get("P_PMC")),data.get("P_VIN_NUM"),data.get("P_FROM_DATE"),data.get("P_TO_DATE"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, getTestDriveSlotPojo);
        String bodyData=sw.toString();
		GetTestDriveSlot.validInputWithPVinNumGetTestDriveSlot(bodyData);
		Assert.assertEquals(GetTestDriveSlot.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + GetTestDriveSlot.code);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.VIN_NUM);
		logger.info("VIN_NUM in response :" + GetTestDriveSlot.SLOT_ID);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(GetTestDriveSlot.message, "SUCCESS");
		logger.info("Ectual message :" + GetTestDriveSlot.message);

		logger.info("Test case executed successfully");

	}

}
