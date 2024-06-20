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

        public class ApplyLoan  {
	
	    protected static Logger logger = LoggerFactory.getLogger(ApplyLoan.class);
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
	    
	    private static String  endpoint = "/maruti/financing/v1/loan-submission";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to Loan Submission Apply Loan API
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with valid Input" + e);
			}
	    }

		
		//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank loan_amount
		
		public static void blank_loan_amount(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Blank loan_amount" + e);
			}
	    }
		
	//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid loan_amount
		
		public static void invalid_loan_amount(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Invalid loan_amount" + e);
			}
	    }	
		
		//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank loan_type
		
		public static void blank_loan_type(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Blank loan_type" + e);
			}
	    }
		
	//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid loan_type
		
		public static void invalid_loan_type(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Invalid loan_type" + e);
			}
	    }	
		//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank tenure
		
		public static void blank_tenure(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Blank tenure" + e);
			}
	    }
		
	//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid tenure
		
		public static void invalid_tenure(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Invalid tenure" + e);
			}
	    }	
		
		
		//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank processing_fee
		
		public static void blank_processing_fee(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Blank processing_fee" + e);
			}
	    }
		
	//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid processing_fee
		
		public static void invalid_processing_fee(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Invalid processing_fee" + e);
			}
	    }
		
		
		//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Blank emi
		
		public static void blank_emi(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Blank emi" + e);
			}
	    }
		
	//		   Method is used to Verify Functionality to Loan Submission Apply Loan API with Invalid emi
		
		public static void invalid_emi(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Apply Loan API" +endpoint);
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
			logger.info("Actual status code :"+" " +ApplyLoan.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Apply Loan API with Invalid emi" + e);
			}
	    }
		
		
		
  }