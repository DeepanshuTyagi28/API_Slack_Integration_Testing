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
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SearchCity;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.SearchCityPojo;
/**
 * @author Deepanshu Tyagi
 * 
 * This class is used to Get Active Enquiry
 */

// TC 1 :- Method is used to Verify Functionality Of Arena FMP API to Search City with Valid Input
public class SearchCityTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "Searchcity_ValidInput", dataProviderClass = DataProviderSource.class)
    public void searchCity_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SearchCityPojo SearchCityPojo = new SearchCityPojo(data.get("search_text"),data.get("financier_id"));
    	String bodyData=jsonSerializer.serialize(SearchCityPojo);
    	SearchCity.ValidInput(bodyData); 
        Assert.assertEquals(SearchCity.code, 200,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(SearchCity.Status.equalsIgnoreCase("Success"), "Response Body validation Failed");	     
    }
    
    
//	 Method is used to Verify Functionality Of Arena FMP API to Search City with Blank Search text
   
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "Searchcity_Blank_search_text", dataProviderClass = DataProviderSource.class)
    public void searchCity_Bank_search_text(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SearchCityPojo SearchCityPojo = new SearchCityPojo(data.get("search_text"),data.get("financier_id"));
    	String bodyData=jsonSerializer.serialize(SearchCityPojo);
    	SearchCity.blank_search_text(bodyData); 
        Assert.assertEquals(SearchCity.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(SearchCity.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	
        Assert.assertTrue(SearchCity.Error.equalsIgnoreCase("search text can't be empty Please provide valid text in input"),"Response Body validation Failed");	 

    }
    
//	Method is used to Verify Functionality Of Arena FMP API to Search City with short Length Search text Keyword(Length of 3 Words are required in order to execute test with search field)
 
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "Searchcity_Blank_search_text_ShortLength", dataProviderClass = DataProviderSource.class)
    public void searchCity_shortlength_search_text(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SearchCityPojo SearchCityPojo = new SearchCityPojo(data.get("search_text"),data.get("financier_id"));
    	String bodyData=jsonSerializer.serialize(SearchCityPojo);
    	SearchCity.length_search_text(bodyData); 
        Assert.assertEquals(SearchCity.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(SearchCity.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	
        Assert.assertTrue(SearchCity.Error.equalsIgnoreCase("min length of search text should be 3"),"Response Body validation Failed");	 

    }
    
    
//	 Method is used to Verify Functionality Of Arena FMP API to Search City with Blank financier_id
    
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "Searchcity_Blank_financier_id", dataProviderClass = DataProviderSource.class)
    public void searchCity_Blank_financier_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SearchCityPojo SearchCityPojo = new SearchCityPojo(data.get("search_text"),data.get("financier_id"));
    	String bodyData=jsonSerializer.serialize(SearchCityPojo);
    	SearchCity.blank_financier_id(bodyData); 
        Assert.assertEquals(SearchCity.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(SearchCity.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	 
        Assert.assertTrue(SearchCity.Error.equalsIgnoreCase("Financier Id cannot be empty"),"Response Body validation Failed");	 

    }
    
    
//	 Method is used to Verify Functionality Of Arena FMP API to Search City with Invalid financier_id
    
    @Test(groups = {"Sanity", "Regression" ,"ARENA"}, dataProvider = "Searchcity_Invalid_financier_id", dataProviderClass = DataProviderSource.class)
    public void searchCity_Invalid_financier_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SearchCityPojo SearchCityPojo = new SearchCityPojo(data.get("search_text"),data.get("financier_id"));
    	String bodyData=jsonSerializer.serialize(SearchCityPojo);
    	SearchCity.invalid_Financier_Id(bodyData); 
        Assert.assertEquals(SearchCity.code, 409,"Status Code Validation Failed for Search City API");
        Assert.assertTrue(SearchCity.Status.equalsIgnoreCase("Failure"),"Response Body validation Failed");	 
        Assert.assertTrue(SearchCity.Error.equalsIgnoreCase("Financier not exist"),"Response Body validation Failed");	 

    }
    
}