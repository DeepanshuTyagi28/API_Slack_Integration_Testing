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
import com.ttn.BusinessLogic.DealerFMP.DealerSendFMPOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Generate/Send Campaign OTP
 */

 // Method is used to Verify Functionality to generate/ Send Campaign OTP Functionality with valid Input
public class DealerSendFMPOTPTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SendDealerFMPOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_Send_OTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin") , null , null);
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerSendFMPOTP.validInput(bodyData); 
        Assert.assertEquals(DealerSendFMPOTP.code, 200,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerSendFMPOTP.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	
        Assert.assertTrue(DealerSendFMPOTP.message.equalsIgnoreCase("OTP sent successfully"), "Response Body Validation failed -OTP not sent Dealer FMP API");	

    }
    
   
    
    // Method is used to Verify Functionality to generate/ Send Campaign OTP Functionality with invalid Input

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SendDealerFMPOTP_InvalidInput", dataProviderClass = DataProviderSource.class)
    public void dealerFMP_Send_OTP_InvalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	MspinPojo MspinPojo = new MspinPojo(data.get("mspin"), null , null);
    	String bodyData=jsonSerializer.serialize(MspinPojo);
    	DealerSendFMPOTP.invalidInput(bodyData); 
        Assert.assertEquals(DealerSendFMPOTP.code, 500,"Status Code Validation Failed for Send Dealer FMP OTP API");

    } 
}