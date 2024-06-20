package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.LoyaltyCustomerDetails;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.LoyaltyCardNumberpojo;

/**
 * @author Deepanshu Tyagi This class is used to verify
 *         SP-GET-LOYALITY-CUST-DETAILS details functionality.
 */

// TC 1 :- Existing Customer Loyalty Card Number
public class LoyaltyCustomerDetailsTest extends BaseLib {

	@Test(priority = 4, groups = { "Sanity",
			"Regression" }, dataProvider = "LoyaltyCustomerDetails_ExistingCard", dataProviderClass = DataProviderSource.class)

	public void LoyaltyCustomerDetails_ExistingLoyaltyCard(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		LoyaltyCardNumberpojo LoyaltyCardNumberpojo = new LoyaltyCardNumberpojo(data.get("card_num"));
		String bodyData = jsonSerializer.serialize(LoyaltyCardNumberpojo);
		LoyaltyCustomerDetails.ExistingLoyaltyCard(bodyData);
		Assert.assertEquals(LoyaltyCustomerDetails.code, 200);
	//	Assert.assertTrue(LoyaltyCustomerDetails.p_tier_name.equalsIgnoreCase(data.get("p_tier_name")),
	//			"Tier doesnt matched to given Loyalty Card");

	}

// TC2  :- Non-Existing Customer Loyalty Card Number

	@Test(priority = 5, groups = { "Sanity",
			"Regression"}, dataProvider = "LoyaltyCustomerDetails_NonExistingCard", dataProviderClass = DataProviderSource.class)
	public void LoyaltyCustomerDetails_NonExistingLoyaltyCard(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		LoyaltyCardNumberpojo LoyaltyCardNumberpojo = new LoyaltyCardNumberpojo(data.get("card_num"));
		String bodyData = jsonSerializer.serialize(LoyaltyCardNumberpojo);
		LoyaltyCustomerDetails.NonExistingLoyaltyCard(bodyData);
		Assert.assertEquals(LoyaltyCustomerDetails.code, 200);
		Assert.assertEquals(LoyaltyCustomerDetails.responseBody.contains("error_msg"), true);
		Assert.assertTrue(LoyaltyCustomerDetails.ErrorMessage.equalsIgnoreCase("No loyalty card exist"),
				"Any Message ");
		Assert.assertTrue(LoyaltyCustomerDetails.p_error_msg.equalsIgnoreCase("No loyalty card exist"), "Any Message ");
	}

// TC3  :- Invalid Customer Loyalty Card Number

	@Test(priority = 6, groups = { "Sanity",
			"Regression" }, dataProvider = "LoyaltyCustomerDetails_InValidCard", dataProviderClass = DataProviderSource.class)
	public void LoyaltyCustomerDetails_InvalidLoyaltyCard(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		LoyaltyCardNumberpojo LoyaltyCardNumberpojo = new LoyaltyCardNumberpojo(data.get("card_num"));
		String bodyData = jsonSerializer.serialize(LoyaltyCardNumberpojo);
		LoyaltyCustomerDetails.InvalidLoyaltyCard(bodyData);
		Assert.assertEquals(LoyaltyCustomerDetails.code, 200);
		Assert.assertEquals(LoyaltyCustomerDetails.responseBody.contains("error_msg"), true);
		Assert.assertTrue(LoyaltyCustomerDetails.ErrorMessage.equalsIgnoreCase("No loyalty card exist"),
				"Any Message ");
		Assert.assertTrue(LoyaltyCustomerDetails.p_error_msg.equalsIgnoreCase("No loyalty card exist"), "Any Message ");

	}

}
