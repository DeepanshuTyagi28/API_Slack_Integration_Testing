package com.ttn.TestCases.LoanSubmission;

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
import com.ttn.BusinessLogic.FMP.CustomerEnquiry;
import com.ttn.BusinessLogic.LoanSubmission.LoanApplicant;
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.LoanApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
/**
 * @author Deepanshu Tyagi
 */

 // Method is used to Verify Functionality to Loan Submission Loan Applicant API


    public class LoanApplicantTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "LoanApplicant_ValidInput", dataProviderClass = DataProviderSource.class)
    public void loanApplicant_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	LoanApplicantPojo LoanApplicantPojo = new LoanApplicantPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("title"),  data.get("father_name") ,data.get("gender"), data.get("pan") ,data.get("aadhar"),data.get("gross_annual_income") , data.get("net_annual_income") ,data.get("work_experience_years"),data.get("work_experience_months") , data.get("first_name") ,data.get("middle_name"),data.get("last_name") , data.get("email") ,data.get("dob"),data.get("residence_type") , data.get("employment_type") ,data.get("business_name"),data.get("defence_id") , data.get("financier_id") ,data.get("channel_id"),data.get("loan_applicant_id") , data.get("is_co_applicant_journey") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, LoanApplicantPojo);
        String bodyData=sw.toString();  
        LoanApplicant.validInput(bodyData);
        Assert.assertEquals(LoanApplicant.code, 200,"Status Code Validation Failed for Loan Submission loan Applicant API");
        Assert.assertEquals(LoanApplicant.Status, "Success","Responby Body Status failed");
        Assert.assertEquals(LoanApplicant.message, "Data saved successfully","Response Body Message failed");
        Assert.assertEquals(LoanApplicant.enquiry_id, CustomerEnquiry.CustomerenquiryID ,"Enquiry ID Doent Matched for Loan Applicant API");


    } 

    // Method is used to Verify Functionality to Loan Submission Loan Applicant API with Blank Enq ID
   
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "LoanApplicant_Blank_EnqID", dataProviderClass = DataProviderSource.class)
    public void loanApplicant_Blank_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	LoanApplicantPojo LoanApplicantPojo = new LoanApplicantPojo( data.get("enquiry_id") , PhoneNumberGenerator.randomMobileNumber ,data.get("title"),  data.get("father_name") ,data.get("gender"), data.get("pan") ,data.get("aadhar"),data.get("gross_annual_income") , data.get("net_annual_income") ,data.get("work_experience_years"),data.get("work_experience_months") , data.get("first_name") ,data.get("middle_name"),data.get("last_name") , data.get("email") ,data.get("dob"),data.get("residence_type") , data.get("employment_type") ,data.get("business_name"),data.get("defence_id") , data.get("financier_id") ,data.get("channel_id"),data.get("loan_applicant_id") , data.get("is_co_applicant_journey") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, LoanApplicantPojo);
        String bodyData=sw.toString();  
        LoanApplicant.blank_enquiryID(bodyData);
        Assert.assertEquals(LoanApplicant.code, 403,"Status Code Validation Failed for Loan Submission loan Applicant API");
    } 
    

    // Method is used to Verify Functionality to Loan Submission Loan Applicant API with Invalid Enq ID
   
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "LoanApplicant_Invalid_EnqID", dataProviderClass = DataProviderSource.class)
    public void loanApplicant_Invalid_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	LoanApplicantPojo LoanApplicantPojo = new LoanApplicantPojo( data.get("enquiry_id") , PhoneNumberGenerator.randomMobileNumber ,data.get("title"),  data.get("father_name") ,data.get("gender"), data.get("pan") ,data.get("aadhar"),data.get("gross_annual_income") , data.get("net_annual_income") ,data.get("work_experience_years"),data.get("work_experience_months") , data.get("first_name") ,data.get("middle_name"),data.get("last_name") , data.get("email") ,data.get("dob"),data.get("residence_type") , data.get("employment_type") ,data.get("business_name"),data.get("defence_id") , data.get("financier_id") ,data.get("channel_id"),data.get("loan_applicant_id") , data.get("is_co_applicant_journey") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, LoanApplicantPojo);
        String bodyData=sw.toString();  
        LoanApplicant.invalid_enquiryID(bodyData);
        Assert.assertEquals(LoanApplicant.code, 403,"Status Code Validation Failed for Loan Submission loan Applicant API");
    } 
    
	//   Method is used to Verify Functionality to Loan Submission Loan Applicant API with Blank financier_id
  
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "LoanApplicant_Blank_financier_Id", dataProviderClass = DataProviderSource.class)
    public void loanApplicant_Blank_financier_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	LoanApplicantPojo LoanApplicantPojo = new LoanApplicantPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("title"),  data.get("father_name") ,data.get("gender"), data.get("pan") ,data.get("aadhar"),data.get("gross_annual_income") , data.get("net_annual_income") ,data.get("work_experience_years"),data.get("work_experience_months") , data.get("first_name") ,data.get("middle_name"),data.get("last_name") , data.get("email") ,data.get("dob"),data.get("residence_type") , data.get("employment_type") ,data.get("business_name"),data.get("defence_id") , data.get("financier_id") ,data.get("channel_id"),data.get("loan_applicant_id") , data.get("is_co_applicant_journey") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, LoanApplicantPojo);
        String bodyData=sw.toString();  
        LoanApplicant.blank_financier_id(bodyData);
        Assert.assertEquals(LoanApplicant.code, 409,"Status Code Validation Failed for Loan Submission loan Applicant API");

    } 
   
	//   Method is used to Verify Functionality to Loan Submission Loan Applicant API with Invalid financier_id

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "LoanApplicant_Invalid_financier_Id", dataProviderClass = DataProviderSource.class)
    public void loanApplicant_Invalid_financier_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	LoanApplicantPojo LoanApplicantPojo = new LoanApplicantPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("title"),  data.get("father_name") ,data.get("gender"), data.get("pan") ,data.get("aadhar"),data.get("gross_annual_income") , data.get("net_annual_income") ,data.get("work_experience_years"),data.get("work_experience_months") , data.get("first_name") ,data.get("middle_name"),data.get("last_name") , data.get("email") ,data.get("dob"),data.get("residence_type") , data.get("employment_type") ,data.get("business_name"),data.get("defence_id") , data.get("financier_id") ,data.get("channel_id"),data.get("loan_applicant_id") , data.get("is_co_applicant_journey") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, LoanApplicantPojo);
        String bodyData=sw.toString();  
        LoanApplicant.invalid_financier_id(bodyData);
        Assert.assertEquals(LoanApplicant.code, 409,"Status Code Validation Failed for Loan Submission loan Applicant API");

    } 

	//   Method is used to Verify Functionality to Loan Submission Loan Applicant API with Blank is_co_applicant_journey

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "LoanApplicant_Blank_is_co_applicant_journey", dataProviderClass = DataProviderSource.class)
    public void loanApplicant_Blank_is_co_applicant_journey(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	LoanApplicantPojo LoanApplicantPojo = new LoanApplicantPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("title"),  data.get("father_name") ,data.get("gender"), data.get("pan") ,data.get("aadhar"),data.get("gross_annual_income") , data.get("net_annual_income") ,data.get("work_experience_years"),data.get("work_experience_months") , data.get("first_name") ,data.get("middle_name"),data.get("last_name") , data.get("email") ,data.get("dob"),data.get("residence_type") , data.get("employment_type") ,data.get("business_name"),data.get("defence_id") , data.get("financier_id") ,data.get("channel_id"),data.get("loan_applicant_id") , data.get("is_co_applicant_journey") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, LoanApplicantPojo);
        String bodyData=sw.toString();  
        LoanApplicant.blank_is_co_applicant_journey(bodyData);
        Assert.assertEquals(LoanApplicant.code, 409,"Status Code Validation Failed for Loan Submission loan Applicant API");

    } 
 
	//   Method is used to Verify Functionality to Loan Submission Loan Applicant API with Invalid is_co_applicant_journey

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "LoanApplicant_Invalid_is_co_applicant_journey", dataProviderClass = DataProviderSource.class)
    public void loanApplicant_Invalid_is_co_applicant_journey(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	LoanApplicantPojo LoanApplicantPojo = new LoanApplicantPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("title"),  data.get("father_name") ,data.get("gender"), data.get("pan") ,data.get("aadhar"),data.get("gross_annual_income") , data.get("net_annual_income") ,data.get("work_experience_years"),data.get("work_experience_months") , data.get("first_name") ,data.get("middle_name"),data.get("last_name") , data.get("email") ,data.get("dob"),data.get("residence_type") , data.get("employment_type") ,data.get("business_name"),data.get("defence_id") , data.get("financier_id") ,data.get("channel_id"),data.get("loan_applicant_id") , data.get("is_co_applicant_journey") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, LoanApplicantPojo);
        String bodyData=sw.toString();  
        LoanApplicant.invalid_is_co_applicant_journey(bodyData);
        Assert.assertEquals(LoanApplicant.code, 409,"Status Code Validation Failed for Loan Submission loan Applicant API");

    } 
    
    
    
 }	
	