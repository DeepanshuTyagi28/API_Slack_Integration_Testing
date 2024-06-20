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
import com.ttn.BusinessLogic.LoanSubmission.GetLoanStatus;
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

 //Method is used to Verify Functionality to Loan Submission :Get Loan Status


    public class GetLoanStatusTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"})
    public void GetLoanStatus_ValidInput()
   
    {
    	GetLoanStatus.validInput();
        Assert.assertEquals(GetLoanStatus.Status, "Success");
        Assert.assertEquals(GetLoanStatus.message, "Loan status successfully returned");
    }   
   
    
    
  //Method is used to Verify Functionality to Loan Submission :Get Loan Status API with Invalid Enq ID
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"})
    public void GetLoanStatus_InvalidEnqID()
   
    {
    	GetLoanStatus.invalid_EnqID();
        Assert.assertEquals(GetLoanStatus.Status, "Failure");
    } 
	
 }	
