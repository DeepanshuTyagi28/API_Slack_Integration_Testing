package com.ttn.Builder;

/**
 * 
 * @author TTN
 */

import com.ttn.CommonUtils.PropertyReader;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder_new {

	public static RequestSpecification request;
	public static String client_id;
	public static String client_secret;
	public static String channel;
	public static String x_api_key;
	public static String IP_Address;

	public static String Environment = PropertyReader.getProperty_for_baseconfig("Environment");
	public static String Channel = PropertyReader.getProperty_for_baseconfig("Channel");
	public static String xapikey = PropertyReader.getProperty_for_baseconfig("xapikey");

	public static String Prod_Base_Url = PropertyReader.getProperty_for_baseconfig("Prod_Base_Url");
	public static String Stage_Base_Url = PropertyReader.getProperty_for_baseconfig("Stage_Base_Url");
	public static String UAT_Base_Url = PropertyReader.getProperty_for_baseconfig("UAT_Base_Url");

	public static String Prod_Base_Url_2 = PropertyReader.getProperty_for_baseconfig("Prod_Base_Url_2");
	public static String Stage_Base_Url_2 = PropertyReader.getProperty_for_baseconfig("Stage_Base_Url_2");
	public static String UAT_Base_Url_2 = PropertyReader.getProperty_for_baseconfig("UAT_Base_Url_2");

	public static String UAT_Login_Base_Url = PropertyReader.getProperty_for_baseconfig("UAT_Login_Base_Url");

	public static String UAT_clientID = PropertyReader.getProperty_for_baseconfig("UAT_clientID");
	public static String Prod_clientID = PropertyReader.getProperty_for_baseconfig("Prod_clientID");
	public static String Stage_clientID = PropertyReader.getProperty_for_baseconfig("Stage_clientID");

	public static String UAT_client_secret = PropertyReader.getProperty_for_baseconfig("UAT_client_secret");
	public static String Prod_client_secret = PropertyReader.getProperty_for_baseconfig("Prod_client_secret");
	public static String Stage_client_secret = PropertyReader.getProperty_for_baseconfig("Stage_client_secret");

	public static String Prod_Base_Url_Hyper = PropertyReader.getProperty_for_baseconfig("Prod_Base_Url_Hyper");
	public static String Stage_Base_Url_Hyper = PropertyReader.getProperty_for_baseconfig("Stage_Base_Url_Hyper");
	public static String UAT_Base_Url_Hyper = PropertyReader.getProperty_for_baseconfig("UAT_Base_Url_Hyper");

	public static String Prod_Base_Url_BTD = PropertyReader.getProperty_for_baseconfig("Prod_Base_Url_BTD");
	public static String Stage_Base_Url_BTD = PropertyReader.getProperty_for_baseconfig("Stage_Base_Url_BTD");
	public static String UAT_Base_Url_BTD = PropertyReader.getProperty_for_baseconfig("UAT_Base_Url_BTD");

	public static String FMP_Prod_Base_Url = PropertyReader.getProperty_for_baseconfig("FMP_Prod_Base_Url");
	public static String FMP_Stage_Base_Url = PropertyReader.getProperty_for_baseconfig("FMP_Stage_Base_Url");
	public static String FMP_UAT_Base_Url = PropertyReader.getProperty_for_baseconfig("FMP_UAT_Base_Url");

	public static String FMP_Channel_Arena = PropertyReader.getProperty_for_baseconfig("FMP_Channel_Arena");
	public static String FMP_Channel_Nexa = PropertyReader.getProperty_for_baseconfig("FMP_Channel_Nexa");

	public static String Vehicle_Details_with_Reg_No_Prod_Base_Url = PropertyReader
			.getProperty_for_baseconfig("Vehicle_Details_with_Reg_No_Prod_Base_Url");
	public static String Vehicle_Details_with_Reg_No_Stage_Base_Url = PropertyReader
			.getProperty_for_baseconfig("Vehicle_Details_with_Reg_No_Stage_Base_Url");
	public static String Vehicle_Details_with_Reg_No_UAT_Base_Url = PropertyReader
			.getProperty_for_baseconfig("Vehicle_Details_with_Reg_No_UAT_Base_Url");

	public static String Prod_Base_ArenaService = PropertyReader.getProperty_for_baseconfig("Prod_Base_ArenaService");
	public static String Stage_Base_ArenaService = PropertyReader.getProperty_for_baseconfig("Stage_Base_ArenaService");
	public static String UAT_Base_ArenaService = PropertyReader.getProperty_for_baseconfig("UAT_Base_ArenaService");

	public static String Prod_ArenaService_XAPI = PropertyReader.getProperty_for_baseconfig("Prod_ArenaService_XAPI");
	public static String Stage_ArenaService_XAPI = PropertyReader.getProperty_for_baseconfig("Stage_ArenaService_XAPI");
	public static String UAT_ArenaService_XAPI = PropertyReader.getProperty_for_baseconfig("UAT_ArenaService_XAPI");

	public static String Prod_ArenaService_IP = PropertyReader.getProperty_for_baseconfig("Prod_ArenaService_IP");
	public static String Stage_ArenaService_IP = PropertyReader.getProperty_for_baseconfig("Stage_ArenaService_IP");
	public static String UAT_ArenaService_IP = PropertyReader.getProperty_for_baseconfig("UAT_ArenaService_IP");

	
	public static String Prod_GetDetailsByUniqueId = PropertyReader
			.getProperty_for_baseconfig("GetDetailsByUniqueId_Prod_Base_Url");
	public static String Stage_GetDetailsByUniqueId = PropertyReader
			.getProperty_for_baseconfig("GetDetailsByUniqueId_Stage_Base_Url");
	public static String UAT_GetDetailsByUniqueId = PropertyReader
			.getProperty_for_baseconfig("GetDetailsByUniqueId_UAT_Base_Url");

	// Selection of Channel between Arena / Nexa

	public static String getChannel() {

		if (Channel.equalsIgnoreCase("Arena")) {
			channel = FMP_Channel_Arena;

		} else if (Channel.equalsIgnoreCase("Nexa")) {
			channel = FMP_Channel_Nexa;

		}
		return channel;

	}

	public static void getBase_URL_2() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = UAT_Base_Url_2;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Stage_Base_Url_2;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Prod_Base_Url_2;
			request = RestAssured.given();

		}

	}

	public static void getBase_URL() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = UAT_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Stage_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Prod_Base_Url;
			request = RestAssured.given();

		}

	}

	// For login
	public static void getBase_URL_Login() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = UAT_Login_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Stage_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Prod_Base_Url;
			request = RestAssured.given();

		}

	}

	// client_id Value : Header Value

	public static String getclientID() {

		if (Environment.equalsIgnoreCase("UAT")) {
			client_id = UAT_clientID;

		} else if (Environment.equalsIgnoreCase("Stage")) {
			client_id = Stage_clientID;

		} else if (Environment.equalsIgnoreCase("prod")) {

			client_id = Prod_clientID;

		}
		return client_id;

	}

	// client_Secret Value : Header Value

	public static String getclientSecret() {

		if (Environment.equalsIgnoreCase("UAT")) {
			client_secret = UAT_client_secret;

		} else if (Environment.equalsIgnoreCase("Stage")) {
			client_secret = Stage_client_secret;

		} else if (Environment.equalsIgnoreCase("prod")) {

			client_secret = Prod_client_secret;

		}
		return client_secret;

	}

	public static void getBase_URL_Hyper() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = UAT_Base_Url_Hyper;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Stage_Base_Url_Hyper;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Prod_Base_Url_Hyper;
			request = RestAssured.given();

		}

	}

	public static void getBase_URL_BTD() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = UAT_Base_Url_BTD;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Stage_Base_Url_BTD;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Prod_Base_Url_BTD;
			request = RestAssured.given();

		}

	}

	public static void FMPBase_URL() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = FMP_UAT_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = FMP_Stage_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = FMP_Prod_Base_Url;
			request = RestAssured.given();

		}

	}

	public static void Vehicle_Details_with_Reg_NoBase_URL() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = Vehicle_Details_with_Reg_No_UAT_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Vehicle_Details_with_Reg_No_Stage_Base_Url;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Vehicle_Details_with_Reg_No_Prod_Base_Url;
			request = RestAssured.given();

		}

	}

	public static void getArenaService() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = UAT_Base_ArenaService;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Stage_Base_ArenaService;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Prod_Base_ArenaService;
			request = RestAssured.given();

		}

	}

