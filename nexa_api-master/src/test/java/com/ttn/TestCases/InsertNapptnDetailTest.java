/**
 * 
 */
package com.ttn.TestCases;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.InsertNapptnDetail;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.InsertNapptnDetailPojo;

/**
 * @author Akhilesh Kumar
 *
 */
public class InsertNapptnDetailTest extends BaseLib {

	protected Logger logger = LoggerFactory.getLogger(InsertNapptnDetailTest.class);

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);

		System.out.println(bodyData);
		InsertNapptnDetail.validInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(InsertNapptnDetail.message, "SUCCESS");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Appnt_type_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Appnt_type_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message : Appointment Type not found");
		Assert.assertEquals(InsertNapptnDetail.message, "Appointment Type not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Dealer_Cd_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Dealer_Cd_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message : Dealer Details is not valid||Customer not found||Appointment Type not found");
		Assert.assertEquals(InsertNapptnDetail.message,
				"Dealer Details is not valid||Customer not found||Appointment Type not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Loc_Cd_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Loc_Cd_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message : Dealer Details is not valid||Customer not found||Appointment Type not found");
		Assert.assertEquals(InsertNapptnDetail.message,
				"Dealer Details is not valid||Customer not found||Appointment Type not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Loc_Cd_Blank_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Loc_Cd_Blank_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info(
				"Expected message : Please enter Loc Code||Dealer Details is not valid||Customer not found||Appointment Type not found");
		Assert.assertEquals(InsertNapptnDetail.message,
				"Please enter Loc Code||Dealer Details is not valid||Customer not found||Appointment Type not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_User_Id_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_User_Id_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info(
				"Expected message : User ID is not valid||Please enter Service Type||Please enter Current Service Advisor||Please enter Slot||Please enter Slot Time||Appointment Date cannot be less than Current Date");
		Assert.assertEquals(InsertNapptnDetail.message,
				"User ID is not valid||Please enter Service Type||Please enter Current Service Advisor||Please enter Slot||Please enter Slot Time||Appointment Date cannot be less than Current Date");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_User_Id_Blank_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_User_Id_Blank_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Please enter User Id");
		Assert.assertEquals(InsertNapptnDetail.message, "Please enter User Id");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Reg_Num_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Reg_Num_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Registration no is not valid");
		Assert.assertEquals(InsertNapptnDetail.message, "Registration no is not valid");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Reg_Blank_Num_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Reg_Blank_Num_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Please enter vehicle registration number");
		Assert.assertEquals(InsertNapptnDetail.message, "Please enter vehicle registration number");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Srvtype_Cd_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Srvtype_Cd_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Service Type not found");
		Assert.assertEquals(InsertNapptnDetail.message, "Service Type not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Currentsa_Cd_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Currentsa_Cd_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Service Advisor not found");
		Assert.assertEquals(InsertNapptnDetail.message, "Service Advisor not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Slot_Cd_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Slot_Cd_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Slot not found");
		Assert.assertEquals(InsertNapptnDetail.message, "Slot not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Slottime_Cd_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Slottime_Cd_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Slot not found");
		Assert.assertEquals(InsertNapptnDetail.message, "Slot not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_Pickuptype_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_Pickuptype_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Pickup not found");
		Assert.assertEquals(InsertNapptnDetail.message, "Pickup not found");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity", "Regression", "NEXA",
			"Prod" }, dataProvider = "insert_Napptn_Detail_Pn_PickuptimeNegative_Test", dataProviderClass = DataProviderSource.class)
	public void insert_Napptn_Detail_Pn_PickuptimeNegative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		InsertNapptnDetailPojo insertNapptnDetailObject = new InsertNapptnDetailPojo(data.get("pn_dealer_cd"),
				data.get("pn_loc_cd"), data.get("pn_user_id"), data.get("pn_reg_num"), data.get("pn_odometer"),
				data.get("pn_srvtype_cd"), data.get("pn_appnt_type"), data.get("pn_appnt_date"),
				data.get("pn_currentsa_cd"), data.get("pn_slot_cd"), data.get("pn_slottime_cd"),
				data.get("pn_pickuptype"), data.get("pn_pickuploc"), data.get("pn_pickuptime"),
				data.get("pn_pickupaddr"), data.get("pn_droploc"), data.get("pn_droptime"), data.get("pn_dropaddr"),
				data.get("pn_driver"), data.get("pn_vehicleno"), data.get("pn_pickupremarks"),
				data.get("pn_remark_non_prev_sa"), data.get("pn_demand_jobs"), data.get("pn_drop_driver"),
				data.get("pn_mobile_no"));

		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		InsertNapptnDetail.invalidInputInsertNapptnDetail(bodyData);
		Assert.assertEquals(InsertNapptnDetail.code, 200);
		logger.info("Expected status code 200");
		logger.info("Ectual status code :" + InsertNapptnDetail.code);
		logger.info("Expected message :  Wrong Pickup Date Format||Time Is compulsory for Pickup Date/Time");
		Assert.assertEquals(InsertNapptnDetail.message,
				"Wrong Pickup Date Format||Time Is compulsory for Pickup Date/Time");
		logger.info("Ectual message :" + InsertNapptnDetail.message);
		logger.info("Test case executed successfully");

	}

}
