package com.ttn.BusinessLogic.LoanSubmission.Coapplicant;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.FMP.CustomerEnquiry;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.BusinessLogic.LoanSubmission.GetLoanStatus;
import com.ttn.CommonUtils.ExtentManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class CoApplicantGetLoanStatus  {
        	
    	    protected static Logger logger = LoggerFactory.getLogger(GetLoanStatus.class);
    	    private static JSONObject requestParam;
    	    public static Response response;
    	    public static int  statusCode;
    	    public static String  p_Enquiry_no;
    	    public static String  responseBody;
    	    public static int code;
    	    public static String  Status;
    	    public static String p_dms_Web_Booking_Ref_no;
    	    public static String message;

    	   //Replace below end point as per need.
    	    
    	    private static String  endpoint1 = "/maruti/loan-management/v1/loan-status/";
    	    private static String  endpoint2 =  CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID;
    	    private static String  endpoint  =  endpoint1 + endpoint2;
    	    private static String  endpoint3  =  endpoint1 + "AR-124578952589";

    	    
    	    
         //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission :Get Loan Status API
    	      

    		public static void validInput( ) {
    	
    			try {
    	    	RequestBuilder_new.FMPBase_URL();
    	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
      	        logger.info("Execution Started");
    	        logger.info("Endpoint for Arena CO-Applicant Loan Submission :Get Loan Status API" +" " +endpoint);
    	        response =  RequestBuilder_new.request.get(endpoint);
    	        ExtentManager.responseBody = response.getBody().asString();
    	        ExtentManager.ApiInfo = endpoint;
    	        logger.info("Response is "+response.prettyPrint());
    	        code =   response.getStatusCode();	        
    	        responseBody = response.getBody().asString();	        
    	        JsonPath jsonPathEvaluator = response.jsonPath();	        
    	        Status = jsonPathEvaluator.get("status");
    	        message = jsonPathEvaluator.get("message");
    			logger.info("Expected status code 200");
    			logger.info("Actual status code :"+" " +GetLoanStatus.code);
    			logger.info("Test case executed successfully");
    			}
    			catch(Exception e)
    			{
    				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission :Get Loan Status API with valid Input" + e);
    			}
    	    }
    		
		
  }