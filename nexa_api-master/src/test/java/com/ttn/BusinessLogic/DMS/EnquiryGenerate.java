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

        public class EnquiryGenerate  {
	
	    protected static Logger logger = LoggerFactory.getLogger(EnquiryGenerate.class);
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
	    
	    private static String  endpoint = "/Enq_generate";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to DMS API Enquiry generate
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.getBase_URL_BTD();	  
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        p_Enquiry_no = jsonPathEvaluator.get("result.p_Enquiry_no");
	        p_dms_Web_Booking_Ref_no = jsonPathEvaluator.get("result.p_dms_Web_Booking_Ref_no");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +EnquiryGenerate.code);
			logger.info("Test case executed successfully");
			logger.info("Enquiry Number is generated as" +EnquiryGenerate.p_Enquiry_no);
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena DMS API Enquiry generate with valid Input" + e);
			}
	    }
		
		
		//  Method is used to Verify Functionality to DMS API Enquiry generate with Existing Enquiry generated
		
		public static void ExistingEnquiry(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL_BTD();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
	        p_Enquiry_no = jsonPathEvaluator.get("result.p_Enquiry_no");
			logger.info("Expected status code 200");
			logger.info("Actual status code :"+" " +EnquiryGenerate.code);
			logger.info("Test case executed successfully");

			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena DMS API Enquiry generate with Existing Enquiry generated" + e);
			}
	    }
	
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank p_web_refid  
		
		public static void blank_p_web_refid(String bodyData) {
			
			try {
	    	RequestBuilder_new.getBase_URL_BTD();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
			logger.info("Actual status code :"+" " +EnquiryGenerate.code);
			logger.info("Test case executed successfully");

			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank p_web_refid" + e);
			}
	    }	
		
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_book_date
		
			public static void blank_P_book_date(String bodyData) {
				
				try {
		    	RequestBuilder_new.getBase_URL_BTD();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
		        logger.info("Body is "+bodyData);
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
				logger.info("Actual status code :"+" " +EnquiryGenerate.code);
				logger.info("Test case executed successfully");

				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_book_date" + e);
				}
		    }	
			
			
		//  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_book_flag
			
				public static void invalid_P_book_flag(String bodyData) {
					
					try {
			    	RequestBuilder_new.getBase_URL_BTD();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
					logger.info("Actual status code :"+" " +EnquiryGenerate.code);
					logger.info("Test case executed successfully");

					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena DMS API Enquiry generate with Invalid P_book_flag" + e);
					}
			    }	
				
			//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_title
				
					public static void blank_P_title(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_title" + e);
						}
				    }			
				
		//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Cust_first_name
					
					public static void blank_P_Cust_first_name(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_Cust_first_name" + e);
						}
				    }			
					
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Model_cd
					
					public static void blank_P_Model_cd(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_Model_cd" + e);
						}
				    }			
          //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Model_cd
					
					public static void invalid_P_Model_cd(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Invalid P_Model_cd" + e);
						}
				    }		
					
//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Variant_Cd
					
					public static void blank_P_Variant_Cd(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_Variant_Cd" + e);
						}
				    }	
					
          //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Variant_Cd
					
					public static void invalid_P_Variant_Cd(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Invalid P_Variant_Cd" + e);
						}
				    }						
//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Color
					
					public static void blank_P_Color(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_Color" + e);
						}
				    }	
					
          //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Color
					
					public static void invalid_P_Color(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Invalid P_Color" + e);
						}
				    }
					
//  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_Dealer_code
					
					public static void blank_P_Dealer_code(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_Dealer_code" + e);
						}
				    }	
					
          //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_Dealer_code
					
					public static void invalid_P_Dealer_code(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Invalid P_Dealer_code" + e);
						}
				    }	
					
        //  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_for_code
					
					public static void blank_P_for_code(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_for_code" + e);
						}
				    }	
					
          //  Method is used to Verify Functionality to DMS API Enquiry generate with Invalid P_for_code
					
					public static void invalid_P_for_code(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Invalid P_for_code" + e);
						}
				    }											
  //  Method is used to Verify Functionality to DMS API Enquiry generate with Blank P_customer_type
					
					public static void blank_P_customer_type(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
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
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");

						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with Blank P_customer_type" + e);
						}
				    }	
					
					
	//  Method is used to Verify Functionality to DMS API Enquiry generate with Valid Input to Generate Enquiry Number In order to Validate LOST case in cancellation and Status check
				
					public static void validInput_LostStatusEnquiry(String bodyData) {
						
						try {
				    	RequestBuilder_new.getBase_URL_BTD();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Token", "dR$545#h^jjmanJ");
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for DMS API : Enquiry generation" +endpoint);
				        RequestBuilder_new.request.body(bodyData);	        
				        response =  RequestBuilder_new.request.post(endpoint);
				        ExtentManager.responseBody = response.getBody().asString();
				        ExtentManager.ApiInfo = endpoint;
				        logger.info("Response is "+response.prettyPrint());
				        code =   response.getStatusCode();	        
				        responseBody = response.getBody().asString();	        
				        JsonPath jsonPathEvaluator = response.jsonPath();	        
				        Status = jsonPathEvaluator.get("status");
				        p_Enquiry_no_LostStatus = jsonPathEvaluator.get("result.p_Enquiry_no");
				        p_dms_Web_Booking_Ref_no_LostStatus = jsonPathEvaluator.get("result.p_dms_Web_Booking_Ref_no");
						logger.info("Expected status code 200");
						logger.info("Actual status code :"+" " +EnquiryGenerate.code);
						logger.info("Test case executed successfully");
						logger.info("Enquiry Number is generated as" +EnquiryGenerate.p_Enquiry_no);
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena DMS API Enquiry generate with valid Input to Generate Enquiry Number In order to Validate LOST case in cancellation and Status check" + e);
						}
				    }
									
		
  }