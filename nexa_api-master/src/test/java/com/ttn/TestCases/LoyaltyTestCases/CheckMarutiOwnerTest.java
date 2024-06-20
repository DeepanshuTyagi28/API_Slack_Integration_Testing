package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.CheckMarutiOwner;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberpojo;



/**
 * @author Deepanshu Tyagi
 * This class is used to verify SP-CHECK-MARUTI-OWNER details functionality.
 */

// TC 1 :- Existing Customer Mobile Number
public class CheckMarutiOwnerTest extends BaseLib {
	
    @Test(priority = 1, groups = {"Sanity", "Regression"}, dataProvider = "CheckMarutiOwner_ExistingCustomer_Input", dataProviderClass = DataProviderSource.class)
    public void CheckMarutiOwnerTest_ExistingCustomer(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
    	String bodyData=jsonSerializer.serialize(Mobilenumberpojo);
    	CheckMarutiOwner.ExistingCustomer(bodyData); 
        Assert.assertEquals(CheckMarutiOwner.code, 200);
        Assert.assertTrue(CheckMarutiOwner.MOBILE_NUMBER.equalsIgnoreCase(data.get("mobile_no")), "Mobile Number not matched");	
        Assert.assertTrue(CheckMarutiOwner.VIN.equalsIgnoreCase(data.get("VIN")), "VIN Number not matched with associated Mobile number");	

    }
 
 // TC 2 :- Non Existing Customer Mobile Number
    
    @Test(priority = 2,groups = {"Sanity", "Regression"}, dataProvider = "CheckMarutiOwner_NonExistingCustomer_Input", dataProviderClass = DataProviderSource.class)
    public void CheckMarutiOwnerTest_NonExistingCustomer(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
    	String bodyData=jsonSerializer.serialize(Mobilenumberpojo);
    	CheckMarutiOwner.Non_ExistingCustomer(bodyData);    	
        Assert.assertEquals(CheckMarutiOwner.code, 200);        
		Assert.assertEquals(CheckMarutiOwner.responseBody.contains("MOBILE_PHONE"), false);	 
		Assert.assertEquals(CheckMarutiOwner.responseBody.contains("error_cd"), true);	 

    }
    

 // TC 3 :- Invalid Mobile Number format
    
    @Test(priority = 3,groups = {"Sanity", "Regression"}, dataProvider = "CheckMarutiOwner_Invalid_Input", dataProviderClass = DataProviderSource.class)
    public void CheckMarutiOwnerTest_Invalid_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberpojo Mobilenumberpojo = new Mobilenumberpojo(data.get("mobile_no"));
    	String bodyData=jsonSerializer.serialize(Mobilenumberpojo);
    	CheckMarutiOwner.InvalidInput(bodyData);    	
        Assert.assertEquals(CheckMarutiOwner.code, 200);        
		Assert.assertEquals(CheckMarutiOwner.responseBody.contains("MOBILE_PHONE"), false);	 
		Assert.assertEquals(CheckMarutiOwner.responseBody.contains("error_cd"), true);	 

 
    }
}
