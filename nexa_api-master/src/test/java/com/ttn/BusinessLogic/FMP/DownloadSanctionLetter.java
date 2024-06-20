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

        public class DownloadSanctionLetter  {
	
	    protected static Logger logger = LoggerFactory.getLogger(DownloadSanctionLetter.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  MobileNumbers;
	    public static String  enquiry_id;

	    
	    //Replace below end point as per need.
	    
	    public static String  endpoint1 = "/maruti/loan-management/v1/download-sanction-letter/";
	    public static String  endpoint =  endpoint1 + "AR-08052023-902469621" ;
	    
    

	// Method is used to Verify Functionality of FMP API Download Sanction Letter

		public static  void validInput( ) {
	
			try {				
	    	RequestBuilder_new.FMPBase_URL();	 
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value_DownloadSanctionLetter);
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Execution Started");
	        logger.info("Endpoint for FMP API Download Sanction Letter" +endpoint);
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        enquiry_id = jsonPathEvaluator.get("enquiry_id");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +DownloadSanctionLetter.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Download Sanction Letter API with Valid Input" + e);
			}
	    }

	
	
  }
