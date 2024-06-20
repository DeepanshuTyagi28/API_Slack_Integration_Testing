package com.ttn.TestCases.DealerFMP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.Campaign.SendCampaignOTP;
import com.ttn.BusinessLogic.DealerFMP.DealerActiveEnquiry;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify Dealer OTP
 */

 // Method is used to Verify Functionality to verify Dealer OTP Functionality with valid Input
public class DealerActiveEnquiryTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "DealerActiveEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
    public void dealerActiveEnquiry_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile") , null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	DealerActiveEnquiry.validInput(bodyData); 
        Assert.assertEquals(DealerActiveEnquiry.code, 200,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerActiveEnquiry.Status.equalsIgnoreCase("Success"), "Response Body Validation failed ");	
        Assert.assertTrue(DealerActiveEnquiry.message.equalsIgnoreCase("Fetched Successfully"), "Response Body Validation failed -Delaer Active Enquiry");	
    }
 
//  Method is used to Verify Functionality to Verify Dealer FMP Active Enquiry with Blank mobile number 
   

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "DealerActiveEnquiry_Blank_Mobile", dataProviderClass = DataProviderSource.class)
    public void dealerActiveEnquiry_Blank_Mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("") , null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	DealerActiveEnquiry.blank_Mobile(bodyData); 
        Assert.assertEquals(DealerActiveEnquiry.code, 409,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerActiveEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
        Assert.assertTrue(DealerActiveEnquiry.message.equalsIgnoreCase("Mobile is mandatory"), "Response Body Validation failed -Delaer Active Enquiry");	
    }
 
}