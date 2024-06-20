package com.ttn.TestCases.Campaign;

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
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Generate/Send Campaign OTP
 */

 // Method is used to Verify Functionality to generate/ Send Campaign OTP Functionality with valid Input
public class SendCampaignOTPTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SendCampaignOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void sendCampaignOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendCampaignOTP.validInput(bodyData); 
        Assert.assertEquals(SendCampaignOTP.code, 200,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendCampaignOTP.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	
        Assert.assertTrue(SendCampaignOTP.message.equalsIgnoreCase("OTP sent successfully"), "Response Body Validation failed -OTP not sent");	

    }
    
	//	 Method is used to Verify Functionality to generate/ Send Campaign OTP Functionality with Blank Mobile Number

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "SendCampaignOTP_Blank_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void sendCampaignOTP_Blank_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendCampaignOTP.blank_MobileNumber(bodyData); 
        Assert.assertEquals(SendCampaignOTP.code, 409,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendCampaignOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed");	
        Assert.assertTrue(SendCampaignOTP.message.equalsIgnoreCase("Mobile number is mandatory"), "Response Body Validation failed");	

    }
    
	//	 Method is used to Verify Functionality to generate/ Send  Campaign OTP Functionality with Invalid Mobile Number

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "SendCampaignOTP_Invalid_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void sendCampaignOTP_Invalid_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendCampaignOTP.invalid_MobileNumber(bodyData); 
        Assert.assertEquals(SendCampaignOTP.code, 409,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendCampaignOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed");	
        Assert.assertTrue(SendCampaignOTP.message.equalsIgnoreCase("Invalid Mobile number format"), "Response Body Validation failed");	

    }
    

    
}