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

	@Test(groups = { "Sanity", "Regression",
			"NEXA", }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
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

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Blank_Teier_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo("",
				data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
		// Assert.assertEquals(GetDetailsByUniqueId_Logic.errorMesage, "Tier not
		// available");
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_Teier_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo("TTT",
				data.get("u_id"));
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
		// Assert.assertEquals(GetDetailsByUniqueId_Logic.errorMesage, "Tier not
		// available");
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_Wrong_U_ID_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo("T1",
				"yyttt");
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
		// Assert.assertEquals(GetDetailsByUniqueId_Logic.errorMesage, "No badge
		// found");
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "getDetailsByUniqueId_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void getDetailsByUniqueId_Negative_with_BlankTest(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetDetailsByUniqueId_Loyelty_Pojo leadFromHyperEnquiryGenerate = new GetDetailsByUniqueId_Loyelty_Pojo("", "");
		String bodyData = jsonSerializer.serialize(leadFromHyperEnquiryGenerate);
		GetDetailsByUniqueId_Logic.getDetailsByUniqueId_Logic_Postive(bodyData);
		Assert.assertEquals(GetDetailsByUniqueId_Logic.code, 200);
		// Assert.assertEquals(GetDetailsByUniqueId_Logic.errorMesage, "Tier not
		// available");
	}
}
