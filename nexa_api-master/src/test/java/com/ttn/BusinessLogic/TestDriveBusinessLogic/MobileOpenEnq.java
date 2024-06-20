/**
 * 
 */
package com.ttn.BusinessLogic.TestDriveBusinessLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;

import io.restassured.response.Response;

/**
 * @author Akhilesh Kumar
 * @apiNote Logic for MobileOpenEnqTest where input is mobile number and return
 *          sceduled testdrive
 */
public class MobileOpenEnq {
	protected static Logger logger = LoggerFactory.getLogger(TestDriveMode.class);
	public static Response response;
	public static String message;
	public static int code;
	public static int codeInBody;
	private static String endpoint = "/MOB_OPEN_ENQ";
	private static String contentType = "application/json";

	/**
	 * 
	 * @param bodyData
	 * @implNote Logic for MobileOpenEnqTest where input is mobile number and return
	 *           sceduled testdrive
	 */
	public static void validInputMobileOpenEnq(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_BTD();
			RequestBuilder_new.request.header("Content-Type", contentType);
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			logger.info("Content-Type for this request :" + contentType);
			logger.info("Endpoint for this request :" + endpoint);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			message = response.jsonPath().get("message").toString();
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		} catch (Exception e) {
			logger.info("Exeption While Execyting MobileOpenEnq" + e);
		}
	}

	public static void invalidvalidInputMobileOpenEnq(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_BTD();
			RequestBuilder_new.request.header("Content-Type", contentType);
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			logger.info("Content-Type for this request :" + contentType);
			logger.info("Endpoint for this request :" + endpoint);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			message = response.jsonPath().get("message").toString();
			codeInBody = response.jsonPath().get("code");
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		} catch (Exception e) {
			logger.info("Exeption While Execyting MobileOpenEnq" + e);
		}
	}

	public static void invalidvalidInputMobileNumberMobileOpenEnq(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_BTD();
			RequestBuilder_new.request.header("Content-Type", contentType);
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			logger.info("Content-Type for this request :" + contentType);
			logger.info("Endpoint for this request :" + endpoint);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());

			codeInBody = response.jsonPath().get("code");
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		} catch (Exception e) {
			logger.info("Exeption While Execyting MobileOpenEnq" + e);
		}
	}

}
