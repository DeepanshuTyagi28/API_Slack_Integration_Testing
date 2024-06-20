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
public class ScheduleTestDrive {

	protected static Logger logger = LoggerFactory.getLogger(ScheduleTestDrive.class);
	public static Response response;
	public static int statusCode;
	public static String message;
	public static String result;
	public static int code;
	public static String dealerIDres;
	private static String endpoint = "/SCHEDULE_TESTDRIVE";

	/**
	 * 
	 * @param bodyData
	 * @implNote method is used to Verify scheduleTestDrive with valid data
	 */
	public static void validInputScheduleTestDrive(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_BTD();
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
			logger.info("Status code for this request : " + code);
			logger.info("Response message for this request is : " + message);

		} catch (Exception e) {
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

}
