package com.ttn.BusinessLogic.LoanSubmission.Coapplicant;

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

        public class CoApplicantCheckEnquiry  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CoApplicantCheckEnquiry.class);
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
	    
	    private static String  endpoint = "/maruti/financing/v1/co-applicant-validate";
	    
	    
	    
  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-Channel", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
  	        logger.info("Execution Started");
  	        logger.info("Authentication Token is as "+" "  +VerifyOTP.Access_token_CoApplicantCustomerJourney);
	        logger.info("Body is "+bodyData);
	        logger.info("Endpoint for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry"+" " +endpoint);
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
			logger.info("Actual status code :"+" " +CoApplicantCheckEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with valid Input" + e);
			}
	    }

		  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Blank Channel

				public static void blank_Channel(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("X-Channel", RequestBuilder_new.getChannel());
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
		  	        logger.info("Execution Started");
		  	        logger.info("Authentication Token is as "+" "  +VerifyOTP.Access_token_CoApplicantCustomerJourney);
			        logger.info("Body is "+bodyData);
			        logger.info("Endpoint for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry"+" " +endpoint);
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
					logger.info("Actual status code :"+" " +CoApplicantCheckEnquiry.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Blank Channel" + e);
					}
			    }
				
				  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Invalid Channel

						public static void invalid_Channel(String bodyData) {
					
							try {
					    	RequestBuilder_new.FMPBase_URL();	    	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        RequestBuilder_new.request.header("X-Channel", RequestBuilder_new.getChannel());
					        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
				  	        logger.info("Execution Started");
				  	        logger.info("Authentication Token is as "+" "  +VerifyOTP.Access_token_CoApplicantCustomerJourney);
					        logger.info("Body is "+bodyData);
					        logger.info("Endpoint for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry"+" " +endpoint);
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
							logger.info("Actual status code :"+" " +CoApplicantCheckEnquiry.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Invalid Channel" + e);
							}
					    }			
	
						
						

						  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Blank Mobile

								public static void blank_Mobile(String bodyData) {
							
									try {
							    	RequestBuilder_new.FMPBase_URL();	    	
							        RequestBuilder_new.request.header("Content-Type", "application/json");
							        RequestBuilder_new.request.header("X-Channel", RequestBuilder_new.getChannel());
							        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
						  	        logger.info("Execution Started");
						  	        logger.info("Authentication Token is as "+" "  +VerifyOTP.Access_token_CoApplicantCustomerJourney);
							        logger.info("Body is "+bodyData);
							        logger.info("Endpoint for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry"+" " +endpoint);
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
									logger.info("Actual status code :"+" " +CoApplicantCheckEnquiry.code);
									logger.info("Test case executed successfully");
									}
									catch(Exception e)
									{
										logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Blank Mobile" + e);
									}
							    }
								
								  // Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Invalid Mobile

										public static void invalid_Mobile(String bodyData) {
									
											try {
									    	RequestBuilder_new.FMPBase_URL();	    	
									        RequestBuilder_new.request.header("Content-Type", "application/json");
									        RequestBuilder_new.request.header("X-Channel", RequestBuilder_new.getChannel());
									        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
								  	        logger.info("Execution Started");
								  	        logger.info("Authentication Token is as "+" "  +VerifyOTP.Access_token_CoApplicantCustomerJourney);
									        logger.info("Body is "+bodyData);
									        logger.info("Endpoint for Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry"+" " +endpoint);
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
											logger.info("Actual status code :"+" " +CoApplicantCheckEnquiry.code);
											logger.info("Test case executed successfully");
											}
											catch(Exception e)
											{
												logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : CO-Applicant Check Enquiry API with Invalid Mobile" + e);
											}
									    }
  }