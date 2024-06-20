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
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.BookTestDriveHyperEnquiryGenerate;
import com.ttn.BusinessLogic.Campaign.FetchCampaignOTP;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Fetch OTP
 */

//	Method is used to Verify Functionality to Fetch Campaign OTP with Valid Mobile Number
public class FetchCampaignOTPTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "FetchCampaignOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void fetchCampaignOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = data.get("mobile");    	
    	FetchCampaignOTP.validInput(MobileNumberdata); 
        Assert.assertEquals(FetchCampaignOTP.code, 200);
        Assert.assertTrue(FetchCampaignOTP.Status.equalsIgnoreCase("Success"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchCampaignOTP.message.equalsIgnoreCase("OTP fetched successfully"),"Response Body validation failed");

    }
   
	//		  Method is used to Verify Functionality to Fetch Campaign OTP with invalid Mobile Number

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "FetchCampaignOTP_InvalidInput", dataProviderClass = DataProviderSource.class)
    public void fetchCampaignOTP_InvalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = data.get("mobile");    	
    	FetchCampaignOTP.invalid_MobileNumber(MobileNumberdata);     	 
        Assert.assertEquals(FetchCampaignOTP.code, 409);
        Assert.assertTrue(FetchCampaignOTP.Status.equalsIgnoreCase("Failure"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchCampaignOTP.message.equalsIgnoreCase("Invalid Mobile number format"),"Response Body validation failed");	

    }
    
    
    //		  Method is used to Verify Functionality to Fetch Campaign OTP with Valid Mobile Number but OTP Not generated

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "FetchCampaignOTP_UnGeneratedMobileNumber", dataProviderClass = DataProviderSource.class)
    public void fetchCampaignOTP_UnGeneratedMobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = data.get("mobile");    	
    	FetchCampaignOTP.OTPUngenerated_MObileNumber(MobileNumberdata);     	 
        Assert.assertEquals(FetchCampaignOTP.code, 409);
        Assert.assertTrue(FetchCampaignOTP.Status.equalsIgnoreCase("Failure"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchCampaignOTP.message.equalsIgnoreCase("OTP is not generated"),"Response Body validation failed");	

    }
    
}