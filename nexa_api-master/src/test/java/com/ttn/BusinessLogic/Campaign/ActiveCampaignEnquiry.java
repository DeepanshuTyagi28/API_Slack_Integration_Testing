package com.ttn.BusinessLogic.Campaign;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.ExtentManager;
import com.ttn.TestCases.FMP.VerifyOTPTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class ActiveCampaignEnquiry  {
	
	    protected static Logger logger = LoggerFactory.getLogger(ActiveCampaignEnquiry.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  Message;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/customer/v1/enquiry/active/all";
	    
	    
	   
// @param bodyData
//Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Active Campaign Enquiry API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +ActiveCampaignEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Active Campaign Enquiry API with Valid Input" + e);
			}
	    }
		
		
 // Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Blank Authorization Token
		public static void blank_AuthToken(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", "");         // Blank Auth Token
	        logger.info("Execution Started");
	        logger.info("Endpoint for Active Campaign Enquiry API" +endpoint);
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
			logger.info("Actual status code :"+" " +ActiveCampaignEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Active Campaign Enquiry API with Blank Authorization Token" + e);
			}
	    }
		
		
// Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Invalid Authorization Token

		public static void invalid_AuthToken(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", "ABCDRTYU");         // Invalid Auth Token
	        logger.info("Execution Started");
	        logger.info("Endpoint for Active Campaign Enquiry API" +endpoint);
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
			logger.info("Actual status code :"+" " +ActiveCampaignEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Active Campaign Enquiry API with Invalid Authorization Token" + e);
			}
	    }

		
// Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Blank Mobile Number
	
		public static void blank_MobileNumber(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Active Campaign Enquiry API" +endpoint);
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
			logger.info("Actual status code :"+" " +ActiveCampaignEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Active Campaign Enquiry API with Blank Mobile Number" + e);
			}
	    }
		
		
// Method is used to Verify Functionality to Arena API for FMP Module: Active Campaign Enquiry with Invalid Mobile Number

	public static void invalid_MobileNumber(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-campaign-authorization", VerifyCampaignOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Active Campaign Enquiry API" +endpoint);
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
			logger.info("Actual status code :"+" " +ActiveCampaignEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Active Campaign Enquiry API with with Invalid Mobile Number" + e);
			}
	    }
  }
        
	
