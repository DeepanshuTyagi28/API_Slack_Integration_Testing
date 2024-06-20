/**
 * 
 */
package com.ttn.BusinessLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 * @author Akhilesh Kumar
 *
 */
public class SpGetTierBadges {
	protected static Logger logger = LoggerFactory.getLogger(SpGetTierBadges.class);
	public static Response response;
	public static String message;
	public static String po_appnt_no;
	public static int code;
	public static int p_list_cursor_list_size;
	public static String bagdgeName;
	public static int codeInBody;

	private static String endpoint = "/SP-GET-TIER-BADGES";
	private static String contentType = "application/json";

	/**
	 * 
	 * @param bodyData
	 * @implNote This method is used to Verify Test_Drive_Hyper_Enqury_Genrate+ with
	 *           valid data
	 * 
	 */
	public static void validInputSpGetTierBadges(String bodyData) {
		

			RequestBuilder_new.getBase_URL();
			RequestBuilder_new.request.header("Content-Type", contentType);			
	        RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
            RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
			logger.info("Content-Type for this request :" + contentType);
			logger.info("Endpoint for this request :" + endpoint);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			JsonPath j = new JsonPath(response.body().asString());
			p_list_cursor_list_size = j.getInt("result.p_list_cursor.size()");
			message = response.jsonPath().get("result.p_list_cursor[0].TIER").toString();
			bagdgeName = response.jsonPath().get("result.p_list_cursor[1].BADGE_NAME").toString();

			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		
	}

	public static void invalidInputSpGetTierBadges(String bodyData) {
		

			RequestBuilder_new.getBase_URL();
			RequestBuilder_new.request.header("Content-Type", contentType);			
	        RequestBuilder_new.request.header("client_id", RequestBuilder_new.getclientID());
            RequestBuilder_new.request.header("client_secret", RequestBuilder_new.getclientSecret());
			logger.info("Content-Type for this request :" + contentType);
			logger.info("Endpoint for this request :" + endpoint);
			RequestBuilder_new.request.log().all();
			logger.info("Body is " + bodyData);
			RequestBuilder_new.request.body(bodyData);
			response = RequestBuilder_new.request.post(endpoint);
			ExtentManager.responseBody = response.getBody().asString();
			ExtentManager.ApiInfo = endpoint;
			logger.info("Response is " + response.prettyPrint());
			JsonPath j = new JsonPath(response.body().asString());
			p_list_cursor_list_size = j.getInt("result.p_list_cursor.size()");
			code = response.getStatusCode();
			logger.info("Status code " + code);
			logger.info("Successfully request send and received");
		
	}

}
