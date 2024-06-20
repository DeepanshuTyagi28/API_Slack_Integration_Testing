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
import com.ttn.BusinessLogic.TestDriveBusinessLogic.ScheduleTestDrive;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.ScheduleTestdrivePojo;

/**
 * @author Akhilesh Kumar
 * @implNote TestCases for
 *
 */
public class ScheduleTestDriveTest extends BaseLib {

	private static Logger logger = LoggerFactory.getLogger(ScheduleTestDriveTest.class);

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "schedule_Test_Drive_Positive_Input_Test", dataProviderClass = DataProviderSource.class)
	public void schedule_Test_Drive_Positive_Input_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);

			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;

			ScheduleTestdrivePojo scheduleTestdrivePojo = new ScheduleTestdrivePojo(data.get("P_MSPIN"),
					Integer.parseInt(data.get("p_pmc")), data.get("P_DEALER_CD"), data.get("08"), data.get("p_vin"),
					data.get("P_TD_SCHD_IN_NUM"), data.get("P_enq_num"), data.get("P_model"), data.get("p_variant_cd"),
					data.get("p_Td_location"), data.get("p_Td_status"), data.get("p_Td_date"),
					data.get("p_Td_startTime"), data.get("p_Td_endTime"), data.get("p_Address1"),
					data.get("p_Address2"), data.get("p_Address3"), data.get("p_Ofc_address1"),
					data.get("p_Ofc_address2"), data.get("p_Ofc_address3"), data.get("p_td_op_type"));
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, scheduleTestdrivePojo);
			String bodyData = sw.toString();
			ScheduleTestDrive.validInputScheduleTestDrive(bodyData);
			Assert.assertEquals(ScheduleTestDrive.code, 200);
			logger.info("Expected status code 200");
			logger.info("Ectual status code :" + ScheduleTestDrive.code);
			logger.info("Expected message : SUCCESS");
			Assert.assertEquals(ScheduleTestDrive.result, "TD BOOKED SUCCESSFULLY: 1");
			logger.info("Ectual message :" + ScheduleTestDrive.result);
			logger.info("Test case executed successfully");
		}

		catch (Exception e) {

			logger.error("Test Case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "schedule_Test_Drive_Positive_Input_Test", dataProviderClass = DataProviderSource.class)
	public void schedule_Test_Drive_Positive_Input_1_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);

			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;

			ScheduleTestdrivePojo scheduleTestdrivePojo = new ScheduleTestdrivePojo(data.get("P_MSPIN"),
					Integer.parseInt(data.get("p_pmc")), data.get("P_DEALER_CD"), data.get("08"), data.get("p_vin"),
					data.get("P_TD_SCHD_IN_NUM"), data.get("P_enq_num"), data.get("P_model"), data.get("p_variant_cd"),
					data.get("p_Td_location"), data.get("p_Td_status"), data.get("p_Td_date"),
					data.get("p_Td_startTime"), data.get("p_Td_endTime"), data.get("p_Address1"),
					data.get("p_Address2"), data.get("p_Address3"), data.get("p_Ofc_address1"),
					data.get("p_Ofc_address2"), data.get("p_Ofc_address3"), data.get("p_td_op_type"));
			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, scheduleTestdrivePojo);
			String bodyData = sw.toString();
			ScheduleTestDrive.validInputScheduleTestDrive(bodyData);
			Assert.assertEquals(ScheduleTestDrive.code, 200);
			logger.info("Expected status code 200");
			logger.info("Ectual status code :" + ScheduleTestDrive.code);
			logger.info("Expected message : SUCCESS");
			Assert.assertEquals(ScheduleTestDrive.result, "TD BOOKED SUCCESSFULLY: 1");
			logger.info("Ectual message :" + ScheduleTestDrive.result);
			logger.info("Test case executed successfully");
		}

		catch (Exception e) {

			logger.error("Test Case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "schedule_Test_Drive_Negative_Input_PreBook_TimeSlot_Test", dataProviderClass = DataProviderSource.class)
	public void schedule_Test_Drive_Negative_Input_PreBook_TimeSlot_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);

		String p_Mobile_no = RandomNumber.getRandomNumber(10);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		HashMap<Object, Object> scheduleTestDriveTestObject = new HashMap<>();

		scheduleTestDriveTestObject.put("P_MSPIN", data.get("P_MSPIN"));
		scheduleTestDriveTestObject.put("p_pmc", 1);
		scheduleTestDriveTestObject.put("P_DEALER_CD", data.get("P_DEALER_CD"));
		scheduleTestDriveTestObject.put("P_FOR_CD", "08");
		scheduleTestDriveTestObject.put("p_vin", data.get("p_vin"));
		scheduleTestDriveTestObject.put("P_TD_SCHD_IN_NUM", data.get("P_TD_SCHD_IN_NUM"));
		scheduleTestDriveTestObject.put("P_enq_num", data.get("P_enq_num"));
		scheduleTestDriveTestObject.put("P_model", data.get("P_model"));
		scheduleTestDriveTestObject.put("p_variant_cd", data.get("p_variant_cd"));
		scheduleTestDriveTestObject.put("p_Td_location", data.get("p_Td_location"));
		scheduleTestDriveTestObject.put("p_Td_status", data.get("p_Td_status"));
		scheduleTestDriveTestObject.put("p_Td_date", data.get("p_Td_date"));
		scheduleTestDriveTestObject.put("p_Td_startTime", data.get("p_Td_startTime"));
		scheduleTestDriveTestObject.put("p_Td_endTime", data.get("p_Td_endTime"));
		scheduleTestDriveTestObject.put("p_Address1", data.get("p_Address1"));
		scheduleTestDriveTestObject.put("p_Address2", data.get("p_Address2"));
		scheduleTestDriveTestObject.put("p_Address3", data.get("p_Address3"));
		scheduleTestDriveTestObject.put("p_Ofc_address1", data.get("p_Ofc_address1"));
		scheduleTestDriveTestObject.put("p_Ofc_address2", data.get("p_Ofc_address2"));
		scheduleTestDriveTestObject.put("p_Ofc_address3", data.get("p_Ofc_address3"));
		scheduleTestDriveTestObject.put("p_td_op_type", data.get("p_td_op_type"));
		scheduleTestDriveTestObject.put("P_State_Desc", data.get("P_State_Desc"));
		scheduleTestDriveTestObject.put("P_City_Desc", data.get("P_City_Desc"));
		scheduleTestDriveTestObject.put("P_Pin_Code", data.get("P_Pin_Code"));
		scheduleTestDriveTestObject.put("SlotNumber", data.get("SlotNumber"));
		
		//String bodyData = sw.toString();
		String bodyData = jsonSerializer.serialize(scheduleTestDriveTestObject);
		ScheduleTestDrive.validInputScheduleTestDrive(bodyData);
		Assert.assertEquals(ScheduleTestDrive.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + ScheduleTestDrive.code);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(ScheduleTestDrive.result, "SLOT IS PREBOOKED");
		logger.info("Ectual message :" + ScheduleTestDrive.result);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression","NEXA","Prod"}, dataProvider = "schedule_Test_Drive_Negative_P_FOR_CD_Test", dataProviderClass = DataProviderSource.class)
	public void schedule_Test_Drive_Negative_P_FOR_CD_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new ScheduleTestDriveTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		String p_Td_date = "10/02/" + RandomNumber.getRandomNumber(4);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;

		HashMap<Object, Object> scheduleTestDriveTestObject = new HashMap<>();

		scheduleTestDriveTestObject.put("P_MSPIN", data.get("P_MSPIN"));
		scheduleTestDriveTestObject.put("p_pmc", 1);
		scheduleTestDriveTestObject.put("P_DEALER_CD", "");
		scheduleTestDriveTestObject.put("P_FOR_CD", "");
		scheduleTestDriveTestObject.put("p_vin", data.get("p_vin"));
		scheduleTestDriveTestObject.put("P_TD_SCHD_IN_NUM", data.get("P_TD_SCHD_IN_NUM"));
		scheduleTestDriveTestObject.put("P_enq_num", data.get("P_enq_num"));
		scheduleTestDriveTestObject.put("P_model", data.get("P_model"));
		scheduleTestDriveTestObject.put("p_variant_cd", data.get("p_variant_cd"));
		scheduleTestDriveTestObject.put("p_Td_location", data.get("p_Td_location"));
		scheduleTestDriveTestObject.put("p_Td_status", data.get("p_Td_status"));
		scheduleTestDriveTestObject.put("p_Td_date", p_Td_date);
		scheduleTestDriveTestObject.put("p_Td_startTime", data.get("p_Td_startTime"));
		scheduleTestDriveTestObject.put("p_Td_endTime", data.get("p_Td_endTime"));
		scheduleTestDriveTestObject.put("p_Address1", data.get("p_Address1"));
		scheduleTestDriveTestObject.put("p_Address2", data.get("p_Address2"));
		scheduleTestDriveTestObject.put("p_Address3", data.get("p_Address3"));
		scheduleTestDriveTestObject.put("p_Ofc_address1", data.get("p_Ofc_address1"));
		scheduleTestDriveTestObject.put("p_Ofc_address2", data.get("p_Ofc_address2"));
		scheduleTestDriveTestObject.put("p_Ofc_address3", data.get("p_Ofc_address3"));
		scheduleTestDriveTestObject.put("p_td_op_type", data.get("p_td_op_type"));
		scheduleTestDriveTestObject.put("P_State_Desc", data.get("P_State_Desc"));
		scheduleTestDriveTestObject.put("P_City_Desc", data.get("P_City_Desc"));
		scheduleTestDriveTestObject.put("P_Pin_Code", data.get("P_Pin_Code"));
		scheduleTestDriveTestObject.put("SlotNumber", data.get("SlotNumber"));

		String bodyData = jsonSerializer.serialize(scheduleTestDriveTestObject);
		ScheduleTestDrive.validInputScheduleTestDrive(bodyData);
		Assert.assertEquals(ScheduleTestDrive.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + ScheduleTestDrive.code);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(ScheduleTestDrive.result, "TD BOOKED SUCCESSFULLY: 1");
		logger.info("Ectual message :" + ScheduleTestDrive.result);
		logger.info("Test case executed successfully");

	}

}
