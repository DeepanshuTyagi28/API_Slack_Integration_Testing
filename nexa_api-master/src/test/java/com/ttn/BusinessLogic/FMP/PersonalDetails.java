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

        public class PersonalDetails  {
	
	    protected static Logger logger = LoggerFactory.getLogger(PersonalDetails.class);
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
	    
	    public static String  endpoint = "/maruti/master/v1/personal-details";

	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Functionality of Arena FMP to Get Personal Details with Valid inputs
	   */

		public static  void validInput( ) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Personal Details API" +endpoint);
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +PersonalDetails.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Personal Details API with Valid Input" + e);
			}
	    }
	

		
  }




