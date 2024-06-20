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
import com.ttn.BusinessLogic.FMP.DocsEmploymentType;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to get DocsEmploymentType API
 */

// TC 1 :- Method is used to Verify Functionality of FMP DocsEmploymentType API

public class DocsEmploymentTypeTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression", "ARENA"})
    public void docsEmploymentType_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
    	DocsEmploymentType.validInput(); 
        Assert.assertEquals(DocsEmploymentType.code, 200,"Status Code Validation Failed for DocsEmploymentType API");

    }
 
//Method is used to Verify Functionality of FMP DocsEmploymentType API with Invalid Sub Employment ID
    
    @Test(groups = {"Sanity", "Regression", "ARENA"})
    public void docsEmploymentType_Invalid_subEmploymentId() throws EncryptedDocumentException, IOException, SerializeException
    {
    	DocsEmploymentType.invalid_subEmploymentId(); 
        Assert.assertEquals(DocsEmploymentType.code, 409,"Status Code Validation Failed for DocsEmploymentType API");
        Assert.assertEquals(DocsEmploymentType.Status,"Failure","Response code Validation Failed for DocsEmploymentType API");

    } 
    
//Method is used to Verify Functionality of FMP DocsEmploymentType API with Blank Sub Employment ID
    
    @Test(groups = {"Sanity", "Regression", "ARENA"})
    public void docsEmploymentType_Blank_subEmploymentId() throws EncryptedDocumentException, IOException, SerializeException
    {
    	DocsEmploymentType.blank_subEmploymentId(); 
        Assert.assertEquals(DocsEmploymentType.code, 409,"Status Code Validation Failed for DocsEmploymentType API");
        Assert.assertEquals(DocsEmploymentType.Status,"Failure","Response code Validation Failed for DocsEmploymentType API");

    }   
}