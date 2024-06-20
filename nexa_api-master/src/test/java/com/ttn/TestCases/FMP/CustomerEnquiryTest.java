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
import com.ttn.BusinessLogic.FMP.CustomerEnquiry;
import com.ttn.BusinessLogic.FMP.FetchOTP;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.CustomerEnquiryPojo;
import com.ttn.pojoClasses.HyperEnquiryGenerate_Pojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * 
 * This class is used to Get Customer Enquiry
 */

// TC 1 :- 
  public class CustomerEnquiryTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
    
  //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry
    public void customerEnquiry_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
    	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
    	CustomerEnquiry.validInput(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 201, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Success"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.message.equalsIgnoreCase("Created Successfully"), "Response Body validation failed");	

    }
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank first_name

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_FirstName", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_FirstName(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_first_name(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("First Name is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid first_name Format

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_FirstName", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_FirstName(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_Format_first_name(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Invalid First name format"), "Response Body validation failed");	

      }  
    
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank Email

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Email", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Email(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_email(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Email is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid Email Format

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Email", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Email(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_Format_email(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Invalid Email format"), "Response Body validation failed");	

      }  
    
 
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank Mobile

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Mobile", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),data.get("mobile"),data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_Mobile(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 401, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	

      }   
  
    
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank DOB

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_DOB", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_DOB(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_dob(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Dob is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid DOB Format

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_DOB", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_DOB(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_Format_dob(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Invalid Dob format"), "Response Body validation failed");	

      }  
    
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank city

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_city", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_City(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_city(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("City is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid city

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_city", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_City(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_city(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("city not exists"), "Response Body validation failed");	

      }  
    
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank state

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_state", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_State(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_state(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("State is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid State

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_State", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_State(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_state(bodyData); 
      	System.out.println(bodyData);
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("state not exists"), "Response Body validation failed");	

      }  
    
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank dealer

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Dealer", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Dealer(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_dealer(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Dealer is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid Dealer

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Dealer", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Dealer(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_dealer(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("dealer not exists"), "Response Body validation failed");	

      }  
    
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank car_model

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Car_model", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Car_model(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_car_model(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Car model is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid Car_model

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Car_model", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Car_model(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_car_model(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("car model not exists"), "Response Body validation failed");	

      } 
    
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank car_variant

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Car_Variant", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Car_Variant(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_car_variant(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Car Variant is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid car_variant

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Car_Variant", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Car_Variant(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_car_variant(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("car variant not exists "), "Response Body validation failed");	

      } 

    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank disclaimer_flag

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Disclaimer_Flag", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Disclaimer_Flag(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_disclaimer_flag(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Disclaimer flag is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid disclaimer_flag

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Disclaimer_Flag", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Disclaimer_Flag(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_disclaimer_flag(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Invalid disclaimer flag value"), "Response Body validation failed");	

      } 

    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank channel

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Channel", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Channel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_channel(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Channel is mandatory"), "Response Body validation failed");	

      }  
    
   
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid channel

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Channel", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Channel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_channel(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 401, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Invalid Token"), "Response Body validation failed");	

      } 

    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank color_code

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Color_Code", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Color_Code(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_color_code(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("color code is mandatory"), "Response Body validation failed");	

      }  

  
  
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank color_description

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Color_Description", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Color_Description(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_color_description(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("color description is mandatory"), "Response Body validation failed");	

      }  
    
    
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank color_indicator

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Color_Indicator", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Color_Indicator(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_color_indicator(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("color indicator is mandatory"), "Response Body validation failed");	

      }  
    
    
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid color_indicator

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Color_Indicator", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Color_Indicator(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_color_indicator(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("color indicator invalid"), "Response Body validation failed");	

      } 

    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank fuel_type

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Blank_Fuel_Type", dataProviderClass = DataProviderSource.class)
    
      public void customerEnquiry_Blank_Fuel_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.blank_fuel_type(bodyData); 
        Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
        Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
        Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Fuel Type cannot be empty"), "Response Body validation failed");	

      }  
    
    
    //Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid fuel_type

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CustomerEnquiry_Invalid_Fuel_Type", dataProviderClass = DataProviderSource.class)
          public void customerEnquiry_Invalid_Fuel_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
      {
      	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
      	CustomerEnquiryPojo CustomerEnquiryPojo = new CustomerEnquiryPojo(data.get("first_name"),data.get("last_name"),data.get("email"),PhoneNumberGenerator.randomMobileNumber,data.get("dob"),data.get("city"),data.get("state"),data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("disclaimer_flag"),data.get("channel"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("fuel_type"),data.get("force_create_flag"),data.get("existing_enquiry_id"));
      	String bodyData=jsonSerializer.serialize(CustomerEnquiryPojo);
      	CustomerEnquiry.invalid_fuel_type(bodyData); 
          Assert.assertEquals(CustomerEnquiry.code, 409, "Status Code Validation Failed for Customer Enquiry");
          Assert.assertTrue(CustomerEnquiry.Status.equalsIgnoreCase("Failure"), "Response Body validation failed");	
          Assert.assertTrue(CustomerEnquiry.ErrorMessage.equalsIgnoreCase("Fuel Type does not exist"), "Response Body validation failed");	

      } 
    

}