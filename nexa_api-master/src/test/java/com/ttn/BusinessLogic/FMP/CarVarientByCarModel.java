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

        public class CarVarientByCarModel  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CarVarientByCarModel.class);
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
	    
	    public static String  endpoint = "/maruti/master/v1/car-variant/150002";
	    public static String  endpoint1 = "/maruti/master/v1/car-variant/7368";

	    
	 	// @param bodyData
	//Method is used to Verify Functionality to Arena API for FMP Module: Car Variant By Car Model with Valid Input


		public static  void validInput( ) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    
	        RequestBuilder_new.request.header("Content-Type", "application/json");   
	     //   RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	     //   RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);        
	        RequestBuilder_new.request.header("X-channel", "1000000");    
	        response =  RequestBuilder_new.request.get(endpoint);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Car Variant By Car Model API" +endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
		    message = response.jsonPath().get("car_variant_list[0].car_model_id").toString();;
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CarVarientByCarModel.code);
			logger.info("Test case executed successfully");

			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Car Variant By Car Model with valid Input" + e);
			}
	    }
		
		
 //Method is used to Verify Functionality to Arena API for FMP Module: Car Variant By Car Model with Invalid Input

		public static  void invalidInput( ) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    
	        RequestBuilder_new.request.header("Content-Type", "application/json");   
	      //  RequestBuilder_new.request.header("channel_id", RequestBuilder_new.getChannel());
	      //  RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);        
	        RequestBuilder_new.request.header("X-channel", "1000000");    
	        response =  RequestBuilder_new.request.get(endpoint1);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Car Variant By Car Model API" +endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint1;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CarVarientByCarModel.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Car Variant By Car Model with Invalid Input" + e);
			}
	    }
	
		
  }




