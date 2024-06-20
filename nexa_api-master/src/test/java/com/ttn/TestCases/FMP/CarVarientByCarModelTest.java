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
import com.ttn.BusinessLogic.FMP.CarVarientByCarModel;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to get car varient by car model
 */

 //Method is used to Verify Functionality to Arena API for FMP Module: Car Variant By Car Model with Valid Input
   public class CarVarientByCarModelTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression","ARENA"})
    public void carVarientByCarModel_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	CarVarientByCarModel.validInput(); 
        Assert.assertEquals(CarVarientByCarModel.code, 200, "Status Code Validation Failed for Car Variant By Car Model API");
        Assert.assertTrue(CarVarientByCarModel.Status.equalsIgnoreCase("Success"),"Response Body validation failed");	
        Assert.assertTrue(CarVarientByCarModel.message.equalsIgnoreCase("150002"),"Response Body validation failed");	

    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: Car Variant By Car Model with Invalid Input

    @Test(groups = {"Sanity", "Regression","ARENA"})
    public void carVarientByCarModel_InvalidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	CarVarientByCarModel.invalidInput(); 
        Assert.assertEquals(CarVarientByCarModel.code, 200 ,"Status Code Validation Failed for Car Variant By Car Model API");
        Assert.assertTrue(CarVarientByCarModel.Status.equalsIgnoreCase("Success"),"Response Body validation failed");	

    }
    
}