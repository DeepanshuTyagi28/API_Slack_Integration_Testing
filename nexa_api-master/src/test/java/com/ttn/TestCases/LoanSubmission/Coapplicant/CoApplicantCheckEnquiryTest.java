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
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantCheckEnquiry;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantCreateEnquiry;
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
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CheckCoApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.SaveSelectedOfferPojo;
/**
 * @author Deepanshu Tyagi
 */

// Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API


    public class CoApplicantCheckEnquiryTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckCoApplicant_ValidInput", dataProviderClass = DataProviderSource.class)
    public void CoApplicant_CheckEnquiry_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CheckCoApplicantPojo CheckCoApplicantPojo = new CheckCoApplicantPojo( data.get("channel") , data.get("mobile"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CheckCoApplicantPojo);
        String bodyData=sw.toString();  
        CoApplicantCheckEnquiry.validInput(bodyData);
        Assert.assertEquals(CoApplicantCheckEnquiry.code, 200,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API");
        Assert.assertEquals(CoApplicantCheckEnquiry.Status, "success","Response Body Validation Failed for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API");

    }   
    
 
	  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Blank Channel


    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckCoApplicant_Blank_Channel", dataProviderClass = DataProviderSource.class)
    public void CoApplicant_CheckEnquiry_Blank_Channel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CheckCoApplicantPojo CheckCoApplicantPojo = new CheckCoApplicantPojo( data.get("channel") , data.get("mobile"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CheckCoApplicantPojo);
        String bodyData=sw.toString();  
        CoApplicantCheckEnquiry.blank_Channel(bodyData);
        Assert.assertEquals(CoApplicantCheckEnquiry.code, 500,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API");

    } 
    
	  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Invalid Channel
 

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckCoApplicant_Invalid_Channel", dataProviderClass = DataProviderSource.class)
    public void CoApplicant_CheckEnquiry_Invalid_Channel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CheckCoApplicantPojo CheckCoApplicantPojo = new CheckCoApplicantPojo( data.get("channel") , data.get("mobile"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CheckCoApplicantPojo);
        String bodyData=sw.toString();  
        CoApplicantCheckEnquiry.invalid_Channel(bodyData);
        Assert.assertEquals(CoApplicantCheckEnquiry.code, 500,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API");

    } 
    
    
	  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Blank Mobile


    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckCoApplicant_Blank_Mobile", dataProviderClass = DataProviderSource.class)
    public void CoApplicant_CheckEnquiry_Blank_Mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CheckCoApplicantPojo CheckCoApplicantPojo = new CheckCoApplicantPojo( data.get("channel") , data.get("mobile"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CheckCoApplicantPojo);
        String bodyData=sw.toString();  
        CoApplicantCheckEnquiry.blank_Mobile(bodyData);
        Assert.assertEquals(CoApplicantCheckEnquiry.code, 500,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API");

    } 
    
	  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Invalid Mobile
 

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckCoApplicant_Invalid_Mobile", dataProviderClass = DataProviderSource.class)
    public void CoApplicant_CheckEnquiry_Invalid_Mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CheckCoApplicantPojo CheckCoApplicantPojo = new CheckCoApplicantPojo( data.get("channel") , data.get("mobile"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CheckCoApplicantPojo);
        String bodyData=sw.toString();  
        CoApplicantCheckEnquiry.invalid_Mobile(bodyData);
        Assert.assertEquals(CoApplicantCheckEnquiry.code, 500,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API");

    }    
    
 }	
