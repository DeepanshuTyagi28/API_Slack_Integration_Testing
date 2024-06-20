/**
 * 
 */
package com.ttn.BusinessLogic;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;


import io.restassured.response.Response;

/**
 * @author Akhilesh Kumar
 *
 */
public class GetDetailsByUniqueId_Logic {
	
	protected static Logger logger = LoggerFactory.getLogger(GetDetailsByUniqueId_Logic.class);
	private static JSONObject requestParam;
	public static Response response;
	public static int statusCode;
	public static String resultBodyInString;
	public static String result;
	public static String errorMesage;
	public static int code;
	
	
	private static String endpoint = "/api/sitecore/LoyaltyProgram/GetDetailsByUniqueId";

	/**
	 * 
	 * @param bodyData
	 * @author Akhilesh Kumar
	 * @since 12/01/2023
	 * @apiNote This api use to get details by CardNumber Loyety Positve input
	 */
	public static void getDetailsByUniqueId_Logic_Postive(String bodyData) {

		RequestBuilder_new.getBase_URL();

		RequestBuilder_new.request.header("Content-Type", "application/json");
		RequestBuilder_new.request.header("Cookie", "ARRAffinity=651b99e06159eb2ba4c46d9e94cd579471b6fdb16c067714fa6f411355f6d100; ARRAffinitySameSite=651b99e06159eb2ba4c46d9e94cd579471b6fdb16c067714fa6f411355f6d100; ASP.NET_SessionId=i3etmqdqlmza4mqytedaoiq2; SC_ANALYTICS_GLOBAL_COOKIE=85e185a4422347e29662a6fef888abfd|False; marutisuzuki#lang=en");
		RequestBuilder_new.getDetailsByUniqueIdBaseURL();

		RequestBuilder_new.request.log().all();

		logger.info("Body is " + bodyData);
		RequestBuilder_new.request.body(bodyData);
		response = RequestBuilder_new.request.post(endpoint);
		logger.info("Response is " + response.prettyPrint());
		//errorMesage = response.jsonPath().get("error_msg").toString();
		resultBodyInString = response.asString();
		
		logger.info("Result Card Type is  " + result);
		ExtentManager.responseBody = response.getBody().asString();
		ExtentManager.ApiInfo = endpoint;
		logger.info("Response is " + response.prettyPrint());

		code = response.getStatusCode();
		logger.info("code " + code);
		logger.info("Test Case Successfully Exected ");
	}
	
	
	public static void getDetailsByUniqueId_Logic_Negative(String bodyData) {

		RequestBuilder_new.getBase_URL();

		RequestBuilder_new.request.header("Content-Type", "application/json");
		RequestBuilder_new.request.header("Cookie", "ARRAffinity=651b99e06159eb2ba4c46d9e94cd579471b6fdb16c067714fa6f411355f6d100; ARRAffinitySameSite=651b99e06159eb2ba4c46d9e94cd579471b6fdb16c067714fa6f411355f6d100; ASP.NET_SessionId=i3etmqdqlmza4mqytedaoiq2; SC_ANALYTICS_GLOBAL_COOKIE=85e185a4422347e29662a6fef888abfd|False; marutisuzuki#lang=en");
		RequestBuilder_new.getDetailsByUniqueIdBaseURL();

		RequestBuilder_new.request.log().all();

		logger.info("Body is " + bodyData);
		RequestBuilder_new.request.body(bodyData);
		response = RequestBuilder_new.request.post(endpoint);
		logger.info("Response is " + response.prettyPrint());
		errorMesage = response.jsonPath().get("error_msg").toString();
		resultBodyInString = response.asString();
		
		logger.info("  " + resultBodyInString);
		ExtentManager.responseBody = response.getBody().asString();
		ExtentManager.ApiInfo = endpoint;
		logger.info("Response is " + response.prettyPrint());

		code = response.getStatusCode();
		logger.info("code " + code);
		logger.info("Test Case Successfully Exected ");
	}
	
	
	
	

}
