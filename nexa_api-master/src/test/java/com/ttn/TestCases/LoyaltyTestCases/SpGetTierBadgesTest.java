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
import com.ttn.BusinessLogic.SpGetTierBadges;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.TestCases.GetDetailsByUniqueId_Test;
import com.ttn.pojoClasses.SpGetTierBadgesPojo;

/**
 * @author Akhilesh Kumar
 *
 */
public class SpGetTierBadgesTest extends BaseLib {
	protected Logger logger = LoggerFactory.getLogger(SpGetTierBadgesTest.class);

	@Test(groups = { "Sanity","Regression"}, dataProvider = "spGetTierBadgesTest_Positive_Test", dataProviderClass = DataProviderSource.class ,enabled = true)
	public void spGetTierBadgesTest_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		SpGetTierBadgesPojo insertNapptnDetailObject = new SpGetTierBadgesPojo(data.get("tier"));
		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		SpGetTierBadges.validInputSpGetTierBadges(bodyData);
		Assert.assertEquals(SpGetTierBadges.code, 200);
		logger.info("Expected status code 200");
		logger.info("Actual status code :" + SpGetTierBadges.code);
		logger.info("Total Number of p_list_cursor :" + SpGetTierBadges.p_list_cursor_list_size);
		logger.info("Expected message : T1");
		Assert.assertEquals(SpGetTierBadges.message, "T1");
		logger.info("Actual message :" + SpGetTierBadges.message);

		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "spGetTierBadgesTest_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void spGetTierBadgesTest_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		SpGetTierBadgesPojo insertNapptnDetailObject = new SpGetTierBadgesPojo(data.get("tier"));
		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		SpGetTierBadges.invalidInputSpGetTierBadges(bodyData);
		Assert.assertEquals(SpGetTierBadges.code, 200);
		logger.info("Expected status code 200");
		logger.info("Actual status code :" + SpGetTierBadges.code);
		logger.info("Total Number of p_list_cursor :" + SpGetTierBadges.p_list_cursor_list_size);
		Assert.assertEquals(SpGetTierBadges.p_list_cursor_list_size, 0);
		logger.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity","Regression" }, dataProvider = "spGetTierBadgesTest_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void spGetTierBadgesTest_NegativeBlank_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new GetDetailsByUniqueId_Test() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		SpGetTierBadgesPojo insertNapptnDetailObject = new SpGetTierBadgesPojo(data.get("tier"));
		String bodyData = jsonSerializer.serialize(insertNapptnDetailObject);
		SpGetTierBadges.invalidInputSpGetTierBadges(bodyData);
		Assert.assertEquals(SpGetTierBadges.code, 200);
		logger.info("Expected status code 200");
		logger.info("Actual status code :" + SpGetTierBadges.code);
		logger.info("Total Number of p_list_cursor :" + SpGetTierBadges.p_list_cursor_list_size);
		Assert.assertEquals(SpGetTierBadges.p_list_cursor_list_size, 0);
		logger.info("Test case executed successfully");

	}

}
