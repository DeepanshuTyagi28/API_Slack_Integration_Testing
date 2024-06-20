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
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantSaveSelectedOffer;
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
import com.ttn.pojoClasses.loanSubmission.Coapplicant.SaveSelectedOfferPojo;
/**
 * @author Deepanshu Tyagi
 */

 // Method is used to Verify Functionality to Loan Submission All Offer API


    public class CoApplicantSaveSelectedOfferTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveSelectedOffer_ValidInput", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveSelectedOffer_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveSelectedOfferPojo SaveSelectedOfferPojo = new SaveSelectedOfferPojo( CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,SendOTPTest.CoApplicantMobileNumber  ,data.get("financier_id"),data.get("financier_name"),data.get("loan_type"),data.get("interest_rate"),data.get("tenure"),data.get("down_payment"),data.get("interest_rate_type"),data.get("loan_amount"),data.get("max_loan_amount"),data.get("emi"),data.get("processing_fee"),data.get("ltv"),data.get("processing_fee_display"),data.get("ltv_based_on"),data.get("component_ltv_amount"),data.get("employment_type"),data.get("branch_code"),data.get("branch_name"),data.get("sales_promo_code"),data.get("credit_promo_code"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveSelectedOfferPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveSelectedOffer.validInput(bodyData);
        Assert.assertEquals(CoApplicantSaveSelectedOffer.code, 200,"Status Code Validation Failed for Loan Submission CoApplicant Save Selected Offer where expected was 200");
    }   
    
    
 	//	Method is used to Verify Functionality to Loan Submission : CoApplicant Save Selected Offer API with Blank financier_id

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveSelectedOffer_Blank_Financier_Id", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveSelectedOffer_Blank_Financier_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveSelectedOfferPojo SaveSelectedOfferPojo = new SaveSelectedOfferPojo( CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,SendOTPTest.CoApplicantMobileNumber  ,data.get("financier_id"),data.get("financier_name"),data.get("loan_type"),data.get("interest_rate"),data.get("tenure"),data.get("down_payment"),data.get("interest_rate_type"),data.get("loan_amount"),data.get("max_loan_amount"),data.get("emi"),data.get("processing_fee"),data.get("ltv"),data.get("processing_fee_display"),data.get("ltv_based_on"),data.get("component_ltv_amount"),data.get("employment_type"),data.get("branch_code"),data.get("branch_name"),data.get("sales_promo_code"),data.get("credit_promo_code"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveSelectedOfferPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveSelectedOffer.blank_financier_id(bodyData);
        Assert.assertEquals(CoApplicantSaveSelectedOffer.code, 500,"Status Code Validation Failed for Loan Submission CoApplicant Save Selected Offer where expected was 500");
    } 
    
    
 	//	Method is used to Verify Functionality to Loan Submission : CoApplicant Save Selected Offer API with Blank financier_name

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveSelectedOffer_Blank_Financier_Name", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveSelectedOffer_Blank_Financier_Name(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveSelectedOfferPojo SaveSelectedOfferPojo = new SaveSelectedOfferPojo( CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,SendOTPTest.CoApplicantMobileNumber ,data.get("financier_id"),data.get("financier_name"),data.get("loan_type"),data.get("interest_rate"),data.get("tenure"),data.get("down_payment"),data.get("interest_rate_type"),data.get("loan_amount"),data.get("max_loan_amount"),data.get("emi"),data.get("processing_fee"),data.get("ltv"),data.get("processing_fee_display"),data.get("ltv_based_on"),data.get("component_ltv_amount"),data.get("employment_type"),data.get("branch_code"),data.get("branch_name"),data.get("sales_promo_code"),data.get("credit_promo_code"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveSelectedOfferPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveSelectedOffer.blank_financier_name(bodyData);
        Assert.assertEquals(CoApplicantSaveSelectedOffer.code, 500,"Status Code Validation Failed for Loan Submission CoApplicant Save Selected Offer where expected was 500");
    }    
    
    
 	//	Method is used to Verify Functionality to Loan Submission : CoApplicant Save Selected Offer API with Blank down_payment

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveSelectedOffer_Blank_DownPayment", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveSelectedOffer_Blank_DownPayment(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveSelectedOfferPojo SaveSelectedOfferPojo = new SaveSelectedOfferPojo( CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,SendOTPTest.CoApplicantMobileNumber  ,data.get("financier_id"),data.get("financier_name"),data.get("loan_type"),data.get("interest_rate"),data.get("tenure"),data.get("down_payment"),data.get("interest_rate_type"),data.get("loan_amount"),data.get("max_loan_amount"),data.get("emi"),data.get("processing_fee"),data.get("ltv"),data.get("processing_fee_display"),data.get("ltv_based_on"),data.get("component_ltv_amount"),data.get("employment_type"),data.get("branch_code"),data.get("branch_name"),data.get("sales_promo_code"),data.get("credit_promo_code"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveSelectedOfferPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveSelectedOffer.blank_down_payment(bodyData);
        Assert.assertEquals(CoApplicantSaveSelectedOffer.code, 500,"Status Code Validation Failed for Loan Submission CoApplicant Save Selected Offer where expected was 500");
    }    
      
    
	//	Method is used to Verify Functionality to Loan Submission : CoApplicant Save Selected Offer API with Blank mobile

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveSelectedOffer_Blank_Mobile", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SaveSelectedOffer_Blank_Mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveSelectedOfferPojo SaveSelectedOfferPojo = new SaveSelectedOfferPojo( CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID  ,data.get("mobile") ,data.get("financier_id"),data.get("financier_name"),data.get("loan_type"),data.get("interest_rate"),data.get("tenure"),data.get("down_payment"),data.get("interest_rate_type"),data.get("loan_amount"),data.get("max_loan_amount"),data.get("emi"),data.get("processing_fee"),data.get("ltv"),data.get("processing_fee_display"),data.get("ltv_based_on"),data.get("component_ltv_amount"),data.get("employment_type"),data.get("branch_code"),data.get("branch_name"),data.get("sales_promo_code"),data.get("credit_promo_code"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveSelectedOfferPojo);
        String bodyData=sw.toString();  
        CoApplicantSaveSelectedOffer.blank_mobile(bodyData);
        Assert.assertEquals(CoApplicantSaveSelectedOffer.code, 401,"Status Code Validation Failed for Loan Submission CoApplicant Save Selected Offer where expected was 500");
    } 
    
    
    
 }	
