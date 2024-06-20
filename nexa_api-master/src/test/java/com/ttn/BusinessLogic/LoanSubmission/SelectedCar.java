package com.ttn.BusinessLogic.LoanSubmission;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.FMP.VerifyOTP;
import com.ttn.CommonUtils.ExtentManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*
 * @author- Deepanshu Tyagi
 */

        public class SelectedCar  {
	
	    protected static Logger logger = LoggerFactory.getLogger(SelectedCar.class);
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
	    public static String enquiry_id;

	    
    
	    //Replace below end point as per need.
	    
	    private static String  endpoint = "maruti/customer/v1/selected-car";
	    
	    
	    /*
	 		   Method is used to Verify Functionality to Loan Submission Selected Car
	   */   

		public static void validInput(String bodyData) {
	
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
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
	        enquiry_id = jsonPathEvaluator.get("enquiry_id");
			logger.info("Expected status code 200");
			logger.info("Actual status code :" +" " +SelectedCar.code);
			logger.info("Test case executed successfully");
			logger.info("Enquiry ID Updated is as"+ " "+SelectedCar.enquiry_id);

			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Selected Car with valid Input" + e);
			}
	    }
		
//	Method is used to Verify Functionality to Loan Submission Selected Car with Blank Enquiry ID	
		
		public static void blank_Enquiry_Id(String bodyData) {
			
			try {
	    	RequestBuilder_new.FMPBase_URL();	    	
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
	        logger.info("Body is "+bodyData);
  	        logger.info("Execution Started");
	        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
	        RequestBuilder_new.request.body(bodyData);	        
	        response =  RequestBuilder_new.request.post(endpoint);
	        ExtentManager.responseBody = response.getBody().asString();
	        ExtentManager.ApiInfo = endpoint;
	        logger.info("Response is "+response.prettyPrint());
	        code =   response.getStatusCode();	        
	        responseBody = response.getBody().asString();	        
	        JsonPath jsonPathEvaluator = response.jsonPath();	        
	        Status = jsonPathEvaluator.get("status");
			logger.info("Expected status code 403");
			logger.info("Actual status code :"+" " +SelectedCar.code);
			logger.info("Test case executed successfully");
			}
			catch(Exception e)
			{
				logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank Enquiry ID" + e);
			}
	    }
		
//		Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing Enquiry ID	
		
			public static void invalid_Enquiry_Id(String bodyData) {
				
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        logger.info("Body is "+bodyData);
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
		        RequestBuilder_new.request.body(bodyData);	        
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
				logger.info("Expected status code 403");
				logger.info("Actual status code :"+" " +SelectedCar.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing Enquiry ID" + e);
				}
		    }
			
			
//			Method is used to Verify Functionality to Loan Submission Selected Car with Blank color_description 	
			
			public static void blank_color_description(String bodyData) {
				
				try {
		    	RequestBuilder_new.FMPBase_URL();	    	
		        RequestBuilder_new.request.header("Content-Type", "application/json");
		        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
		        logger.info("Body is "+bodyData);
	  	        logger.info("Execution Started");
		        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
		        RequestBuilder_new.request.body(bodyData);	        
		        response =  RequestBuilder_new.request.post(endpoint);
		        ExtentManager.responseBody = response.getBody().asString();
		        ExtentManager.ApiInfo = endpoint;
		        logger.info("Response is "+response.prettyPrint());
		        code =   response.getStatusCode();	        
		        responseBody = response.getBody().asString();	        
		        JsonPath jsonPathEvaluator = response.jsonPath();	        
		        Status = jsonPathEvaluator.get("status");
				logger.info("Expected status code 409");
				logger.info("Actual status code :"+" " +SelectedCar.code);
				logger.info("Test case executed successfully");
				}
				catch(Exception e)
				{
					logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank color_description" + e);
				}
		    }
				
				
