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
import com.ttn.BusinessLogic.LoanSubmission.ApplyLoan;
import com.ttn.BusinessLogic.LoanSubmission.CheckLoanOffer;
import com.ttn.BusinessLogic.LoanSubmission.LoanApplicant;
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.BusinessLogic.LoanSubmission.SaveAadharConsent;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.ApplyLoanPojo;
import com.ttn.pojoClasses.loanSubmission.CheckLoanOfferPojo;
import com.ttn.pojoClasses.loanSubmission.LoanApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
import com.ttn.pojoClasses.loanSubmission.SaveAadharConsentPojo;
/**
 * @author Deepanshu Tyagi
 */

 // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API


    public class SaveAadharConsentTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_ValidInput", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo( CustomerEnquiry.CustomerenquiryID , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.validInput(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 200,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");
        Assert.assertEquals(SaveAadharConsent.Status, "SUCCESS");
        Assert.assertEquals(SaveAadharConsent.message, "Details saved Successfully");

    }   


    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank Enq ID

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Blank_EnqID", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Blank_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo( data.get("enquiry_id") , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.blank_EnqID(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 403,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");

    } 
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid Enq ID

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Invalid_EnqID", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Invalid_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo( data.get("enquiry_id") , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.invalid_EnqID(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 403,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");

    } 
    
 

    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank Applicant_Type

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Blank_Applicant_Type", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Blank_Applicant_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo(CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.blank_applicant_type(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");

    } 
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid Applicant_Type

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Invalid_Applicant_Type", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Invalid_Applicant_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo( CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.invalid_applicant_type(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");

    } 
    
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank language

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Blank_language", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Blank_language(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo(CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.blank_language(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");

    } 
    
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank Content

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Blank_Content", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Blank_Content(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo(CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.blank_content(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");
    } 
    
    
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank Consent

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Blank_Consent", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Blank_Consent(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo(CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.blank_consent(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");

    } 
    
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid Consent

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Invalid_Consent", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Invalid_Consent(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo( CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.invalid_consent(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");

    } 
    
    
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank Doc_Type_Id

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Blank_Doc_Type_Id", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Blank_Doc_Type_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo(CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.blank_doc_type_id(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");
    } 
    
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid Doc_Type_Id

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Invalid_Doc_Type_Id", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Invalid_Doc_Type_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo( CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.invalid_doc_type_id(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");
    }   
  
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank User_IP

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Blank_User_IP", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Blank_User_IP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo(CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.blank_user_ip(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");
    } 
    
    
    // Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid User_IP

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "SaveAadharConsent_Invalid_User_IP", dataProviderClass = DataProviderSource.class)
    public void saveAadharConsent_Invalid_User_IP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	SaveAadharConsentPojo SaveAadharConsentPojo = new SaveAadharConsentPojo( CustomerEnquiry.CustomerenquiryID  , data.get("language"), data.get("content"), data.get("applicant_type"), data.get("consent"), data.get("doc_type_id"), data.get("proof_type_id"), data.get("user_ip"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, SaveAadharConsentPojo);
        String bodyData=sw.toString();  
        SaveAadharConsent.invalid_user_ip(bodyData);
        Assert.assertEquals(SaveAadharConsent.code, 409,"Status Code Validation Failed for Loan Submission Save Aadhar Consent API ");
    }   
     
 }	
