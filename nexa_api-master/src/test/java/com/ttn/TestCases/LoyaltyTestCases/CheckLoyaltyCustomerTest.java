package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.CheckLoyaltyCustomer;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberpojo;

/**
 * @author Deepanshu Tyagi This class is used to verify
 *         SP-GET-LOYALITY-CUST-DETAILS details functionality.
 */

// TC 1 :- Existing Customer Loyalty Card Number
public class CheckLoyaltyCustomerTest extends BaseLib {

	@Test(priority = 20, groups = { "Sanity","Regression" }, dataProvider = "CheckLoyaltyCustomer_ExistingCustomer", dataProviderClass = DataProviderSource.class)

	public void CheckLoyaltyCustomer_ExistingCustomer(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
		String bodyData = jsonSerializer.serialize(Mobilenumberpojo);
		CheckLoyaltyCustomer.ExistingCustomer(bodyData);
		Assert.assertEquals(CheckLoyaltyCustomer.code, 200);
		Assert.assertTrue(CheckLoyaltyCustomer.CARD_NUM.equalsIgnoreCase(data.get("CardNumber")),
				"Loyalty card Number not matched with associated phone Number");

	}

	@Test(priority = 21, groups = { "Sanity",
			"Regression" }, dataProvider = "CheckLoyaltyCustomer_NonExistingCustomer", dataProviderClass = DataProviderSource.class)

	public void CheckLoyaltyCustomer_NonExistingCustomer(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
		String bodyData = jsonSerializer.serialize(Mobilenumberpojo);
		CheckLoyaltyCustomer.NonExistingCustomer(bodyData);
		Assert.assertEquals(CheckLoyaltyCustomer.code, 200);
		Assert.assertTrue(CheckLoyaltyCustomer.error_msg.equalsIgnoreCase("No loyalty card exist"),
				"Loyalty card exist for this phone Number");

	}

	@Test(priority = 22, groups = { "Sanity",
			"Regression" }, dataProvider = "CheckLoyaltyCustomer_Invalidinput", dataProviderClass = DataProviderSource.class)

	public void CheckLoyaltyCustomer_InvalidInput(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
		String bodyData = jsonSerializer.serialize(Mobilenumberpojo);
		CheckLoyaltyCustomer.InvalidInput(bodyData);
		Assert.assertEquals(CheckLoyaltyCustomer.code, 200);
		Assert.assertTrue(CheckLoyaltyCustomer.error_msg.equalsIgnoreCase("No loyalty card exist"),
				"Loyalty card exist for passed Input parameter");

	}
}
