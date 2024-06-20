package com.ttn.TestCases.FMP;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify OTP
 */

// TC 1:- Verify OTP Functionality
public class VerifyOTPTest extends BaseLib {

    @Test(priority = 1, groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "VerifyOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void verifyOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String OTPvalue = FetchOTP.OTP;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(PhoneNumberGenerator.randomMobileNumber,data.get("channel"),OTPvalue);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyOTP.validInput(bodyData); 
        Assert.assertEquals(VerifyOTP.code, 200,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyOTP.message.equalsIgnoreCase("JWT"), "Response Body Validation failed -OTP not sent");	

    }
    
    
	//	Method is used to Verify Functionality of Arena FMP API to Verify OTP with Already verified

    @Test(priority = 2, groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "VerifyOTP_AlredayVerifiedOTP", dataProviderClass = DataProviderSource.class)
    public void verifyOTP_OTP_Already_Verified(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String OTPvalue = FetchOTP.OTP;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(PhoneNumberGenerator.randomMobileNumber,data.get("channel"),OTPvalue);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyOTP.OTP_AlreadyVerified(bodyData); 
        Assert.assertEquals(VerifyOTP.code, 409,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
        Assert.assertTrue(VerifyOTP.message.equalsIgnoreCase("OTP already verified"), "Response Body Validation failed -");	

        
    }
    
	//	Method is used to Verify Functionality of Arena FMP API to Verify OTP with Invalid OTP format

    @Test(priority = 3, groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "VerifyOTP_Invalid_OTP_FORMAT", dataProviderClass = DataProviderSource.class)
    public void verifyOTP_Invalid_OTP_Format(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    //	String OTPvalue = FetchOTP.OTP;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(PhoneNumberGenerator.randomMobileNumber,data.get("channel"),"ABCD");
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyOTP.invalid_OTP_FORMAT(bodyData); 
        Assert.assertEquals(VerifyOTP.code, 409,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed -");	
        Assert.assertTrue(VerifyOTP.message.equalsIgnoreCase("Invalid OTP format"), "Response Body Validation failed -");	

        
    }
    
	//	Method is used to Verify Functionality of Arena FMP API to Verify OTP with Invalid OTP 

    @Test(priority = 4, groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "VerifyOTP_Invalid_OTP", dataProviderClass = DataProviderSource.class)
    public void verifyOTP_Invalid_OTP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	//String OTPvalue = FetchOTP.OTP;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),"1234");
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyOTP.invalid_OTP(bodyData); 
        Assert.assertEquals(VerifyOTP.code, 409,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed -");	

        
    }  
    
    
    //Download Sanction Letter
    // Method is used to Verify Functionality of Arena FMP API to Verify OTP with valid Inpuit FOR Download Sanction Letter

    @Test(priority = 5, groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "VerifyOTP_DownloadSanctionLetter", dataProviderClass = DataProviderSource.class)
    public void verifyOTP_DownloadSanctionLetter(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String OTPvalue = FetchOTP.OTP_DownloadSanctionLetter;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),OTPvalue);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyOTP.validInput_DownloadSanctionLetter(bodyData); 
        Assert.assertEquals(VerifyOTP.code, 200,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyOTP.message.equalsIgnoreCase("JWT"), "Response Body Validation failed -OTP not sent");	

    }
   
    // Method is used to Verify Functionality of Arena FMP API to Verify OTP with valid Input FOR Download Sanction Letter

    @Test(priority = 6, groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "VerifyOTP_CoApplicantCustomerJourney", dataProviderClass = DataProviderSource.class)
    public void verifyOTP_CoApplicantCustomerJourney(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String OTPvalue = FetchOTP.OTP_CoApplicant;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(SendOTPTest.CoApplicantMobileNumber,data.get("channel"),OTPvalue);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyOTP.validInput_CoApplicantCustomerJourney(bodyData); 
        Assert.assertEquals(VerifyOTP.code, 200,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyOTP.message.equalsIgnoreCase("JWT"), "Response Body Validation failed -OTP not sent");	

    }  
    
}