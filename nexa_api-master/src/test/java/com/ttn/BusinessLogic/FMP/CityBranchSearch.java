package com.ttn.BusinessLogic.FMP;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;
import com.ttn.TestCases.FMP.VerifyOTPTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class CityBranchSearch  {
	
	    protected static Logger logger = LoggerFactory.getLogger(CityBranchSearch.class);
	    private static JSONObject requestParam;
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static String  responseBody;
	    public static int code;
	    public static String  Status;
	    public static String  Message;
	    public static String  Error;

	    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "/maruti/loan-offer/v1/city/branch/search";
	    
	    
	    /*
	 		  @param bodyData
	 		  Method is used to Verify Functionality Of Arena FMP API to Search City Branch  with Valid Input
	   */

		public static void ValidInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Search City Branch API"  +endpoint);
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
			logger.info("Actual status code :"+" " +CityBranchSearch.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP City Branch Search API with Valid Input" + e);			}
	    }
		
		
//	 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Blank Search text
		
		public static void blank_search_text(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Search City Branch API" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	 
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        Error = jsonPathEvaluator.get("errors[0].error_message");
			logger.info("Expected status code 409");
			logger.info("Actual status code :"+" " +CityBranchSearch.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena FMP  City Branch Search API with Blank Search text" + e);			}
	    }	
		
		
//		 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with short Length Search text Keyword(Length of 3 Words are required in order to execute test with search field)
		
			public static void length_search_text(String bodyData) {
				
				try {
		    	RequestBuilder_new.FMPBase_URL();	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        logger.info("Body is "+bodyData);
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for Search City Branch API" +endpoint);
		        RequestBuilder_new.request.body(bodyData);	 
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
		        Error = jsonPathEvaluator.get("errors[0].error_message");
				logger.info("Expected status code 409");
				logger.info("Actual status code :"+" " +CityBranchSearch.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena FMP  City Branch Search API with short Length Search text Keyword" + e);			}
		    }	
			
			
//			 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Blank financier_id
			
				public static void blank_financier_id(String bodyData) {
					
					try {
			    	RequestBuilder_new.FMPBase_URL();	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for Search City Branch API" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	 
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
			        Error = jsonPathEvaluator.get("errors[0].error_message");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +CityBranchSearch.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena FMP  City Branch  Search API with  Blank financier_id" + e);			}
			    }	

//				 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Invalid financier_id
				
					public static void invalid_Financier_Id(String bodyData) {
						
						try {
				    	RequestBuilder_new.FMPBase_URL();	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for Search City Branch API" +endpoint);
				        RequestBuilder_new.request.body(bodyData);	 
				        response =  RequestBuilder_new.request.post(endpoint);
				        ExtentManager.responseBody = response.getBody().asString();
				        ExtentManager.ApiInfo = endpoint;
				        logger.info("Response is "+response.prettyPrint());
				        code =   response.getStatusCode();	        
				        responseBody = response.getBody().asString();	        
				        JsonPath jsonPathEvaluator = response.jsonPath();	        
				        Status = jsonPathEvaluator.get("status");
				        Error = jsonPathEvaluator.get("errors[0].error_message");
						logger.info("Expected status code 409");
						logger.info("Actual status code :"+" " +CityBranchSearch.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena FMP  City Branch Search API with Invalid financier_id" + e);			}
				    }	

//					 Method is used to Verify Functionality Of Arena FMP API to Search City Branch with Blank City 
					
						public static void blank_City(String bodyData) {
							
							try {
					    	RequestBuilder_new.FMPBase_URL();	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        logger.info("Body is "+bodyData);
				  	        logger.info("Execution Started");
					        logger.info("Endpoint for Search City Branch API" +endpoint);
					        RequestBuilder_new.request.body(bodyData);	 
					        response =  RequestBuilder_new.request.post(endpoint);
					        ExtentManager.responseBody = response.getBody().asString();
					        ExtentManager.ApiInfo = endpoint;
					        logger.info("Response is "+response.prettyPrint());
					        code =   response.getStatusCode();	        
					        responseBody = response.getBody().asString();	        
					        JsonPath jsonPathEvaluator = response.jsonPath();	        
					        Status = jsonPathEvaluator.get("status");
					        Error = jsonPathEvaluator.get("errors[0].error_message");
							logger.info("Expected status code 409");
							logger.info("Actual status code :"+" " +CityBranchSearch.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena FMP  City Branch Search API with Blank City " + e);			}
					    }	

  }
        
	
