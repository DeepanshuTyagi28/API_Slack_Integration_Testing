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

        public class CustomerEnquiry  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CustomerEnquiry.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  ErrorMessage;
	    public static String  CustomerenquiryID;
	    public static String  CustomerenquiryID_CoApplicant;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/customer/v1/enquiry";
	    
	    
	   
// @param bodyData
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("x-fmp-source", "");
	        logger.info("Execution Started");
	        logger.info("Endpoint for FMP Customer Enquiry Generation API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        CustomerenquiryID = jsonPathEvaluator.get("enquiry_id");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 201");
			logger.info("Actual status code :"+" " +CustomerEnquiry.code);
			logger.info("Test case executed successfully");
	        logger.info("Enquiry ID is Generated as : "+" " +CustomerEnquiry.CustomerenquiryID);
			}
			
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Valid Input" + e);
			}
	    }
		
	
		
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank first_name

		public static void blank_first_name(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("x-fmp-source", "");
	        logger.info("Execution Started");
	        logger.info("Endpoint for Customer Enquiry API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CustomerEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank first_name" + e);
			}
	    }
		
		
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid first_name Format

		public static void invalid_Format_first_name(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("x-fmp-source", "");
	        logger.info("Execution Started");
	        logger.info("Endpoint for Customer Enquiry API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CustomerEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid first_name" + e);
			}
	    }
	
		
		
		//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank email

				public static void blank_email(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("x-fmp-source", "");
			        logger.info("Execution Started");
			        logger.info("Endpoint for Customer Enquiry API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +CustomerEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank email" + e);
					}
			    }
				
				
		//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid email Format

				public static void invalid_Format_email(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("x-fmp-source", "");
			        logger.info("Execution Started");
			        logger.info("Endpoint for Customer Enquiry API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +CustomerEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid email" + e);
					}
			    }
				
				
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank Mobile

				public static void blank_Mobile(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("x-fmp-source", "");
			        logger.info("Execution Started");
			        logger.info("Endpoint for Customer Enquiry API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
					logger.info("Expected status code 401");
					logger.info("Actual status code :"+" " +CustomerEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank Mobile" + e);
					}
			    }
				
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank dob

				public static void blank_dob(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("x-fmp-source", "");
			        logger.info("Execution Started");
			        logger.info("Endpoint for Customer Enquiry API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +CustomerEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank dob" + e);
					}
			    }
				
				
		//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid DOB Format

				public static void invalid_Format_dob(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("x-fmp-source", "");
			        logger.info("Execution Started");
			        logger.info("Endpoint for Customer Enquiry API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +CustomerEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid dob" + e);
					}
			    }			
				
		
		//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank city

				public static void blank_city(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("x-fmp-source", "");
			        logger.info("Execution Started");
			        logger.info("Endpoint for Customer Enquiry API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +CustomerEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank city" + e);
					}
			    }
				
				
		//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid city 

				public static void invalid_city(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("x-fmp-source", "");
			        logger.info("Execution Started");
			        logger.info("Endpoint for Customer Enquiry API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +CustomerEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid city" + e);
					}
			    }			
				
				
			
			
			//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank state

			public static void blank_state(String bodyData) {
		
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
		        RequestBuilder_new.request.header("x-fmp-source", "");
		        logger.info("Execution Started");
		        logger.info("Endpoint for Customer Enquiry API" +endpoint);
		        RequestBuilder_new.request.body(bodyData);	 
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
		        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
				logger.info("Expected status code 409");
				logger.info("Actual status code :"+" " +CustomerEnquiry.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank state" + e);
				}
		    }
			
			
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid state

			public static void invalid_state(String bodyData) {
		
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
		        RequestBuilder_new.request.header("x-fmp-source", "");
		        logger.info("Execution Started");
		        logger.info("Endpoint for Customer Enquiry API" +endpoint);
		        RequestBuilder_new.request.body(bodyData);	 
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
		        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
				logger.info("Expected status code 409");
				logger.info("Actual status code :"+" " +CustomerEnquiry.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid state" + e);
				}
		    }			
			
			
			
			
			//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank dealer

			public static void blank_dealer(String bodyData) {
		
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
		        RequestBuilder_new.request.header("x-fmp-source", "");
		        logger.info("Execution Started");
		        logger.info("Endpoint for Customer Enquiry API" +endpoint);
		        RequestBuilder_new.request.body(bodyData);	 
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
		        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
				logger.info("Expected status code 409");
				logger.info("Actual status code :"+" " +CustomerEnquiry.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank dealer" + e);
				}
		    }
			
			
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid dealer 

			public static void invalid_dealer(String bodyData) {
		
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
		        RequestBuilder_new.request.header("x-fmp-source", "");
		        logger.info("Execution Started");
		        logger.info("Endpoint for Customer Enquiry API" +endpoint);
		        RequestBuilder_new.request.body(bodyData);	 
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
		        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
				logger.info("Expected status code 409");
				logger.info("Actual status code :"+" " +CustomerEnquiry.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid dealer" + e);
				}
		    }			
			
			
		
		
		//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank car_model

		public static void blank_car_model(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("x-fmp-source", "");
	        logger.info("Execution Started");
	        logger.info("Endpoint for Customer Enquiry API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CustomerEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank car_model" + e);
			}
	    }
		
		
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid car_model

		public static void invalid_car_model(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("x-fmp-source", "");
	        logger.info("Execution Started");
	        logger.info("Endpoint for Customer Enquiry API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CustomerEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid car_model" + e);
			}
	    }			
	////////////////			
		
		//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank car_variant

		public static void blank_car_variant(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("x-fmp-source", "");
	        logger.info("Execution Started");
	        logger.info("Endpoint for Customer Enquiry API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CustomerEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank car_variant" + e);
			}
	    }
		
		
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid car_variant 

		public static void invalid_car_variant(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("x-fmp-source", "");
	        logger.info("Execution Started");
	        logger.info("Endpoint for Customer Enquiry API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CustomerEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid car_variant" + e);
			}
	    }			
		
		
	
	
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank disclaimer_flag

	public static void blank_disclaimer_flag(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
        RequestBuilder_new.request.header("x-fmp-source", "");
        logger.info("Execution Started");
        logger.info("Endpoint for Customer Enquiry API" +endpoint);
        RequestBuilder_new.request.body(bodyData);	 
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        ExtentManager.ApiInfo = endpoint;
        logger.info("Response is "+response.prettyPrint());
        code =   response.getStatusCode();	        
        responseBody = response.getBody().asString();	        
        JsonPath jsonPathEvaluator = response.jsonPath();	        
        Status = jsonPathEvaluator.get("status");
        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank disclaimer_flag" + e);
		}
    }
	
	
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid disclaimer_flag

	public static void invalid_disclaimer_flag(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
        RequestBuilder_new.request.header("x-fmp-source", "");
        logger.info("Execution Started");
        logger.info("Endpoint for Customer Enquiry API" +endpoint);
        RequestBuilder_new.request.body(bodyData);	 
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        ExtentManager.ApiInfo = endpoint;
        logger.info("Response is "+response.prettyPrint());
        code =   response.getStatusCode();	        
        responseBody = response.getBody().asString();	        
        JsonPath jsonPathEvaluator = response.jsonPath();	        
        Status = jsonPathEvaluator.get("status");
        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid disclaimer_flag" + e);
		}
    }	
	
	
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank channel

	public static void blank_channel(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
        RequestBuilder_new.request.header("x-fmp-source", "");
        logger.info("Execution Started");
        logger.info("Endpoint for Customer Enquiry API" +endpoint);
        RequestBuilder_new.request.body(bodyData);	 
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        ExtentManager.ApiInfo = endpoint;
        logger.info("Response is "+response.prettyPrint());
        code =   response.getStatusCode();	        
        responseBody = response.getBody().asString();	        
        JsonPath jsonPathEvaluator = response.jsonPath();	        
        Status = jsonPathEvaluator.get("status");
        ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank channel" + e);
		}
    }
	
	
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid channel 

	public static void invalid_channel(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
        RequestBuilder_new.request.header("x-fmp-source", "");
        logger.info("Execution Started");
        logger.info("Endpoint for Customer Enquiry API" +endpoint);
        RequestBuilder_new.request.body(bodyData);	 
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        ExtentManager.ApiInfo = endpoint;
        logger.info("Response is "+response.prettyPrint());
        code =   response.getStatusCode();	        
        responseBody = response.getBody().asString();	        
        JsonPath jsonPathEvaluator = response.jsonPath();	        
        Status = jsonPathEvaluator.get("status");
        ErrorMessage = jsonPathEvaluator.get("error_message");
		logger.info("Expected status code 401");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid channel" + e);
		}
    }			
	
	


