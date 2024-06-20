package com.ttn.TestCases.LoanSubmission;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.Campaign.SendCampaignOTP;
import com.ttn.BusinessLogic.DMS.EnquiryGenerate;
import com.ttn.BusinessLogic.DealerFMP.DealerActiveEnquiry;
import com.ttn.BusinessLogic.FMP.CustomerEnquiry;
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.BusinessLogic.LoanSubmission.SelectedCar;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.CarEnquiryPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify 
 */

 // Method is used to Verify Functionality to  Loan Submission Selected Car

    public class SelectedCarTest extends BaseLib {

        @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_ValidInput", dataProviderClass = DataProviderSource.class)
        public void selectedCar_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
        {
		    CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new
		    CarEnquiryPojo.CarSummary( data.get("color_description"), data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),	  data.get("tcs"), 
		    List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
        	ObjectMapper mapper = new ObjectMapper();
    	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            StringWriter sw = new StringWriter();
            mapper.writeValue(sw , CarEnquiryPojo);
            String bodyData=sw.toString();  
            SelectedCar.validInput(bodyData);
            Assert.assertEquals(SelectedCar.code, 200,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
            Assert.assertEquals(SelectedCar.Status, "Success","Response Body Validation Failed for Selecte Car");
            Assert.assertEquals(SelectedCar.enquiry_id, CustomerEnquiry.CustomerenquiryID,"Enqiry ID Doesnt matched for Updating the Selected Car API");
            Assert.assertEquals(SelectedCar.message, "Car Summary Created","Response Body Validation Failed for Selecte Car");

        } 
        
        
    // Method is used to Verify Functionality to  Loan Submission Selected Car with Blank Enquiry ID

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_EnquiryID", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_EnquiryID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(data.get("enquiry_id"), new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_Enquiry_Id(bodyData);
        Assert.assertEquals(SelectedCar.code, 403,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
    // Method is used to Verify Functionality to  Loan Submission Selected Car with Invalid Enquiry ID

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_EnquiryID", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_EnquiryID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(data.get("enquiry_id"), new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_Enquiry_Id(bodyData);
        Assert.assertEquals(SelectedCar.code, 403,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank color_description 	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_color_description", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Color_Description(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_color_description(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank color_indicator	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Color_Indicator", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Color_Indicator(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_color_indicator(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid color_indicator	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Color_Indicator", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Color_Indicator(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_color_indicator(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank customer_type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Customer_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Customer_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_customer_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid customer_type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Customer_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Customer_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_customer_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
    
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank buyer_type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Buyer_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Buyer_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_buyer_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid buyer_type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Buyer_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Buyer_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_buyer_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing sales_type

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Sales_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Sales_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_sales_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid Sales_Type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Sales_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Sales_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_sales_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank fuel_type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Fuel_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Fuel_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_fuel_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid Fuel_Type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Fuel_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Fuel_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_fuel_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank ac_type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_AC_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_AC_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_ac_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid ac_type	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_AC_Type", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_AC_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_ac_type(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }    
 
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank dealer_code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Dealer_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Dealer_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_dealer_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid Dealer_Code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Dealer_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Dealer_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_dealer_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank model_code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Model_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Model_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_model_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid Model_Code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Model_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Model_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_model_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank variant_code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Variant_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Variant_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_variant_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid Variant_Code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_Variant_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_Variant_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_variant_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
   
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank state_code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_State_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_State_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_state_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid State Code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_State_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_State_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_state_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    } 
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank color_code	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_Color_Code", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_Color_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_color_code(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    

//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank on_road_price	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_On_Road_Price", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_On_Road_Price(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_on_road_price(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid On_Road_Price	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_On_Road_Price", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_On_Road_Price(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_on_road_price(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }
 
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank TCS	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Blank_TCS", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Blank_TCS(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
    	List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.blank_tcs(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }  
    
    
//	Method is used to Verify Functionality to Loan Submission Selected Car with Invalid TCS	

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SelectedCar_Invalid_TCS", dataProviderClass = DataProviderSource.class)
    public void selectedCar_Invalid_TCS(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	
    	CarEnquiryPojo CarEnquiryPojo = new CarEnquiryPojo(CustomerEnquiry.CustomerenquiryID, new CarEnquiryPojo.CarSummary( data.get("color_description"),data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),data.get("tcs"),
   		List.of(new CarEnquiryPojo.InsuranceData("15000", "1+3 years"))));
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CarEnquiryPojo);
        String bodyData=sw.toString();  
        SelectedCar.invalid_tcs(bodyData);
        Assert.assertEquals(SelectedCar.code, 409,"Status Code Validation Failed for Loan Submission Selected Car Enquiry Detail");
    }
    
 }	
	