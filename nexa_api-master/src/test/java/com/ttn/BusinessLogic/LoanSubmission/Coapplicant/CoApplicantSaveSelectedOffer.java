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

        public class CoApplicantSaveSelectedOffer  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CoApplicantSaveSelectedOffer.class);
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
	    
	    private static String  endpoint = "/maruti/loan-management/v1/dealer/selected-offer";
	    
	    
	    
   //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Offer API
	      

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Arena CO-Applicant Loan Submission : Save Selected Offer API"+" " +endpoint);
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
			logger.info("Actual status code :"+" " +CoApplicantSaveSelectedOffer.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission CoApplicant Save Selected Offer API with valid Input" + e);
			}
	    }

		
	
 	//	Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Offer API with Blank financier_id
      

	public static void blank_financier_id(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
        logger.info("Body is "+bodyData);
	        logger.info("Execution Started");
        logger.info("Endpoint for Arena CO-Applicant Loan Submission : Save Selected Offer API" +endpoint);
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
		logger.info("Expected status code 500");
		logger.info("Actual status code :"+" " +CoApplicantSaveSelectedOffer.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena Loan Submission CoApplicant Save Selected Offer API with blank financier_id" + e);
		}
    }
	
	
 	//	Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Offer API with Blank financier_name
    

	public static void blank_financier_name(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
        logger.info("Body is "+bodyData);
	        logger.info("Execution Started");
        logger.info("Endpoint for Arena CO-Applicant Loan Submission : Save Selected Offer API" +endpoint);
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
		logger.info("Expected status code 500");
		logger.info("Actual status code :"+" " +CoApplicantSaveSelectedOffer.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena Loan Submission CoApplicant Save Selected Offer API with blank financier_name" + e);
		}
    }
	
 	//	Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Save Selected Offer API with Blank down_payment
    

	public static void blank_down_payment(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
        logger.info("Body is "+bodyData);
	        logger.info("Execution Started");
        logger.info("Endpoint for Arena CO-Applicant Loan Submission : Save Selected Offer API" +endpoint);
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
		logger.info("Expected status code 500");
		logger.info("Actual status code :"+" " +CoApplicantSaveSelectedOffer.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : Save Selected Offer API with blank down_payment" + e);
		}
    }	
	
	
	//	Method is used to Verify Functionality to Loan Submission : CoApplicant Save Selected Offer API with Blank mobile
    

	public static void blank_mobile(String bodyData) {

		try {
    	RequestBuilder_new.FMPBase_URL();	    	
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_CoApplicantCustomerJourney);
        logger.info("Body is "+bodyData);
	        logger.info("Execution Started");
        logger.info("Endpoint for Arena CO-Applicant Loan Submission : Save Selected Offer API" +endpoint);
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
		logger.info("Expected status code 401");
		logger.info("Actual status code :"+" " +CoApplicantSaveSelectedOffer.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : Save Selected Offer API with blank mobile" + e);
		}
    }
	
	
	
		
  }