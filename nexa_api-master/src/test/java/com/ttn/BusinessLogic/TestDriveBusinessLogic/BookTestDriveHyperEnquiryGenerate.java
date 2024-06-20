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
public class BookTestDriveHyperEnquiryGenerate {

	protected static Logger logger = LoggerFactory.getLogger(BookTestDriveHyperEnquiryGenerate.class);
	public static Response response;
	public static int statusCode;
	public static String message;
	public static String result;
	public static String p_Enquiry_no;
	public static String dealerId;
	public static int code;
	public static String dealerIDres;
	private static String endpoint = "/HyperEnquiryGenerate";

	/**
	 * 
	 * @param bodyData
	 * 
	 *                 This method is used to Verify
	 *                 Test_Drive_Hyper_Enqury_Genrate+ with valid data
	 */
	public static void validInputBookTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			result = response.jsonPath().get("message").toString();
			code = response.getStatusCode();
			logger.info("code " + code);
			logger.info("Successfully");
		} catch (Exception e) {
			logger.info("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputCityNameBookTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			result = response.jsonPath().get("message").toString();
			code = response.getStatusCode();
			logger.info("code " + code);
			logger.info("Successfully");
		} catch (Exception e) {
			logger.info("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

}
