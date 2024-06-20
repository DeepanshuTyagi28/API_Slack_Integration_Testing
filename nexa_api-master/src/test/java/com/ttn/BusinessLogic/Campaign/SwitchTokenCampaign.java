package com.ttn.BusinessLogic.Campaign;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;
import com.ttn.TestCases.FMP.VerifyOTPTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class SwitchTokenCampaign  {
	
	    protected static Logger logger = LoggerFactory.getLogger(SwitchTokenCampaign.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  Message;
	    public static String access_token;
	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/user/v1/maruti/switch-token";
	    
	    
	   
// @param bodyData
//Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign 

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Switch Token Campaign API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        access_token = jsonPathEvaluator.get("token_type");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +SwitchTokenCampaign.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Switch Token Campaign API with Valid Input" + e);
			}
	    }
		
		
 // Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Blank Authorization Token
		public static void blank_AuthToken(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", "");         // Blank Auth Token
	        logger.info("Execution Started");
	        logger.info("Endpoint for Switch Token Campaign API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        Message = jsonPathEvaluator.get("fault.message");
			logger.info("Expected status code 401");
			logger.info("Actual status code :"+" " +SwitchTokenCampaign.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Switch Token Campaign API with Blank Authorization Token" + e);
			}
	    }
		
		
// Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Invalid Authorization Token

		public static void invalid_AuthToken(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", "ABCDRTYU");         // Invalid Auth Token
	        logger.info("Execution Started");
	        logger.info("Endpoint for Switch Token Campaign API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        Message = jsonPathEvaluator.get("fault.message");
			logger.info("Expected status code 401");
			logger.info("Actual status code :"+" " +SwitchTokenCampaign.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Switch Token Campaign API with Invalid Authorization Token" + e);
			}
	    }

		
// Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Blank Mobile Number
	
		public static void blank_MobileNumber(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Switch Token Campaign API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        Message = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +SwitchTokenCampaign.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Switch Token Campaign API with Blank Mobile Number" + e);
			}
	    }
		
		
// Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Invalid Mobile Number

	public static void invalid_MobileNumber(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Switch Token Campaign API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        Message = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +SwitchTokenCampaign.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Switch Token Campaign API with with Invalid Mobile Number" + e);
			}
	    }
	
	
	// Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Blank channel_id 
	
	public static void blank_channel_id(String bodyData) {
		
		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
        logger.info("Execution Started");
        logger.info("Endpoint for Switch Token Campaign API" +endpoint);
        RequestBuilder_new.request.body(bodyData);	 
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        ExtentManager.ApiInfo = endpoint;
        logger.info("Response is "+response.prettyPrint());
        code =   response.getStatusCode();	        
        responseBody = response.getBody().asString();	        
        JsonPath jsonPathEvaluator = response.jsonPath();	        
        Status = jsonPathEvaluator.get("status");
        Message = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +SwitchTokenCampaign.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Switch Token Campaign API with with Blank channel_id" + e);
		}
    }
	
	
	// Method is used to Verify Functionality to Arena API for FMP Module: Switch Token Campaign with Invalid channel_id 

	
	public static void invalid_channel_id(String bodyData) {
		
		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
        logger.info("Execution Started");
        logger.info("Endpoint for Switch Token Campaign API" +endpoint);
        RequestBuilder_new.request.body(bodyData);	 
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        ExtentManager.ApiInfo = endpoint;
        logger.info("Response is "+response.prettyPrint());
        code =   response.getStatusCode();	        
        responseBody = response.getBody().asString();	        
        JsonPath jsonPathEvaluator = response.jsonPath();	        
        Status = jsonPathEvaluator.get("status");
        Message = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +SwitchTokenCampaign.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Switch Token Campaign API with with Invalid channel_id " + e);
		}
    }
  }
        
	
