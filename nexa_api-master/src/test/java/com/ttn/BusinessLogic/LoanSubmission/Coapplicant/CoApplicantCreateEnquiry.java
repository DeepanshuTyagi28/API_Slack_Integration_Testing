package com.ttn.BusinessLogic.LoanSubmission.Coapplicant;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.FMP.CustomerEnquiry;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.ExtentManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class CoApplicantCreateEnquiry {
	
	    protected static Logger logger = LoggerFactory.getLogger(CoApplicantCreateEnquiry.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  p_Enquiry_no;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String p_dms_Web_Booking_Ref_no;
	    public static String message;
	    public static String CoApplicant_CustomerenquiryID;

	    
	   //Replace below end point as per need.
	    
	    private static String  endpoint = "maruti/customer/v1/enquiry";
	    
	   

	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Enquiry Creation

	  		public static void validInput(String bodyData) {
	  	
	  			try {
	  	    	RequestBuilder_new.FMPBase_URL();	    	
	  	        RequestBuilder_new.request.header("Content-Type", "application/json");
	  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
	  	        RequestBuilder_new.request.header("x-fmp-source", "");
	  	        logger.info("Execution Started");
	  	        logger.info("Authentication Token is as "+" " +VerifyOTP.Access_token_CoApplicantCustomerJourney);
	  	        logger.info("Body is" +" "+bodyData);
	  	        logger.info("Endpoint for Co-Applicant Customer Enquiry Generation API :-" +" " +endpoint);
	  	        RequestBuilder_new.request.body(bodyData);	 
	  	        response =  RequestBuilder_new.request.post(endpoint);
	  	        ExtentManager.responseBody = response.getBody().asString();
	  	        ExtentManager.ApiInfo = endpoint;
	  	        logger.info("Response is "+response.prettyPrint());
	  	        code =   response.getStatusCode();	        
	  	        responseBody = response.getBody().asString();	        
	  	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	  	        Status = jsonPathEvaluator.get("status");
		        CoApplicant_CustomerenquiryID = jsonPathEvaluator.get("enquiry_id");
	  	        message = jsonPathEvaluator.get("message");
	  			logger.info("Expected status code 201");
	  			logger.info("Actual status code :"+" " +CoApplicantCreateEnquiry.code);
	  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
	  			logger.info("Test case executed successfully");
	  			}
	  			
	  			catch(Exception e)
	  			{
	  				logger.info("Exeption While Executing Arena CO-Applicant Customer Enquiry API with Valid Input" + e);
	  			}
	  	    }

		
	  	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Blank Mobile Number

	  		public static void blank_MobileNumber(String bodyData) {
	  	
	  			try {
	  	    	RequestBuilder_new.FMPBase_URL();	    	
	  	        RequestBuilder_new.request.header("Content-Type", "application/json");
	  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
	  	        RequestBuilder_new.request.header("x-fmp-source", "");
	  	        logger.info("Execution Started");
	  	        logger.info("Body is" +" "+bodyData);
	  	        logger.info("Endpoint for Co-Applicant Customer Enquiry Generation API :-" +" " +endpoint);
	  	        RequestBuilder_new.request.body(bodyData);	 
	  	        response =  RequestBuilder_new.request.post(endpoint);
	  	        ExtentManager.responseBody = response.getBody().asString();
	  	        ExtentManager.ApiInfo = endpoint;
	  	        logger.info("Response is "+response.prettyPrint());
	  	        code =   response.getStatusCode();	        
	  	        responseBody = response.getBody().asString();	        
	  	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	  	        Status = jsonPathEvaluator.get("status");
		        CoApplicant_CustomerenquiryID = jsonPathEvaluator.get("enquiry_id");
	  	        message = jsonPathEvaluator.get("message");
	  			logger.info("Expected status code 401");
	  			logger.info("Actual status code :"+" " +CoApplicantCreateEnquiry.code);
	  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
	  			logger.info("Test case executed successfully");
	  			}
	  			
	  			catch(Exception e)
	  			{
	  				logger.info("Exeption While Executing Arena CO-Applicant Customer Enquiry API with Blank Mobile Number" + e);
	  			}
	  	    }
	  		
		  	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Invalid Mobile Number

		  		public static void invalid_MobileNumber(String bodyData) {
		  	
		  			try {
		  	    	RequestBuilder_new.FMPBase_URL();	    	
		  	        RequestBuilder_new.request.header("Content-Type", "application/json");
		  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
		  	        RequestBuilder_new.request.header("x-fmp-source", "");
		  	        logger.info("Execution Started");
		  	        logger.info("Body is" +" "+bodyData);
		  	        logger.info("Endpoint for Co-Applicant Customer Enquiry Generation API :-" +" " +endpoint);
		  	        RequestBuilder_new.request.body(bodyData);	 
		  	        response =  RequestBuilder_new.request.post(endpoint);
		  	        ExtentManager.responseBody = response.getBody().asString();
		  	        ExtentManager.ApiInfo = endpoint;
		  	        logger.info("Response is "+response.prettyPrint());
		  	        code =   response.getStatusCode();	        
		  	        responseBody = response.getBody().asString();	        
		  	        JsonPath jsonPathEvaluator = response.jsonPath();	        
		  	        Status = jsonPathEvaluator.get("status");
		  	        message = jsonPathEvaluator.get("message");
		  			logger.info("Expected status code 401");
		  			logger.info("Actual status code :"+" " +CoApplicantCreateEnquiry.code);
		  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
		  			logger.info("Test case executed successfully");
		  			}
		  			
		  			catch(Exception e)
		  			{
		  				logger.info("Exeption While Executing Arena CO-Applicant Customer Enquiry API with Invalid Mobile Number" + e);
		  			}
		  	    }  		
			  	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Blank Car Model

		  		public static void blank_CarModel(String bodyData) {
		  	
		  			try {
		  	    	RequestBuilder_new.FMPBase_URL();	    	
		  	        RequestBuilder_new.request.header("Content-Type", "application/json");
		  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
		  	        RequestBuilder_new.request.header("x-fmp-source", "");
		  	        logger.info("Execution Started");
		  	        logger.info("Body is" +" "+bodyData);
		  	        logger.info("Endpoint for Co-Applicant Customer Enquiry Generation API :-" +" " +endpoint);
		  	        RequestBuilder_new.request.body(bodyData);	 
		  	        response =  RequestBuilder_new.request.post(endpoint);
		  	        ExtentManager.responseBody = response.getBody().asString();
		  	        ExtentManager.ApiInfo = endpoint;
		  	        logger.info("Response is "+response.prettyPrint());
		  	        code =   response.getStatusCode();	        
		  	        responseBody = response.getBody().asString();	        
		  	        JsonPath jsonPathEvaluator = response.jsonPath();	        
		  	        Status = jsonPathEvaluator.get("status");
		  	        message = jsonPathEvaluator.get("message");
		  			logger.info("Expected status code 409");
		  			logger.info("Actual status code :"+" " +CoApplicantCreateEnquiry.code);
		  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
		  			logger.info("Test case executed successfully");
		  			}
		  			
		  			catch(Exception e)
		  			{
		  				logger.info("Exeption While Executing Arena CO-Applicant Customer Enquiry API with Blank Car Model" + e);
		  			}
		  	    }	
		  		
		  		
			  	  //Method is used to Verify Functionality to Arena Co-Applicant Loan Submission /Customer Journey CO-Applicant with Blank Car Variant

		  		public static void blank_CarVariant(String bodyData) {
		  	
		  			try {
		  	    	RequestBuilder_new.FMPBase_URL();	    	
		  	        RequestBuilder_new.request.header("Content-Type", "application/json");
		  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
		  	        RequestBuilder_new.request.header("x-fmp-source", "");
		  	        logger.info("Execution Started");
		  	        logger.info("Body is" +" "+bodyData);
		  	        logger.info("Endpoint for Co-Applicant Customer Enquiry Generation API :-" +" " +endpoint);
		  	        RequestBuilder_new.request.body(bodyData);	 
		  	        response =  RequestBuilder_new.request.post(endpoint);
		  	        ExtentManager.responseBody = response.getBody().asString();
		  	        ExtentManager.ApiInfo = endpoint;
		  	        logger.info("Response is "+response.prettyPrint());
		  	        code =   response.getStatusCode();	        
		  	        responseBody = response.getBody().asString();	        
		  	        JsonPath jsonPathEvaluator = response.jsonPath();	        
		  	        Status = jsonPathEvaluator.get("status");
		  	        message = jsonPathEvaluator.get("message");
		  			logger.info("Expected status code 409");
		  			logger.info("Actual status code :"+" " +CoApplicantCreateEnquiry.code);
		  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
		  			logger.info("Test case executed successfully");
		  			}
		  			
		  			catch(Exception e)
		  			{
		  				logger.info("Exeption While Executing Arena CO-Applicant Customer Enquiry API with Blank Car Variant" + e);
		  			}
		  	    }		  		
	   
  }