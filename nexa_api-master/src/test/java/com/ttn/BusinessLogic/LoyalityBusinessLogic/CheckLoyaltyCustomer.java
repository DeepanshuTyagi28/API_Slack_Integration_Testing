package com.ttn.BusinessLogic.LoyalityBusinessLogic;


import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


/*
 * @author Deepanshu Tyagi
 *	This Class is used to check Loyalty customer Details Functionality.
 */

        public class CheckLoyaltyCustomer  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CheckLoyaltyCustomer.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  ErrorMessage;
	    public static String  CARD_NUM;
	    public static String  error_msg;

 
	             //Replace below end point as per need.
	    
	    private static String  endpoint = "/SP-CHECK-LOYALITY-CUSTOMER";
	    
	    
	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Loyalty Customer Details with valid/Existing customer 
	 	*/

		public static void ExistingCustomer(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
            RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
	        logger.info("Body is "+bodyData);
	        System.out.println(bodyData);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();
	        responseBody = response.getBody().asString();
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        CARD_NUM = jsonPathEvaluator.get("result.p_list_cursor.CARD_NUM[0]");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		
		public static void NonExistingCustomer(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
            RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
	        logger.info("Body is "+bodyData);
	        System.out.println(bodyData);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();
	        responseBody = response.getBody().asString();
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        error_msg = jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		public static void InvalidInput(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
            RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
	        logger.info("Body is "+bodyData);
	        System.out.println(bodyData);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();
	        responseBody = response.getBody().asString();
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        error_msg = jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }

		

}
