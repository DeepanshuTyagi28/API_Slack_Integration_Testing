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

        public class CoApplicantSelectedCar {
	
	    protected static Logger logger = LoggerFactory.getLogger(CoApplicantSelectedCar.class);
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
	    
	    private static String  endpoint = "maruti/customer/v1/selected-car";
	    
	   

	  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API

	  		public static void validInput(String bodyData) {
	  	
	  			try {
	  	    	RequestBuilder_new.FMPBase_URL();	    	
	  	        RequestBuilder_new.request.header("Content-Type", "application/json");
	  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
	  	        logger.info("Execution Started");
	  	        logger.info("Authentication Token is as "+" " +VerifyOTP.Access_token_CoApplicantCustomerJourney);
	  	        logger.info("Body is "+" "+bodyData);
	  	        logger.info("Endpoint for Arena CO-Applicant Loan Submission - Save Selected Car API :-" +"  " +endpoint);
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
	  			logger.info("Expected status code 200");
	  			logger.info("Actual status code :"+" " +CoApplicantSelectedCar.code);
	  			logger.info("Test case executed successfully");
	  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
	  			}
	  			
	  			catch(Exception e)
	  			{
	  				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission -Save Selected Car API with Valid Input" + e);
	  			}
	  	    }

	  	  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API with Blank Enquiry ID

	  		public static void blank_EnquiryID(String bodyData) {
	  	
	  			try {
	  	    	RequestBuilder_new.FMPBase_URL();	    	
	  	        RequestBuilder_new.request.header("Content-Type", "application/json");
	  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
	  	        logger.info("Execution Started");
	  	        logger.info("Body is "+" "+bodyData);
	  	        logger.info("Endpoint for Arena CO-Applicant Loan Submission - Save Selected Car API :-" +"  " +endpoint);
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
	  			logger.info("Expected status code 200");
	  			logger.info("Actual status code :"+" " +CoApplicantSelectedCar.code);
	  			logger.info("Test case executed successfully");
	  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
	  			}
	  			
	  			catch(Exception e)
	  			{
	  				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission -Save Selected Car API with Blank Enquiry ID" + e);
	  			}
	  	    }		
 	
		  	  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API with Invalid Enquiry ID

		  		public static void invalid_EnquiryID(String bodyData) {		  	
		  			try {
		  	    	RequestBuilder_new.FMPBase_URL();	    	
		  	        RequestBuilder_new.request.header("Content-Type", "application/json");
		  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
		  	        logger.info("Execution Started");
		  	        logger.info("Body is "+" "+bodyData);
		  	        logger.info("Endpoint for Arena CO-Applicant Loan Submission - Save Selected Car API :-" +"  " +endpoint);
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
		  			logger.info("Expected status code 200");
		  			logger.info("Actual status code :"+" " +CoApplicantSelectedCar.code);
		  			logger.info("Test case executed successfully");
		  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
		  			}
		  			catch(Exception e)
		  			{
		  				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission -Save Selected Car API with Invalid Enquiry ID" + e);
		  			}
		  	    }	 
		  		
			  	  //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Car API with Blank State Code 

		  		public static void blank_StateCode(String bodyData) {
		  	
		  			try {
		  	    	RequestBuilder_new.FMPBase_URL();	    	
		  	        RequestBuilder_new.request.header("Content-Type", "application/json");
		  	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
		  	        logger.info("Execution Started");
		  	        logger.info("Body is "+" "+bodyData);
		  	        logger.info("Endpoint for Arena CO-Applicant Loan Submission - Save Selected Car API :-" +"  " +endpoint);
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
		  			logger.info("Expected status code 200");
		  			logger.info("Actual status code :"+" " +CoApplicantSelectedCar.code);
		  			logger.info("Test case executed successfully");
		  	        logger.info("Enquiry ID is Generated as : "+" " +CoApplicantCreateEnquiry.CoApplicant_CustomerenquiryID);
		  			}
		  			
		  			catch(Exception e)
		  			{
		  				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission -Save Selected Car API with Blank State Code" + e);
		  			}
		  	    }		  		
		  		
		  		
  }