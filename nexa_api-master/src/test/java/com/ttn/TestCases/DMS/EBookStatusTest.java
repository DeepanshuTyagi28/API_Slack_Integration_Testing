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
import com.ttn.BusinessLogic.DMS.EBookStatus;
import com.ttn.BusinessLogic.DMS.EBookingCancel;
import com.ttn.BusinessLogic.DMS.EnquiryGenerate;
import com.ttn.BusinessLogic.DealerFMP.DealerActiveEnquiry;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.pojoClasses.EBookStatusPojo;
import com.ttn.pojoClasses.EBookingCancelPojo;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify DMS API Enquiry Cancellation
 */

 // Method is used to Verify Functionality to verify DMS API Enquiry Status  with valid Input
    public class EBookStatusTest extends BaseLib {
   	
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookStatus_ValidInput", dataProviderClass = DataProviderSource.class)
    public void eBookStatus_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookStatusPojo EBookStatusPojo = new EBookStatusPojo(data.get("p_pmc"),EnquiryGenerate.p_dms_Web_Booking_Ref_no);
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookStatusPojo);
        String bodyData=sw.toString();  
        EBookStatus.validInput(bodyData); 
        Assert.assertEquals(EBookStatus.code, 200,"Status Code Validation Failed for DMS Enquiry Status  API");
        Assert.assertEquals(EBookStatus.p_enq_status, "Hot","Response Body Failed");

    } 
    
	//	   Method is used to Verify Functionality to DMS API Enquiry Booking Status with Blank Web Booking Refrence Number
    
    @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookStatus_Blank_WebBookingRef", dataProviderClass = DataProviderSource.class)
    public void eBookStatus_Blank_WebBookingRef(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	EBookStatusPojo EBookStatusPojo = new EBookStatusPojo(data.get("p_pmc"),data.get("p_web_booking_ref_no"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, EBookStatusPojo);
        String bodyData=sw.toString();  
        EBookStatus.blank_WebBookingRef(bodyData); 
        Assert.assertEquals(EBookStatus.code, 200,"Status Code Validation Failed for DMS Enquiry Status  API");
        Assert.assertEquals(EBookStatus.message, "Status can not be searched without manadatory parameter.","Response Body Failed");

    } 
    
    
//	   Method is used to Verify Functionality to DMS API Enquiry Booking Status with Invalid Web Booking Refrence Number
    
 @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookStatus_Invalid_WebBookingRef", dataProviderClass = DataProviderSource.class)
 public void eBookStatus_Invalid_WebBookingRef(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
 {
 	EBookStatusPojo EBookStatusPojo = new EBookStatusPojo(data.get("p_pmc"),data.get("p_web_booking_ref_no"));
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
     mapper.enable(SerializationFeature.INDENT_OUTPUT);
     StringWriter sw = new StringWriter();
     mapper.writeValue(sw, EBookStatusPojo);
     String bodyData=sw.toString();  
     EBookStatus.invalid_WebBookingRef(bodyData); 
     Assert.assertEquals(EBookStatus.code, 200,"Status Code Validation Failed for DMS Enquiry Status  API");
     Assert.assertEquals(EBookStatus.message, "Enquiry detail not found against provided Booking reference no: Z73689!@#","Response Body Failed");

 } 
 
// Method is used to Verify Functionality to DMS API Enquiry Booking Status with Valid Input as Status as Lost Status Enquiry 

 
 @Test(groups = {"Sanity", "Regression" , "ARENA","Prod"}, dataProvider = "EBookStatus_ValidInput_LostStatusEnquiry", dataProviderClass = DataProviderSource.class)
 public void eBookStatus_ValidInput_LostStatusEnquiry(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
 {
 	EBookStatusPojo EBookStatusPojo = new EBookStatusPojo(data.get("p_pmc"),EnquiryGenerate.p_dms_Web_Booking_Ref_no_LostStatus);
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
     mapper.enable(SerializationFeature.INDENT_OUTPUT);
     StringWriter sw = new StringWriter();
     mapper.writeValue(sw, EBookStatusPojo);
     String bodyData=sw.toString();  
     EBookStatus.validInput_LostStatusEnquiry(bodyData); 
     Assert.assertEquals(EBookStatus.code, 200,"Status Code Validation Failed for DMS Enquiry Status  API");
     Assert.assertEquals(EBookStatus.p_enq_status, "Lost","Response Body Failed");

 } 
 }	
	
