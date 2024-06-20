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
import com.ttn.pojoClasses.loanSubmission.CheckLoanOfferPojo;
import com.ttn.pojoClasses.loanSubmission.LoanApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
/**
 * @author Deepanshu Tyagi
 */

 // Method is used to Verify Functionality to Loan Submission Check Loan Offer API


    public class CheckLoanOfferTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckLoanOffer_ValidInput", dataProviderClass = DataProviderSource.class)
    public void checkLoanOffer_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CheckLoanOfferPojo CheckLoanOfferPojo = new CheckLoanOfferPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("model_code"),  data.get("ex_show_room_price") ,data.get("on_road_price"), data.get("loan_amount") ,data.get("tenure"),data.get("down_payment") , data.get("estimated_emi") ,data.get("processing_fee"),data.get("variant_code") , data.get("dob") ,data.get("employment_type"),data.get("gender") , data.get("first_name") ,data.get("last_name"),data.get("email") , data.get("pan") ,data.get("aadhar"),data.get("net_annual_income") , data.get("residence_type") ,data.get("employer_type"),data.get("interest_rate") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CheckLoanOfferPojo);
        String bodyData=sw.toString();  
        CheckLoanOffer.validInput(bodyData);
        Assert.assertEquals(CheckLoanOffer.code, 200,"Status Code Validation Failed for Loan Submission Check Loan Offer ");
        Assert.assertEquals(CheckLoanOffer.Status, "success","Response Body validation Failed for Check Loan Offer API");
        Assert.assertEquals(CheckLoanOffer.message, "loan detail fetched successfully","Response Body validation Failed for Check Loan Offer API");

    } 
    
	//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Blank Enq ID
   
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckLoanOffer_Blank_EnqID", dataProviderClass = DataProviderSource.class)
    public void checkLoanOffer_Blank_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CheckLoanOfferPojo CheckLoanOfferPojo = new CheckLoanOfferPojo( data.get("enquiry_id") , PhoneNumberGenerator.randomMobileNumber ,data.get("model_code"),  data.get("ex_show_room_price") ,data.get("on_road_price"), data.get("loan_amount") ,data.get("tenure"),data.get("down_payment") , data.get("estimated_emi") ,data.get("processing_fee"),data.get("variant_code") , data.get("dob") ,data.get("employment_type"),data.get("gender") , data.get("first_name") ,data.get("last_name"),data.get("email") , data.get("pan") ,data.get("aadhar"),data.get("net_annual_income") , data.get("residence_type") ,data.get("employer_type"),data.get("interest_rate") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, CheckLoanOfferPojo);
        String bodyData=sw.toString();  
        CheckLoanOffer.blank_EnqID(bodyData);
        Assert.assertEquals(CheckLoanOffer.code, 401,"Status Code Validation Failed for Loan Submission Check Loan Offer ");
    }
    
