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

        public class DealerActiveEnquiry  {
	
	    protected static Logger logger = LoggerFactory.getLogger(DealerActiveEnquiry.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String MSPin_Token;
	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/customer/v1/dealer/enquiry/active";
	    
	    
	    /*
	 		 * @param bodyData
	 		   Method is used to Verify Functionality to Verify Dealer FMP Active Enquiry with valid Input
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-dealer-authorization", DealerVerifyFMPOTP.MSPin_Token);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify Dealer Active Enquiry API" +endpoint);
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
			logger.info("Actual status code :"+" " +DealerActiveEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify Dealer Active Enquiry API with Valid Input" + e);
			}
	    }
		
//    Method is used to Verify Functionality to Verify Dealer FMP Active Enquiry with Blank mobile number 
		
		public static void blank_Mobile(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("X-dealer-authorization", DealerVerifyFMPOTP.MSPin_Token);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Verify Dealer Active Enquiry API" +endpoint);
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
	        message = jsonPathEvaluator.get("errors.error_message[0]");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +DealerActiveEnquiry.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Verify Dealer Active Enquiry API with Blank mobile number " + e);
			}
	    }
	
  }




