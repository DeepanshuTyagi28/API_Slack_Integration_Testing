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
import com.ttn.BusinessLogic.SP_GET_LOYALITY_CUST_DETAILS_Logic;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.SpGetLoyalityCustDetailsPojo;

/**
 * @author Akhilesh Kumar
 * @apiNote ValidSP_GET_LOYALITY_CUST_DETAILS from loyelty
 * 
 */
public class ValidSpGetLoyelityCustDetailsTest extends BaseLib{

	protected static Logger logger = LoggerFactory.getLogger(ValidSpGetLoyelityCustDetailsTest.class);

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "validSP_GET_LOYALITY_CUST_DETAILS_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void validSP_GET_LOYALITY_CUST_DETAILS_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new ValidSpGetLoyelityCustDetailsTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		SpGetLoyalityCustDetailsPojo sP_GET_LOYALITY_CUST_DETAILS_obj = new SpGetLoyalityCustDetailsPojo(
				data.get("card_num"));
		String bodyData = jsonSerializer.serialize(sP_GET_LOYALITY_CUST_DETAILS_obj);
		SP_GET_LOYALITY_CUST_DETAILS_Logic.validSP_GET_LOYALITY_CUST_DETAILS_Logic(bodyData);
		Assert.assertEquals(SP_GET_LOYALITY_CUST_DETAILS_Logic.code, 200);
		Assert.assertEquals(SP_GET_LOYALITY_CUST_DETAILS_Logic.resultBodyInString.contains("MULDMS.IDX_CARD_NUM"), true,
				"Valid Response");
	}

	@Test(groups = { "Sanity",
			"Regression" }, dataProvider = "invalidSP_GET_LOYALITY_CUST_DETAILS_Negative_Test", dataProviderClass = DataProviderSource.class)
	public void invalidSP_GET_LOYALITY_CUST_DETAILS_Negative_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new ValidSpGetLoyelityCustDetailsTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		SpGetLoyalityCustDetailsPojo sP_GET_LOYALITY_CUST_DETAILS_obj = new SpGetLoyalityCustDetailsPojo(
				data.get("card_num"));
		String bodyData = jsonSerializer.serialize(sP_GET_LOYALITY_CUST_DETAILS_obj);
		SP_GET_LOYALITY_CUST_DETAILS_Logic.negative_GET_LOYALITY_CUST_DETAILS_Negative_Logic(bodyData);
		Assert.assertEquals(SP_GET_LOYALITY_CUST_DETAILS_Logic.code, 200);
		Assert.assertEquals(SP_GET_LOYALITY_CUST_DETAILS_Logic.errorMesage, "No loyalty card exist");
		logger.info("In Response payload error message is : " + SP_GET_LOYALITY_CUST_DETAILS_Logic.errorMesage);
	}

}
