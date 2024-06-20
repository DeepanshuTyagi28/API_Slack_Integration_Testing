/**
 * 
 */
package com.ttn.BusinessLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;

import io.restassured.response.Response;

/**
 * @author Akhilesh Kumar
 *
 */
public class GetTestDriveSlot {
	protected static Logger logger = LoggerFactory.getLogger(GetTestDriveSlot.class);
	public static Response response;
	public static String message;
	public static int code;
	public static String VIN_NUM;
	public static String SLOT_ID;
	public static int codeInBody;
	private static String endpoint = "/GET_TD_SLOT";
	private static String baseUri = "http://staging.dmssales.co.in:9898/ArenaService.svc";
	private static String contentType = "application/json";

	/**
	 * 
	 * @param bodyData
	 * @implNote This method is used to Verify GetTestDriveSlot with valid data
	 * 
	 */
	public static void validInputWithPVinNumGetTestDriveSlot(String bodyData) {
		

			RequestBuilder_new.getBase_URL();
			RequestBuilder_new.request.header("Content-Type", contentType);
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			RequestBuilder_new.request.baseUri(baseUri);
			logger.info("BaseURI for this request :" + baseUri);
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
			VIN_NUM = response.jsonPath().get("result[0].VIN_NUM").toString();
			SLOT_ID = response.jsonPath().get("result[0].SLOT_ID").toString();
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		
	}

}
