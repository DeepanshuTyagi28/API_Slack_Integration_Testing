package com.ttn.BusinessLogic.ArenaService;

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

        public class GetStateMaster  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GetStateMaster.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  p_Enquiry_no;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String p_dms_Web_Booking_Ref_no;
	    public static String message;
	    public static String p_dms_Web_Booking_Ref_no_LostStatus;
	    public static String p_Enquiry_no_LostStatus;

	    
    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/GetStateMaster";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to Arena Services : Get State Master
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL_BTD();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Arena Service : Get State Master API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +GetStateMaster.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Arena Services : Get State Master with valid Input" + e);
			}
	    }
		
		
		
//	Method is used to Verify Functionality to Arena Services : Get State Master with Invalid Inputs

	public static void invalidInput(String bodyData) {

		try {
 	RequestBuilder_new.getBase_URL_BTD();	    	
     RequestBuilder_new.request.header("Content-Type", "application/json");
     RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
     logger.info("Body is "+bodyData);
       logger.info("Execution Started");
     logger.info("Endpoint for Arena Service : Get State Master API" +endpoint);
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
		logger.info("Actual status code :"+" " +GetStateMaster.code);
		logger.info("Test case executed successfully");
		}
		catch(Exception e)
		{
			logger.info("Exeption While Executing Arena Arena Services : Get State Master with invalid Input" + e);
		}
 }
	
	
  }