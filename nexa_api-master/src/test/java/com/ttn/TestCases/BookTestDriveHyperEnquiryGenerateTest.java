/**
 * 
 */
package com.ttn.TestCases;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.BookTestDriveHyperEnquiryGenerate;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnqGnratePojo;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
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

/**
 * @author Akhilesh Kumar
 *
 */
public class BookTestDriveHyperEnquiryGenerateTest extends BaseLib {

	protected static Logger logger = LoggerFactory.getLogger(BookTestDriveHyperEnquiryGenerateTest.class);

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();
			BookTestDriveHyperEnquiryGenerate.validInputBookTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			logger.info("Expected status code 200");
			logger.info("Ectual status code :" + BookTestDriveHyperEnquiryGenerate.code);
			logger.info("Expected message : SUCCESS");
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result, "SUCCESS");
			logger.info("Ectual message :" + BookTestDriveHyperEnquiryGenerate.result);
			logger.info("Test case executed successfully");
		}

		catch (Exception e) {

			logger.error("Test Case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "BookTestDriveHyperEnquiryGenerateWithInValidCityNameTest", dataProviderClass = DataProviderSource.class)
	public void BookTestDriveHyperEnquiryGenerateWithInValidCityNameTest(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), data.get("p_buyer_type"),
					data.get("p_enq_source"), data.get("p_enq_mode"), "02", data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputCityNameBookTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result.contains("RES_CITY_CD"), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "BookTestDriveHyperEnquryGenerateNegativeBuyerTypeTest", dataProviderClass = DataProviderSource.class)
	public void BookTestDriveHyperEnquryGenerateNegativeBuyerTypeTest(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), data.get("p_buyer_type"),
					data.get("p_enq_source"), data.get("p_enq_mode"), data.get("p_old_car_make"),
					data.get("p_old_car_model"), data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"),
					data.get("P_UTM_CAMPAIGN"), data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"),
					data.get("P_UTM_TERM"), data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputPByerTyeTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result, "Invalid Buyer Type.");
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_used_refid__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Model_cd__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), data.get("p_buyer_type"),
					data.get("p_enq_source"), data.get("p_enq_mode"), data.get("p_old_car_make"),
					data.get("p_old_car_model"), data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"),
					data.get("P_UTM_CAMPAIGN"), data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"),
					data.get("P_UTM_TERM"), data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputCityNameBookTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_used_refid__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_used_refid__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), data.get("p_buyer_type"),
					data.get("p_enq_source"), data.get("p_enq_mode"), data.get("p_old_car_make"),
					data.get("p_old_car_model"), data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"),
					data.get("P_UTM_CAMPAIGN"), data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"),
					data.get("P_UTM_TERM"), data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputUsedRefIdTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result
					.contains("Enquiry already exists for Web book Reference No"), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Model__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Model__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputWrongModelNumberTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(
					BookTestDriveHyperEnquiryGenerate.result.contains("Please provide correct Model and Variant."),
					true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Source__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Source__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputPEnqSourceNumberTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result.contains("Enquiry Source can not be blank"),
					true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Mode__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Mode__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputPEnqModeTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result.contains("Wrong Enquiry Mode"), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Date__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Date__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputWithoutDateTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result
					.contains("Can not generate Enquiry without mandatory data for Test Drive."), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Refid__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Refid__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputWithoutDateTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result
					.contains("Can not generate Enquiry without mandatory data for Test Drive."), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Flag__Test", dataProviderClass = DataProviderSource.class)
	public void Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Flag__Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputWithoutDateTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result
					.contains("Can not generate Enquiry without a Valid Customer Choice."), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "BookTestDriveHyperEnquiryGenerateWithInValidCAddress3NameTest", dataProviderClass = DataProviderSource.class)
	public void BookTestDriveHyperEnquiryGenerateWithInValidCAddress3NameTest(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputCityNameBookTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result.contains("RES_CITY_CD"), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "BookTestDriveHyperEnquiryGenerateWithInValidAddress2NameTest", dataProviderClass = DataProviderSource.class)
	public void BookTestDriveHyperEnquiryGenerateWithInValidAddress2NameTest(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputCityNameBookTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result.contains("RES_CITY_CD"), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "BookTestDriveHyperEnquiryGenerateWithInValidAdressNameTest", dataProviderClass = DataProviderSource.class)
	public void BookTestDriveHyperEnquiryGenerateWithInValidAdressNameTest(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputCityNameBookTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result.contains("RES_CITY_CD"), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}
	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "BookTestDriveHyperEnquiryGenerateWithInValidStateNameTest", dataProviderClass = DataProviderSource.class)
	public void BookTestDriveHyperEnquiryGenerateWithInValidStateNameTest(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		try {

			String methodNameUsingClassInstance = new BookTestDriveHyperEnquiryGenerateTest() {
			}.getClass().getEnclosingMethod().getName();
			logger.info("Execution start of :" + methodNameUsingClassInstance);
			String p_web_refid = RandomNumber.getRandomNumber(19);
			String p_Mobile_no = RandomNumber.getRandomNumber(10);
			JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
			HyperEnqGnratePojo hyperEnqGnratePojo = new HyperEnqGnratePojo(1, p_web_refid,
					Integer.parseInt(data.get("p_book_flag")), data.get("p_book_date"), data.get("p_title"),
					data.get("p_title"), data.get("p_Cust_middle_name"), data.get("p_Cust_last_name"),
					data.get("p_add1"), data.get("p_add2"), data.get("p_add3"), data.get("p_city"), data.get("p_state"),
					data.get("p_pin"), p_Mobile_no, data.get("p_Email_id"), data.get("p_Dealer_code"),
					data.get("p_for_code"), data.get("p_book_pref_date"), data.get("p_book_pref_time"),
					data.get("p_customer_type"), data.get("p_Model_cd"), data.get("p_Variant_Cd"), data.get("p_Color"),
					data.get("p_test_drive_place"), data.get("p_hyper_ref_id"), "02", data.get("p_enq_source"),
					data.get("p_enq_mode"), data.get("p_old_car_make"), data.get("p_old_car_model"),
					data.get("P_UTM_SOURCE"), data.get("P_UTM_MEDIUM"), data.get("P_UTM_CAMPAIGN"),
					data.get("P_UTM_KEYWORD"), data.get("P_UTM_ADGROUPNAME"), data.get("P_UTM_TERM"),
					data.get("P_UTM_CONTENT"));

			ObjectMapper mapper = new ObjectMapper();
			mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			StringWriter sw = new StringWriter();
			mapper.writeValue(sw, hyperEnqGnratePojo);
			String bodyData = sw.toString();

			BookTestDriveHyperEnquiryGenerate.inValidInputCityNameBookTestDriveHyperEnquiryGenerate(bodyData);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.code, 200);
			Assert.assertEquals(BookTestDriveHyperEnquiryGenerate.result.contains("RES_CITY_CD"), true);
			logger.info("execution for testcase " + methodNameUsingClassInstance + " successfully completed");
		}

		catch (Exception e) {

			logger.error("Test case is failing due To error : " + e);

		}
	}

}
