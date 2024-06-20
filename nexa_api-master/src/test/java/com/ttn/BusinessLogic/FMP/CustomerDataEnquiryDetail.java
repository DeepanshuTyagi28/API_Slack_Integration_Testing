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

        public class CustomerDataEnquiryDetail  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CustomerDataEnquiryDetail.class);
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
	    
	    public static String  endpoint1 = "/maruti/financing/v1/customer-data/";
	    public static String  endpoint =  endpoint1 + CustomerEnquiry.CustomerenquiryID ;
	    
    

	// Method is used to Verify Functionality of FMP API for Customer Data Enquiry Detail

		public static  void validInput( ) {
	
			try {				
	    	RequestBuilder_new.FMPBase_URL();	 
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        RequestBuilder_new.request.header("X-channel", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Execution Started");
	        logger.info("Endpoint for FMP API Customer Data Enquiry Detail" +endpoint);
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        enquiry_id = jsonPathEvaluator.get("enquiry_id");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CustomerDataEnquiryDetail.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Data Enquiry Detail API with Valid Input" + e);
			}
	    }

	
	// Method is used to Verify Functionality of FMP API for Customer Data Enquiry Detail with Invalid Auth
		
		public static  void invalidAuthentication( ) {
			
			try {				
	    	RequestBuilder_new.FMPBase_URL();	 
	        RequestBuilder_new.request.header("Authorization", "ABC");
	        RequestBuilder_new.request.header("X-channel", RequestBuilder_new.getChannel());
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Execution Started");
	        logger.info("Endpoint for FMP API Customer Data Enquiry Detail" +endpoint);
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        enquiry_id = jsonPathEvaluator.get("enquiry_id");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +CustomerDataEnquiryDetail.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP Customer Data Enquiry Detail API with Valid Input" + e);
			}
	    }
	
  }
