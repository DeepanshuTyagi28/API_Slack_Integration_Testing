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
public class MobileTestdrive {

	protected static Logger logger = LoggerFactory.getLogger(MobileTestdrive.class);
	public static Response response;
	public static int statusCode;
	public static String message;
	public static String result;
	public static String p_Enquiry_no;
	public static String dealerId;
	public static int code;
	public static String dealerIDres;
	public static int codeInBody;

	private static String endpoint = "/Mobile_Testdrive";
	private static String contentType = "application/json";

	/**
	 * 
	 * @param bodyData
	 * @implNote This method is used to Verify Test_Drive_Hyper_Enqury_Genrate+ with
	 *           valid data
	 * 
	 */
	public static void validInputMobileTestdrive(String bodyData) {
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
			result = response.jsonPath().get("message").toString();
			codeInBody = response.jsonPath().get("code");
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		} catch (Exception e) {
			logger.info("Exeption While Execyting validInputMobileTestdrive" + e);
		}
	}

	/**
	 * 
	 * @param bodyData
	 * @implNote This method is used to Verify Test_Drive_Hyper_Enqury_Genrate+ with
	 *           valid data
	 * 
	 */
	public static void inValidInputMobileTestdrive(String bodyData) {
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
			logger.info("Exeption While Execyting inValidInputMobileTestdrive" + e);
		}
	}

	/**
	 * 
	 * @param bodyData
	 * @implNote This method is used to Verify Test_Drive_Hyper_Enqury_Genrate+ with
	 *           valid data
	 * 
	 */
	public static void blanckInputMobileTestdrive(String bodyData) {
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
			result = response.jsonPath().get("message").toString();
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		} catch (Exception e) {
			logger.info("Exeption While Execyting inValidInputMobileTestdrive" + e);
		}
	}

}
