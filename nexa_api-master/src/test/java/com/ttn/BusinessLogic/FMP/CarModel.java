package com.ttn.BusinessLogic.FMP;

import java.io.IOException;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;
import com.ttn.pojoClasses.Mobilenumberspojo;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class CarModel  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CarModel.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  MobileNumbers;
	    public static String  OTP;

	    
	    //Replace below end point as per need.
	    
	    public static String  endpoint = "/maruti/master/v1/car-model/all";

	    
// @param bodyData
//Method is used to Verify Functionality to Arena API for FMP Module: Car Model with Valid Input
	  

		public static  void validInput( ) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");   
	        RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	        response =  RequestBuilder_new.request.get(endpoint);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Car Model API" +endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
	        logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CarModel.code);
			logger.info("Test case executed successfully");			
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Car Model API with Valid Input" + e);
			}
			
	    }
		
		
		//Method is used to Verify Functionality to Arena API for FMP Module: Car Model with Invalid Channel ID

		public static  void invalid_ChannelID( ) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");   
	        RequestBuilder_new.request.header("channel_id", "AX");        
	        response =  RequestBuilder_new.request.get(endpoint);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Car Model API" +endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
	        logger.info("Expected status code 500");
			logger.info("Actual status code :"+" " +CarModel.code);
			logger.info("Test case executed successfully");			
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Car Model API with Invalid Channel ID" + e);
			}
	    }
		
		
		//Method is used to Verify Functionality to Arena API for FMP Module: Car Model with Blank Channel ID

		public static  void blank_ChannelID( ) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");   
	        RequestBuilder_new.request.header("channel_id", "");        
	        response =  RequestBuilder_new.request.get(endpoint);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Car Model API" +endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
	        logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CarModel.code);
			logger.info("Test case executed successfully");			
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Car Model API with Blank Channel ID" + e);
			}
	    }



		
  }




