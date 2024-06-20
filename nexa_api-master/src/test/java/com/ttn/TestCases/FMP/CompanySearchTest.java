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
import org.testng.annotations.Test;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.BookTestDriveHyperEnquiryGenerate;
import com.ttn.BusinessLogic.FMP.ActiveEnquiry;
import com.ttn.BusinessLogic.FMP.CompanyOffer;
import com.ttn.BusinessLogic.FMP.CompanySearch;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.CompanyOfferPojo;
import com.ttn.pojoClasses.CompanySearchPojo;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/*
  @author Deepanshu Tyagi
 */


// TC 1 :- Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanySearch

  public class CompanySearchTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanySearch_ValidInput", dataProviderClass = DataProviderSource.class)
    
    public void CompanySearch_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
   
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanySearchPojo CompanySearchPojo = new CompanySearchPojo(data.get("search_text"));
    	String bodyData=jsonSerializer.serialize(CompanySearchPojo);
    	CompanySearch.validInput(bodyData); 
        Assert.assertEquals(CompanySearch.code, 200, "Status Code Validation Failed for Company Search");
        
    }
    
    
    //Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/Company Search with Minimum Search Criteria (Less than 3 Work)
   
    
  @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanySearch_InvalidInput", dataProviderClass = DataProviderSource.class)
    
    public void CompanySearch_invalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
   
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanySearchPojo CompanySearchPojo = new CompanySearchPojo(data.get("search_text"));
    	String bodyData=jsonSerializer.serialize(CompanySearchPojo);
    	CompanySearch.invalidInput(bodyData); 
        Assert.assertEquals(CompanySearch.code, 409, "Status Code Validation Failed for Company Search");
        Assert.assertEquals(CompanySearch.Status, "Failure", "Response Body Validation Failed for Company Search");
        Assert.assertEquals(CompanySearch.ErrorCode, "Invalid Length( Length should be greater or equal to 3)", "Response Body Error Code Validation Failed for Company Search");

        
    }
   
}