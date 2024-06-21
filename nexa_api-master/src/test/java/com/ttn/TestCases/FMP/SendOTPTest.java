package com.ttn.TestCases.FMP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.FMP.SendOTP;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.PhoneNumberGenerator;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.Mobilenumberspojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Generate/Send OTP
 */

 // Method is used to Verify Functionality to generate/ Send OTP Functionality with valid Input


public class SendOTPTest extends BaseLib {
	
	 String RandomMobileNumber = PhoneNumberGenerator.generateMobileNumber();
 	public static String CoApplicantMobileNumber ="85459"+RandomNumber.getRandomNumber(5);

	
    @Test(groups = {"Sanity", "Regression" , "ARENA" ,"Prod" }, dataProvider = "SendOTP_ValidInput", dataProviderClass = DataProviderSource.class)
    public void sendOTP_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Mobilenumberspojo Mobilenumberspojo = new Mobilenumberspojo(RandomMobileNumber,data.get("channel"),null);
    	String bodyData=jsonSerializer.serialize(Mobilenumberspojo);
    	SendOTP.validInput(bodyData); 
        Assert.assertEquals(SendOTP.code, 200,"Status Code Validation Failed for Send OTP API");
        Assert.assertTrue(SendOTP.Status.equalsIgnoreCase("Success"), "Response Body Validation failed -OTP not sent");	
        Assert.assertTrue(SendOTP.message.equalsIgnoreCase("OTP sent successfully"), "Response Body Validation failed -OTP not sent");	

    }

    
    
}
