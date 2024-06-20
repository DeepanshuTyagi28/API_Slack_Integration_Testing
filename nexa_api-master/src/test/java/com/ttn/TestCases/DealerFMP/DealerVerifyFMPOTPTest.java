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
import com.ttn.BusinessLogic.DealerFMP.DealerVerifyFMPOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify Dealer OTP
 */

 // Method is used to Verify Functionality to verify Dealer OTP Functionality with valid Input
public class DealerVerifyFMPOTPTest extends BaseLib {

    @Test(priority = 1 ,groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "VerifyDealerFMPOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_verifyOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin") , data.get("otp") , data.get("channel"));
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerVerifyFMPOTP.validInput(bodyData); 
        Assert.assertEquals(DealerVerifyFMPOTP.code, 200,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerVerifyFMPOTP.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	
        Assert.assertTrue(DealerVerifyFMPOTP.message.equalsIgnoreCase("Dealer Login Successful"), "Response Body Validation failed -OTP not verify Dealer FMP API");	
    }
 
    
	//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with blank MSPIN

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "VerifyDealerFMPOTP_Blank_MSPIN", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_verifyOTP_Blank_MSPIN(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin") , data.get("otp") , data.get("channel"));
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerVerifyFMPOTP.blank_MSPIN(bodyData); 
        Assert.assertEquals(DealerVerifyFMPOTP.code, 409,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerVerifyFMPOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
    }
   
  
    
	//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with Invalid MSPIN

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "VerifyDealerFMPOTP_Invalid_MSPIN", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_verifyOTP_Invalid_MSPIN(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin") , data.get("otp") , data.get("channel"));
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerVerifyFMPOTP.invalid_MSPIN(bodyData); 
        Assert.assertEquals(DealerVerifyFMPOTP.code, 500,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerVerifyFMPOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
    }
    
    
    
//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with blank OTP

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "VerifyDealerFMPOTP_Blank_OTP", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_verifyOTP_Blank_OTP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin") , data.get("otp") , data.get("channel"));
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerVerifyFMPOTP.blank_OTP(bodyData); 
        Assert.assertEquals(DealerVerifyFMPOTP.code, 409,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerVerifyFMPOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
    }
   
  
    
	//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with Invalid OTP

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "VerifyDealerFMPOTP_Invalid_OTP", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_verifyOTP_Invalid_OTP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin") , data.get("otp") , data.get("channel"));
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerVerifyFMPOTP.invalid_OTP(bodyData); 
        Assert.assertEquals(DealerVerifyFMPOTP.code, 200,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerVerifyFMPOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
    }
 
    
	//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with Invalid OTP Format

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "VerifyDealerFMPOTP_Invalid_OTP_Format", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_verifyOTP_Invalid_OTP_Format(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin") , data.get("otp") , data.get("channel"));
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerVerifyFMPOTP.invalid_OTP_Format(bodyData); 
        Assert.assertEquals(DealerVerifyFMPOTP.code, 409,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerVerifyFMPOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
    }
}