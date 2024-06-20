package com.ttn.TestCases.FMP;

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
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Fetch OTP
 */

//		  Method is used to Verify Functionality to Fetch OTP with Valid Mobile Number
public class FetchOTPTest extends BaseLib {
	
	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "FetchOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void fetchOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = PhoneNumberGenerator.randomMobileNumber;   
    	FetchOTP.validInput(MobileNumberdata); 
        Assert.assertEquals(FetchOTP.code, 200);
        Assert.assertTrue(FetchOTP.Status.equalsIgnoreCase("Success"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchOTP.message.equalsIgnoreCase("OTP fetched successfully"),"Response Body validation failed");


    }
    
   
	//		  Method is used to Verify Functionality to Fetch OTP with invalid Mobile Number

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "FetchOTP_InvalidInput", dataProviderClass = DataProviderSource.class)
    public void fetchOTP_InvalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = data.get("mobile");    	
    	FetchOTP.invalid_MobileNumber(MobileNumberdata);     	 
        Assert.assertEquals(FetchOTP.code, 409);
        Assert.assertTrue(FetchOTP.Status.equalsIgnoreCase("Failure"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchOTP.message.equalsIgnoreCase("Invalid Mobile number format"),"Response Body validation failed");	

    }
    
    
    //		  Method is used to Verify Functionality to Fetch OTP with Valid Mobile Number but OTP Not generated

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "FetchOTP_UnGeneratedMobileNumber", dataProviderClass = DataProviderSource.class)
    public void fetchOTP_OTP_UnGeneratedMobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = data.get("mobile");    	
    	FetchOTP.OTPUngenerated_MObileNumber(MobileNumberdata);     	 
        Assert.assertEquals(FetchOTP.code, 409);
        Assert.assertTrue(FetchOTP.Status.equalsIgnoreCase("Failure"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchOTP.message.equalsIgnoreCase("OTP is not generated"),"Response Body validation failed");	

    }
    
    
    //  Method is used to Verify Functionality to Fetch OTP with Valid Mobile Number For Download Sanction Letter
    

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "FetchOTP_DownloadSanctionLetter", dataProviderClass = DataProviderSource.class)
    public void fetchOTP_DownloadSanctionLetter(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = data.get("mobile");    	
    	FetchOTP.validInput_DownloadSanctionLetter(MobileNumberdata); 
        Assert.assertEquals(FetchOTP.code, 200);
        Assert.assertTrue(FetchOTP.Status.equalsIgnoreCase("Success"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchOTP.message.equalsIgnoreCase("OTP fetched successfully"),"Response Body validation failed");

    }
    
    
    //  Method is used to Verify Functionality to Fetch OTP with Valid Mobile Number For CoApplicant Journey
    

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "FetchOTP_CoApplicantCustomerJourney", dataProviderClass = DataProviderSource.class)
    public void fetchOTP_CoApplicantCustomerJourney(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String MobileNumberdata = SendOTPTest.CoApplicantMobileNumber;    	
    	FetchOTP.validInput_CoApplicantCustomerJourney(MobileNumberdata); 
        Assert.assertEquals(FetchOTP.code, 200);
        Assert.assertTrue(FetchOTP.Status.equalsIgnoreCase("Success"), "Status Code Validation Failed for fetch OTP API");	
        Assert.assertTrue(FetchOTP.message.equalsIgnoreCase("OTP fetched successfully"),"Response Body validation failed");

    }  
    
}