package com.ttn.BusinessLogic.LoanSubmission;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.ExtentManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class CheckLoanOffer  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CheckLoanOffer.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  p_Enquiry_no;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String p_dms_Web_Booking_Ref_no;
	    public static String message;
	    public static String p_dms_Web_Booking_Ref_no_LostStatus;
	    public static String p_Enquiry_no_LostStatus;

	   //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/financing/v1/check-loan-offer/280003";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to Loan Submission Check Loan Offer API
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
  	        logger.info("Token Used is as " +" " +VerifyOTP.Access_token_Value);
	        logger.info("Endpoint for Loan Submission Check Loan Offer API" +endpoint);
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
			logger.info("Actual status code :"+" " +CheckLoanOffer.code);
			logger.info("Test case executed successfully");
			
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Check Loan Offer API with valid Input" + e);
			}
	    }
		
		
	//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Blank Enq ID

		public static void blank_EnqID(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Check Loan Offer API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 401");
			logger.info("Actual status code :"+" " +CheckLoanOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Check Loan Offer API with Blank Enq ID" + e);
			}
	    }		
	
		//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Invalid Enq ID

		public static void invalid_EnqID(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Check Loan Offer API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 401");
			logger.info("Actual status code :"+" " +CheckLoanOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Check Loan Offer API with Invalid Enq ID" + e);
			}
	    }
		
		//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Blank mobile

		public static void blank_mobile(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Check Loan Offer API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CheckLoanOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Check Loan Offer API with Blank mobile" + e);
			}
	    }		
	
		//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Invalid mobile

		public static void invalid_mobile(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Check Loan Offer API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CheckLoanOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Check Loan Offer API with Invalid mobile" + e);
			}
	    }		
		
		
		//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Blank interest_rate

		public static void blank_interest_rate(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Check Loan Offer API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CheckLoanOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Check Loan Offer API with Blank interest_rate" + e);
			}
	    }		
	
		//	   Method is used to Verify Functionality to Loan Submission Check Loan Offer API with Invalid interest_rate

		public static void invalid_interest_rate(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Check Loan Offer API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CheckLoanOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Check Loan Offer API with Invalid interest_rate" + e);
			}
	    }		
		
  }