// client_Secret Value : Header Value

	public static String getArena_X_APIKey() {

		if (Environment.equalsIgnoreCase("UAT")) {
			x_api_key = UAT_ArenaService_XAPI;

		} else if (Environment.equalsIgnoreCase("Stage")) {
			x_api_key = Stage_ArenaService_XAPI;

		} else if (Environment.equalsIgnoreCase("prod")) {

			x_api_key = Prod_ArenaService_XAPI;

		}
		return x_api_key;

	}
	
	// FMP IP Address Value : Header Value

		public static String getArenaFMP_IPAddress() {

			if (Environment.equalsIgnoreCase("UAT")) {
				IP_Address = UAT_ArenaService_IP;

			} else if (Environment.equalsIgnoreCase("Stage")) {
				IP_Address = Stage_ArenaService_IP;

			} else if (Environment.equalsIgnoreCase("prod")) {

				IP_Address = Prod_ArenaService_IP;

			}
			return IP_Address;

		}	
	

//Base url for GetDetailByUniqID
	public static void getDetailsByUniqueIdBaseURL() {

		if (Environment.equalsIgnoreCase("UAT")) {
			RestAssured.baseURI = UAT_GetDetailsByUniqueId;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("Stage")) {
			RestAssured.baseURI = Stage_GetDetailsByUniqueId;
			request = RestAssured.given();

		} else if (Environment.equalsIgnoreCase("prod")) {
			RestAssured.baseURI = Prod_GetDetailsByUniqueId;
			request = RestAssured.given();

		}

	}

}