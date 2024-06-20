/**
 * 
 */
package com.ttn.BusinessLogic;


import org.json.simple.JSONObject;

import com.aventstack.extentreports.model.Log;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.ExtentManager;
import com.ttn.CommonUtils.HttpMethodSelector;

import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;

/**
 * @author TTN
 *
 */
public class VehicleDetailsByMobileNumber {

	    private static JSONObject requestParam; 
	    public static Response response;
	    public static int  statusCode;
	    public static String  message;
	    public static int code ;
	  
	    private static String  endpoint = "/VehicleDetails ";
	   
	    
	    public static void getVehicleDetailsByMobileNumber(String P_MOBILE) {
	    RequestBuilder_new.getBase_URL();
	    RequestBuilder_new.request.baseUri("http://staging.dmssales.co.in:9898/ArenaService.svc");
        requestParam = new JSONObject();
        requestParam.put("P_MOBILE", P_MOBILE);
        
        RequestBuilder_new.request.header("Content-Type", "application/json");
        RequestBuilder_new.request.header("token" , "dR$545#h^jjmanJ");
        RequestBuilder_new.request.body(requestParam);
        
        RequestBuilder_new.request.log().all();
        response =  RequestBuilder_new.request.post(endpoint);
        ExtentManager.responseBody = response.getBody().asString();
        code= response.getStatusCode();
        ExtentManager.ApiInfo = endpoint;
        System.out.println( response.getBody().asString());
		message =response.jsonPath().get("message").toString();


}
	    }
