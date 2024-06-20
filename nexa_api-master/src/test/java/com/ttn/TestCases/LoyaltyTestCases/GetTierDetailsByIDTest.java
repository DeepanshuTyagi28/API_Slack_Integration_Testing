package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.GetTierDetailsByID;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.GetTierDetailsPOJO;

/**
 * @author Deepanshu Tyagi This class is used to verify Get Tier Details By Id
 *         functionality.
 */

// TC 1 :- 
public class GetTierDetailsByIDTest extends BaseLib {

	@Test(priority = 48, groups = { "Sanity",
			"Regression" }, dataProvider = "GetTierDetailsBYID_ValidTier", dataProviderClass = DataProviderSource.class)
	public void GetTierDetailsByID_ValidTier(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTierDetailsPOJO GetTierDetailsPOJO = new GetTierDetailsPOJO(data.get("tier"), data.get("category"));
		String bodyData = jsonSerializer.serialize(GetTierDetailsPOJO);
		GetTierDetailsByID.ValidTier(bodyData);
		Assert.assertEquals(GetTierDetailsByID.code, 200);
		Assert.assertTrue(GetTierDetailsByID.TierID.equalsIgnoreCase(data.get("tier")), "Tier Not Matched");

	}

	@Test(priority = 49, groups = { "Sanity",
			"Regression" }, dataProvider = "GetTierDetailsBYID_BlankTier", dataProviderClass = DataProviderSource.class)
	public void GetTierDetailsByID_BlankTier(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTierDetailsPOJO GetTierDetailsPOJO = new GetTierDetailsPOJO(data.get("tier"), data.get("category"));
		String bodyData = jsonSerializer.serialize(GetTierDetailsPOJO);
		GetTierDetailsByID.BlankTier(bodyData);
		Assert.assertEquals(GetTierDetailsByID.code, 200);
		Assert.assertTrue(GetTierDetailsByID.error_message.equalsIgnoreCase("Tier not available"), "");

	}

	@Test(priority = 50, groups = { "Sanity",
			"Regression"}, dataProvider = "GetTierDetailsBYID_InvalidTier", dataProviderClass = DataProviderSource.class)
	public void GetTierDetailsByID_InvalidTier(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTierDetailsPOJO GetTierDetailsPOJO = new GetTierDetailsPOJO(data.get("tier"), data.get("category"));
		String bodyData = jsonSerializer.serialize(GetTierDetailsPOJO);
		GetTierDetailsByID.InvalidTier(bodyData);
		Assert.assertEquals(GetTierDetailsByID.code, 200);
		Assert.assertTrue(GetTierDetailsByID.error_message.equalsIgnoreCase("Tier not available"), "");

	}

	@Test(priority = 51, groups = { "Sanity",
			"Regression"}, dataProvider = "GetTierDetailsBYID_Valid_category", dataProviderClass = DataProviderSource.class)
	public void GetTierDetailsByID_Valid_category(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTierDetailsPOJO GetTierDetailsPOJO = new GetTierDetailsPOJO(data.get("tier"), data.get("category"));
		String bodyData = jsonSerializer.serialize(GetTierDetailsPOJO);
		GetTierDetailsByID.Valid_category(bodyData);
		Assert.assertEquals(GetTierDetailsByID.code, 200);
		Assert.assertTrue(GetTierDetailsByID.error_message.equalsIgnoreCase(data.get("category")), "");

	}

	@Test(priority = 52, groups = { "Sanity",
			"Regression" }, dataProvider = "GetTierDetailsBYID_Invalid_category", dataProviderClass = DataProviderSource.class)
	public void GetTierDetailsByID_Invalid_category(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		GetTierDetailsPOJO GetTierDetailsPOJO = new GetTierDetailsPOJO(data.get("tier"), data.get("category"));
		String bodyData = jsonSerializer.serialize(GetTierDetailsPOJO);
		GetTierDetailsByID.Invalid_category(bodyData);
		Assert.assertEquals(GetTierDetailsByID.code, 200);
		Assert.assertTrue(GetTierDetailsByID.error_message.equalsIgnoreCase(""), "");

	}

}
