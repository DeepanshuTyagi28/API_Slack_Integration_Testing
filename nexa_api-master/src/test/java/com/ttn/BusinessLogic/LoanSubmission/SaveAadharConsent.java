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

        public class SaveAadharConsent  {
	
	    protected static Logger logger = LoggerFactory.getLogger(SaveAadharConsent.class);
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
	    
	    private static String  endpoint = "/maruti/document-management/v1/document/consent";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
			logger.info("Actual status code :"+" " +SaveAadharConsent.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with valid Input" + e);
			}
	    }

		
//	Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank Enq ID
		

		public static void blank_EnqID(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
			logger.info("Expected status code 403");
			logger.info("Actual status code :"+" " +SaveAadharConsent.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Blank Enq ID" + e);
			}
	    }
		

//		Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid Enq ID
		

			public static void invalid_EnqID(String bodyData) {
				
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        logger.info("Body is "+bodyData);
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
				logger.info("Expected status code 403");
				logger.info("Actual status code :"+" " +SaveAadharConsent.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Invalid Enq ID" + e);
				}
		    }
			
			
//			Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank applicant_type
			

			public static void blank_applicant_type(String bodyData) {
				
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        logger.info("Body is "+bodyData);
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
				logger.info("Expected status code 409");
				logger.info("Actual status code :"+" " +SaveAadharConsent.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Blank applicant_type" + e);
				}
		    }
			

//			Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid applicant_type
			

				public static void invalid_applicant_type(String bodyData) {
					
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +SaveAadharConsent.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Invalid applicant_type" + e);
					}
			    }		
				
				
//				Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank language
				

				public static void blank_language(String bodyData) {
					
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +SaveAadharConsent.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Blank language" + e);
					}
			    }
//				Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank content
				

				public static void blank_content(String bodyData) {
					
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +SaveAadharConsent.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Blank content" + e);
					}
			    }	
				
//				Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank consent
				

				public static void blank_consent(String bodyData) {
					
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +SaveAadharConsent.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Blank consent" + e);
					}
			    }
				

//				Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid consent
				

					public static void invalid_consent(String bodyData) {
						
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
						logger.info("Expected status code 409");
						logger.info("Actual status code :"+" " +SaveAadharConsent.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Invalid consent" + e);
						}
				    }						
				
//					Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank doc_type_id
					

					public static void blank_doc_type_id(String bodyData) {
						
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
						logger.info("Expected status code 409");
						logger.info("Actual status code :"+" " +SaveAadharConsent.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Blank doc_type_id" + e);
						}
				    }
					

//					Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid doc_type_id
					

						public static void invalid_doc_type_id(String bodyData) {
							
							try {
					    	RequestBuilder_new.FMPBase_URL();	    	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
					        logger.info("Body is "+bodyData);
				  	        logger.info("Execution Started");
					        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
							logger.info("Expected status code 409");
							logger.info("Actual status code :"+" " +SaveAadharConsent.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Invalid doc_type_id" + e);
							}
					    }						
					
					
//						Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Blank user_ip
						

						public static void blank_user_ip(String bodyData) {
							
							try {
					    	RequestBuilder_new.FMPBase_URL();	    	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
					        logger.info("Body is "+bodyData);
				  	        logger.info("Execution Started");
					        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
							logger.info("Expected status code 409");
							logger.info("Actual status code :"+" " +SaveAadharConsent.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Blank user_ip" + e);
							}
					    }
						

//						Method is used to Verify Functionality to Loan Submission Save Aadhar Consent API with Invalid user_ip
						

							public static void invalid_user_ip(String bodyData) {
								
								try {
						    	RequestBuilder_new.FMPBase_URL();	    	
						        RequestBuilder_new.request.header("Content-Type", "application/json");
						        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
						        logger.info("Body is "+bodyData);
					  	        logger.info("Execution Started");
						        logger.info("Endpoint for Loan Submission Save Aadhar Consent API" +endpoint);
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
								logger.info("Expected status code 409");
								logger.info("Actual status code :"+" " +SaveAadharConsent.code);
								logger.info("Test case executed successfully");
								}
								catch(Exception e)
								{
									logger.info("Exeption While Executing Arena Loan Submission Save Aadhar Consent API with Invalid user_ip" + e);
								}
						    }						
						
						
																	
			
  }