//				Method is used to Verify Functionality to Loan Submission Selected Car with Blank color_indicator	
				
				public static void blank_color_indicator(String bodyData) {
					
					try {
			    	RequestBuilder_new.FMPBase_URL();	    	
			        RequestBuilder_new.request.header("Content-Type", "application/json");
			        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
			        logger.info("Body is "+bodyData);
		  	        logger.info("Execution Started");
			        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
			        RequestBuilder_new.request.body(bodyData);	        
			        response =  RequestBuilder_new.request.post(endpoint);
			        ExtentManager.responseBody = response.getBody().asString();
			        ExtentManager.ApiInfo = endpoint;
			        logger.info("Response is "+response.prettyPrint());
			        code =   response.getStatusCode();	        
			        responseBody = response.getBody().asString();	        
			        JsonPath jsonPathEvaluator = response.jsonPath();	        
			        Status = jsonPathEvaluator.get("status");
					logger.info("Expected status code 409");
					logger.info("Actual status code :"+" " +SelectedCar.code);
					logger.info("Test case executed successfully");
					}
					catch(Exception e)
					{
						logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank color_indicator" + e);
					}
			    }
				
//				Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing color_indicator
				
					public static void invalid_color_indicator(String bodyData) {
						
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
				        RequestBuilder_new.request.body(bodyData);	        
				        response =  RequestBuilder_new.request.post(endpoint);
				        ExtentManager.responseBody = response.getBody().asString();
				        ExtentManager.ApiInfo = endpoint;
				        logger.info("Response is "+response.prettyPrint());
				        code =   response.getStatusCode();	        
				        responseBody = response.getBody().asString();	        
				        JsonPath jsonPathEvaluator = response.jsonPath();	        
				        Status = jsonPathEvaluator.get("status");
						logger.info("Expected status code 409");
						logger.info("Actual status code :"+" " +SelectedCar.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing color_indicator" + e);
						}
				    }	
					
					
//					Method is used to Verify Functionality to Loan Submission Selected Car with Blank customer_type	
					
					public static void blank_customer_type(String bodyData) {
						
						try {
				    	RequestBuilder_new.FMPBase_URL();	    	
				        RequestBuilder_new.request.header("Content-Type", "application/json");
				        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
				        logger.info("Body is "+bodyData);
			  	        logger.info("Execution Started");
				        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
				        RequestBuilder_new.request.body(bodyData);	        
				        response =  RequestBuilder_new.request.post(endpoint);
				        ExtentManager.responseBody = response.getBody().asString();
				        ExtentManager.ApiInfo = endpoint;
				        logger.info("Response is "+response.prettyPrint());
				        code =   response.getStatusCode();	        
				        responseBody = response.getBody().asString();	        
				        JsonPath jsonPathEvaluator = response.jsonPath();	        
				        Status = jsonPathEvaluator.get("status");
						logger.info("Expected status code 409");
						logger.info("Actual status code :"+" " +SelectedCar.code);
						logger.info("Test case executed successfully");
						}
						catch(Exception e)
						{
							logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank customer_type" + e);
						}
				    }
					
