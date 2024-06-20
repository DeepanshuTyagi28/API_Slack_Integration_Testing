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
public class InsertNapptnDetail {

	protected static Logger logger = LoggerFactory.getLogger(InsertNapptnDetail.class);
	public static Response response;
	public static String message;
	public static String po_appnt_no;
	public static int code;
	public static String dealerIDres;
	public static int codeInBody;

	private static String endpoint = "/INSERT_NAPPNT_DTL";
	private static String baseUri = "http://staging.dmssales.co.in:9898/ArenaService.svc";
	private static String contentType = "application/json";

	/**
	 * 
	 * @param bodyData
	 * @implNote This method is used to Verify Test_Drive_Hyper_Enqury_Genrate+ with
	 *           valid data
	 * 
	 */
	public static void validInputInsertNapptnDetail(String bodyData) {
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
		po_appnt_no = response.jsonPath().get("result.po_appnt_no").toString();
		logger.info("Successfully request send and po_appnt_no :"+po_appnt_no);
		codeInBody = response.jsonPath().get("code");
		code = response.getStatusCode();
		logger.info("Status code " + code);
		logger.info("Successfully request send and received");
	}
	
	
	public static void invalidInputInsertNapptnDetail(String bodyData) {
	

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
			codeInBody = response.jsonPath().get("code");
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		
	}

}
