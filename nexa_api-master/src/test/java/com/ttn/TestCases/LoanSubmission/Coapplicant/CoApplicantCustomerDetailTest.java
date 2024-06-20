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
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantCustomerDetail;
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
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CustomerDetailPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CustomerDetailSelfEmployedPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.SaveSelectedOfferPojo;
/**
 * @author Deepanshu Tyagi
 */

//	Method is used to Verify Functionality to Loan Submission : CoApplicant Customer Detailed  Salaried API


    public class CoApplicantCustomerDetailTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CustomerDetail_ValidInput_Salaried", dataProviderClass = DataProviderSource.class)
    public void coApplicant_CustomerDetail_ValidInput_Salaried(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CustomerDetailPojo CustomerDetailPojo = new CustomerDetailPojo(data.get("first_name"),CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID , data.get("last_name") ,data.get("email"),SendOTPTest.CoApplicantMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), SendOTPTest.CoApplicantMobileNumber );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CustomerDetailPojo);
        String bodyData=sw.toString();  
        CoApplicantCustomerDetail.validInput_Salaried(bodyData);
        Assert.assertEquals(CoApplicantCustomerDetail.code, 200,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Customer Detailed  Salaried API where Expected Status is 200");
 
    } 
    
    
 	//	Method is used to Verify Functionality to Loan Submission : CoApplicant Customer Detailed  Self Employed  API

    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CustomerDetail_ValidInput_SelfEmployed", dataProviderClass = DataProviderSource.class)
    public void coApplicant_CustomerDetail_ValidInput_SelfEmployed(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CustomerDetailSelfEmployedPojo CustomerDetailSelfEmployedPojo = new CustomerDetailSelfEmployedPojo(CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID ,data.get("first_name"), data.get("last_name") ,data.get("email"),SendOTPTest.CoApplicantMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("residence_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("residing_since") ,data.get("employment_type"),data.get("sub_employment_id") , data.get("current_emi"),SendOTPTest.CoApplicantMobileNumber  ,data.get("self_work_experience_in_years"),data.get("self_work_experience_in_months") , data.get("tenure_of_business_in_years") ,data.get("tenure_of_business_in_months") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CustomerDetailSelfEmployedPojo);
        String bodyData=sw.toString();  
        CoApplicantCustomerDetail.validInput_SelfEmployed(bodyData);
        Assert.assertEquals(CoApplicantCustomerDetail.code, 200 , "Status Code Validation Failed for Arena CO-Applicant Loan Submission : Customer Detailed  Self Employed API where Expected Status is 200");
 
    } 
 
    
 	//	Method is used to Verify Functionality to Loan Submission : CoApplicant Customer Detailed  NIS  API

    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CustomerDetail_ValidInput_NIS", dataProviderClass = DataProviderSource.class)
    public void coApplicant_CustomerDetail_ValidInput_NIS(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CustomerDetailPojo CustomerDetailPojo = new CustomerDetailPojo(data.get("first_name"),CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID , data.get("last_name") ,data.get("email"),SendOTPTest.CoApplicantMobileNumber  , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), SendOTPTest.CoApplicantMobileNumber  );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CustomerDetailPojo);
        String bodyData=sw.toString();  
        CoApplicantCustomerDetail.validInput_NIS(bodyData);
        Assert.assertEquals(CoApplicantCustomerDetail.code, 200,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Customer Detailed  NIS  API where Expected Status is 200");
 
    } 
    
  
//	Method is used to Verify Functionality to Loan Submission : CoApplicant Customer Detailed  with Blank Enq ID

    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CustomerDetail_Blank_EnqID", dataProviderClass = DataProviderSource.class)
    public void coApplicant_CustomerDetail_Blank_EnquiryID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CustomerDetailPojo CustomerDetailPojo = new CustomerDetailPojo(data.get("first_name"),data.get("enquiry_id") , data.get("last_name") ,data.get("email"),SendOTPTest.CoApplicantMobileNumber  , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), SendOTPTest.CoApplicantMobileNumber  );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CustomerDetailPojo);
        String bodyData=sw.toString();  
        CoApplicantCustomerDetail.blank_EnqID(bodyData);
        Assert.assertEquals(CoApplicantCustomerDetail.code, 403 , "Status Code Validation Failed for Arena CO-Applicant Loan Submission : Customer Detailed API with Blank Enquiry ID where expected status code is 403 ");
 
    } 
    
//	Method is used to Verify Functionality to Loan Submission : CoApplicant Customer Detailed  with Blank AuthMobile

    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CustomerDetail_Blank_AuthMobile", dataProviderClass = DataProviderSource.class)
    public void coApplicant_CustomerDetail_Blank_AuthMobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CustomerDetailPojo CustomerDetailPojo = new CustomerDetailPojo(data.get("first_name"),CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID , data.get("last_name") ,data.get("email"),SendOTPTest.CoApplicantMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), data.get("auth_mobile") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CustomerDetailPojo);
        String bodyData=sw.toString();  
        CoApplicantCustomerDetail.blank_Auth_Mobile(bodyData);
        Assert.assertEquals(CoApplicantCustomerDetail.code, 409 , "Status Code Validation Failed for Arena CO-Applicant Loan Submission : Customer Detailed API with Blank Auth Mobile where expected status code is 409");
 
    } 
    
 }	
