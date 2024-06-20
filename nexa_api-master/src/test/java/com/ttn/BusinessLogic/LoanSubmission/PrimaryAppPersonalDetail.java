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

        public class PrimaryAppPersonalDetail  {
	
	    protected static Logger logger = LoggerFactory.getLogger(PrimaryAppPersonalDetail.class);
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
	    public static String enquiry_id;

	    
    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/customer/v1/";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			logger.info("Access Token Used is as "+" " +VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
	        enquiry_id = jsonPathEvaluator.get("enquiry_id");
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
			logger.info("Test case executed successfully");
			logger.info("Enquiry Id used is as "+" " +PrimaryAppPersonalDetail.enquiry_id);
			

			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with valid Input" + e);
			}
	    }
		

	//	   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank enquiry_id
	      

		public static void blank_enquiry_id(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
			logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank enquiry_id" + e);
			}
	    }
		
		
//		   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with Invalid enquiry_id
	      

			public static void invalid_enquiry_id(String bodyData) {
		
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        logger.info("Body is "+bodyData);
		        logger.info("Execution Started");
		        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
				logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Invalid enquiry_id" + e);
				}
		    }
			
			
//			   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank mobile
			
			public static void blank_mobile(String bodyData) {
		
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        logger.info("Body is "+bodyData);
		        logger.info("Execution Started");
		        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
				logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank mobile" + e);
				}
		    }
			
			
//			   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with Invalid mobile
		      

				public static void invalid_mobile(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Body is "+bodyData);
			        logger.info("Execution Started");
			        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
					logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Invalid mobile" + e);
					}
			    }
//				   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank auth_mobile
				
				public static void blank_auth_mobile(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Body is "+bodyData);
			        logger.info("Execution Started");
			        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
					logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank auth_mobile" + e);
					}
			    }
				
				
//				   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with Invalid auth_mobile
			      

					public static void invalid_auth_mobile(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Invalid auth_mobile" + e);
						}
				    }
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank credit_check_flag
					
					public static void blank_credit_check_flag(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank credit_check_flag" + e);
						}
				    }					
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank employment_type
					
					public static void blank_employment_type(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank employment_type" + e);
						}
				    }						

					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank city
					
					public static void blank_city(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank city" + e);
						}
				    }	
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank residence_type
					
					public static void blank_residence_type(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank residence_type" + e);
						}
				    }	
					
	////////
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank annual_salary
					
					public static void blank_annual_salary(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank annual_salary" + e);
						}
				    }	
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank state
					
					public static void blank_state(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank state" + e);
						}
				    }	
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank first_name
					
					public static void blank_first_name(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank first_name" + e);
						}
				    }	
					
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank email
					
					public static void blank_email(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank email" + e);
						}
				    }	
					
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank work_experience_years
					
					public static void blank_work_experience_years(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank work_experience_years" + e);
						}
				    }	
					
					
//////
					
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank car_model
					
					public static void blank_car_model(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank car_model" + e);
						}
				    }	
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank sub_employment_id
					
					public static void blank_sub_employment_id(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank sub_employment_id" + e);
						}
				    }	
					
					

					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank car_variant
					
					public static void blank_car_variant(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank car_variant" + e);
						}
				    }	
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank pan_number
					
					public static void blank_pan_number(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank pan_number" + e);
						}
				    }	
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank dealer
					
					public static void blank_dealer(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank dealer" + e);
						}
				    }	
					
					
//					   Method is used to Verify Functionality to Loan Submission Primary APP Personal Details with blank net_annual_income
					
					public static void blank_net_annual_income(String bodyData) {
				
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
				        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Primary APP Personal Details" +endpoint);
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
						logger.info("Actual status code :"+" " +PrimaryAppPersonalDetail.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Primary APP Personal Details with Blank net_annual_income" + e);
						}
				    }	
					
					
					
  }