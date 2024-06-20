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

        public class GetDealerByCity  {
	
	    protected static Logger logger = LoggerFactory.getLogger(GetDealerByCity.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  p_Enquiry_no;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String p_dms_Web_Booking_Ref_no;
	    public static String message;
	    public static String City;

	    
    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/GetDealerByCity";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to Arena Services : Get Dealer By City
	   */   

		public static void validInput( ) {
	
			try {
	    	RequestBuilder_new.getArenaService();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("x-api-key", RequestBuilder_new.getArena_X_APIKey());
	        RequestBuilder_new.request.param("CityName", "Gurugram");
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Arena Service : Get Dealer By city" +endpoint);
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        City = jsonPathEvaluator.get("CITY[]");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +GetDealerByCity.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Services : Get Dealer By City with valid Input" + e);
			}
	    }
	
		// 	 Method is used to Verify Functionality to Arena Services : Get Dealer By City with Invalid Input

		
		public static void invalidInput( ) {
			
			try {
	    	RequestBuilder_new.getArenaService();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("x-api-key", RequestBuilder_new.getArena_X_APIKey());
	        RequestBuilder_new.request.param("CityName", "ABC");
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Arena Service : Get Dealer By city" +endpoint);
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +GetDealerByCity.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Services : Get Dealer By City with invalid Input" + e);
			}
	    }
	
  }