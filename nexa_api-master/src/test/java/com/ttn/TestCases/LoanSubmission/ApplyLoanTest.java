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
/**
 * @author Deepanshu Tyagi
 */

 // Method is used to Verify Functionality to Loan Submission Apply Loan API


    public class ApplyLoanTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_ValidInput", dataProviderClass = DataProviderSource.class)
    public void applyLoan_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, ApplyLoanPojo);
        String bodyData=sw.toString();  
        ApplyLoan.validInput(bodyData);
        Assert.assertEquals(ApplyLoan.code, 200,"Status Code Validation Failed for Loan Submission Apply Loan ");
        Assert.assertEquals(ApplyLoan.Status, "INITIATED");
        Assert.assertEquals(ApplyLoan.message, "Loan submission process Initiated for HDFC Bank");


    }   
    
    
	//	 Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank loan_Amount
   

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Blank_loan_Amount", dataProviderClass = DataProviderSource.class)
    public void applyLoan_Blank_loan_Amount(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, ApplyLoanPojo);
        String bodyData=sw.toString();  
        ApplyLoan.blank_loan_amount(bodyData);
        Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
    } 
    
	//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid loan_Amount
    

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Invalid_loan_Amount", dataProviderClass = DataProviderSource.class)
    public void applyLoan_Invalid_loan_Amount(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, ApplyLoanPojo);
        String bodyData=sw.toString();  
        ApplyLoan.invalid_loan_amount(bodyData);
        Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
    }  
    
    
//	   Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank loan_Type
    

@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Blank_loan_Type", dataProviderClass = DataProviderSource.class)
public void applyLoan_Blank_loan_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
	ObjectMapper mapper = new ObjectMapper();
 mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
 mapper.enable(SerializationFeature.INDENT_OUTPUT);
 StringWriter sw = new StringWriter();
 mapper.writeValue(sw, ApplyLoanPojo);
 String bodyData=sw.toString();  
 ApplyLoan.blank_loan_type(bodyData);
 Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
} 

//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid loan_Type


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Invalid_loan_Type", dataProviderClass = DataProviderSource.class)
public void applyLoan_Invalid_loan_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
	ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
	ObjectMapper mapper = new ObjectMapper();
 mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
 mapper.enable(SerializationFeature.INDENT_OUTPUT);
 StringWriter sw = new StringWriter();
 mapper.writeValue(sw, ApplyLoanPojo);
 String bodyData=sw.toString();  
 ApplyLoan.invalid_loan_type(bodyData);
 Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
}  
  
//Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank Tenure


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Blank_Tenure", dataProviderClass = DataProviderSource.class)
public void applyLoan_Blank_Tenure(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ApplyLoanPojo);
String bodyData=sw.toString();  
ApplyLoan.blank_tenure(bodyData);
Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
} 

//	   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid Tenure


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Invalid_Tenure", dataProviderClass = DataProviderSource.class)
public void applyLoan_Invalid_Tenure(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ApplyLoanPojo);
String bodyData=sw.toString();  
ApplyLoan.invalid_tenure(bodyData);
Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
} 



//Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank Processing_Fee


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Blank_Processing_Fee", dataProviderClass = DataProviderSource.class)
public void applyLoan_Blank_Processing_Fee(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ApplyLoanPojo);
String bodyData=sw.toString();  
ApplyLoan.blank_processing_fee(bodyData);
Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
} 

//	   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid Processing_Fee


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Invalid_Processing_Fee", dataProviderClass = DataProviderSource.class)
public void applyLoan_Invalid_Processing_Fee(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ApplyLoanPojo);
String bodyData=sw.toString();  
ApplyLoan.invalid_processing_fee(bodyData);
Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
} 

 

//Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank EMI


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Blank_EMI", dataProviderClass = DataProviderSource.class)
public void applyLoan_Blank_EMI(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ApplyLoanPojo);
String bodyData=sw.toString();  
ApplyLoan.blank_emi(bodyData);
Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
} 

//	   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid EMI


@Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "ApplyLoan_Invalid_EMI", dataProviderClass = DataProviderSource.class)
public void applyLoan_Invalid_EMI(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
{
ApplyLoanPojo ApplyLoanPojo = new ApplyLoanPojo( CustomerEnquiry.CustomerenquiryID ,data.get("current_emi"),  data.get("financier_id") ,data.get("loan_amount"), data.get("loan_type") ,data.get("tenure"),data.get("doc_list") , data.get("message") ,data.get("processing_fee"),data.get("processing_fee_display") , data.get("interest_rate") ,data.get("emi"),data.get("expected_tenure"));	
ObjectMapper mapper = new ObjectMapper();
mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
mapper.enable(SerializationFeature.INDENT_OUTPUT);
StringWriter sw = new StringWriter();
mapper.writeValue(sw, ApplyLoanPojo);
String bodyData=sw.toString();  
ApplyLoan.invalid_emi(bodyData);
Assert.assertEquals(ApplyLoan.code, 409,"Status Code Validation Failed for Loan Submission Apply Loan ");
} 

 }	
