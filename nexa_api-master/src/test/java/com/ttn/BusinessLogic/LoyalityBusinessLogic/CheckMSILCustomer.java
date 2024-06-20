package com.ttn.BusinessLogic.LoyalityBusinessLogic;


import java.io.InputStream;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


/*
 * @author Deepanshu Tyagi
 */
       public class CheckMSILCustomer  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CheckMSILCustomer.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static String  ErrorMessage;
	    public static String  ErrorCode;
	    public static int code;
	    public static String  VIN;
	    public static String  MOBILE_NUMBER;
	    public static int  responsebody2;


	             //Replace below end point as per need.
	    
	    private static String  endpoint = "/SP-CHECK-MSIL-CUSTOMER";
	    
	    
	    /**
	 		 * @param bodyData
	 		 * This method is used to Check MSIL Customer with valid/Existing customer Details 
	 		 * 
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
	        ErrorMessage = jsonPathEvaluator.get("error_msg");	                
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		 //  This method is used to Check MSIL Customer with Non-Existing customer Details 

	
		public static void Non_ExistingCustomer(String bodyData) {
			
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
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		 //  This method is used to Check MSIL Customer with Invalid Input Type customer Details 
		
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
	        ErrorMessage = jsonPathEvaluator.get("error_msg");	  
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
