package com.ttn.BusinessLogic.DMS;

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

        public class EBookStatus  {
	
	    protected static Logger logger = LoggerFactory.getLogger(EBookStatus.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String MSPin_Token;
	    public static String p_enq_status;
 
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/NRM_EBOOK_STATUS";
	    
	    
	    /*
	 		 * @param bodyData
	 		   Method is used to Verify Functionality to DMS API Enquiry Booking Status
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL_BTD();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for DMS API : Status Enquiry " +endpoint);
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
	        p_enq_status = jsonPathEvaluator.get("result.p_enq_status");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +EBookStatus.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena DMS API Status Enquiry with valid Input" + e);
			}
	    }

	

		
		//	   Method is used to Verify Functionality to DMS API Enquiry Booking Status with Blank Web Booking Refrence Number

	public static void blank_WebBookingRef(String bodyData) {

		try {
 	RequestBuilder_new.getBase_URL_BTD();	    	
     RequestBuilder_new.request.header("Content-Type", "application/json");
     RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
     logger.info("Body is "+bodyData);
       logger.info("Execution Started");
     logger.info("Endpoint for DMS API : Status Enquiry " +endpoint);
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
     p_enq_status = jsonPathEvaluator.get("result.p_enq_status");
		logger.info("Expected status code 200");
		logger.info("Actual status code :"+" " +EBookStatus.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena DMS API Status Enquiry with Blank Web Booking Refrence Numbert" + e);
		}
 }
	
	//	   Method is used to Verify Functionality to DMS API Enquiry Booking Status with Invalid Web Booking Refrence Number

public static void invalid_WebBookingRef(String bodyData) {

	try {
	RequestBuilder_new.getBase_URL_BTD();	    	
 RequestBuilder_new.request.header("Content-Type", "application/json");
 RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
 logger.info("Body is "+bodyData);
   logger.info("Execution Started");
 logger.info("Endpoint for DMS API : Status Enquiry " +endpoint);
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
 p_enq_status = jsonPathEvaluator.get("result.p_enq_status");
	logger.info("Expected status code 200");
	logger.info("Actual status code :"+" " +EBookStatus.code);
	logger.info("Test case executed successfully");
	}
	catch(Exception e)
	{
		logger.info("Exeption While Executing Arena DMS API Status Enquiry with Invalid Web Booking Refrence Numbert" + e);
	}
}

//	   Method is used to Verify Functionality to DMS API Enquiry Booking Status with Valid Input as Status as Lost Status Enquiry 

public static void validInput_LostStatusEnquiry(String bodyData) {
	
	try {
	RequestBuilder_new.getBase_URL_BTD();	    	
    RequestBuilder_new.request.header("Content-Type", "application/json");
    RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
    logger.info("Body is "+bodyData);
      logger.info("Execution Started");
    logger.info("Endpoint for DMS API : Status Enquiry " +endpoint);
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
    p_enq_status = jsonPathEvaluator.get("result.p_enq_status");
	logger.info("Expected status code 200");
	logger.info("Actual status code :"+" " +EBookStatus.code);
	logger.info("Test case executed successfully");
	}
	catch(Exception e)
	{
		logger.info("Exeption While Executing Arena DMS API Status Enquiry with valid Input as Lost Status Enquiry " + e);
	}
}


  }
        