//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank color_code

public static void blank_color_code(String bodyData) {

	try {
	RequestBuilder_new.FMPBase_URL();	    	
    RequestBuilder_new.request.header("Content-Type", "application/json");
    RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
    RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
    RequestBuilder_new.request.header("x-fmp-source", "");
    logger.info("Execution Started");
    logger.info("Endpoint for Customer Enquiry API" +endpoint);
    RequestBuilder_new.request.body(bodyData);	 
    response =  RequestBuilder_new.request.post(endpoint);
    ExtentManager.responseBody = response.getBody().asString();
    ExtentManager.ApiInfo = endpoint;
    logger.info("Response is "+response.prettyPrint());
    code =   response.getStatusCode();	        
    responseBody = response.getBody().asString();	        
    JsonPath jsonPathEvaluator = response.jsonPath();	        
    Status = jsonPathEvaluator.get("status");
    ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
	logger.info("Expected status code 409");
	logger.info("Actual status code :"+" " +CustomerEnquiry.code);
	logger.info("Test case executed successfully");
	}
	catch(Exception e)
	{
		logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank color_code" + e);
	}
}
	
	/////////////////////////

//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank color_description

public static void blank_color_description(String bodyData) {

	try {
	RequestBuilder_new.FMPBase_URL();	    	
RequestBuilder_new.request.header("Content-Type", "application/json");
RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
RequestBuilder_new.request.header("x-fmp-source", "");
logger.info("Execution Started");
logger.info("Endpoint for Customer Enquiry API" +endpoint);
RequestBuilder_new.request.body(bodyData);	 
response =  RequestBuilder_new.request.post(endpoint);
ExtentManager.responseBody = response.getBody().asString();
ExtentManager.ApiInfo = endpoint;
logger.info("Response is "+response.prettyPrint());
code =   response.getStatusCode();	        
responseBody = response.getBody().asString();	        
JsonPath jsonPathEvaluator = response.jsonPath();	        
Status = jsonPathEvaluator.get("status");
ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
	logger.info("Expected status code 409");
	logger.info("Actual status code :"+" " +CustomerEnquiry.code);
	logger.info("Test case executed successfully");
	}
	catch(Exception e)
	{
		logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank color_description" + e);
	}
}


