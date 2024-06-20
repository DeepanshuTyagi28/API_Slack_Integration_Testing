package com.ttn.TestCases.DMS;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Hashtable;
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
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify DMS Generate Enquiry
 */

//  Method is used to Verify Functionality to DMS API Enquiry  generated with valid Input

    public class EnquiryGenerateTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_ValidInput", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"),"W"+RandomNumber.getRandomNumber(5) , data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.validInput(bodyData);
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
    } 
    
	
    
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Existing Enquiry generated

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_ExistingEnquiry", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_ExistingEnquiry(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), data.get("p_web_refid"), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.ExistingEnquiry(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.p_Enquiry_no, "ENQ23001186");
    } 
    
    
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank p_web_refid

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_web_refid", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_web_refid(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), data.get("p_web_refid") , data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_p_web_refid(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");
    }  
    
//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_book_date

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_book_date", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_book_date(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_book_date(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");
    }  
    
    
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_book_flag

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Invalid_P_book_flag", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Invalid_P_book_flag(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.invalid_P_book_flag(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Test Drive.");

    }  
    
    
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_title

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_tittle", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_title(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_title(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");

    }
    
    
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Cust_first_name

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_Cust_first_name", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_Cust_first_name(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_Cust_first_name(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");

    }
    
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Mobile_no

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_Model_cd", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_Model_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_Model_cd(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");

    }  
 
    
//  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Mobile_no

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Invalid_P_Model_cd", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Invalid_P_Model_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.invalid_P_Model_cd(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Please provide correct Model and Variant.");

    }  
    
    
    
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Variant_Cd

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_Variant_Cd", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_Variant_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_Variant_Cd(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");

    }  
 
    
    //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Variant_Cd

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Invalid_P_Variant_Cd", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Invalid_P_Variant_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.invalid_P_Variant_Cd(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Please provide correct Model and Variant.");

    }  
    
    
//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Color

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_Color", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_Color(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_Color(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");

    }  
 
    
    //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Color

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Invalid_P_Color", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Invalid_P_Color(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.invalid_P_Color(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Please provide valid color and variant combination.");

    }  
    
    
//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Dealer_code

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_Dealer_code", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_Dealer_code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_Dealer_code(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");

    }  
 
    
    //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Dealer_code

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Invalid_P_Dealer_code", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Invalid_P_Dealer_code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.invalid_P_Dealer_code(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Please check Dealer Code and For Code.ORA-01403: no data found");

    }  
    
    //  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_for_code

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_for_code", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_for_code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_for_code(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");
    }  
 
    
    //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_for_code

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Invalid_P_for_code", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Invalid_P_for_code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.invalid_P_for_code(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Please check Dealer Code and For Code.ORA-01403: no data found");

    } 
    
    
    //  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_customer_type

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_Blank_P_customer_type", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_Blank_P_customer_type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"), RandomNumber.getRandomNumber(5), data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.blank_P_customer_type(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
        Assert.assertEquals(EnquiryGenerate.message, "Can not generate Enquiry without mandatory data for Showroom Book.");
    } 
    
    
 //	 Method is used to Verify Functionality to DMS API Enquiry generate with Valid Input to Generate Enquiry Number In order to Validate LOST case in cancellation and Status check
   
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EnquiryGenerate_ValidInput_LostStatusEnquiry", dataProviderClass = DataProviderSource.class)
    public void enquiryGenerate_ValidInput_LostStatusEnquiry(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EnquiryGeneratePojo EnquiryGeneratePojo = new EnquiryGeneratePojo(data.get("p_pmc"),"W"+RandomNumber.getRandomNumber(5) , data.get("p_book_date") ,data.get("p_book_flag"),data.get("p_title") , data.get("p_Cust_first_name") ,data.get("p_Cust_middle_name"),data.get("p_Cust_last_name") , data.get("p_Mobile_no") ,data.get("p_add1"),data.get("p_add2") , data.get("p_add3") ,data.get("p_Model_cd"),data.get("p_Variant_Cd") , data.get("p_Color") ,data.get("p_Dealer_code"),data.get("p_for_code") , data.get("p_customer_type") ,data.get("p_city"),data.get("p_state") , data.get("p_pin") ,data.get("p_Email_id"),data.get("P_Tracking_Id") , data.get("P_Bank_Ref_No") ,data.get("P_Order_Status"),data.get("P_Payment_Mode") , data.get("P_Amount") ,data.get("p_book_pref_date"),data.get("p_book_pref_time") , data.get("p_test_drive_place") ,data.get("p_enq_mode"),data.get("p_enq_source") , data.get("p_platform") ,data.get("P_Account_Number") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EnquiryGeneratePojo);
        String bodyData=sw.toString();  
    	EnquiryGenerate.validInput_LostStatusEnquiry(bodyData); 
        Assert.assertEquals(EnquiryGenerate.code, 200,"Status Code Validation Failed for DMS Enquiry Generate API");
    } 
    
    
    }	
	