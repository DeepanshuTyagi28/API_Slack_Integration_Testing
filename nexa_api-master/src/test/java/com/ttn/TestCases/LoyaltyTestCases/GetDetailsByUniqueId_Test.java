/**
 * 
 */
package com.ttn.TestCases.LoyaltyTestCases;

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
import com.ttn.BusinessLogic.GetDetailsByUniqueId_Logic;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.GetDetailsByUniqueId_Loyelty_Pojo;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;

/**
 * @author Akhilesh Kumar
 *
 */
public class GetDetailsByUniqueId_Test extends BaseLib {

	protected Logger logger = LoggerFactory.getLogger(GetDetailsByUniqueId_Test.class);

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
		// Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}

	@Test(groups = { "Sanity",
			"Regression"}, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_Teier_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
		// Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_u_id_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
// Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_u_id_45Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
//Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_u_id_4Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
        //Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_u_id_34Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
        //Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_u_id_2Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
        //Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_u_id_1Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo(
				data.get("tier"), data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
		// Assert.assertEquals(TotalCalls.dealerIDres, data.get("dealerID"));
	}
}
