package com.ttn.BusinessLogic.DealerFMP;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class DealerSendFMPOTP  {
	
	    protected static Logger logger = LoggerFactory.getLogger(DealerSendFMPOTP.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/financing/v1/dealer/send-otp";
	    
	    
	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Functionality to generate Send Dealer FMP OTP Functionality with valid Input
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Send Dealer FMP OTP API" +endpoint);
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
			logger.info("Actual status code :"+" " +DealerSendFMPOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Send Dealer FMP OTP API with Valid Input" + e);
			}
	    }
		

		 // Method is used to Verify Functionality to generate Send Dealer FMP OTP Functionality with invalid Input

			public static void invalidInput(String bodyData) {
		
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        logger.info("Body is "+bodyData);
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for Send Dealer FMP OTP API" +endpoint);
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
				logger.info("Actual status code :"+" " +DealerSendFMPOTP.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena FMP Send Dealer FMP OTP API with invalid Input" + e);
				}
		    }
		
  }




