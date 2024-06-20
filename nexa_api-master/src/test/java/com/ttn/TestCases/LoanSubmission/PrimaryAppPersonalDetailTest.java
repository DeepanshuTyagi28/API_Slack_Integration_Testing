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
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify 
 */

 // Method is used to Verify Functionality to Loan Submission Primary APP Personal Details

    public class PrimaryAppPersonalDetailTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_ValidInput", dataProviderClass = DataProviderSource.class)
    public void primaryAPPPersonalDetail_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PrimaryAppPojo);
        String bodyData=sw.toString();  
    	PrimaryAppPersonalDetail.validInput(bodyData);
        Assert.assertEquals(PrimaryAppPersonalDetail.code, 200,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");
        Assert.assertEquals(PrimaryAppPersonalDetail.Status, "Success","");
        Assert.assertEquals(PrimaryAppPersonalDetail.message, "Customer Updated successfully","");
        Assert.assertEquals(PrimaryAppPersonalDetail.enquiry_id, CustomerEnquiry.CustomerenquiryID ,"Enquiry Id Doesnt Mached for Loan Submission-Primary App Personal Detail API");

    } 
    
	//	   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank enquiry_id
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Enquiry_Id", dataProviderClass = DataProviderSource.class)
    public void primaryAPPPersonalDetail_Blank_Enquiry_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),data.get("enquiry_id") , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PrimaryAppPojo);
        String bodyData=sw.toString();  
    	PrimaryAppPersonalDetail.blank_enquiry_id(bodyData);
        Assert.assertEquals(PrimaryAppPersonalDetail.code, 403,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");
   
    }
    
    
	//	   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with Invalid enquiry_id
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Invalid_Enquiry_Id", dataProviderClass = DataProviderSource.class)
    public void primaryAPPPersonalDetail_Invalid_Enquiry_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),data.get("enquiry_id"), data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PrimaryAppPojo);
        String bodyData=sw.toString();  
    	PrimaryAppPersonalDetail.invalid_enquiry_id(bodyData);
        Assert.assertEquals(PrimaryAppPersonalDetail.code, 403,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");
   
    }
//	   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank mobile
    
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_mobile", dataProviderClass = DataProviderSource.class)
    public void primaryAPPPersonalDetail_Blank_mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),data.get("mobile") , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, PrimaryAppPojo);
        String bodyData=sw.toString();  
    	PrimaryAppPersonalDetail.blank_mobile(bodyData);
        Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");
   
    } 
  
//	   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with Invalid mobile
    
    
 @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Invalid_mobile", dataProviderClass = DataProviderSource.class)
 public void primaryAPPPersonalDetail_Invalid_mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
 {
 	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),data.get("mobile") , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
 	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
     mapper.enable(SerializationFeature.INDENT_OUTPUT);
     StringWriter sw = new StringWriter();
     mapper.writeValue(sw, PrimaryAppPojo);
     String bodyData=sw.toString();  
 	PrimaryAppPersonalDetail.invalid_mobile(bodyData);
     Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

 }
 
// Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank auth_mobile
 
 
@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_auth_mobile", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_auth_mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), data.get("auth_mobile") );	
	ObjectMapper mapper = new ObjectMapper();
  mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
  mapper.enable(SerializationFeature.INDENT_OUTPUT);
  StringWriter sw = new StringWriter();
  mapper.writeValue(sw, PrimaryAppPojo);
  String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_auth_mobile(bodyData);
  Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

// Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with Invalid Auth mobile


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Invalid_auth_mobile", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Invalid_auth_mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), data.get("auth_mobile") );	
ObjectMapper mapper = new ObjectMapper();
  mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
PrimaryAppPersonalDetail.invalid_auth_mobile(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 401,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

}


//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank credit_check_flag

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Credit_Check_Flag", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Credit_Check_Flag(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, PrimaryAppPojo);
    String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_credit_check_flag(bodyData);
    Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank employment_type

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Employment_Type", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Employment_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
  mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
  mapper.enable(SerializationFeature.INDENT_OUTPUT);
  StringWriter sw = new StringWriter();
  mapper.writeValue(sw, PrimaryAppPojo);
  String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_employment_type(bodyData);
  Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 
 


//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank city

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_City", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_City(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
  mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
  mapper.enable(SerializationFeature.INDENT_OUTPUT);
  StringWriter sw = new StringWriter();
  mapper.writeValue(sw, PrimaryAppPojo);
  String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_city(bodyData);
  Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank residence_type

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Residence_Type", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Residence_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_residence_type(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank annual_salary

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Annual_Salary", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Annual_Salary(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_annual_salary(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank state

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_State", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_State(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
PrimaryAppPersonalDetail.blank_state(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 


//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank first_name

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_First_Name", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_First_Name(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_first_name(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 


//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank email

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Email", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Email(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_email(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank work_experience_years

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Work_Experience_Years", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Work_Experience_Years(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_work_experience_years(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//////


//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank car_model

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Car_Model", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Car_Model(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_car_model(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank sub_employment_id

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Sub_Employment_Id", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Sub_Employment_Id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_sub_employment_id(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 


//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank car_variant

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Car_Variant", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Car_Variant(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_car_variant(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank pan_number

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Pan_Number", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Pan_Number(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_pan_number(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank dealer

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Dealer", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Dealer(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_dealer(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 

//Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank net_annual_income

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "PrimaryAppPersonalDetail_Blank_Net_Annual_Income", dataProviderClass = DataProviderSource.class)
public void primaryAPPPersonalDetail_Blank_Net_Annual_Income(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	PrimaryAppPojo PrimaryAppPojo = new PrimaryAppPojo(data.get("first_name"),CustomerEnquiry.CustomerenquiryID , data.get("last_name") ,data.get("email"),PhoneNumberGenerator.randomMobileNumber , data.get("dob") ,data.get("city"),data.get("state") , data.get("dealer") ,data.get("registration"),data.get("is_customer_co_applicant_type") , data.get("car_model") ,data.get("car_variant"),data.get("employment_type") , data.get("sub_employment_id") ,data.get("residence_type"),data.get("employer_type") , data.get("solicit_flag") ,data.get("credit_check_flag"),data.get("pan_number") , data.get("employer") ,data.get("aadhar_number"),data.get("annual_salary") , data.get("net_annual_income") ,data.get("current_emi"),data.get("residing_since") , data.get("work_experience_years") ,data.get("work_experience_months"), PhoneNumberGenerator.randomMobileNumber );	
	ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, PrimaryAppPojo);
String bodyData=sw.toString();  
	PrimaryAppPersonalDetail.blank_net_annual_income(bodyData);
Assert.assertEquals(PrimaryAppPersonalDetail.code, 409,"Status Code Validation Failed for Loan Submission Primary APP Personal Details ");

} 


    }	
	