//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank color_indicator

	public static void blank_color_indicator(String bodyData) {

		try {
  	RequestBuilder_new.FMPBase_URL();	    	
      RequestBuilder_new.request.header("Content-Type", "application/json");
      RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
      RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
      RequestBuilder_new.request.header("x-fmp-source", "");
      logger.info("Execution Started");
      logger.info("Endpoint for Customer Enquiry API" +endpoint);
      RequestBuilder_new.request.body(bodyData);	 
      response =  RequestBuilder_new.request.post(endpoint);
      ExtentManager.responseBody = response.getBody().asString();
      ExtentManager.ApiInfo = endpoint;
      logger.info("Response is "+response.prettyPrint());
      code =   response.getStatusCode();	        
      responseBody = response.getBody().asString();	        
      JsonPath jsonPathEvaluator = response.jsonPath();	        
      Status = jsonPathEvaluator.get("status");
      ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank color_indicator" + e);
		}
  }
	
	
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid color_indicator

	public static void invalid_color_indicator(String bodyData) {

		try {
  	RequestBuilder_new.FMPBase_URL();	    	
      RequestBuilder_new.request.header("Content-Type", "application/json");
      RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
      RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
      RequestBuilder_new.request.header("x-fmp-source", "");
      logger.info("Execution Started");
      logger.info("Endpoint for Customer Enquiry API" +endpoint);
      RequestBuilder_new.request.body(bodyData);	 
      response =  RequestBuilder_new.request.post(endpoint);
      ExtentManager.responseBody = response.getBody().asString();
      ExtentManager.ApiInfo = endpoint;
      logger.info("Response is "+response.prettyPrint());
      code =   response.getStatusCode();	        
      responseBody = response.getBody().asString();	        
      JsonPath jsonPathEvaluator = response.jsonPath();	        
      Status = jsonPathEvaluator.get("status");
      ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid color_indicator" + e);
		}
  }	
	
	
	//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with blank fuel_type

	public static void blank_fuel_type(String bodyData) {

		try {
  	RequestBuilder_new.FMPBase_URL();	    	
      RequestBuilder_new.request.header("Content-Type", "application/json");
      RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
      RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
      RequestBuilder_new.request.header("x-fmp-source", "");
      logger.info("Execution Started");
      logger.info("Endpoint for Customer Enquiry API" +endpoint);
      RequestBuilder_new.request.body(bodyData);	 
      response =  RequestBuilder_new.request.post(endpoint);
      ExtentManager.responseBody = response.getBody().asString();
      ExtentManager.ApiInfo = endpoint;
      logger.info("Response is "+response.prettyPrint());
      code =   response.getStatusCode();	        
      responseBody = response.getBody().asString();	        
      JsonPath jsonPathEvaluator = response.jsonPath();	        
      Status = jsonPathEvaluator.get("status");
      ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 409");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with blank fuel_type" + e);
		}
  }
	
	
