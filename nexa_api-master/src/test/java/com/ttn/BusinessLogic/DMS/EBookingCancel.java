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

        public class EBookingCancel  {
	
	    protected static Logger logger = LoggerFactory.getLogger(EBookingCancel.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String MSPin_Token;
	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/EBookingCancel";
	    
	    
	    /*
	 		 * @param bodyData
	 		   Method is used to Verify Functionality to DMS API Enquiry Cancellation
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL_BTD();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
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
			logger.info("Actual status code :"+" " +EBookingCancel.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with valid Input" + e);
			}
	    }

	
	// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Blank P_dealer_Cd
		
		public static void blank_P_dealer_Cd(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL_BTD();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
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
			logger.info("Actual status code :"+" " +EBookingCancel.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with Blank P_dealer_Cd" + e);
			}
	    }	
		
		
		// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Invalid P_dealer_Cd
		
				public static void invalid_P_dealer_Cd(String bodyData) {
					
					try {
			    	RequestBuilder_new.getBase_URL_BTD();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	        
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("code");
			        message = jsonPathEvaluator.get("message");
					logger.info("Expected status code 200");
					logger.info("Actual status code :"+" " +EBookingCancel.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with Invalid P_dealer_Cd" + e);
					}
			    }	

				// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Blank P_for_Cd
				
				public static void blank_P_for_Cd(String bodyData) {
					
					try {
			    	RequestBuilder_new.getBase_URL_BTD();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
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
					logger.info("Actual status code :"+" " +EBookingCancel.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with Blank P_for_Cd" + e);
					}
			    }	
				
				
				// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Invalid P_for_Cd
				
						public static void invalid_P_for_Cd(String bodyData) {
							
							try {
					    	RequestBuilder_new.getBase_URL_BTD();	    	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
					        logger.info("Body is "+bodyData);
				  	        logger.info("Execution Started");
					        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
					        RequestBuilder_new.request.body(bodyData);	        
					        response =  RequestBuilder_new.request.post(endpoint);
					        ExtentManager.responseBody = response.getBody().asString();
					        ExtentManager.ApiInfo = endpoint;
					        logger.info("Response is "+response.prettyPrint());
					        code =   response.getStatusCode();	        
					        responseBody = response.getBody().asString();	        
					        JsonPath jsonPathEvaluator = response.jsonPath();	        
					        Status = jsonPathEvaluator.get("code");
					        message = jsonPathEvaluator.get("message");
							logger.info("Expected status code 200");
							logger.info("Actual status code :"+" " +EBookingCancel.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with Invalid P_for_Cd" + e);
							}
					    }					
		
						
						// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Blank P_flag
						
						public static void blank_P_flag(String bodyData) {
							
							try {
					    	RequestBuilder_new.getBase_URL_BTD();	    	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
					        logger.info("Body is "+bodyData);
				  	        logger.info("Execution Started");
					        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
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
							logger.info("Actual status code :"+" " +EBookingCancel.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with Blank P_flag" + e);
							}
					    }	
						
						
						// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Invalid P_flag
						
								public static void invalid_P_flag(String bodyData) {
									
									try {
							    	RequestBuilder_new.getBase_URL_BTD();	    	
							        RequestBuilder_new.request.header("Content-Type", "application/json");
							        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
							        logger.info("Body is "+bodyData);
						  	        logger.info("Execution Started");
							        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
							        RequestBuilder_new.request.body(bodyData);	        
							        response =  RequestBuilder_new.request.post(endpoint);
							        ExtentManager.responseBody = response.getBody().asString();
							        ExtentManager.ApiInfo = endpoint;
							        logger.info("Response is "+response.prettyPrint());
							        code =   response.getStatusCode();	        
							        responseBody = response.getBody().asString();	        
							        JsonPath jsonPathEvaluator = response.jsonPath();	        
							        Status = jsonPathEvaluator.get("code");
							        message = jsonPathEvaluator.get("message");
									logger.info("Expected status code 200");
									logger.info("Actual status code :"+" " +EBookingCancel.code);
									logger.info("Test case executed successfully");
									}
									catch(Exception e)
									{
										logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with Invalid P_flag" + e);
									}
							    }		
								
	//  Method is used to Verify Functionality to DMS API Enquiry Cancellation with Valid Input to Cancel Enquiry Number In order to Validate LOST case in cancellation and Status check
							
								public static void validInput_LostStatusEnquiryCancellation(String bodyData) {
									
									try {
							    	RequestBuilder_new.getBase_URL_BTD();	    	
							        RequestBuilder_new.request.header("Content-Type", "application/json");
							        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
							        logger.info("Body is "+bodyData);
						  	        logger.info("Execution Started");
							        logger.info("Endpoint for DMS API : Enquiry Cancellation" +endpoint);
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
									logger.info("Actual status code :"+" " +EBookingCancel.code);
									logger.info("Test case executed successfully");
									}
									catch(Exception e)
									{
										logger.info("Exeption While Executing Arena DMS API Enquiry Cancellation with valid Input In order to Validate LOST case in cancellation and Status check" + e);
									}
							    }							
				
  }
        




