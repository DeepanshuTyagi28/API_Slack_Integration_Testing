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
import com.ttn.BusinessLogic.LoanSubmission.AllOffer;
import com.ttn.BusinessLogic.LoanSubmission.ApplyLoan;
import com.ttn.BusinessLogic.LoanSubmission.CheckLoanOffer;
import com.ttn.BusinessLogic.LoanSubmission.LoanApplicant;
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.AllOfferPojo;
import com.ttn.pojoClasses.loanSubmission.ApplyLoanPojo;
import com.ttn.pojoClasses.loanSubmission.CheckLoanOfferPojo;
import com.ttn.pojoClasses.loanSubmission.LoanApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
/**
 * @author Deepanshu Tyagi
 */

 // Method is used to Verify Functionality to Loan Submission All Offer API


    public class AllOfferTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "AllOffer_ValidInput", dataProviderClass = DataProviderSource.class)
    public void allOffer_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	AllOfferPojo AllOfferPojo = new AllOfferPojo( CustomerEnquiry.CustomerenquiryID ,data.get("tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, AllOfferPojo);
        String bodyData=sw.toString();  
        AllOffer.validInput(bodyData);
        Assert.assertEquals(AllOffer.code, 200,"Status Code Validation Failed for Loan Submission Apply Loan ");
    }   
    
//	Method is used to Verify Functionality to Loan Submission All Offer API with Blank Enquiry ID
   
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "AllOffer_Blank_EnqID", dataProviderClass = DataProviderSource.class)
    public void allOffer_Blank_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	AllOfferPojo AllOfferPojo = new AllOfferPojo( data.get("enquiry_id") ,data.get("tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, AllOfferPojo);
        String bodyData=sw.toString();  
        AllOffer.blank_EnqID(bodyData);
        Assert.assertEquals(AllOffer.code, 401,"Status Code Validation Failed for Loan Submission Apply Loan ");
    }   
    
    
//	Method is used to Verify Functionality to Loan Submission All Offer API with Invalid Enquiry ID
 
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "AllOffer_Invalid_EnqID", dataProviderClass = DataProviderSource.class)
    public void allOffer_Invalid_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	AllOfferPojo AllOfferPojo = new AllOfferPojo( data.get("enquiry_id"),data.get("tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, AllOfferPojo);
        String bodyData=sw.toString();  
        AllOffer.invalid_EnqID(bodyData);
        Assert.assertEquals(AllOffer.code, 401,"Status Code Validation Failed for Loan Submission Apply Loan ");
    }   
    
    

 }	
