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
import com.ttn.BusinessLogic.FMP.KYCDocuments;
import com.ttn.BusinessLogic.FMP.PersonalDetails;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to get Personal Details
 */

// TC 1 :- Method is used to Verify Functionality of Arena FMP to Get Personal Details with Valid inputs

public class PersonalDetailsTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA"})
    public void personalDetails_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	PersonalDetails.validInput(); 
        Assert.assertEquals(PersonalDetails.code, 200,"Status Code Validation Failed for Car Model API");
        Assert.assertTrue(PersonalDetails.Status.equalsIgnoreCase("Success"), "Response Body Validation failed");	
    }
 
    
}