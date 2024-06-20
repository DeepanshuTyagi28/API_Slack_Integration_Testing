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
import com.ttn.BusinessLogic.FMP.AllCity;
import com.ttn.BusinessLogic.FMP.AllColor;
import com.ttn.BusinessLogic.FMP.CarModel;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to get All City
 */

// TC 1 :- Method is used to Verify Functionality of FMP ALL CITY API to Get all available City 

public class AllCityTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression", "ARENA"})
    public void AllCity_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	AllCity.validInput(); 
        Assert.assertEquals(AllCity.code, 200,"Status Code Validation Failed for ALL City API");
        Assert.assertTrue(AllCity.Status.equalsIgnoreCase("Success"), "Response Body validation failed");	

    }
 
    
}