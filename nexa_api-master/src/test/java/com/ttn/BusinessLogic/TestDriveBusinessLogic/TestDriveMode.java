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
 *
 */
public class TestDriveMode {
	protected static Logger logger = LoggerFactory.getLogger(TestDriveMode.class);
	public static Response response;
	public static String message;
	public static int code;
	public static int codeInBody;
	private static String endpoint = "/TD_MODE";
	private static String contentType = "application/json";

	/**
	 * 
	 * @param bodyData
	 * @implNote This method is used to Verify GetTestDriveSlot with valid data
	 * 
	 */
	public static void validInputTestDriveMode(String bodyData) {
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
			logger.info("Exeption While Execyting SpGetTierBadges" + e);
		}
	}
	public static void invalidInputTestDriveMode(String bodyData) {
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
			logger.info("Exeption While Execyting SpGetTierBadges" + e);
		}
	}

}
