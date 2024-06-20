package com.ttn.BusinessLogic.LoyalityBusinessLogic;

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

public class CheckMarutiOwner {

	protected static Logger logger = LoggerFactory.getLogger(CheckMarutiOwner.class);
	private static JSONObject requestParam;
	public static Response response;
	public static int statusCode;
	public static String message;
	public static String responseBody;
	public static int code;
	public static String VIN;
	public static String MOBILE_NUMBER;

	// Replace below end point as per need.

	private static String endpoint = "/SP-CHECK-MARUTI-OWNER";

	/*
	 * @param bodyData Method is used to Verify Functionality of SP-Check MARUTI
	 * Owner with valid/Existing customer Details
	 */

	public static void ExistingCustomer(String bodyData) {

		try {
			RequestBuilder_new.getBase_URL();
			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
			RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
			logger.info("Body is " + bodyData);
			System.out.println(bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			code = response.getStatusCode();
			responseBody = response.getBody().asString();
			JsonPath jsonPathEvaluator = response.jsonPath();
			VIN = jsonPathEvaluator.get("result.p_list_cursor.VIN[0]");
			MOBILE_NUMBER = jsonPathEvaluator.get("result.p_list_cursor.MOBILE_PHONE[0]");
			logger.info("code " + code);
			logger.info("Successfully got result");
		} catch (Exception e) {
			logger.info("Exception occured");
			e.printStackTrace();
		}
	}

	/*
	 * Method is used to Verify Functionality of SP-Check MARUTI Owner with
	 * Non-Existing customer Details
	 */

	public static void Non_ExistingCustomer(String bodyData) {

		try {
			RequestBuilder_new.getBase_URL();

			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
			RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
			logger.info("Body is " + bodyData);
			System.out.println(bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			code = response.getStatusCode();
			responseBody = response.getBody().asString();
			logger.info("code " + code);
			logger.info("Successfully got result");
		} catch (Exception e) {
			logger.info("Exception occured");
			e.printStackTrace();
		}
	}

	/*
	 * Method is used to Verify Functionality of SP-Check MARUTI Owner with Invalid
	 * Input Details
	 */

	public static void InvalidInput(String bodyData) {

		try {
			RequestBuilder_new.getBase_URL();
			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
			RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
			logger.info("Body is " + bodyData);
			System.out.println(bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			code = response.getStatusCode();
			responseBody = response.getBody().asString();
			logger.info("code " + code);
			logger.info("Successfully got result");
		} catch (Exception e) {
			logger.info("Exception occured");
			e.printStackTrace();
		}
	}
}
