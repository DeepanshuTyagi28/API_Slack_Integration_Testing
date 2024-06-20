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

        public class CoApplicantLoanSubmission  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CoApplicantLoanSubmission.class);
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
	    
	    private static String  endpoint = "/maruti/financing/v1/loan-submission";
	    
	    
   //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Loan Submission API

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Arena CO-Applicant Loan Submission Journey : Loan Submission API" +endpoint);
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
			logger.info("Actual status code :"+" " +CoApplicantLoanSubmission.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission Journey : Loan Submission API with valid Input" + e);
			}
	    }


		
		
		   //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Loan Submission API with Blank Enq ID

				public static void blank_EnqID(String bodyData) {
			
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for Arena CO-Applicant Loan Submission Journey : Loan Submission API" +endpoint);
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
					logger.info("Actual status code :"+" " +CoApplicantLoanSubmission.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena CO-Applicant Loan Submission Journey : Loan Submission API with Blank Enq ID" + e);
					}
			    }
	
				   //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Loan Submission API with Blank financier_id

							public static void blank_financier_id(String bodyData) {
						
								try {
						    	RequestBuilder_new.FMPBase_URL();	    	
						        RequestBuilder_new.request.header("Content-Type", "application/json");
						        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
						        logger.info("Body is "+bodyData);
					  	        logger.info("Execution Started");
						        logger.info("Endpoint for Arena CO-Applicant Loan Submission Journey : Loan Submission API" +endpoint);
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
								logger.info("Actual status code :"+" " +CoApplicantLoanSubmission.code);
								logger.info("Test case executed successfully");
								}
								catch(Exception e)
								{
									logger.info("Exeption While Executing Arena CO-Applicant Loan Submission Journey : Loan Submission API with Blank financier_id" + e);
								}
						    }	
				
  }