package com.ttn.TestCases.LoanSubmission.Coapplicant;

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
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.BusinessLogic.LoanSubmission.AllOffer;
import com.ttn.BusinessLogic.LoanSubmission.ApplyLoan;
import com.ttn.BusinessLogic.LoanSubmission.CheckLoanOffer;
import com.ttn.BusinessLogic.LoanSubmission.LoanApplicant;
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantCreateEnquiry;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.TestCases.FMP.SendOTPTest;
import com.ttn.pojoClasses.CustomerEnquiryPojo;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.AllOfferPojo;
import com.ttn.pojoClasses.loanSubmission.ApplyLoanPojo;
import com.ttn.pojoClasses.loanSubmission.CheckLoanOfferPojo;
import com.ttn.pojoClasses.loanSubmission.LoanApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CreateEnquiryPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CustomerDetailPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CustomerDetailSelfEmployedPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.SaveSelectedOfferPojo;
/**
 * @author Deepanshu Tyagi
 */

//Method is used to Verify Functionality to Arena Loan Submission /Customer Journey CO-Applicant with Enquiry Generation / Valid Inputs


public class CoApplicantCreateEnquiryTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CoApplicantCreateEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
    
    public void coApplicant_CustomerEnquiry_ValidInput_EnquiryGeneration(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CreateEnquiryPojo CreateEnquiryPojo = new CreateEnquiryPojo(data.get("dealer"),data.get("car_model"),data.get("car_variant"),SendOTPTest.CoApplicantMobileNumber,data.get("name"),data.get("first_name"),data.get("last_name"),data.get("email"),data.get("dob"),data.get("city"),data.get("state"),data.get("disclaimer_flag"),data.get("channel"),data.get("force_create_flag"),data.get("existing_enquiry_id"),data.get("for_code"),data.get("state_code"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("mspin"),data.get("dms_lead_id"),data.get("fuel_type"));
    	String bodyData=jsonSerializer.serialize(CreateEnquiryPojo);
    	CoApplicantCreateEnquiry.validInput(bodyData); 
        Assert.assertEquals(CoApplicantCreateEnquiry.code, 201, "Status Code Validation Failed for CO-Applicant Customer Enquiry Generation Failed as Expected is 201");
        Assert.assertTrue(CoApplicantCreateEnquiry.Status.equalsIgnoreCase("Success"), "Enquiry is Not generated for  CO-Applicant Customer Enquiry Journey Generation");	
        Assert.assertTrue(CoApplicantCreateEnquiry.message.equalsIgnoreCase("Created Successfully"), "Response Body validation failed CO-Applicant Customer Enquiry Generation");	

    }
  
	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Blank Mobile Number
   
    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CoApplicantCreateEnquiry_Blank_MobileNumber", dataProviderClass = DataProviderSource.class)
    
    public void coApplicant_CustomerEnquiry_Blank_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CreateEnquiryPojo CreateEnquiryPojo = new CreateEnquiryPojo(data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("mobile"),data.get("name"),data.get("first_name"),data.get("last_name"),data.get("email"),data.get("dob"),data.get("city"),data.get("state"),data.get("disclaimer_flag"),data.get("channel"),data.get("force_create_flag"),data.get("existing_enquiry_id"),data.get("for_code"),data.get("state_code"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("mspin"),data.get("dms_lead_id"),data.get("fuel_type"));
    	String bodyData=jsonSerializer.serialize(CreateEnquiryPojo);
    	CoApplicantCreateEnquiry.blank_MobileNumber(bodyData); 
        Assert.assertEquals(CoApplicantCreateEnquiry.code, 401, "Status Code Validation Failed for CO-Applicant Customer Enquiry Generation Failed as Expected is 401");

    }

	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Invalid Mobile Number

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CoApplicantCreateEnquiry_Invalid_MobileNumber", dataProviderClass = DataProviderSource.class)
    
    public void coApplicant_CustomerEnquiry__Invalid_MobileNumber(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CreateEnquiryPojo CreateEnquiryPojo = new CreateEnquiryPojo(data.get("dealer"),data.get("car_model"),data.get("car_variant"),data.get("mobile"),data.get("name"),data.get("first_name"),data.get("last_name"),data.get("email"),data.get("dob"),data.get("city"),data.get("state"),data.get("disclaimer_flag"),data.get("channel"),data.get("force_create_flag"),data.get("existing_enquiry_id"),data.get("for_code"),data.get("state_code"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("mspin"),data.get("dms_lead_id"),data.get("fuel_type"));
    	String bodyData=jsonSerializer.serialize(CreateEnquiryPojo);
    	CoApplicantCreateEnquiry.invalid_MobileNumber(bodyData); 
        Assert.assertEquals(CoApplicantCreateEnquiry.code, 401, "Status Code Validation Failed for CO-Applicant Customer Enquiry Generation Failed as Expected is 401");
    }
   
	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Blank Car Model

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CoApplicantCreateEnquiry_Blank_CarModel", dataProviderClass = DataProviderSource.class)
    
    public void coApplicant_CustomerEnquiry_Blank_CarModel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CreateEnquiryPojo CreateEnquiryPojo = new CreateEnquiryPojo(data.get("dealer"),data.get("car_model"),data.get("car_variant"),SendOTPTest.CoApplicantMobileNumber,data.get("name"),data.get("first_name"),data.get("last_name"),data.get("email"),data.get("dob"),data.get("city"),data.get("state"),data.get("disclaimer_flag"),data.get("channel"),data.get("force_create_flag"),data.get("existing_enquiry_id"),data.get("for_code"),data.get("state_code"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("mspin"),data.get("dms_lead_id"),data.get("fuel_type"));
    	String bodyData=jsonSerializer.serialize(CreateEnquiryPojo);
    	CoApplicantCreateEnquiry.blank_CarModel(bodyData); 
        Assert.assertEquals(CoApplicantCreateEnquiry.code, 409, "Status Code Validation Failed for CO-Applicant Customer Enquiry Generation Failed as Expected is 409");

    }    
    
	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Blank Car Variant

    @Test(groups = {"Sanity", "Regression" ,"ARENA","Prod"}, dataProvider = "CoApplicantCreateEnquiry_Blank_CarVariant", dataProviderClass = DataProviderSource.class)
    
    public void coApplicant_CustomerEnquiry_Blank_CarVariant(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	CreateEnquiryPojo CreateEnquiryPojo = new CreateEnquiryPojo(data.get("dealer"),data.get("car_model"),data.get("car_variant"),SendOTPTest.CoApplicantMobileNumber,data.get("name"),data.get("first_name"),data.get("last_name"),data.get("email"),data.get("dob"),data.get("city"),data.get("state"),data.get("disclaimer_flag"),data.get("channel"),data.get("force_create_flag"),data.get("existing_enquiry_id"),data.get("for_code"),data.get("state_code"),data.get("color_code"),data.get("color_description"),data.get("color_indicator"),data.get("mspin"),data.get("dms_lead_id"),data.get("fuel_type"));
    	String bodyData=jsonSerializer.serialize(CreateEnquiryPojo);
    	CoApplicantCreateEnquiry.blank_CarVariant(bodyData); 
        Assert.assertEquals(CoApplicantCreateEnquiry.code, 409, "Status Code Validation Failed for CO-Applicant Customer Enquiry Generation Failed as Expected is 409");

    }    
    
 }	
