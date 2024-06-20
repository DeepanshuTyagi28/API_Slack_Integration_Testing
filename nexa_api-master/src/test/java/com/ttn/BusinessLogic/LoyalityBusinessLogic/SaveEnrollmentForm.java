package com.ttn.BusinessLogic.LoyalityBusinessLogic;


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

        public class SaveEnrollmentForm  {
	
	    protected static Logger logger = LoggerFactory.getLogger(SaveEnrollmentForm.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  responseBody;
	    public static int code;
	    public static String  TIER;
	    public static String  DealerCode;
	    public static String  error_msg;
  

	             //Replace below end point as per need.
	    
	    private static String  endpoint = "/SP-SAVE-ENROLLMENT-FORM";
	    
	    
	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Functionality of SP-Save Enrollment Form with valid details
	   */
	    
		public static void ValidInput(String bodyData) {
	
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
	        error_msg= jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }

		
		public static void Blankreg_mobile(String bodyData) {
			
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
	        error_msg= jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		

		
		public static void Invalidreg_mobile(String bodyData) {
			
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
	        error_msg= jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }

		
		public static void BlankEmail(String bodyData) {
			
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
	        error_msg= jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		public static void Blank_card_issu_dlr_map_cd(String bodyData) {
			
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
	        error_msg= jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
		/////
	public static void Blank_card_issu_loc_cd(String bodyData) {
			
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
	        error_msg= jsonPathEvaluator.get("error_msg");
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
	
	public static void Blank_card_vin(String bodyData) {
		
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
        error_msg= jsonPathEvaluator.get("error_msg");
        logger.info("code "+code);
        logger.info("Successfully got result");
		}
		
		catch(Exception e)
		{
			logger.info("Exception occured");
			e.printStackTrace();
		}
    }
	
	public static void Blank_user_id(String bodyData) {
		
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
        error_msg= jsonPathEvaluator.get("error_msg");
        logger.info("code "+code);
        logger.info("Successfully got result");
		}
		
		catch(Exception e)
		{
			logger.info("Exception occured");
			e.printStackTrace();
		}
    }
	
	public static void Blank_card_issu_parent(String bodyData) {
		
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
        error_msg= jsonPathEvaluator.get("error_msg");
        logger.info("code "+code);
        logger.info("Successfully got result");
		}
		
		catch(Exception e)
		{
			logger.info("Exception occured");
			e.printStackTrace();
		}
    }
	
	public static void Blank_OS_Type(String bodyData) {
		
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
        error_msg= jsonPathEvaluator.get("error_msg");
        logger.info("code "+code);
        logger.info("Successfully got result");
		}
		
		catch(Exception e)
		{
			logger.info("Exception occured");
			e.printStackTrace();
		}
    }
	
		
	public static void InvalidVIN(String bodyData) {
		
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
        error_msg= jsonPathEvaluator.get("error_msg");
        logger.info("code "+code);
        logger.info("Successfully got result");
		}
		
		catch(Exception e)
		{
			logger.info("Exception occured");
			e.printStackTrace();
		}
    }	
	
	public static void IncorrectMapping(String bodyData) {
		
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
        error_msg= jsonPathEvaluator.get("error_msg");
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
