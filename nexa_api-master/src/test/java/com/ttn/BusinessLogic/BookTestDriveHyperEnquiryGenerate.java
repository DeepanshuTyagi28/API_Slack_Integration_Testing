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
public class BookTestDriveHyperEnquiryGenerate {

	protected static Logger logger = LoggerFactory.getLogger(BookTestDriveHyperEnquiryGenerate.class);
	public static Response response;
	public static int statusCode;
	public static String message;
	public static String result;
	public static String p_Enquiry_no;
	public static String p_dms_Web_Booking_Ref_no;
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
			p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			p_dms_Web_Booking_Ref_no = response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputCityNameBookTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
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
			logger.info("Status code for this request :" + code);
			// p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			// p_Enquiry_no =
			// response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputPByerTyeTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
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
			logger.info("Status code for this request :" + code);
			// p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			// p_Enquiry_no =
			// response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputUsedRefIdTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
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
			logger.info("Status code for this request :" + code);
			// p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			// p_Enquiry_no =
			// response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputWrongModelNumberTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
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
			logger.info("Status code for this request :" + code);
			// p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			// p_Enquiry_no =
			// response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputPEnqSourceNumberTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
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
			logger.info("Status code for this request :" + code);
			// p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			// p_Enquiry_no =
			// response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputPEnqModeTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
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
			logger.info("Status code for this request :" + code);
			// p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			// p_Enquiry_no =
			// response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

	public static void inValidInputWithoutDateTestDriveHyperEnquiryGenerate(String bodyData) {
		try {

			RequestBuilder_new.getBase_URL_Hyper();
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
			logger.info("Status code for this request :" + code);
			// p_Enquiry_no = response.jsonPath().get("result.p_Enquiry_no").toString();
			// p_Enquiry_no =
			// response.jsonPath().get("result.p_dms_Web_Booking_Ref_no").toString();
			logger.info("Status code for this request : " + code);
			logger.info("p_Enquiry_no for this request is : " + p_Enquiry_no);
			logger.info("p_dms_Web_Booking_Ref_no for this request is : " + p_dms_Web_Booking_Ref_no);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			logger.error("Exeption While Execyting validInputBookTestDriveHyperEnquiryGenerate" + e);
		}
	}

}
