package com.ttn.TestCases.DMS;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Hashtable;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.Builder.RequestBuilder_new;
import com.ttn.BusinessLogic.Campaign.SendCampaignOTP;
import com.ttn.BusinessLogic.DMS.EBookingCancel;
import com.ttn.BusinessLogic.DMS.EnquiryGenerate;
import com.ttn.BusinessLogic.DealerFMP.DealerActiveEnquiry;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.pojoClasses.EBookingCancelPojo;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify DMS API Enquiry Cancellation
 */

 // Method is used to Verify Functionality to verify DMS API Enquiry Cancellation  with valid Input
    public class EBookingCancelTest extends BaseLib {
   	
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_ValidInput", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(EnquiryGenerate.p_dms_Web_Booking_Ref_no ,EnquiryGenerate.p_Enquiry_no , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.validInput(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
    } 
    
	   
	// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Blank P_dealer_Cd
   

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_Blank_P_dealer_Cd", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_Blank_P_Dealer_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(data.get("p_Website_booking_Ref_no"),data.get("p_DMS_booking_no") , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.blank_P_dealer_Cd(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
        Assert.assertEquals(EBookingCancel.message, "Please check Dealer Code and For Code.ORA-01403: no data found");

    } 
    
	// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Invalid P_dealer_Cd


    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_Invalid_P_dealer_Cd", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_Invalid_P_Dealer_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(data.get("p_Website_booking_Ref_no"),data.get("p_DMS_booking_no") , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.invalid_P_dealer_Cd(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
        Assert.assertEquals(EBookingCancel.message, "Please check Dealer Code and For Code.ORA-01403: no data found");

    } 
	
  
    
    
	// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Blank P_for_Cd
    

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_Blank_P_for_Cd", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_Blank_P_for_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(data.get("p_Website_booking_Ref_no"),data.get("p_DMS_booking_no") , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.blank_P_for_Cd(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
        Assert.assertEquals(EBookingCancel.message, "Please check Dealer Code and For Code.ORA-01403: no data found");

    } 
    
	// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Invalid P_dealer_Cd


    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_Invalid_P_for_Cd", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_Invalid_P_for_Cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(data.get("p_Website_booking_Ref_no"),data.get("p_DMS_booking_no") , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.invalid_P_for_Cd(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
        Assert.assertEquals(EBookingCancel.message, "Please check Dealer Code and For Code.ORA-01403: no data found");

    } 
    
    
    
	// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Blank P_flag
    

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_Blank_P_flag", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_Blank_P_flag(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(data.get("p_Website_booking_Ref_no"),data.get("p_DMS_booking_no") , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.blank_P_flag(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
        Assert.assertEquals(EBookingCancel.message, "Please provide the correct Action flag.");

    } 
    
	// Method is used to Verify Functionality to DMS API Enquiry Cancellation with Invalid P_flag


    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_Invalid_P_flag", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_Invalid_P_flag(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(data.get("p_Website_booking_Ref_no"),data.get("p_DMS_booking_no") , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.invalid_P_flag(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
   //   Assert.assertEquals(EBookingCancel.message, "Please provide the correct Action flag.");

    } 
  
    
	//  Method is used to Verify Functionality to DMS API Enquiry Cancellation with Valid Input to Cancel Enquiry Number In order to Validate LOST case in cancellation and Status check

    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookingCancel_ValidInput_LostStatus", dataProviderClass = DataProviderSource.class)
    public void eBookingCancel_ValidInput_LostStatusEnquirycancellation(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookingCancelPojo EBookingCancelPojo = new EBookingCancelPojo(EnquiryGenerate.p_dms_Web_Booking_Ref_no_LostStatus ,EnquiryGenerate.p_Enquiry_no_LostStatus , data.get("p_dealer_Cd") ,data.get("p_for_Cd"),data.get("p_flag"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookingCancelPojo);
        String bodyData=sw.toString();  
        EBookingCancel.validInput_LostStatusEnquiryCancellation(bodyData); 
        Assert.assertEquals(EBookingCancel.code, 200,"Status Code Validation Failed for DMS Enquiry cancellation  API");
    }   
    
    
    }	
	