//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Invalid Enq ID
    
 @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckLoanOffer_Invalid_EnqID", dataProviderClass = DataProviderSource.class)
 public void checkLoanOffer_Invalid_EnqID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
 {
 	CheckLoanOfferPojo CheckLoanOfferPojo = new CheckLoanOfferPojo( data.get("enquiry_id") , PhoneNumberGenerator.randomMobileNumber ,data.get("model_code"),  data.get("ex_show_room_price") ,data.get("on_road_price"), data.get("loan_amount") ,data.get("tenure"),data.get("down_payment") , data.get("estimated_emi") ,data.get("processing_fee"),data.get("variant_code") , data.get("dob") ,data.get("employment_type"),data.get("gender") , data.get("first_name") ,data.get("last_name"),data.get("email") , data.get("pan") ,data.get("aadhar"),data.get("net_annual_income") , data.get("residence_type") ,data.get("employer_type"),data.get("interest_rate") );	
 	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
     mapper.enable(SerializationFeature.INDENT_OUTPUT);
     StringWriter sw = new StringWriter();
     mapper.writeValue(sw, CheckLoanOfferPojo);
     String bodyData=sw.toString();  
     CheckLoanOffer.invalid_EnqID(bodyData);
     Assert.assertEquals(CheckLoanOffer.code, 401,"Status Code Validation Failed for Loan Submission Check Loan Offer ");
 }
 
 
	//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Blank mobile

 @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckLoanOffer_Blank_Mobile", dataProviderClass = DataProviderSource.class)
 public void checkLoanOffer_Blank_Mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
 {
 	CheckLoanOfferPojo CheckLoanOfferPojo = new CheckLoanOfferPojo( CustomerEnquiry.CustomerenquiryID , data.get("mobile") ,data.get("model_code"),  data.get("ex_show_room_price") ,data.get("on_road_price"), data.get("loan_amount") ,data.get("tenure"),data.get("down_payment") , data.get("estimated_emi") ,data.get("processing_fee"),data.get("variant_code") , data.get("dob") ,data.get("employment_type"),data.get("gender") , data.get("first_name") ,data.get("last_name"),data.get("email") , data.get("pan") ,data.get("aadhar"),data.get("net_annual_income") , data.get("residence_type") ,data.get("employer_type"),data.get("interest_rate") );	
 	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
     mapper.enable(SerializationFeature.INDENT_OUTPUT);
     StringWriter sw = new StringWriter();
     mapper.writeValue(sw, CheckLoanOfferPojo);
     String bodyData=sw.toString();  
     CheckLoanOffer.blank_mobile(bodyData);
     Assert.assertEquals(CheckLoanOffer.code, 409,"Status Code Validation Failed for Loan Submission Check Loan Offer ");
 } 
 
	//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Invalid mobile

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckLoanOffer_Invalid_Mobile", dataProviderClass = DataProviderSource.class)
public void checkLoanOffer_Invalid_Mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	CheckLoanOfferPojo CheckLoanOfferPojo = new CheckLoanOfferPojo( CustomerEnquiry.CustomerenquiryID , data.get("mobile") ,data.get("model_code"),  data.get("ex_show_room_price") ,data.get("on_road_price"), data.get("loan_amount") ,data.get("tenure"),data.get("down_payment") , data.get("estimated_emi") ,data.get("processing_fee"),data.get("variant_code") , data.get("dob") ,data.get("employment_type"),data.get("gender") , data.get("first_name") ,data.get("last_name"),data.get("email") , data.get("pan") ,data.get("aadhar"),data.get("net_annual_income") , data.get("residence_type") ,data.get("employer_type"),data.get("interest_rate") );	
	ObjectMapper mapper = new ObjectMapper();
  mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
  mapper.enable(SerializationFeature.INDENT_OUTPUT);
  StringWriter sw = new StringWriter();
  mapper.writeValue(sw, CheckLoanOfferPojo);
  String bodyData=sw.toString();  
  CheckLoanOffer.invalid_mobile(bodyData);
  Assert.assertEquals(CheckLoanOffer.code, 409,"Status Code Validation Failed for Loan Submission Check Loan Offer ");
}  

//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Blank interest_rate

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckLoanOffer_Blank_interest_rate", dataProviderClass = DataProviderSource.class)
public void checkLoanOffer_Blank_interest_rate(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	CheckLoanOfferPojo CheckLoanOfferPojo = new CheckLoanOfferPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("model_code"),  data.get("ex_show_room_price") ,data.get("on_road_price"), data.get("loan_amount") ,data.get("tenure"),data.get("down_payment") , data.get("estimated_emi") ,data.get("processing_fee"),data.get("variant_code") , data.get("dob") ,data.get("employment_type"),data.get("gender") , data.get("first_name") ,data.get("last_name"),data.get("email") , data.get("pan") ,data.get("aadhar"),data.get("net_annual_income") , data.get("residence_type") ,data.get("employer_type"),data.get("interest_rate") );	
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, CheckLoanOfferPojo);
    String bodyData=sw.toString();  
    CheckLoanOffer.blank_interest_rate(bodyData);
    Assert.assertEquals(CheckLoanOffer.code, 409,"Status Code Validation Failed for Loan Submission Check Loan Offer ");
} 
//Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Invalid interest_rate

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CheckLoanOffer_Invalid_interest_rate", dataProviderClass = DataProviderSource.class)
public void checkLoanOffer_Invalid_interest_rate(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
CheckLoanOfferPojo CheckLoanOfferPojo = new CheckLoanOfferPojo( CustomerEnquiry.CustomerenquiryID , PhoneNumberGenerator.randomMobileNumber ,data.get("model_code"),  data.get("ex_show_room_price") ,data.get("on_road_price"), data.get("loan_amount") ,data.get("tenure"),data.get("down_payment") , data.get("estimated_emi") ,data.get("processing_fee"),data.get("variant_code") , data.get("dob") ,data.get("employment_type"),data.get("gender") , data.get("first_name") ,data.get("last_name"),data.get("email") , data.get("pan") ,data.get("aadhar"),data.get("net_annual_income") , data.get("residence_type") ,data.get("employer_type"),data.get("interest_rate") );	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, CheckLoanOfferPojo);
String bodyData=sw.toString();  
CheckLoanOffer.invalid_interest_rate(bodyData);
Assert.assertEquals(CheckLoanOffer.code, 409,"Status Code Validation Failed for Loan Submission Check Loan Offer ");
} 
    
    
    
 }	
