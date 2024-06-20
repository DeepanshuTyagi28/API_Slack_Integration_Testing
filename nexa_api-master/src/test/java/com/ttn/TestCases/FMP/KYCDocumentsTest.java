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
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to get KYC Documents
 */

 // Method is used to Verify Functionality of Arena FMP to Get KYC Documents 
public class KYCDocumentsTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA"})
    public void KYCDocument_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	KYCDocuments.validInput(); 
        Assert.assertEquals(KYCDocuments.code, 200 ,"Status Code Validation Failed for Car Model API");
        Assert.assertTrue(KYCDocuments.Status.equalsIgnoreCase("Success"), "Response body Validation failed");	

    }
 }