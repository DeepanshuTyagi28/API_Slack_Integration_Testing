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
 * @since 12/01/2023
 * @apiNote This api use to get details by CardNumber Loyety
 *
 */
public class SP_GET_LOYALITY_CUST_DETAILS_Logic {

	protected static Logger logger = LoggerFactory.getLogger(SP_GET_LOYALITY_CUST_DETAILS_Logic.class);
	private static JSONObject requestParam;
	public static Response response;
	public static int statusCode;
	public static String resultBodyInString;
	public static String result;
	public static String errorMesage;
	public static int code;
	
	
	private static String endpoint = "/SP-GET-LOYALITY-CUST-DETAILS";

	/**
	 * 
	 * @param bodyData
	 * @author Akhilesh Kumar
	 * @since 12/01/2023
	 * @apiNote This api use to get details by CardNumber Loyety Positve input
	 */
	public static void validSP_GET_LOYALITY_CUST_DETAILS_Logic(String bodyData) {

		RequestBuilder_new.getBase_URL();

		RequestBuilder_new.request.header("Content-Type", "application/json");
		RequestBuilder_new.request.header("client_id", "50913da4c48f4681885ac2e87bd8d920");
		RequestBuilder_new.request.header("client_secret", "FE1d33F32Ac4414981387F7E823B2c7b");
		RequestBuilder_new.request.baseUri("https://crm-app-stage.sg-s1.cloudhub.io");

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
	public static void negative_GET_LOYALITY_CUST_DETAILS_Negative_Logic(String bodyData) {

		RequestBuilder_new.getBase_URL();

		RequestBuilder_new.request.header("Content-Type", "application/json");
		RequestBuilder_new.request.header("client_id", "50913da4c48f4681885ac2e87bd8d920");
		RequestBuilder_new.request.header("client_secret", "FE1d33F32Ac4414981387F7E823B2c7b");
		RequestBuilder_new.request.baseUri("https://crm-app-stage.sg-s1.cloudhub.io");

		RequestBuilder_new.request.log().all();

		logger.info("Body is " + bodyData);
		RequestBuilder_new.request.body(bodyData);
		response = RequestBuilder_new.request.post(endpoint);
		logger.info("Response is " + response.prettyPrint());
		errorMesage = response.jsonPath().get("error_msg").toString();
		resultBodyInString = response.asString();
		
		logger.info("Result Card Type is  " + result);
		ExtentManager.responseBody = response.getBody().asString();
		ExtentManager.ApiInfo = endpoint;
		logger.info("Response is " + response.prettyPrint());

		code = response.getStatusCode();
		logger.info("code " + code);
		logger.info("Test Case Successfully Exected ");
	}

}
