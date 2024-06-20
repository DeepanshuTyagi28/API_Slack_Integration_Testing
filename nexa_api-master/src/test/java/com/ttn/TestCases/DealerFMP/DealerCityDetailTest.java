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
import com.ttn.BusinessLogic.DealerFMP.DealerCityDetail;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Generate/Send Campaign OTP
 */

 // Method is used to Verify Functionality for  FMP API To get Dealer Detail with valid Input

public class DealerCityDetailTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA"})
    public void dealerCityDetail_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	DealerCityDetail.validInput(); 
        Assert.assertEquals(DealerCityDetail.code, 200,"Status Code Validation Failed for Send Dealer FMP OTP API");
        Assert.assertTrue(DealerCityDetail.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	

    }
	
    //	 	 Method is used to Verify Functionality for  FMP API To get Dealer Detail with invalid Input
  

    @Test(groups = {"Sanity", "Regression" , "ARENA"})
    public void dealerCityDetail_invalidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	DealerCityDetail.invalidInput(); 
        Assert.assertEquals(DealerCityDetail.code, 400,"Status Code Validation Failed for Send Dealer FMP OTP API");
    }
}