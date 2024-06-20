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
 * @author Deepanshu Tyagi
 * This class is used to verify SP-GET-LOYALITY-CUST-DETAILS details functionality.
 */

// TC 1 :- Existing Customer Loyalty Card Number
public class GetCardTransactionTest extends BaseLib {
	
    @Test(priority = 53, groups = {"Sanity", "Regression"}, dataProvider = "GetCardTransaction_ExistingCard", dataProviderClass = DataProviderSource.class )
   
    public void GetCardTransactionTest_ExistingLoyaltyCard(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	LoyaltyCardNumberpojo LoyaltyCardNumberpojo = new LoyaltyCardNumberpojo(data.get("card_num"));
    	String bodyData=jsonSerializer.serialize(LoyaltyCardNumberpojo);
    	LoyaltyCustomerDetails.ExistingLoyaltyCard(bodyData);    	
        Assert.assertEquals(LoyaltyCustomerDetails.code, 200);    
//	    Assert.assertTrue(LoyaltyCustomerDetails.p_tier_name.equalsIgnoreCase(data.get("p_tier_name")), "Tier name and Loyalty card doesnt matched");	

        
    }
    
    
// TC2  :- Non-Existing Customer Loyalty Card Number
    
    @Test(priority = 54, groups = {"Sanity", "Regression"}, dataProvider = "GetCardTransaction_NonExistingCard", dataProviderClass = DataProviderSource.class )
    public void GetCardTransactionTest_NonExistingLoyaltyCard(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	LoyaltyCardNumberpojo LoyaltyCardNumberpojo = new LoyaltyCardNumberpojo(data.get("card_num"));
    	String bodyData=jsonSerializer.serialize(LoyaltyCardNumberpojo);
    	LoyaltyCustomerDetails.NonExistingLoyaltyCard(bodyData);    	
        Assert.assertEquals(LoyaltyCustomerDetails.code, 200);        
		Assert.assertEquals(LoyaltyCustomerDetails.responseBody.contains("error_msg"), true);
	    Assert.assertTrue(LoyaltyCustomerDetails.ErrorMessage.equalsIgnoreCase("No loyalty card exist"), "Any Message ");	
	    Assert.assertTrue(LoyaltyCustomerDetails.p_error_msg.equalsIgnoreCase("No loyalty card exist"), "Any Message ");				
    }	

// TC3  :- Invalid Customer Loyalty Card Number
    
    @Test(priority = 55, groups = {"Sanity", "Regression"}, dataProvider = "GetCardTransaction_InvalidCard", dataProviderClass = DataProviderSource.class )
    public void GetCardTransactionTest_InvalidLoyaltyCard(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	LoyaltyCardNumberpojo LoyaltyCardNumberpojo = new LoyaltyCardNumberpojo(data.get("card_num"));
    	String bodyData=jsonSerializer.serialize(LoyaltyCardNumberpojo);
    	LoyaltyCustomerDetails.InvalidLoyaltyCard(bodyData);    	
        Assert.assertEquals(LoyaltyCustomerDetails.code, 200);        
		Assert.assertEquals(LoyaltyCustomerDetails.responseBody.contains("error_msg"), true);	 
	    Assert.assertTrue(LoyaltyCustomerDetails.ErrorMessage.equalsIgnoreCase("No loyalty card exist"), "Any Message ");	
	    Assert.assertTrue(LoyaltyCustomerDetails.p_error_msg.equalsIgnoreCase("No loyalty card exist"), "Any Message ");				

    }
    
}
