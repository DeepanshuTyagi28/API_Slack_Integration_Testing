package com.ttn.TestCases.Campaign;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.Campaign.FetchCampaignOTP;
import com.ttn.BusinessLogic.Campaign.VerifyCampaignOTP;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify Campaign OTP
 */
	
// TC 1:- Verify OTP Functionality
public class VerifyCampaignOTPTest extends BaseLib {

    @Test(priority = 1, groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "VerifyCampaignOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void verifyCampaignOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String OTPvalue = FetchCampaignOTP.OTP;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),OTPvalue);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyCampaignOTP.validInput(bodyData); 
        Assert.assertEquals(VerifyCampaignOTP.code, 200,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyCampaignOTP.message.equalsIgnoreCase("JWT"), "Response Body Validation failed -OTP not sent");	
    	String Auth_Token = VerifyCampaignOTP.Access_token_Value;

    }
    
	//	Method is used to Verify Functionality of Arena FMP API to Verify Campaign OTP with Already verified

    @Test(priority = 2, groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "VerifyCampaignOTP_AlredayVerifiedOTP", dataProviderClass = DataProviderSource.class)
    public void verifyCampaignOTP_OTP_Already_Verified(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	String OTPvalue = FetchCampaignOTP.OTP;
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),OTPvalue);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyCampaignOTP.OTP_AlreadyVerified(bodyData); 
        Assert.assertEquals(VerifyCampaignOTP.code, 409,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyCampaignOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed ");	
        Assert.assertTrue(VerifyCampaignOTP.message.equalsIgnoreCase("OTP already verified"), "Response Body Validation failed -");	

        
    }
    
	//	Method is used to Verify Functionality of Arena FMP API to Verify Campaign OTP with Invalid OTP format

    @Test(priority = 3, groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "VerifyCampaignOTP_Invalid_OTP_FORMAT", dataProviderClass = DataProviderSource.class)
    public void verifyCampaignOTP_Invalid_OTP_Format(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),"ABCD");
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyCampaignOTP.invalid_OTP_FORMAT(bodyData); 
        Assert.assertEquals(VerifyCampaignOTP.code, 409,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyCampaignOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed -");	
        Assert.assertTrue(VerifyCampaignOTP.message.equalsIgnoreCase("Invalid OTP format"), "Response Body Validation failed -");	

        
    }
    
	//	Method is used to Verify Functionality of Arena FMP API to Verify Campaign OTP with Invalid OTP 

    @Test(priority = 4, groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "VerifyCampaignOTP_Invalid_OTP", dataProviderClass = DataProviderSource.class)
    public void verifyCampaignOTP_Invalid_OTP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),data.get("channel"),"1234");
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	VerifyCampaignOTP.invalid_OTP(bodyData); 
        Assert.assertEquals(VerifyCampaignOTP.code, 409,"Status Code Validation Failed for Verify OTP API");
        Assert.assertTrue(VerifyCampaignOTP.Status.equalsIgnoreCase("Failure"), "Response Body Validation failed -");	

        
    }   
    
    
}