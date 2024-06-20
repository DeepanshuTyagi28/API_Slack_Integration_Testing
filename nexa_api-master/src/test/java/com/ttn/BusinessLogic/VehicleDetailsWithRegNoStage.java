/**
 * 
 */
package com.ttn.BusinessLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;

import io.restassured.response.Response;

/**
 * @author Akhilesh Kumar
 *
 */
public class VehicleDetailsWithRegNoStage {

	protected static Logger logger = LoggerFactory.getLogger(VehicleDetailsWithRegNoStage.class);
	public static Response response;
	public static int statusCode;
	public static String message;
	public static String result;
	public static int code;
	public static int codeInBody;
	public static String dealerIDres;
	private static String endpoint = "/JobCardOpeningCustomerAndVehicleMaster";

	/**
	 * 
	 * @param bodyData
	 * 
	 *                 This method is used to Verify VehicleDetailsWithRegNoStage
	 *                 with valid data
	 */
	public static void validInputVehicleDetailsWithRegNoStage(String bodyData) {
		try {

			RequestBuilder_new.Vehicle_Details_with_Reg_NoBase_URL();
			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			RequestBuilder_new.request.body(bodyData);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			result = response.jsonPath().get("message").toString();
			code = response.getStatusCode();
			message = response.jsonPath().get("message").toString();
			Assert.assertEquals(code, 200);
			Assert.assertEquals(message, "This is first time visit. Please scan VIN");

		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputVehicleDetailsWithRegNoStage" + e);
			Assert.fail();
		}
	}

	// invalid input
	public static void invalidInputVehicleDetailsWithRegNoStage(String bodyData) {
		try {

			RequestBuilder_new.Vehicle_Details_with_Reg_NoBase_URL();
			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			RequestBuilder_new.request.body(bodyData);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			result = response.jsonPath().get("message").toString();
			code = response.getStatusCode();
			codeInBody = response.jsonPath().get("code");
			Assert.assertEquals(code, 200);
			Assert.assertEquals(codeInBody, 1);

		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting inInputVehicleDetailsWithRegNoStage" + e);
			Assert.fail();
		}
	}

	// invlid input
	public static void invalidTwoAndThreeInputFieldsVehicleDetailsWithRegNoStage(String bodyData) {
		try {

			RequestBuilder_new.Vehicle_Details_with_Reg_NoBase_URL();
			RequestBuilder_new.request.header("Content-Type", "application/json");
			RequestBuilder_new.request.header("token", "dR$545#h^jjmanJ");
			RequestBuilder_new.request.body(bodyData);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			result = response.jsonPath().get("message").toString();
			code = response.getStatusCode();
			codeInBody = response.jsonPath().get("code");
			Assert.assertEquals(code, 200);
			Assert.assertEquals(codeInBody, 100);

		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting inInputVehicleDetailsWithRegNoStage" + e);
			Assert.fail();
		}
	}

}