//					Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing customer_type
					
						public static void invalid_customer_type(String bodyData) {
							
							try {
					    	RequestBuilder_new.FMPBase_URL();	    	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
					        logger.info("Body is "+bodyData);
				  	        logger.info("Execution Started");
					        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
					        RequestBuilder_new.request.body(bodyData);	        
					        response =  RequestBuilder_new.request.post(endpoint);
					        ExtentManager.responseBody = response.getBody().asString();
					        ExtentManager.ApiInfo = endpoint;
					        logger.info("Response is "+response.prettyPrint());
					        code =   response.getStatusCode();	        
					        responseBody = response.getBody().asString();	        
					        JsonPath jsonPathEvaluator = response.jsonPath();	        
					        Status = jsonPathEvaluator.get("status");
							logger.info("Expected status code 409");
							logger.info("Actual status code :"+" " +SelectedCar.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing customer_type" + e);
							}
					    }			
						
						
//						Method is used to Verify Functionality to Loan Submission Selected Car with Blank buyer_type	
						
						public static void blank_buyer_type(String bodyData) {
							
							try {
					    	RequestBuilder_new.FMPBase_URL();	    	
					        RequestBuilder_new.request.header("Content-Type", "application/json");
					        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
					        logger.info("Body is "+bodyData);
				  	        logger.info("Execution Started");
					        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
					        RequestBuilder_new.request.body(bodyData);	        
					        response =  RequestBuilder_new.request.post(endpoint);
					        ExtentManager.responseBody = response.getBody().asString();
					        ExtentManager.ApiInfo = endpoint;
					        logger.info("Response is "+response.prettyPrint());
					        code =   response.getStatusCode();	        
					        responseBody = response.getBody().asString();	        
					        JsonPath jsonPathEvaluator = response.jsonPath();	        
					        Status = jsonPathEvaluator.get("status");
							logger.info("Expected status code 409");
							logger.info("Actual status code :"+" " +SelectedCar.code);
							logger.info("Test case executed successfully");
							}
							catch(Exception e)
							{
								logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank buyer_type" + e);
							}
					    }
						
//						Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing buyer_type
						
							public static void invalid_buyer_type(String bodyData) {
								
								try {
						    	RequestBuilder_new.FMPBase_URL();	    	
						        RequestBuilder_new.request.header("Content-Type", "application/json");
						        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
						        logger.info("Body is "+bodyData);
					  	        logger.info("Execution Started");
						        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
						        RequestBuilder_new.request.body(bodyData);	        
						        response =  RequestBuilder_new.request.post(endpoint);
						        ExtentManager.responseBody = response.getBody().asString();
						        ExtentManager.ApiInfo = endpoint;
						        logger.info("Response is "+response.prettyPrint());
						        code =   response.getStatusCode();	        
						        responseBody = response.getBody().asString();	        
						        JsonPath jsonPathEvaluator = response.jsonPath();	        
						        Status = jsonPathEvaluator.get("status");
								logger.info("Expected status code 409");
								logger.info("Actual status code :"+" " +SelectedCar.code);
								logger.info("Test case executed successfully");
								}
								catch(Exception e)
								{
									logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing buyer_type" + e);
								}
						    }
							
//							Method is used to Verify Functionality to Loan Submission Selected Car with Blank sales_type	
							
							public static void blank_sales_type(String bodyData) {
								
								try {
						    	RequestBuilder_new.FMPBase_URL();	    	
						        RequestBuilder_new.request.header("Content-Type", "application/json");
						        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
						        logger.info("Body is "+bodyData);
					  	        logger.info("Execution Started");
						        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
						        RequestBuilder_new.request.body(bodyData);	        
						        response =  RequestBuilder_new.request.post(endpoint);
						        ExtentManager.responseBody = response.getBody().asString();
						        ExtentManager.ApiInfo = endpoint;
						        logger.info("Response is "+response.prettyPrint());
						        code =   response.getStatusCode();	        
						        responseBody = response.getBody().asString();	        
						        JsonPath jsonPathEvaluator = response.jsonPath();	        
						        Status = jsonPathEvaluator.get("status");
								logger.info("Expected status code 409");
								logger.info("Actual status code :"+" " +SelectedCar.code);
								logger.info("Test case executed successfully");
								}
								catch(Exception e)
								{
									logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank sales_type" + e);
								}
						    }
							
//							Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing sales_type
							
								public static void invalid_sales_type(String bodyData) {
									
									try {
							    	RequestBuilder_new.FMPBase_URL();	    	
							        RequestBuilder_new.request.header("Content-Type", "application/json");
							        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
							        logger.info("Body is "+bodyData);
						  	        logger.info("Execution Started");
							        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
							        RequestBuilder_new.request.body(bodyData);	        
							        response =  RequestBuilder_new.request.post(endpoint);
							        ExtentManager.responseBody = response.getBody().asString();
							        ExtentManager.ApiInfo = endpoint;
							        logger.info("Response is "+response.prettyPrint());
							        code =   response.getStatusCode();	        
							        responseBody = response.getBody().asString();	        
							        JsonPath jsonPathEvaluator = response.jsonPath();	        
							        Status = jsonPathEvaluator.get("status");
									logger.info("Expected status code 409");
									logger.info("Actual status code :"+" " +SelectedCar.code);
									logger.info("Test case executed successfully");
									}
									catch(Exception e)
									{
										logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing sales_type" + e);
									}
							    }					
//								Method is used to Verify Functionality to Loan Submission Selected Car with Blank fuel_type	
								
								public static void blank_fuel_type(String bodyData) {
									
									try {
							    	RequestBuilder_new.FMPBase_URL();	    	
							        RequestBuilder_new.request.header("Content-Type", "application/json");
							        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
							        logger.info("Body is "+bodyData);
						  	        logger.info("Execution Started");
							        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
							        RequestBuilder_new.request.body(bodyData);	        
							        response =  RequestBuilder_new.request.post(endpoint);
							        ExtentManager.responseBody = response.getBody().asString();
							        ExtentManager.ApiInfo = endpoint;
							        logger.info("Response is "+response.prettyPrint());
							        code =   response.getStatusCode();	        
							        responseBody = response.getBody().asString();	        
							        JsonPath jsonPathEvaluator = response.jsonPath();	        
							        Status = jsonPathEvaluator.get("status");
									logger.info("Expected status code 409");
									logger.info("Actual status code :"+" " +SelectedCar.code);
									logger.info("Test case executed successfully");
									}
									catch(Exception e)
									{
										logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank fuel_type" + e);
									}
							    }
								
//		Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing fuel_type
								
									public static void invalid_fuel_type(String bodyData) {
										
										try {
								    	RequestBuilder_new.FMPBase_URL();	    	
								        RequestBuilder_new.request.header("Content-Type", "application/json");
								        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
								        logger.info("Body is "+bodyData);
							  	        logger.info("Execution Started");
								        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
								        RequestBuilder_new.request.body(bodyData);	        
								        response =  RequestBuilder_new.request.post(endpoint);
								        ExtentManager.responseBody = response.getBody().asString();
								        ExtentManager.ApiInfo = endpoint;
								        logger.info("Response is "+response.prettyPrint());
								        code =   response.getStatusCode();	        
								        responseBody = response.getBody().asString();	        
								        JsonPath jsonPathEvaluator = response.jsonPath();	        
								        Status = jsonPathEvaluator.get("status");
										logger.info("Expected status code 409");
										logger.info("Actual status code :"+" " +SelectedCar.code);
										logger.info("Test case executed successfully");
										}
										catch(Exception e)
										{
											logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing fuel_type" + e);
										}
								    }		
//									Method is used to Verify Functionality to Loan Submission Selected Car with Blank ac_type	
									
									public static void blank_ac_type(String bodyData) {
										
										try {
								    	RequestBuilder_new.FMPBase_URL();	    	
								        RequestBuilder_new.request.header("Content-Type", "application/json");
								        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
								        logger.info("Body is "+bodyData);
							  	        logger.info("Execution Started");
								        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
								        RequestBuilder_new.request.body(bodyData);	        
								        response =  RequestBuilder_new.request.post(endpoint);
								        ExtentManager.responseBody = response.getBody().asString();
								        ExtentManager.ApiInfo = endpoint;
								        logger.info("Response is "+response.prettyPrint());
								        code =   response.getStatusCode();	        
								        responseBody = response.getBody().asString();	        
								        JsonPath jsonPathEvaluator = response.jsonPath();	        
								        Status = jsonPathEvaluator.get("status");
										logger.info("Expected status code 409");
										logger.info("Actual status code :"+" " +SelectedCar.code);
										logger.info("Test case executed successfully");
										}
										catch(Exception e)
										{
											logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank ac_type" + e);
										}
								    }
									
//			Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing ac_type
									
										public static void invalid_ac_type(String bodyData) {
											
											try {
									    	RequestBuilder_new.FMPBase_URL();	    	
									        RequestBuilder_new.request.header("Content-Type", "application/json");
									        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
									        logger.info("Body is "+bodyData);
								  	        logger.info("Execution Started");
									        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
									        RequestBuilder_new.request.body(bodyData);	        
									        response =  RequestBuilder_new.request.post(endpoint);
									        ExtentManager.responseBody = response.getBody().asString();
									        ExtentManager.ApiInfo = endpoint;
									        logger.info("Response is "+response.prettyPrint());
									        code =   response.getStatusCode();	        
									        responseBody = response.getBody().asString();	        
									        JsonPath jsonPathEvaluator = response.jsonPath();	        
									        Status = jsonPathEvaluator.get("status");
											logger.info("Expected status code 409");
											logger.info("Actual status code :"+" " +SelectedCar.code);
											logger.info("Test case executed successfully");
											}
											catch(Exception e)
											{
												logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing ac_type" + e);
											}
									    }											
//										Method is used to Verify Functionality to Loan Submission Selected Car with Blank dealer_code	
										
										public static void blank_dealer_code(String bodyData) {
											
											try {
									    	RequestBuilder_new.FMPBase_URL();	    	
									        RequestBuilder_new.request.header("Content-Type", "application/json");
									        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
									        logger.info("Body is "+bodyData);
								  	        logger.info("Execution Started");
									        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
									        RequestBuilder_new.request.body(bodyData);	        
									        response =  RequestBuilder_new.request.post(endpoint);
									        ExtentManager.responseBody = response.getBody().asString();
									        ExtentManager.ApiInfo = endpoint;
									        logger.info("Response is "+response.prettyPrint());
									        code =   response.getStatusCode();	        
									        responseBody = response.getBody().asString();	        
									        JsonPath jsonPathEvaluator = response.jsonPath();	        
									        Status = jsonPathEvaluator.get("status");
											logger.info("Expected status code 409");
											logger.info("Actual status code :"+" " +SelectedCar.code);
											logger.info("Test case executed successfully");
											}
											catch(Exception e)
											{
												logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank dealer_code" + e);
											}
									    }
										
//										Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing dealer_code
										
											public static void invalid_dealer_code(String bodyData) {
												
												try {
										    	RequestBuilder_new.FMPBase_URL();	    	
										        RequestBuilder_new.request.header("Content-Type", "application/json");
										        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
										        logger.info("Body is "+bodyData);
									  	        logger.info("Execution Started");
										        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
										        RequestBuilder_new.request.body(bodyData);	        
										        response =  RequestBuilder_new.request.post(endpoint);
										        ExtentManager.responseBody = response.getBody().asString();
										        ExtentManager.ApiInfo = endpoint;
										        logger.info("Response is "+response.prettyPrint());
										        code =   response.getStatusCode();	        
										        responseBody = response.getBody().asString();	        
										        JsonPath jsonPathEvaluator = response.jsonPath();	        
										        Status = jsonPathEvaluator.get("status");
												logger.info("Expected status code 409");
												logger.info("Actual status code :"+" " +SelectedCar.code);
												logger.info("Test case executed successfully");
												}
												catch(Exception e)
												{
													logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing dealer_code" + e);
												}
										    }					
//											Method is used to Verify Functionality to Loan Submission Selected Car with Blank model_code	
											
											public static void blank_model_code(String bodyData) {
												
												try {
										    	RequestBuilder_new.FMPBase_URL();	    	
										        RequestBuilder_new.request.header("Content-Type", "application/json");
										        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
										        logger.info("Body is "+bodyData);
									  	        logger.info("Execution Started");
										        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
										        RequestBuilder_new.request.body(bodyData);	        
										        response =  RequestBuilder_new.request.post(endpoint);
										        ExtentManager.responseBody = response.getBody().asString();
										        ExtentManager.ApiInfo = endpoint;
										        logger.info("Response is "+response.prettyPrint());
										        code =   response.getStatusCode();	        
										        responseBody = response.getBody().asString();	        
										        JsonPath jsonPathEvaluator = response.jsonPath();	        
										        Status = jsonPathEvaluator.get("status");
												logger.info("Expected status code 409");
												logger.info("Actual status code :"+" " +SelectedCar.code);
												logger.info("Test case executed successfully");
												}
												catch(Exception e)
												{
													logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank model_code" + e);
												}
										    }
											
//					Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing model_code
											
												public static void invalid_model_code(String bodyData) {
													
													try {
											    	RequestBuilder_new.FMPBase_URL();	    	
											        RequestBuilder_new.request.header("Content-Type", "application/json");
											        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
											        logger.info("Body is "+bodyData);
										  	        logger.info("Execution Started");
											        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
											        RequestBuilder_new.request.body(bodyData);	        
											        response =  RequestBuilder_new.request.post(endpoint);
											        ExtentManager.responseBody = response.getBody().asString();
											        ExtentManager.ApiInfo = endpoint;
											        logger.info("Response is "+response.prettyPrint());
											        code =   response.getStatusCode();	        
											        responseBody = response.getBody().asString();	        
											        JsonPath jsonPathEvaluator = response.jsonPath();	        
											        Status = jsonPathEvaluator.get("status");
													logger.info("Expected status code 409");
													logger.info("Actual status code :"+" " +SelectedCar.code);
													logger.info("Test case executed successfully");
													}
													catch(Exception e)
													{
														logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing model_code" + e);
													}
											    }		
//												Method is used to Verify Functionality to Loan Submission Selected Car with Blank variant_code	
												
												public static void blank_variant_code(String bodyData) {
													
													try {
											    	RequestBuilder_new.FMPBase_URL();	    	
											        RequestBuilder_new.request.header("Content-Type", "application/json");
											        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
											        logger.info("Body is "+bodyData);
										  	        logger.info("Execution Started");
											        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
											        RequestBuilder_new.request.body(bodyData);	        
											        response =  RequestBuilder_new.request.post(endpoint);
											        ExtentManager.responseBody = response.getBody().asString();
											        ExtentManager.ApiInfo = endpoint;
											        logger.info("Response is "+response.prettyPrint());
											        code =   response.getStatusCode();	        
											        responseBody = response.getBody().asString();	        
											        JsonPath jsonPathEvaluator = response.jsonPath();	        
											        Status = jsonPathEvaluator.get("status");
													logger.info("Expected status code 409");
													logger.info("Actual status code :"+" " +SelectedCar.code);
													logger.info("Test case executed successfully");
													}
													catch(Exception e)
													{
														logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank variant_code" + e);
													}
											    }
												
//						Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing variant_code
												
													public static void invalid_variant_code(String bodyData) {
														
														try {
												    	RequestBuilder_new.FMPBase_URL();	    	
												        RequestBuilder_new.request.header("Content-Type", "application/json");
												        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
												        logger.info("Body is "+bodyData);
											  	        logger.info("Execution Started");
												        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
												        RequestBuilder_new.request.body(bodyData);	        
												        response =  RequestBuilder_new.request.post(endpoint);
												        ExtentManager.responseBody = response.getBody().asString();
												        ExtentManager.ApiInfo = endpoint;
												        logger.info("Response is "+response.prettyPrint());
												        code =   response.getStatusCode();	        
												        responseBody = response.getBody().asString();	        
												        JsonPath jsonPathEvaluator = response.jsonPath();	        
												        Status = jsonPathEvaluator.get("status");
														logger.info("Expected status code 409");
														logger.info("Actual status code :"+" " +SelectedCar.code);
														logger.info("Test case executed successfully");
														}
														catch(Exception e)
														{
															logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing variant_code" + e);
														}
												    }
													
//													Method is used to Verify Functionality to Loan Submission Selected Car with Blank state_code	
													
													public static void blank_state_code(String bodyData) {
														
														try {
												    	RequestBuilder_new.FMPBase_URL();	    	
												        RequestBuilder_new.request.header("Content-Type", "application/json");
												        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
												        logger.info("Body is "+bodyData);
											  	        logger.info("Execution Started");
												        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
												        RequestBuilder_new.request.body(bodyData);	        
												        response =  RequestBuilder_new.request.post(endpoint);
												        ExtentManager.responseBody = response.getBody().asString();
												        ExtentManager.ApiInfo = endpoint;
												        logger.info("Response is "+response.prettyPrint());
												        code =   response.getStatusCode();	        
												        responseBody = response.getBody().asString();	        
												        JsonPath jsonPathEvaluator = response.jsonPath();	        
												        Status = jsonPathEvaluator.get("status");
														logger.info("Expected status code 409");
														logger.info("Actual status code :"+" " +SelectedCar.code);
														logger.info("Test case executed successfully");
														}
														catch(Exception e)
														{
															logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank state_code" + e);
														}
												    }
													
//							Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing state_code
													
														public static void invalid_state_code(String bodyData) {
															
															try {
													    	RequestBuilder_new.FMPBase_URL();	    	
													        RequestBuilder_new.request.header("Content-Type", "application/json");
													        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
													        logger.info("Body is "+bodyData);
												  	        logger.info("Execution Started");
													        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
													        RequestBuilder_new.request.body(bodyData);	        
													        response =  RequestBuilder_new.request.post(endpoint);
													        ExtentManager.responseBody = response.getBody().asString();
													        ExtentManager.ApiInfo = endpoint;
													        logger.info("Response is "+response.prettyPrint());
													        code =   response.getStatusCode();	        
													        responseBody = response.getBody().asString();	        
													        JsonPath jsonPathEvaluator = response.jsonPath();	        
													        Status = jsonPathEvaluator.get("status");
															logger.info("Expected status code 409");
															logger.info("Actual status code :"+" " +SelectedCar.code);
															logger.info("Test case executed successfully");
															}
															catch(Exception e)
															{
																logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing state_code" + e);
															}
													    }		
//														Method is used to Verify Functionality to Loan Submission Selected Car with Blank color_code	
														
														public static void blank_color_code(String bodyData) {
															
															try {
													    	RequestBuilder_new.FMPBase_URL();	    	
													        RequestBuilder_new.request.header("Content-Type", "application/json");
													        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
													        logger.info("Body is "+bodyData);
												  	        logger.info("Execution Started");
													        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
													        RequestBuilder_new.request.body(bodyData);	        
													        response =  RequestBuilder_new.request.post(endpoint);
													        ExtentManager.responseBody = response.getBody().asString();
													        ExtentManager.ApiInfo = endpoint;
													        logger.info("Response is "+response.prettyPrint());
													        code =   response.getStatusCode();	        
													        responseBody = response.getBody().asString();	        
													        JsonPath jsonPathEvaluator = response.jsonPath();	        
													        Status = jsonPathEvaluator.get("status");
															logger.info("Expected status code 409");
															logger.info("Actual status code :"+" " +SelectedCar.code);
															logger.info("Test case executed successfully");
															}
															catch(Exception e)
															{
																logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank color_code" + e);
															}
													    }
														
														
														
//														Method is used to Verify Functionality to Loan Submission Selected Car with Blank on_road_price
														
														public static void blank_on_road_price(String bodyData) {
															
															try {
													    	RequestBuilder_new.FMPBase_URL();	    	
													        RequestBuilder_new.request.header("Content-Type", "application/json");
													        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
													        logger.info("Body is "+bodyData);
												  	        logger.info("Execution Started");
													        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
													        RequestBuilder_new.request.body(bodyData);	        
													        response =  RequestBuilder_new.request.post(endpoint);
													        ExtentManager.responseBody = response.getBody().asString();
													        ExtentManager.ApiInfo = endpoint;
													        logger.info("Response is "+response.prettyPrint());
													        code =   response.getStatusCode();	        
													        responseBody = response.getBody().asString();	        
													        JsonPath jsonPathEvaluator = response.jsonPath();	        
													        Status = jsonPathEvaluator.get("status");
															logger.info("Expected status code 409");
															logger.info("Actual status code :"+" " +SelectedCar.code);
															logger.info("Test case executed successfully");
															}
															catch(Exception e)
															{
																logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank on_road_price" + e);
															}
													    }
																			
														
//								Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing on_road_price
														
															public static void invalid_on_road_price(String bodyData) {
																
																try {
														    	RequestBuilder_new.FMPBase_URL();	    	
														        RequestBuilder_new.request.header("Content-Type", "application/json");
														        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
														        logger.info("Body is "+bodyData);
													  	        logger.info("Execution Started");
														        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
														        RequestBuilder_new.request.body(bodyData);	        
														        response =  RequestBuilder_new.request.post(endpoint);
														        ExtentManager.responseBody = response.getBody().asString();
														        ExtentManager.ApiInfo = endpoint;
														        logger.info("Response is "+response.prettyPrint());
														        code =   response.getStatusCode();	        
														        responseBody = response.getBody().asString();	        
														        JsonPath jsonPathEvaluator = response.jsonPath();	        
														        Status = jsonPathEvaluator.get("status");
																logger.info("Expected status code 409");
																logger.info("Actual status code :"+" " +SelectedCar.code);
																logger.info("Test case executed successfully");
																}
																catch(Exception e)
																{
																	logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing on_road_price" + e);
																}
														    }
															
															
//															Method is used to Verify Functionality to Loan Submission Selected Car with Blank tcs
															
															public static void blank_tcs(String bodyData) {
																
																try {
														    	RequestBuilder_new.FMPBase_URL();	    	
														        RequestBuilder_new.request.header("Content-Type", "application/json");
														        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
														        logger.info("Body is "+bodyData);
													  	        logger.info("Execution Started");
														        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
														        RequestBuilder_new.request.body(bodyData);	        
														        response =  RequestBuilder_new.request.post(endpoint);
														        ExtentManager.responseBody = response.getBody().asString();
														        ExtentManager.ApiInfo = endpoint;
														        logger.info("Response is "+response.prettyPrint());
														        code =   response.getStatusCode();	        
														        responseBody = response.getBody().asString();	        
														        JsonPath jsonPathEvaluator = response.jsonPath();	        
														        Status = jsonPathEvaluator.get("status");
																logger.info("Expected status code 409");
																logger.info("Actual status code :"+" " +SelectedCar.code);
																logger.info("Test case executed successfully");
																}
																catch(Exception e)
																{
																	logger.info("Exeption While Executing Arena Loan Submission Selected Car with Blank tcs" + e);
																}
														    }
																				
															
//									Method is used to Verify Functionality to Loan Submission Selected Car with Invalid/Non Existing tcs
															
																public static void invalid_tcs(String bodyData) {
																	
																	try {
															    	RequestBuilder_new.FMPBase_URL();	    	
															        RequestBuilder_new.request.header("Content-Type", "application/json");
															        RequestBuilder_new.request.header("Authorization", VerifyOTP.Access_token_Value);
															        logger.info("Body is "+bodyData);
														  	        logger.info("Execution Started");
															        logger.info("Endpoint for Loan Submission Selected Car" +endpoint);
															        RequestBuilder_new.request.body(bodyData);	        
															        response =  RequestBuilder_new.request.post(endpoint);
															        ExtentManager.responseBody = response.getBody().asString();
															        ExtentManager.ApiInfo = endpoint;
															        logger.info("Response is "+response.prettyPrint());
															        code =   response.getStatusCode();	        
															        responseBody = response.getBody().asString();	        
															        JsonPath jsonPathEvaluator = response.jsonPath();	        
															        Status = jsonPathEvaluator.get("status");
																	logger.info("Expected status code 409");
																	logger.info("Actual status code :"+" " +SelectedCar.code);
																	logger.info("Test case executed successfully");
																	}
																	catch(Exception e)
																	{
																		logger.info("Exeption While Executing Arena Loan Submission Selected Car with Invalid/Non Existing tcs" + e);
																	}
															    }
						
  }