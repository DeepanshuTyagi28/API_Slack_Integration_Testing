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

        public class FetchDealerDetails  {
	
	    protected static Logger logger = LoggerFactory.getLogger(FetchDealerDetails.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  responseBody;
	    public static int code;
	    public static String  TIER;
	    public static String  DealerCode;
	    public static String  p_error_msg;
  

	             //Replace below end point as per need.
	    
	    private static String  endpoint = "/SP-FETCH-DEALER-DETAILS";
	    
	    
	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Functionality of SP-Fetch Delaer Details with valid/Existing Tier
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
	        DealerCode =   response.jsonPath().get("P_DEALER_MAP_CD").toString();
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }

		
		public static void BlankDealerCode(String bodyData) {
			
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
	        p_error_msg =   response.jsonPath().get("P_ERR_MSG").toString();

	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }
		
public static void InvalidDealerCode(String bodyData) {
			
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
	        p_error_msg =   response.jsonPath().get("P_ERR_MSG").toString();
	        logger.info("code "+code);
	        logger.info("Successfully got result");
			}
			catch(Exception e)
			{
				logger.info("Exception occured");
				e.printStackTrace();
			}
	    }

public static void Blank_For_CD(String bodyData) {
	
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
    p_error_msg =   response.jsonPath().get("P_ERR_MSG").toString();
    logger.info("code "+code);
    logger.info("Successfully got result");
	}
	catch(Exception e)
	{
		logger.info("Exception occured");
		e.printStackTrace();
	}
}

public static void Invalid_For_CD(String bodyData) {
	
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
    p_error_msg =   response.jsonPath().get("P_ERR_MSG").toString();
    logger.info("code "+code);
    logger.info("Successfully got result");
	}
	catch(Exception e)
	{
		logger.info("Exception occured");
		e.printStackTrace();
	}
}

public static void Blank_PMC(String bodyData) {
	
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
    logger.info("code "+code);
    logger.info("Successfully got result");
	}
	catch(Exception e)
	{
		logger.info("Exception occured");
		e.printStackTrace();
	}
}

public static void Invalid_PMC(String bodyData) {
	
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
