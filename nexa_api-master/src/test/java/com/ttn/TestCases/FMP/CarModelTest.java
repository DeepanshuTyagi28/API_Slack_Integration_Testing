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
import com.ttn.BusinessLogic.FMP.CarModel;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to get car model
 */

//Method is used to Verify Functionality to Arena API for FMP Module: Car Model with Valid Input
public class CarModelTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA"})
    public void carModel_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	CarModel.validInput(); 
        Assert.assertEquals(CarModel.code, 200,"Status Code Validation Failed for Car Model API");
        Assert.assertTrue(CarModel.Status.equalsIgnoreCase("Success"),"Response Body validation failed");	

    }
    
	//Method is used to Verify Functionality to Arena API for FMP Module: Car Model with Invalid Channel ID

    @Test(groups = {"Sanity", "Regression","ARENA"})
    public void carModel_Invalid_ChannelID() throws EncryptedDocumentException, IOException, SerializeException
    {
    	CarModel.invalid_ChannelID(); 
        Assert.assertEquals(CarModel.code, 500,"Status Code Validation Failed for Car Model API");
        Assert.assertTrue(CarModel.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	

    }

	//Method is used to Verify Functionality to Arena API for FMP Module: Car Model with Blank Channel ID

    @Test(groups = {"Sanity", "Regression","ARENA"})
    public void carModel_Blank_ChannelID() throws EncryptedDocumentException, IOException, SerializeException
    {
    	CarModel.blank_ChannelID(); 
        Assert.assertEquals(CarModel.code, 200,"Status Code Validation Failed for Car Model API");
        Assert.assertTrue(CarModel.Status.equalsIgnoreCase("Success"), "Response Body validation failed");	

    }
    
}