//Method is used to Verify Functionality to Arena API for FMP Module: Customer Enquiry with Invalid fuel_type 

	public static void invalid_fuel_type(String bodyData) {

		try {
  	RequestBuilder_new.FMPBase_URL();	    	
      RequestBuilder_new.request.header("Content-Type", "application/json");
      RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
      RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
      RequestBuilder_new.request.header("x-fmp-source", "");
      logger.info("Execution Started");
      logger.info("Endpoint for Customer Enquiry API" +endpoint);
      RequestBuilder_new.request.body(bodyData);	 
      response =  RequestBuilder_new.request.post(endpoint);
      ExtentManager.responseBody = response.getBody().asString();
      ExtentManager.ApiInfo = endpoint;
      logger.info("Response is "+response.prettyPrint());
      code =   response.getStatusCode();	        
      responseBody = response.getBody().asString();	        
      JsonPath jsonPathEvaluator = response.jsonPath();	        
      Status = jsonPathEvaluator.get("status");
      ErrorMessage = jsonPathEvaluator.get("errors.error_message[0]");
		logger.info("Expected status code 401");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Invalid fuel_type" + e);
		}
  }			
	
// Customer Enquiry Generation for Co-Applicant Customer Journey	

	public static void validInput_CoApplicantCustomerJourney(String bodyData) {
		
		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
        RequestBuilder_new.request.header("x-fmp-source", "");
        logger.info("Execution Started");
        logger.info("Endpoint for FMP Customer Enquiry Generation API" +endpoint);
        RequestBuilder_new.request.body(bodyData);	 
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        ExtentManager.ApiInfo = endpoint;
        logger.info("Response is "+response.prettyPrint());
        code =   response.getStatusCode();	        
        responseBody = response.getBody().asString();	        
        JsonPath jsonPathEvaluator = response.jsonPath();	        
        Status = jsonPathEvaluator.get("status");
        CustomerenquiryID_CoApplicant = jsonPathEvaluator.get("enquiry_id");
        message = jsonPathEvaluator.get("message");
		logger.info("Expected status code 201");
		logger.info("Actual status code :"+" " +CustomerEnquiry.code);
		logger.info("Test case executed successfully");
        logger.info("Enquiry ID is Generated as for CoApplicant Customer Journey: "+" " +CustomerEnquiry.CustomerenquiryID);
		}
		
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena FMP Customer Enquiry API with Valid Input" + e);
		}
    }
	

	
 
  }
        
	
