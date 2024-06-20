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
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.BookTestDriveHyperEnquiryGenerate;
import com.ttn.BusinessLogic.FMP.AllCity;
import com.ttn.BusinessLogic.FMP.AllColor;
import com.ttn.BusinessLogic.FMP.CarModel;
import com.ttn.BusinessLogic.FMP.CustomerDataEnquiryDetail;
import com.ttn.BusinessLogic.FMP.CustomerEnquiry;
import com.ttn.BusinessLogic.FMP.DocsEmploymentType;
import com.ttn.BusinessLogic.FMP.DownloadSanctionLetter;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to FMP Download Sanction Letter API
 */

// TC 1 :- Method is used to Verify Functionality of FMP DownloadSanctionLetter API

public class DownloadSanctionLetterTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression", "ARENA","Prod"})
    public void downloadSanctionLetter_ValidInput() throws EncryptedDocumentException, IOException, SerializeException
    {
          DownloadSanctionLetter.validInput(); 
          Assert.assertEquals(DownloadSanctionLetter.code, 200,"Status Code Validation Failed for DownloadSanctionLetter API");

    }
    

  
}