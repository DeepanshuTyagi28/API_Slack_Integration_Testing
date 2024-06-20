package com.ttn.BusinessLogic.Campaign;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;
import com.ttn.pojoClasses.Mobilenumberspojo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class FetchCampaignOTP  {
	
	    protected static Logger logger = LoggerFactory.getLogger(FetchCampaignOTP.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  MobileNumbers;
	    public static String  OTP;

	    
	    //Replace below end point as per need.
	    
	    public static String  endpoint1 = "/maruti/user/v1/maruti/campaign-otp/";
	    public static String  endpoint ="";
	    
	  
	 //		  @param bodyData
	 //		  Method is used to Verify Functionality to Fetch Campaign OTP with Valid Mobile Number
	   

		public static  void validInput(String MobileNumberdata) {
	
			try {
			endpoint = endpoint1 +MobileNumberdata ;
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");        
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
  	        logger.info("Execution Started");
	        logger.info("Endpoint for fetch Campaign OTP API" +endpoint);
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");     
	        OTP = jsonPathEvaluator.get("otp");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +FetchCampaignOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Fetch Campaign OTP with Valid Mobile Number" + e);
			}
	    }
		
		
	//		  Method is used to Verify Functionality to Fetch Campaign OTP with invalid Mobile Number

		public static  void invalid_MobileNumber(String MobileNumberdata) {
			
			try {
			endpoint = endpoint1 +MobileNumberdata ;
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");        
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
  	        logger.info("Execution Started");
	        logger.info("Endpoint for fetch Campaign OTP API" +endpoint);
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("error_message");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +FetchCampaignOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Fetch Campaign OTP with Invalid Mobile Number" + e);
			}
	    }

		
 //		  Method is used to Verify Functionality to Fetch Campaign OTP with Valid Mobile Number but OTP Not generated

		public static  void OTPUngenerated_MObileNumber(String MobileNumberdata) {
			
			try {
			endpoint = endpoint1 +MobileNumberdata ;
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");        
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
  	        logger.info("Execution Started");
	        logger.info("Endpoint for fetch Campaign OTP API" +endpoint);
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("error_message");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +FetchCampaignOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Fetch Campaign OTP with Valid Mobile Number but OTP Not generated" + e);
			}
	    }
		
  }




