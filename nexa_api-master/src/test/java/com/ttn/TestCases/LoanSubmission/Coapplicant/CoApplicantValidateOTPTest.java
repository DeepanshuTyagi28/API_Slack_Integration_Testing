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
import org.testng.asserts.SoftAssert;

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
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantGetOTP;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantValidateOTP;
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
import com.ttn.pojoClasses.loanSubmission.Coapplicant.ValidateCoApplicantOTPPojo;
/**
 * @author Deepanshu Tyagi
 */

//	Method is used to Verify Functionality to Loan Submission : Validate CoApplicant OTP API


public class CoApplicantValidateOTPTest extends BaseLib {

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantValidateOTP_ValidInput", dataProviderClass = DataProviderSource.class)
public void coApplicant_ValidateOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	ValidateCoApplicantOTPPojo ValidateCoApplicantOTPPojo = new ValidateCoApplicantOTPPojo(data.get("channel"),data.get("mobile"), CoApplicantGetOTP.CoApplicant_OTP ,data.get("applicant_type"));	
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, ValidateCoApplicantOTPPojo);
    String bodyData=sw.toString();  
    CoApplicantValidateOTP.validInput(bodyData);
}  



	//	Method is used to Verify Functionality to Loan Submission : Validate CoApplicant OTP   API with Blank Mobile Number


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantValidateOTP_Blank_Mobile", dataProviderClass = DataProviderSource.class)
public void coApplicant_ValidateOTP_BlankMobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	ValidateCoApplicantOTPPojo ValidateCoApplicantOTPPojo = new ValidateCoApplicantOTPPojo(data.get("channel"),data.get("mobile"), CoApplicantGetOTP.CoApplicant_OTP ,data.get("applicant_type"));	
	ObjectMapper mapper = new ObjectMapper();
    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    StringWriter sw = new StringWriter();
    mapper.writeValue(sw, ValidateCoApplicantOTPPojo);
    String bodyData=sw.toString();  
    CoApplicantValidateOTP.blank_Mobile(bodyData);
    Assert.assertEquals(CoApplicantValidateOTP.code, 409,"Status Code Validation Failed for Loan Submission : Validate CoApplicant OTP API");
} 


//	Method is used to Verify Functionality to Loan Submission : Validate CoApplicant OTP   API with Invalid Mobile Number


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantValidateOTP_Invalid_Mobile", dataProviderClass = DataProviderSource.class)
public void coApplicant_ValidateOTP_InvalidMobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ValidateCoApplicantOTPPojo ValidateCoApplicantOTPPojo = new ValidateCoApplicantOTPPojo(data.get("channel"),data.get("mobile"), CoApplicantGetOTP.CoApplicant_OTP ,data.get("applicant_type"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ValidateCoApplicantOTPPojo);
String bodyData=sw.toString();  
CoApplicantValidateOTP.invalid_Mobile(bodyData);
Assert.assertEquals(CoApplicantValidateOTP.code, 409,"Status Code Validation Failed for Loan Submission : Validate CoApplicant OTP API");
}



//	Method is used to Verify Functionality to Loan Submission : Validate CoApplicant OTP   API with Blank Channel


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantValidateOTP_Blank_Channel", dataProviderClass = DataProviderSource.class)
public void coApplicant_ValidateOTP_BlankChannel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ValidateCoApplicantOTPPojo ValidateCoApplicantOTPPojo = new ValidateCoApplicantOTPPojo(data.get("channel"),data.get("mobile"), CoApplicantGetOTP.CoApplicant_OTP ,data.get("applicant_type"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ValidateCoApplicantOTPPojo);
String bodyData=sw.toString();  
CoApplicantValidateOTP.blank_Channel(bodyData);
Assert.assertEquals(CoApplicantValidateOTP.code, 409,"Status Code Validation Failed for Loan Submission : Validate CoApplicant OTP API");
} 


//Method is used to Verify Functionality to Loan Submission : Validate CoApplicant OTP   API with Invalid Channel


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantValidateOTP_Invalid_Channel", dataProviderClass = DataProviderSource.class)
public void coApplicant_ValidateOTP_InvalidChannel(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ValidateCoApplicantOTPPojo ValidateCoApplicantOTPPojo = new ValidateCoApplicantOTPPojo(data.get("channel"),data.get("mobile"), CoApplicantGetOTP.CoApplicant_OTP ,data.get("applicant_type"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ValidateCoApplicantOTPPojo);
String bodyData=sw.toString();  
CoApplicantValidateOTP.invalid_Mobile(bodyData);
Assert.assertEquals(CoApplicantValidateOTP.code, 409,"Status Code Validation Failed for Loan Submission : Validate CoApplicant OTP API");
}


//	Method is used to Verify Functionality to Loan Submission : Validate CoApplicant OTP   API with Blank OTP


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantValidateOTP_Blank_OTP", dataProviderClass = DataProviderSource.class)
public void coApplicant_ValidateOTP_Blank_OTP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ValidateCoApplicantOTPPojo ValidateCoApplicantOTPPojo = new ValidateCoApplicantOTPPojo(data.get("channel"),data.get("mobile"), data.get("otp"),data.get("applicant_type"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ValidateCoApplicantOTPPojo);
String bodyData=sw.toString();  
CoApplicantValidateOTP.blank_OTP(bodyData);
Assert.assertEquals(CoApplicantValidateOTP.code, 409,"Status Code Validation Failed for Loan Submission : Validate CoApplicant OTP API");
} 


//Method is used to Verify Functionality to Loan Submission : Validate CoApplicant OTP   API with Invalid OTP


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantValidateOTP_Invalid_OTP", dataProviderClass = DataProviderSource.class)
public void coApplicant_ValidateOTP_Invalid_OTP(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ValidateCoApplicantOTPPojo ValidateCoApplicantOTPPojo = new ValidateCoApplicantOTPPojo(data.get("channel"),data.get("mobile"), data.get("otp") ,data.get("applicant_type"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ValidateCoApplicantOTPPojo);
String bodyData=sw.toString();  
CoApplicantValidateOTP.invalid_OTP(bodyData);
Assert.assertEquals(CoApplicantValidateOTP.code, 409,"Status Code Validation Failed for Loan Submission : Validate CoApplicant OTP API");
}



}	
    
