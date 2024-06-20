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
import com.ttn.BusinessLogic.LoanSubmission.AllOffer;
import com.ttn.BusinessLogic.LoanSubmission.ApplyLoan;
import com.ttn.BusinessLogic.LoanSubmission.CheckLoanOffer;
import com.ttn.BusinessLogic.LoanSubmission.LoanApplicant;
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantCreateEnquiry;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantLoanSubmission;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantSaveLoanAppCustomer;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.TestCases.FMP.SendOTPTest;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.AllOfferPojo;
import com.ttn.pojoClasses.loanSubmission.ApplyLoanPojo;
import com.ttn.pojoClasses.loanSubmission.CheckLoanOfferPojo;
import com.ttn.pojoClasses.loanSubmission.LoanApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CoApplicantLoanSaveAppCustomerPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CoApplicantLoanSubmissionPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.SaveSelectedOfferPojo;
/**
 * @author Deepanshu Tyagi
 */

//Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Loan APP Customer  API


    public class CoApplicantSaveLoanAppCustomerTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantSaveLoanAppCustomer_ValidInput", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveLoanAppCustomer_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantLoanSaveAppCustomerPojo CoApplicantLoanSaveAppCustomerPojo = new CoApplicantLoanSaveAppCustomerPojo( data.get("is_co_applicant_journey") , data.get("channel_id") ,data.get("financier_id"),CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,SendOTPTest.CoApplicantMobileNumber ,data.get("title"),data.get("marital_status"),data.get("father_name"),data.get("gender"),data.get("pan"),data.get("aadhar"),data.get("gross_annual_income"),data.get("no_of_dependents"),data.get("education"),data.get("work_experience_years"),data.get("work_experience_months"),data.get("first_name"), data.get("middle_name") , data.get("last_name") , data.get("email") , data.get("dob") , data.get("mother_name") , data.get("nationality") , data.get("residence_type") , data.get("staying_since") , data.get("employment_type") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CoApplicantLoanSaveAppCustomerPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveLoanAppCustomer.validInput(bodyData);
        Assert.assertEquals(CoApplicantSaveLoanAppCustomer.code, 200,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Save Loan APP Customer  API");
    }   

    
    
  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Loan APP Customer  API With Blank ENQ ID
   
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantSaveLoanAppCustomer_Blank_EnqID", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveLoanAppCustomer_Blank_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantLoanSaveAppCustomerPojo CoApplicantLoanSaveAppCustomerPojo = new CoApplicantLoanSaveAppCustomerPojo( data.get("is_co_applicant_journey") , data.get("channel_id") ,data.get("financier_id"),data.get("enquiry_id")  ,SendOTPTest.CoApplicantMobileNumber ,data.get("title"),data.get("marital_status"),data.get("father_name"),data.get("gender"),data.get("pan"),data.get("aadhar"),data.get("gross_annual_income"),data.get("no_of_dependents"),data.get("education"),data.get("work_experience_years"),data.get("work_experience_months"),data.get("first_name"), data.get("middle_name") , data.get("last_name") , data.get("email") , data.get("dob") , data.get("mother_name") , data.get("nationality") , data.get("residence_type") , data.get("staying_since") , data.get("employment_type") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CoApplicantLoanSaveAppCustomerPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveLoanAppCustomer.blank_EnqID(bodyData);
        Assert.assertEquals(CoApplicantSaveLoanAppCustomer.code, 403,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Save Loan APP Customer  API");
    } 
    
    
    //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Loan APP Customer  API With Invalid ENQ ID
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantSaveLoanAppCustomer_InvalidEnqID", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveLoanAppCustomer_Invalid_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantLoanSaveAppCustomerPojo CoApplicantLoanSaveAppCustomerPojo = new CoApplicantLoanSaveAppCustomerPojo( data.get("is_co_applicant_journey") , data.get("channel_id") ,data.get("financier_id"),data.get("enquiry_id")  ,SendOTPTest.CoApplicantMobileNumber ,data.get("title"),data.get("marital_status"),data.get("father_name"),data.get("gender"),data.get("pan"),data.get("aadhar"),data.get("gross_annual_income"),data.get("no_of_dependents"),data.get("education"),data.get("work_experience_years"),data.get("work_experience_months"),data.get("first_name"), data.get("middle_name") , data.get("last_name") , data.get("email") , data.get("dob") , data.get("mother_name") , data.get("nationality") , data.get("residence_type") , data.get("staying_since") , data.get("employment_type") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CoApplicantLoanSaveAppCustomerPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveLoanAppCustomer.invalid_EnqID(bodyData);
        Assert.assertEquals(CoApplicantSaveLoanAppCustomer.code, 403,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Save Loan APP Customer  API");
    }     
    
 }	
