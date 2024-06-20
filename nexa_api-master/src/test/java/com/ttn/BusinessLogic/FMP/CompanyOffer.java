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

        public class CompanyOffer  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CompanyOffer.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  ErrorCode;
	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/financing/v1/company-offers";
	    
	    
	   
// @param bodyData
//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Execution Started");
	        logger.info("Endpoint for CompanyOffers API" +endpoint);
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
			logger.info("Actual status code :"+" " +CompanyOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Valid Input" + e);
			}
	    }
		
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank dealer_code

				public static void blank_Dealer_Code(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorCode = jsonPathEvaluator.get("errors.error_code[0]");
					logger.info("Expected status code 200");
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Blank dealer_code" + e);
					}
			    }
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid dealer_code

				public static void invalid_Dealer_Code(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
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
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Invalid dealer_code" + e);
					}
			    }			
 
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank variant_code

				public static void blank_variant_code(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorCode = jsonPathEvaluator.get("errors.error_code[0]");
					logger.info("Expected status code 200");
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Blank variant_code" + e);
					}
			    }
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid variant_code

				public static void invalid_variant_code(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
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
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Invalid variant_code" + e);
					}
			    }			
 	
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank model_code

				public static void blank_model_code(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorCode = jsonPathEvaluator.get("errors.error_code[0]");
					logger.info("Expected status code 200");
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Blank model_code" + e);
					}
			    }
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid model_code

				public static void invalid_model_code(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
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
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Invalid model_code" + e);
					}
			    }			
				
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank company_id

				public static void blank_company_id(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorCode = jsonPathEvaluator.get("errors.error_code[0]");
					logger.info("Expected status code 200");
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Blank company_id" + e);
					}
			    }
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid company_id

				public static void invalid_company_id(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
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
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Invalid company_id" + e);
					}
			    }					
				
				
				//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Blank fuel_type

				public static void blank_fuel_type(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorCode = jsonPathEvaluator.get("errors.error_code[0]");
					logger.info("Expected status code 200");
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Blank fuel_type" + e);
					}
			    }
				
	//Method is used to Verify Functionality to Arena API for FMP Module: PriceSummary/CompanyOffers with Invalid fuel_type

				public static void invalid_fuel_type(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Execution Started");
			        logger.info("Endpoint for CompanyOffers API" +endpoint);
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
					logger.info("Actual status code :"+" " +CompanyOffer.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP PriceSummary/CompanyOffers API with Invalid fuel_type" + e);
					}
			    }								
				
				
 						
  }
        
	
