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
import com.ttn.BusinessLogic.Campaign.SwitchTokenCampaign;
import com.ttn.BusinessLogic.FMP.ActiveEnquiry;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.SwitchTokenPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Get Switch Token campaign  
 * 
 */

// TC 1 :- 
  public class SwitchTokenCampaignTest extends BaseLib {

    @Test( priority = 7 ,groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "SwitchTokenCampaign_ValidInput", dataProviderClass = DataProviderSource.class)
    
  //Method is used to Verify Functionality to Arena API for FMP Module: Switch Token campaign 
    public void switchTokenCampaign_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SwitchTokenPojo SwitchTokenPojo = new SwitchTokenPojo(data.get("mobile"),data.get("channel_id"));
    	String bodyData=jsonSerializer.serialize(SwitchTokenPojo);
    	SwitchTokenCampaign.validInput(bodyData); 
        Assert.assertEquals(SwitchTokenCampaign.code, 200, "Status Code Validation Failed for Switch Token campaign ");
        Assert.assertTrue(SwitchTokenCampaign.access_token.equalsIgnoreCase("JWT"), "Response Body Access token is Not generated as JWT Token Type");	
    }
    
    // Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Blank Authorization Token

    @Test(priority = 1 , groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "SwitchTokenCampaign_Blank_AuthToken", dataProviderClass = DataProviderSource.class)
    public void switchTokenCampaign_Blank_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SwitchTokenPojo SwitchTokenPojo = new SwitchTokenPojo(data.get("mobile"),data.get("channel_id"));
    	String bodyData=jsonSerializer.serialize(SwitchTokenPojo);
    	SwitchTokenCampaign.blank_AuthToken(bodyData); 
        Assert.assertEquals(SwitchTokenCampaign.code, 401, "Status Code Validation Failed for Switch Token campaign ");
        Assert.assertTrue(SwitchTokenCampaign.Message.equalsIgnoreCase("Unauthorized Access"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Invalid Authorization Token

    @Test(priority = 2 ,groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "SwitchTokenCampaign_Invalid_AuthToken", dataProviderClass = DataProviderSource.class)
    public void switchTokenCampaign_Invalid_AuthToken(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SwitchTokenPojo SwitchTokenPojo = new SwitchTokenPojo(data.get("mobile"),data.get("channel_id"));
    	String bodyData=jsonSerializer.serialize(SwitchTokenPojo);
    	SwitchTokenCampaign.invalid_AuthToken(bodyData); 
        Assert.assertEquals(SwitchTokenCampaign.code, 401, "Status Code Validation Failed for Switch Token campaign ");
        Assert.assertTrue(SwitchTokenCampaign.Message.equalsIgnoreCase("Unauthorized Access"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Blank Mobile Number

    @Test(priority = 3 ,groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "SwitchTokenCampaign_Blank_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void switchTokenCampaign_Blank_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SwitchTokenPojo SwitchTokenPojo = new SwitchTokenPojo(data.get("mobile"),data.get("channel_id"));
    	String bodyData=jsonSerializer.serialize(SwitchTokenPojo);
    	SwitchTokenCampaign.blank_MobileNumber(bodyData); 
        Assert.assertEquals(SwitchTokenCampaign.code, 409, "Status Code Validation Failed for Switch Token campaign ");
        Assert.assertTrue(SwitchTokenCampaign.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(SwitchTokenCampaign.Message.equalsIgnoreCase("Mobile number is madatory"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Invalid Mobile Number

    @Test(priority = 4 ,groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "SwitchTokenCampaign_Invalid_MobileNumber", dataProviderClass = DataProviderSource.class)
    public void switchTokenCampaign_Invalid_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SwitchTokenPojo SwitchTokenPojo = new SwitchTokenPojo(data.get("mobile"),data.get("channel_id"));
    	String bodyData=jsonSerializer.serialize(SwitchTokenPojo);
    	SwitchTokenCampaign.invalid_MobileNumber(bodyData); 
        Assert.assertEquals(SwitchTokenCampaign.code, 409, "Status Code Validation Failed for Switch Token campaign ");
        Assert.assertTrue(SwitchTokenCampaign.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(SwitchTokenCampaign.Message.equalsIgnoreCase("Invalid mobile number"), "Response Body validation failed");	

        
    }

    
    // Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Blank channel_id

    @Test(priority = 5 ,groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "SwitchTokenCampaign_Blank_channel_id", dataProviderClass = DataProviderSource.class)
    public void switchTokenCampaign_Blank_Channel_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SwitchTokenPojo SwitchTokenPojo = new SwitchTokenPojo(data.get("mobile"),data.get("channel_id"));
    	String bodyData=jsonSerializer.serialize(SwitchTokenPojo);
    	SwitchTokenCampaign.blank_MobileNumber(bodyData); 
        Assert.assertEquals(SwitchTokenCampaign.code, 409, "Status Code Validation Failed for Switch Token campaign ");
        Assert.assertTrue(SwitchTokenCampaign.Status.equalsIgnoreCase("Failure"), "");	
     //   Assert.assertTrue(SwitchTokenCampaign.Message.equalsIgnoreCase("Mobile number is madatory"), "Response Body validation failed");	

        
    }
    
 // Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Invalid channel_id

    @Test(priority = 6 ,groups = {"Sanity", "Regression","ARENA","Prod"}, dataProvider = "SwitchTokenCampaign_Invalid_channel_id", dataProviderClass = DataProviderSource.class)
    public void switchTokenCampaign_Invalid_channel_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SwitchTokenPojo SwitchTokenPojo = new SwitchTokenPojo(data.get("mobile"),data.get("channel_id"));
    	String bodyData=jsonSerializer.serialize(SwitchTokenPojo);
    	SwitchTokenCampaign.invalid_MobileNumber(bodyData); 
        Assert.assertEquals(SwitchTokenCampaign.code, 409, "Status Code Validation Failed for Switch Token campaign ");
        Assert.assertTrue(SwitchTokenCampaign.Status.equalsIgnoreCase("Failure"), "");	
        Assert.assertTrue(SwitchTokenCampaign.Message.equalsIgnoreCase("Invalid channel id"), "Response Body validation failed");	

        
    }
}