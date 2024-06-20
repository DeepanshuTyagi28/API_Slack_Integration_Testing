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
import org.testng.annotations.Test;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.BookTestDriveHyperEnquiryGenerate;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Generate/Send OTP
 */

 // Method is used to Verify Functionality to generate/ Send OTP Functionality with valid Input


public class SendOTPTest extends BaseLib {
	
	 String RandomMobileNumber = PhoneNumberGenerator.generateMobileNumber();
 	public static String CoApplicantMobileNumber ="85459"+RandomNumber.getRandomNumber(5);

	
    @Test(groups = {"Sanity", "Regression" , "ARENA" ,"Prod" }, dataProvider = "SendOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void sendOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(RandomMobileNumber,data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.validInput(bodyData); 
        Assert.assertEquals(SendOTP.code, 200,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("OTP sent successfully"), "Response Body Validation failed -OTP not sent");	

    }

    
	//	 Method is used to Verify Functionality to generate/ Send OTP Functionality with Blank Mobile Number

    @Test(groups = {"Sanity", "Regression", "ARENA" ,"Prod"}, dataProvider = "SendOTP_Blank_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void sendOTP_Blank_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"), null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.blank_MobileNumber(bodyData); 
        Assert.assertEquals(SendOTP.code, 409,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("Mobile number is mandatory"), "Response Body Validation failed");	

    }
  
	//	 Method is used to Verify Functionality to generate/ Send OTP Functionality with Invalid Mobile Number

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "SendOTP_Invalid_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void sendOTP_Invalid_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.invalid_MobileNumber(bodyData); 
        Assert.assertEquals(SendOTP.code, 409,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("Invalid Mobile number format"), "Response Body Validation failed");	

    }
    
	//	 Method is used to Verify Functionality to generate/ Send OTP Functionality with Blank Channel ID 

    
    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "SendOTP_Blank_Channel", dataProviderClass = DataProviderSource.class)
    public void sendOTP_Blank_Channel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.blank_Channel(bodyData); 
        Assert.assertEquals(SendOTP.code, 409,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("Channel Id can be NX or AR"), "Response Body Validation failed");	

    }
    
    
	//	 Method is used to Verify Functionality to generate/ Send OTP Functionality with Invalid Channel ID 

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"}, dataProvider = "SendOTP_Invalid_Channel", dataProviderClass = DataProviderSource.class)
    public void sendOTP_Invalid_Channel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.invalid_Channel(bodyData); 
        Assert.assertEquals(SendOTP.code, 409,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("Channel Id can be NX or AR"), "Response Body Validation failed");	

    }
    
    
    // Send OTP FOR Download Sanction Letter as we have particular number for authorization
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SendOTP_DownloadSanctionLetter", dataProviderClass = DataProviderSource.class)
    public void sendOTP_DownloadSanctionLetter(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.validInput(bodyData); 
        Assert.assertEquals(SendOTP.code, 200,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("OTP sent successfully"), "Response Body Validation failed -OTP not sent");	

    }
    
   
    
    // Sending the OTP In order to validate CO-Applicant Customer Journey    
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SendOTP_CoApplicantJourney", dataProviderClass = DataProviderSource.class)
    public void sendOTP_CoApplicantCustomerJourney(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(CoApplicantMobileNumber ,data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.validInput(bodyData); 
        Assert.assertEquals(SendOTP.code, 200,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("OTP sent successfully"), "Response Body Validation failed -OTP not sent");	
    }
    
    
}