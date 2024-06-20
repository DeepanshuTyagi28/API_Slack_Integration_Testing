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
import com.ttn.BusinessLogic.BookTestDriveHyperEnquiryGenerate;
import com.ttn.BusinessLogic.Campaign.ActiveCampaignEnquiry;
import com.ttn.BusinessLogic.FMP.ActiveEnquiry;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * 
 * This class is used to Get Active Campaign  Enquiry
 */

// TC 1 :- 
  public class ActiveCampaignEnquiryTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "ActiveCampaignEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
    
  //Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry
    public void activeCampaignEnquiry_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveCampaignEnquiry.validInput(bodyData); 
        Assert.assertEquals(ActiveCampaignEnquiry.code, 200, "Status Code Validation Failed for Active Campaign Enquiry");
        Assert.assertTrue(ActiveCampaignEnquiry.Status.equalsIgnoreCase("Success"), "Response Body validation failed");	

        
    }
    
    // Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Blank Authorization Token

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveCampaignEnquiry_Blank_AuthToken", dataProviderClass = DataProviderSource.class)
    public void activeCampaignEnquiry_Blank_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveCampaignEnquiry.blank_AuthToken(bodyData); 
        Assert.assertEquals(ActiveCampaignEnquiry.code, 401, "Status Code Validation Failed for Active Campaign Enquiry");
        Assert.assertTrue(ActiveCampaignEnquiry.Message.equalsIgnoreCase("Unauthorized Access"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Invalid Authorization Token

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveCampaignEnquiry_Invalid_AuthToken", dataProviderClass = DataProviderSource.class)
    public void activeCampaignEnquiry_Invalid_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveCampaignEnquiry.invalid_AuthToken(bodyData); 
        Assert.assertEquals(ActiveCampaignEnquiry.code, 401, "Status Code Validation Failed for Active Campaign Enquiry");
        Assert.assertTrue(ActiveCampaignEnquiry.Message.equalsIgnoreCase("Unauthorized Access"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Blank Mobile Number

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveCampaignEnquiry_Blank_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void activeCampaignEnquiry_Blank_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveCampaignEnquiry.blank_MobileNumber(bodyData); 
        Assert.assertEquals(ActiveCampaignEnquiry.code, 409, "Status Code Validation Failed for Active Campaign Enquiry");
        Assert.assertTrue(ActiveCampaignEnquiry.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(ActiveCampaignEnquiry.Message.equalsIgnoreCase("Mobile is mandatory"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Invalid Mobile Number

    @Test(groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "ActiveCampaignEnquiry_Invalid_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void activeCampaignEnquiry_Invalid_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(data.get("mobile"),null,null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	ActiveCampaignEnquiry.invalid_MobileNumber(bodyData); 
        Assert.assertEquals(ActiveCampaignEnquiry.code, 409, "Status Code Validation Failed for Active Campaign Enquiry");
        Assert.assertTrue(ActiveCampaignEnquiry.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(ActiveCampaignEnquiry.Message.equalsIgnoreCase("Invalid Mobile format"), "Response Body validation failed");	

        
    }
 
}