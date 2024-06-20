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

        public class CoApplicantGetOTP  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CoApplicantGetOTP.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  p_Enquiry_no;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String p_dms_Web_Booking_Ref_no;
	    public static String message;
	    public static String CoApplicant_OTP;

	   //Replace below end point as per need.
	    
	    private static String  endpoint = "maruti/user/v1/maruti/9457632145";
	    
	    
        //Method is used to Verify Functionality to Arena CO-Applicant Loan Submission : Get CoApplicant OTP API

		public static void validInput( ) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
  	        logger.info("Execution Started");
	        logger.info("Endpoint for CoApplicant Loan Submission :Get CoApplicant OTP API"+" " +endpoint);
  	        logger.info("Co-Applicant Mobile Number is Used as 9457632145");
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
	        CoApplicant_OTP = jsonPathEvaluator.get("otp");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CoApplicantGetOTP.code);
			logger.info("OTP Fetched Succesfully as :"+" " +CoApplicantGetOTP.CoApplicant_OTP);
			logger.info("Test case executed successfully");

			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena CO-Applicant Loan Submission : Get CoApplicant OTP with valid Input" + e);
			}
	    }


	
		
  }