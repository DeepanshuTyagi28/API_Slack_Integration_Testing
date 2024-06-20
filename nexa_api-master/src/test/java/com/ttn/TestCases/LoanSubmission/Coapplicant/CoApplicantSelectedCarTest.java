package com.ttn.TestCases.LoanSubmission.Coapplicant;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

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
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.BusinessLogic.LoanSubmission.AllOffer;
import com.ttn.BusinessLogic.LoanSubmission.ApplyLoan;
import com.ttn.BusinessLogic.LoanSubmission.CheckLoanOffer;
import com.ttn.BusinessLogic.LoanSubmission.LoanApplicant;
import com.ttn.BusinessLogic.LoanSubmission.PrimaryAppPersonalDetail;
import com.ttn.BusinessLogic.LoanSubmission.SelectedCar;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantCreateEnquiry;
import com.ttn.BusinessLogic.LoanSubmission.Coapplicant.CoApplicantSelectedCar;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.TestCases.FMP.SendOTPTest;
import com.ttn.pojoClasses.CustomerEnquiryPojo;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.loanSubmission.AllOfferPojo;
import com.ttn.pojoClasses.loanSubmission.ApplyLoanPojo;
import com.ttn.pojoClasses.loanSubmission.CarEnquiryPojo;
import com.ttn.pojoClasses.loanSubmission.CheckLoanOfferPojo;
import com.ttn.pojoClasses.loanSubmission.LoanApplicantPojo;
import com.ttn.pojoClasses.loanSubmission.PrimaryAppPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CoApplicantSelectedCarPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CreateEnquiryPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CustomerDetailPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.CustomerDetailSelfEmployedPojo;
import com.ttn.pojoClasses.loanSubmission.Coapplicant.SaveSelectedOfferPojo;
/**
 * @author Deepanshu Tyagi
 */

//Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API


public class CoApplicantSelectedCarTest extends BaseLib {

  @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantSelectedCar_ValidInput", dataProviderClass = DataProviderSource.class)
  public void coApplicant_SelectedCar_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
  {
  	CoApplicantSelectedCarPojo CoApplicantSelectedCarPojo = new CoApplicantSelectedCarPojo(CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID, new
  	CoApplicantSelectedCarPojo.CarSummary( data.get("color_description"), data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),	  data.get("tcs"), 
	    List.of(new CoApplicantSelectedCarPojo.InsuranceData("1500", "1+3 years"))));    	
  	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
      mapper.enable(SerializationFeature.INDENT_OUTPUT);
      StringWriter sw = new StringWriter();
      mapper.writeValue(sw , CoApplicantSelectedCarPojo);
      String bodyData=sw.toString();  
      CoApplicantSelectedCar.validInput(bodyData);
      Assert.assertEquals(CoApplicantSelectedCar.code, 200,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API where Expected Status is 200");
      Assert.assertEquals(CoApplicantSelectedCar.message, "Car Summary Created","Response Body Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API");

  } 
    
	  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API with Blank Enquiry ID
   

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantSelectedCar_BlankEnquiryID", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SelectedCar_Blank_EnquiryID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantSelectedCarPojo CoApplicantSelectedCarPojo = new CoApplicantSelectedCarPojo(data.get("enquiry_id"), new
    	CoApplicantSelectedCarPojo.CarSummary( data.get("color_description"), data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),	  data.get("tcs"), 
	    List.of(new CoApplicantSelectedCarPojo.InsuranceData("1500", "1+3 years"))));    	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CoApplicantSelectedCarPojo);
        String bodyData=sw.toString();  
        CoApplicantSelectedCar.blank_EnquiryID(bodyData);
        Assert.assertEquals(CoApplicantSelectedCar.code, 403,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API where Expected Status is 403");
        Assert.assertEquals(CoApplicantSelectedCar.Status, "Failure","Response Body Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API");

    }     
    
	  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API with Invalid Enquiry ID
    

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantSelectedCar_InvalidEnquiryID", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SelectedCar_Invalid_EnquiryID(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantSelectedCarPojo CoApplicantSelectedCarPojo = new CoApplicantSelectedCarPojo(data.get("enquiry_id"), new
    	CoApplicantSelectedCarPojo.CarSummary( data.get("color_description"), data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),	  data.get("tcs"), 
	    List.of(new CoApplicantSelectedCarPojo.InsuranceData("1500", "1+3 years"))));    	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CoApplicantSelectedCarPojo);
        String bodyData=sw.toString();  
        CoApplicantSelectedCar.invalid_EnquiryID(bodyData);
        Assert.assertEquals(CoApplicantSelectedCar.code, 403,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API where Expected Status is 403");
        Assert.assertEquals(CoApplicantSelectedCar.Status, "Failure","Response Body Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API");

    }
  
    
	  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API with Blank State Code 
   
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "CoApplicantSelectedCar_Blank_StateCode", dataProviderClass = DataProviderSource.class)
    public void coApplicant_SelectedCar_Blank_StateCode(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	CoApplicantSelectedCarPojo CoApplicantSelectedCarPojo = new CoApplicantSelectedCarPojo(CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID, new
    	CoApplicantSelectedCarPojo.CarSummary( data.get("color_description"), data.get("color_code"),data.get("color_indicator"),data.get("company_id"),data.get("company_name"),data.get("customer_type"),data.get("buyer_type"),data.get("registration_tenure"),data.get("share_capital"),data.get("sales_type"),data.get("fuel_type"),data.get("ac_type"),data.get("dealer_code"),data.get("model_code"),data.get("variant_code"),data.get("for_code"),data.get("state_code"),data.get("on_road_price"),data.get("ex_showroom_price"),	  data.get("tcs"), 
	    List.of(new CoApplicantSelectedCarPojo.InsuranceData("1500", "1+3 years"))));    	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw , CoApplicantSelectedCarPojo);
        String bodyData=sw.toString();  
        CoApplicantSelectedCar.blank_StateCode(bodyData);
        Assert.assertEquals(CoApplicantSelectedCar.code, 409,"Status Code Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API where Expected Status is 409");
        Assert.assertEquals(CoApplicantSelectedCar.message, "BusinessException","Response Body Validation Failed for Arena CO-Applicant Loan Submission : Save Selected Car API");

    }   
    
    
    
 }	
