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
 *	This Class is used to Verify Loyalty customer Details Functionality.
 */

        public class GetCardtransaction  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GetCardtransaction.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  ErrorMessage;
	    public static String  p_error_msg;
	    public static String  ErrorCode;
	    public static String  p_tier_name;

 
	             //Replace below end point as per need.
	    
	    private static String  endpoint = "/sp-get-card-transactions";
	    
	    
	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Loyalty Customer transaction on card with valid/Existing Loyalty Card Details 
	 	*/

		public static void ExistingLoyaltyCard(String bodyData) {
	
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
	        
	        //Response Body Validation
	        responseBody = response.getBody().asString();
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        ErrorMessage = jsonPathEvaluator.get("error_msg");
	        p_error_msg = jsonPathEvaluator.get("result.p_error_msg");
	        p_tier_name= jsonPathEvaluator.get("result.p_tier_name");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		
		 /* Method is used to Verify Loyalty Customer Details with Non-Existing Loyalty Card Details */

		
		public static void NonExistingLoyaltyCard(String bodyData) {
			
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
	        ErrorMessage = jsonPathEvaluator.get("error_msg");
	        p_error_msg = jsonPathEvaluator.get("result.p_error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		
		 /* Method is used to Verify Loyalty Customer Details with Invalid Loyalty Card Details */
		
           public static void InvalidLoyaltyCard(String bodyData) {
			
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
	        ErrorMessage = jsonPathEvaluator.get("error_msg");
	        p_error_msg = jsonPathEvaluator.get("result.p_error_msg");
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
