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
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CoApplicantLoanSubmissionPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.SaveSelectedOfferPojo;
/**
 * @author Deepanshu Tyagi
 */

//Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Loan Submission API


    public class CoApplicantLoanSubmissionTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantLoanSubmission_ValidInput", dataProviderClass = DataProviderSource.class)
    public void coApplicant_LoanSubmission_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantLoanSubmissionPojo CoApplicantLoanSubmissionPojo = new CoApplicantLoanSubmissionPojo( CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,data.get("current_emi"),data.get("financier_id"),data.get("loan_amount"),data.get("loan_type"),data.get("tenure"),data.get("processing_fee_display"),data.get("interest_rate"),data.get("emi"),data.get("min_cibil_score"),data.get("max_cibil_score"),data.get("expected_tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CoApplicantLoanSubmissionPojo);
        String bodyData=sw.toString();  
        CoApplicantLoanSubmission.validInput(bodyData);
        Assert.assertEquals(CoApplicantLoanSubmission.code, 200,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Loan Submission API");
    }   
 
    
    
	   //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Loan Submission API with Blank Enq ID

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantLoanSubmission_Blank_EnqID", dataProviderClass = DataProviderSource.class)
    public void coApplicant_LoanSubmission_Blank_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantLoanSubmissionPojo CoApplicantLoanSubmissionPojo = new CoApplicantLoanSubmissionPojo( data.get("enquiry_id") ,data.get("current_emi"),data.get("financier_id"),data.get("loan_amount"),data.get("loan_type"),data.get("tenure"),data.get("processing_fee_display"),data.get("interest_rate"),data.get("emi"),data.get("min_cibil_score"),data.get("max_cibil_score"),data.get("expected_tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CoApplicantLoanSubmissionPojo);
        String bodyData=sw.toString();  
        CoApplicantLoanSubmission.blank_EnqID(bodyData);
        Assert.assertEquals(CoApplicantLoanSubmission.code, 409,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Loan Submission API");
    } 
 
    
	   //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Loan Submission API with Blank financier_id

    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantLoanSubmission_Blank_Financier_Id", dataProviderClass = DataProviderSource.class)
    public void coApplicant_LoanSubmission_Blank_Financier_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantLoanSubmissionPojo CoApplicantLoanSubmissionPojo = new CoApplicantLoanSubmissionPojo( CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,data.get("current_emi"),data.get("financier_id"),data.get("loan_amount"),data.get("loan_type"),data.get("tenure"),data.get("processing_fee_display"),data.get("interest_rate"),data.get("emi"),data.get("min_cibil_score"),data.get("max_cibil_score"),data.get("expected_tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CoApplicantLoanSubmissionPojo);
        String bodyData=sw.toString();  
        CoApplicantLoanSubmission.blank_financier_id(bodyData);
        Assert.assertEquals(CoApplicantLoanSubmission.code, 409,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Loan Submission API");
    } 
    
    
 }	
