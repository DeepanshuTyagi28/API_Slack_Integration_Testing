package com.ttn.BusinessLogic.FMP;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class VerifyOTP  {
	
	    protected static Logger logger = LoggerFactory.getLogger(VerifyOTP.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  Access_token_Value;
	    public static String  Access_token_Value_DownloadSanctionLetter;
	    public static String  Access_token_CoApplicantCustomerJourney;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/user/v1/maruti/token/mobile";
	    
	    
	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Functionality of Arena FMP API to Verify OTP with valid input
	   */

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	    	
	     //   RequestBuilder_new.request.header("X-user-ip-address", "192.168.9.232");
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());

  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify OTP API" +endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("token_type");
	        Access_token_Value = jsonPathEvaluator.get("access_token");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +VerifyOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify OTP API  with Valid Input" + e);
			}
	    }
		
	//	Method is used to Verify Functionality of Arena FMP API to Verify OTP with Already verified
		public static void OTP_AlreadyVerified(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	    	
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());

  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify OTP API" +endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("error_message");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +VerifyOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify OTP API  with Already Verified OTP" + e);
			}
	    }
		
		
		//	Method is used to Verify Functionality of Arena FMP API to Verify OTP with Invalid OTP format

		public static void invalid_OTP_FORMAT(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	    	
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());

  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify OTP API" +endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +VerifyOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify OTP API  with Invalid OTP Format" + e);
			}
	    }
		

		//	Method is used to Verify Functionality of Arena FMP API to Verify OTP with Invalid OTP 

		public static void invalid_OTP(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	    	
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());

  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify OTP API" +endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("error_message");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +VerifyOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify OTP API  with Invalid OTP" + e);
			}
	    } 
	   
	
	//Download Sanction Letter
	// Method is used to Verify Functionality of Arena FMP API to Verify OTP with Valid OTP for Download Sanction Letter	
		
		public static void validInput_DownloadSanctionLetter(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	 
	    	
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify OTP API" +endpoint);
	        logger.info("Body is "+bodyData);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("token_type");
	        Access_token_Value_DownloadSanctionLetter = jsonPathEvaluator.get("access_token");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +VerifyOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify OTP API  with Valid Input with Download Sanction Letter" + e);
			}
	    }
		
		
		
		//CoApplicant Customer Journey
		// Method is used to Verify Functionality of Arena FMP API to Verify OTP with Valid OTP for CoApplicantCustomerJourney	
			
			public static void validInput_CoApplicantCustomerJourney(String bodyData) {
				
				try {
		    	RequestBuilder_new.FMPBase_URL();	
		    	
		        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for Verify OTP API" +endpoint);
		        logger.info("Body is "+bodyData);
		        RequestBuilder_new.request.body(bodyData);	 
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
		        message = jsonPathEvaluator.get("token_type");
		        Access_token_CoApplicantCustomerJourney = jsonPathEvaluator.get("access_token");
				logger.info("Expected status code 200");
				logger.info("Actual status code :"+" " +VerifyOTP.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena FMP Verify OTP API  with Valid Input with CoApplicantCustomerJourney" + e);
				}
		    }	
	    
  }
        
	
