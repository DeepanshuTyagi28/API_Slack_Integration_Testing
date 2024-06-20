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
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.CompanyOfferPojo;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
  @author Deepanshu Tyagi
 */

// TC 1 :- Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers

  public class CompanyOfferTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_ValidInput", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.validInput(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 200, "Status Code Validation Failed for Company offer");
    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank dealer_code

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Blank_dealer_code", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Blank_Dealer_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.blank_Dealer_Code(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 409, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");
        Assert.assertEquals(CompanyOffer.ErrorCode, "Dealer code is mandatory", "Response Body Validation Failed with Blank Dealer Code");
    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid dealer_code

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Invalid_dealer_code", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Invalid_Dealer_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.invalid_Dealer_Code(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 500, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");

    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank variant_code

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Blank_variant_code", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Blank_Variant_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.blank_variant_code(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 409, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");
        Assert.assertEquals(CompanyOffer.ErrorCode, "variant_code is a mandatory field", "Response Body Validation Failed with Blank variant_code");
    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid variant_code

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Invalid_variant_code", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Invalid_Variant_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.invalid_variant_code(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 500, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");

    }
 
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank model_code

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Blank_model_code", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Blank_Model_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.blank_model_code(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 409, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");
        Assert.assertEquals(CompanyOffer.ErrorCode, "Model code is mandatory", "Response Body Validation Failed with Blank model_code");
    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid model_code

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Invalid_model_code", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Invalid_Model_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.invalid_model_code(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 500, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");

    }
 
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank company_id

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Blank_company_id", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Blank_company_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.blank_company_id(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 409, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");
        Assert.assertEquals(CompanyOffer.ErrorCode, "company_id is mandatory and should be a numeric value", "Response Body Validation Failed with Blank company_id");
    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid company_id

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Invalid_company_id", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Invalid_company_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.invalid_company_id(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 409, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");

    }
   
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank fuel_type

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Blank_fuel_type", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Blank_fuel_type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.blank_fuel_type(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 409, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");
        Assert.assertEquals(CompanyOffer.ErrorCode, "Invalid fuel type value", "Response Body Validation Failed with Blank fuel_type");
    }
    
    
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid fuel_type

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CompanyOffer_Invalid_fuel_type", dataProviderClass = DataProviderSource.class)
    
    public void companyOffer_Invalid_fuel_type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CompanyOfferPojo CompanyOfferPojo = new CompanyOfferPojo(data.get("dealer_code"),data.get("variant_code"),data.get("model_code"),data.get("fuel_type"),data.get("company_id"));
    	String bodyData=jsonSerializer.serialize(CompanyOfferPojo);
    	CompanyOffer.invalid_fuel_type(bodyData); 
        Assert.assertEquals(CompanyOffer.code, 409, "Status Code Validation Failed for Company offer");
        Assert.assertEquals(CompanyOffer.Status, "Failure", "Response Body Validation Failed");

    } 
}