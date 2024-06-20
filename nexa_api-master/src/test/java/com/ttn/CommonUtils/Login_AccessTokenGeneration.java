package com.ttn.CommonUtils;


import org.json.simple.JSONObject;

import com.ttn.Builder.RequestBuilder_new;
import com.ttn.CommonUtils.Constants;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Login_AccessTokenGeneration {
	
	 private static JSONObject requestParam;
	  private static Response response;
	    public static int statusCode;
	    
	    private static String SID;
		private static String pass;
		private static String message;
		 
	    
 public static void login() {
	    	
	    	RequestBuilder_new.getBase_URL();
	        requestParam = new JSONObject();
	        SID = PropertyReader.getProperty("SID");
	        pass = PropertyReader.getProperty("PASSWORD");
	        requestParam.put("sid", SID);
	        requestParam.put("pwd", pass);
	        RequestBuilder_new.request.header("Content-Type", "application/json");
	        RequestBuilder_new.request.body(requestParam.toJSONString());
	        //Replace below end point as per need.
	        response =  RequestBuilder_new.request.post("/dummy/Login");
	        message =   response.jsonPath().get("message").toString();
	        System.out.println("-----------setAccess Token Test-----------------");
	        System.out.println("Message -------  "+ message);
	        String token = response.jsonPath().get("data.accessToken").toString();
	        Constants.setAccessToken(token);
	    }

}
