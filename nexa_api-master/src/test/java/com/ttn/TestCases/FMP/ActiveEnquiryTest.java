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
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.BookTestDriveHyperEnquiryGenerate;
import com.ttn.BusinessLogic.FMP.ActiveEnquiry;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * 
 * This class is used to Get Active Enquiry
 */

// TC 1 :- 
  public class ActiveEnquiryTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "ActiveEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
    
  //Method is used to Verify Functionality to Arena API for FMP Module: Active Enquiry
    public void activeEnquiry_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(PhoneNumberGenerator.randomMobileNumber,null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveEnquiry.validInput(bodyData); 
        Assert.assertEquals(ActiveEnquiry.code, 200, "Status Code Validation Failed for Active Enquiry");
        Assert.assertTrue(ActiveEnquiry.Status.equalsIgnoreCase("Success"), "Response Body validation failed");	

        
    }
    
    // Method is used to Verify Functionality to Arena API for FMP Module: Active Enquiry with Blank Authorization Token

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveEnquiry_Blank_AuthToken", dataProviderClass = DataProviderSource.class)
    public void activeEnquiry_Blank_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(PhoneNumberGenerator.randomMobileNumber,null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveEnquiry.blank_AuthToken(bodyData); 
        Assert.assertEquals(ActiveEnquiry.code, 401, "Status Code Validation Failed for Active Enquiry");
        Assert.assertTrue(ActiveEnquiry.Message.equalsIgnoreCase("Unauthorized Access"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Active Enquiry with Invalid Authorization Token

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveEnquiry_Invalid_AuthToken", dataProviderClass = DataProviderSource.class)
    public void activeEnquiry_Invalid_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(PhoneNumberGenerator.randomMobileNumber,null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveEnquiry.invalid_AuthToken(bodyData); 
        Assert.assertEquals(ActiveEnquiry.code, 401, "Status Code Validation Failed for Active Enquiry");
        Assert.assertTrue(ActiveEnquiry.Message.equalsIgnoreCase("Unauthorized Access"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Active Enquiry with Blank Mobile Number

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveEnquiry_Blank_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void activeEnquiry_Blank_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveEnquiry.blank_MobileNumber(bodyData); 
        Assert.assertEquals(ActiveEnquiry.code, 409, "Status Code Validation Failed for Active Enquiry");
        Assert.assertTrue(ActiveEnquiry.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(ActiveEnquiry.Message.equalsIgnoreCase("Mobile is mandatory"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Active Enquiry with Invalid Mobile Number

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveEnquiry_Invalid_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void activeEnquiry_Invalid_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveEnquiry.invalid_MobileNumber(bodyData); 
        Assert.assertEquals(ActiveEnquiry.code, 409, "Status Code Validation Failed for Active Enquiry");
        Assert.assertTrue(ActiveEnquiry.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(ActiveEnquiry.Message.equalsIgnoreCase("Invalid Mobile format"), "Response Body validation failed");	

        
    }
 
}