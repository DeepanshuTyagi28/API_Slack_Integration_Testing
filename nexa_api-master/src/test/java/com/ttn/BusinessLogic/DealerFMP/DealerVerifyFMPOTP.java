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

        public class DealerVerifyFMPOTP  {
	
	    protected static Logger logger = LoggerFactory.getLogger(DealerVerifyFMPOTP.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String MSPin_Token;
	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/user/v1/dealer/validate-otp";
	    
	    
	    /*
	 		 * @param bodyData
	 		   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with valid Input
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	    	
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify Dealer FMP OTP API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        MSPin_Token = jsonPathEvaluator.get("mspin_token");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +DealerVerifyFMPOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify Dealer FMP OTP API with Valid Input" + e);
			}
	    }
		

	//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with blank MSPIN
	
		public static void blank_MSPIN(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify Dealer FMP OTP API" +endpoint);
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
			logger.info("Actual status code :"+" " +DealerVerifyFMPOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify Dealer FMP OTP API with blank MSPIN" + e);
			}
	    }
		
		
		
		//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with Invalid MSPIN
		
        public static void invalid_MSPIN(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify Dealer FMP OTP API" +endpoint);
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
			logger.info("Actual status code :"+" " +DealerVerifyFMPOTP.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify Dealer FMP OTP API with Invalid MSPIN" + e);
			}
	    }
	
        
// 	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with blank OTP
    	
    		public static void blank_OTP(String bodyData) {
    			
    			try {
    	    	RequestBuilder_new.FMPBase_URL();	
		        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

    	        RequestBuilder_new.request.header("Content-Type", "application/json");
    	        logger.info("Body is "+bodyData);
      	        logger.info("Execution Started");
    	        logger.info("Endpoint for Verify Dealer FMP OTP API" +endpoint);
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
    			logger.info("Actual status code :"+" " +DealerVerifyFMPOTP.code);
    			logger.info("Test case executed successfully");
    			}
    			catch(Exception e)
    			{
    				logger.info("Exeption While Executing Arena FMP Verify Dealer FMP OTP API with blank OTP" + e);
    			}
    	    }
    		
    		
    		
    		//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with Invalid OTP
    		
            public static void invalid_OTP(String bodyData) {
    			
    			try {
    	    	RequestBuilder_new.FMPBase_URL();	
		        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

    	        RequestBuilder_new.request.header("Content-Type", "application/json");
    	        logger.info("Body is "+bodyData);
      	        logger.info("Execution Started");
    	        logger.info("Endpoint for Verify Dealer FMP OTP API" +endpoint);
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
    			logger.info("Actual status code :"+" " +DealerVerifyFMPOTP.code);
    			logger.info("Test case executed successfully");
    			}
    			catch(Exception e)
    			{
    				logger.info("Exeption While Executing Arena FMP Verify Dealer FMP OTP API with Invalid OTP" + e);
    			}
    	    }     
        
            
            
    		//	   Method is used to Verify Functionality to Verify Dealer FMP OTP Functionality with Invalid OTP Format
    		
            public static void invalid_OTP_Format(String bodyData) {
    			
    			try {
    	    	RequestBuilder_new.FMPBase_URL();	
		        RequestBuilder_new.request.header("X-user-ip-address", RequestBuilder_new.getArenaFMP_IPAddress());

    	        RequestBuilder_new.request.header("Content-Type", "application/json");
    	        logger.info("Body is "+bodyData);
      	        logger.info("Execution Started");
    	        logger.info("Endpoint for Verify Dealer FMP OTP API" +endpoint);
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
    			logger.info("Actual status code :"+" " +DealerVerifyFMPOTP.code);
    			logger.info("Test case executed successfully");
    			}
    			catch(Exception e)
    			{
    				logger.info("Exeption While Executing Arena FMP Verify Dealer FMP OTP API with Invalid OTP Format" + e);
    			}
    	    }  
  }




