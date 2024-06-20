package com.ttn.BusinessLogic.FMP;

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

        public class CompanySearch  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CompanySearch.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  ErrorCode;
	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/loan-offer/v1/company/search";
	    
	    
	   
// @param bodyData
//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/Company Search

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Company Search API" +endpoint);
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
			logger.info("Actual status code :"+" " +CompanySearch.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP PriceSummary/Company Search API with Valid Input" + e);
			}
	    }
		
	
		
		
   //Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/Company Search with Minimum Search Criteria (Less than 3 Work)

		public static void invalidInput(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Company Search API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        ErrorCode = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CompanySearch.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP PriceSummary/Company Search API with Valid Input with Minimum word Search Criteria " + e);
			}
	    }
		
	
 						
  }
        
	
