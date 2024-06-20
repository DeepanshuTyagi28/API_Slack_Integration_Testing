package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.CheckMSILCustomer;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberpojo;

/**
 * @author Deepanshu Tyagi This class is used to verify SP-CHECK-MSIL-CUSTOMER
 *         details functionality.
 */

// TC 1 :- Existing Customer Mobile Number
public class CheckMSILCustomerTest extends BaseLib {

	@Test(priority = 7, groups = { "Sanity",
			"Regression" }, dataProvider = "CheckMSILCustomer_ExistingCustomer", dataProviderClass = DataProviderSource.class)
	public void CheckMSILCustomerTest_ExistingCustomer(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
		String bodyData = jsonSerializer.serialize(Mobilenumberpojo);
		CheckMSILCustomer.ExistingCustomer(bodyData);
		Assert.assertEquals(CheckMSILCustomer.code, 200);
		Assert.assertEquals(CheckMSILCustomer.responseBody.contains("error_cd"), true);

	}

	@Test(priority = 8, groups = { "Sanity",
			"Regression" }, dataProvider = "CheckMSILCustomer_NonExistingCustomer", dataProviderClass = DataProviderSource.class)
	public void CheckMSILCustomerTest_NonExistingCustomer(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
		String bodyData = jsonSerializer.serialize(Mobilenumberpojo);
		CheckMSILCustomer.Non_ExistingCustomer(bodyData);
		Assert.assertEquals(CheckMSILCustomer.code, 200);
		Assert.assertEquals(CheckMSILCustomer.responseBody.contains("error_cd"), true);
		Assert.assertTrue(CheckMSILCustomer.ErrorMessage.equalsIgnoreCase("No Customer exist"),
				"customer is alredy registered with maruti ");

	}

	@Test(priority = 9, groups = { "Sanity",
			"Regression" }, dataProvider = "CheckMSILCustomer_InvalidInputtype", dataProviderClass = DataProviderSource.class)
	public void CheckMSILCustomerTest_BlankInput(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
		String bodyData = jsonSerializer.serialize(Mobilenumberpojo);
		CheckMSILCustomer.InvalidInput(bodyData);
		Assert.assertEquals(CheckMSILCustomer.code, 200);
		Assert.assertEquals(CheckMSILCustomer.responseBody.contains("error_cd"), true);
		Assert.assertTrue(CheckMSILCustomer.ErrorMessage.equalsIgnoreCase("No Customer exist"),
				"Please Provide Existing/Valid Customer details");

	}

}
