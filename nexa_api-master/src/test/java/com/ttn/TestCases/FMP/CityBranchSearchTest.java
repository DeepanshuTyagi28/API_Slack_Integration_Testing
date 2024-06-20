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
import com.ttn.BusinessLogic.FMP.CityBranchSearch;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SearchCity;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.CityBranchPojo;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.SearchCityPojo;
/**
 * @author Deepanshu Tyagi
 * 
 * This class is used to Get Active Enquiry
 */

// TC 1 :- Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Valid Input
public class CityBranchSearchTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "CityBranchSearch_ValidInput", dataProviderClass = DataProviderSource.class)
    public void cityBranchSearch_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityBranchPojo CityBranchPojo = new CityBranchPojo(data.get("search_text"),data.get("financier_id"),data.get("city"));
    	String bodyData=jsonSerializer.serialize(CityBranchPojo);
    	CityBranchSearch.ValidInput(bodyData); 
        Assert.assertEquals(CityBranchSearch.code, 200,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(CityBranchSearch.Status.equalsIgnoreCase("Success"), "Response Body validation Failed");	     
    }
    
    
//	 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Blank Search text
   
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "CityBranchSearch_Blank_search_text", dataProviderClass = DataProviderSource.class)
    public void cityBranchSearch_Blank_search_text(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityBranchPojo CityBranchPojo = new CityBranchPojo(data.get("search_text"),data.get("financier_id"),data.get("city"));
    	String bodyData=jsonSerializer.serialize(CityBranchPojo);
    	CityBranchSearch.blank_search_text(bodyData); 
        Assert.assertEquals(CityBranchSearch.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(CityBranchSearch.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	
        Assert.assertTrue(CityBranchSearch.Error.equalsIgnoreCase("searchText can't be empty"),"Response Body validation Failed");	 

    }
    
//	Method is used to Verify Functionality Of Arena FMP API to Search City Branch with short Length Search text Keyword(Length of 3 Words are required in order to execute test with search field)
 
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "CityBranchSearch_Blank_search_text_ShortLength", dataProviderClass = DataProviderSource.class)
    public void cityBranchSearch_shortlength_search_text(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityBranchPojo CityBranchPojo = new CityBranchPojo(data.get("search_text"),data.get("financier_id"),data.get("city"));
    	String bodyData=jsonSerializer.serialize(CityBranchPojo);
    	CityBranchSearch.length_search_text(bodyData); 
        Assert.assertEquals(CityBranchSearch.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(CityBranchSearch.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	
        Assert.assertTrue(CityBranchSearch.Error.equalsIgnoreCase("min length of search text should be 3"),"Response Body validation Failed");	 

    }
    
    
//	 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Blank financier_id
    
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "CityBranchSearch_Blank_financier_id", dataProviderClass = DataProviderSource.class)
    public void cityBranchSearch_Blank_financier_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityBranchPojo CityBranchPojo = new CityBranchPojo(data.get("search_text"),data.get("financier_id"),data.get("city"));
    	String bodyData=jsonSerializer.serialize(CityBranchPojo);
    	CityBranchSearch.blank_financier_id(bodyData); 
        Assert.assertEquals(CityBranchSearch.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(CityBranchSearch.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	 
        Assert.assertTrue(CityBranchSearch.Error.equalsIgnoreCase("Financier Id cannot be empty"),"Response Body validation Failed");	 

    }
    
    
//	 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Invalid financier_id
    
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "CityBranchSearch_Invalid_financier_id", dataProviderClass = DataProviderSource.class)
    public void cityBranchSearch_Invalid_financier_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CityBranchPojo CityBranchPojo = new CityBranchPojo(data.get("search_text"),data.get("financier_id"),data.get("city"));
    	String bodyData=jsonSerializer.serialize(CityBranchPojo);
    	CityBranchSearch.invalid_Financier_Id(bodyData); 
        Assert.assertEquals(CityBranchSearch.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(CityBranchSearch.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	 
        Assert.assertTrue(CityBranchSearch.Error.equalsIgnoreCase("Financier not exist"),"Response Body validation Failed");	 

    }
    
//	 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Blank city 
    
   @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "CityBranchSearch_Blank_City", dataProviderClass = DataProviderSource.class)
   public void cityBranchSearch_Blank_city(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
   {
   	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
   	CityBranchPojo CityBranchPojo = new CityBranchPojo(data.get("search_text"),data.get("financier_id"),data.get("city"));
   	String bodyData=jsonSerializer.serialize(CityBranchPojo);
   	CityBranchSearch.blank_City(bodyData); 
       Assert.assertEquals(CityBranchSearch.code, 409,"Status Code Validation Failed for Search City API");
       Assert.assertTrue(CityBranchSearch.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	 
       Assert.assertTrue(CityBranchSearch.Error.equalsIgnoreCase("City can't be empty"),"Response Body validation Failed");	 

   }
    
}