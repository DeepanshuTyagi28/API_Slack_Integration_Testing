package com.ttn.BusinessLogic.DealerFMP;

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

        public class DealerCityDetail  {
	
	    protected static Logger logger = LoggerFactory.getLogger(DealerCityDetail.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/master/v1/dealer/130011";
	    private static String  endpoint1 = "/maruti/master/v1/dealer/c1z";
	    
	    
	    /*
	 		 * @param bodyData
	 		 * Method is used to Verify Functionality for  FMP API To get Dealer Detail with valid Input
	   */   

		public static void validInput() {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Get Dealer Detail" +endpoint);
	        response =  RequestBuilder_new.request.get(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +DealerCityDetail.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP API To get Dealer Detail" + e);
			}
	    }
		

	//	 	 Method is used to Verify Functionality for  FMP API To get Dealer Detail with invalid Input
	
		
		public static void invalidInput() {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Get Dealer Detail" +endpoint1);
	        response =  RequestBuilder_new.request.get(endpoint1);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint1;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        message = jsonPathEvaluator.get("message");
			logger.info("Expected status code 400");
			logger.info("Actual status code :"+" " +DealerCityDetail.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP API To get Dealer Detail" + e);
			}
	    }
		
  }




