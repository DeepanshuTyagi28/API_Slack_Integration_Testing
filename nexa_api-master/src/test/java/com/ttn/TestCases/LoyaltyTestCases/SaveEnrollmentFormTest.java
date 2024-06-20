package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.SaveEnrollmentForm;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.SaveEnrollmentFormPojo;



/**
 * @author Deepanshu Tyagi
 * This class is used to verify SP-Fetch Dealer details functionality.
 */


/**
 * 
 * @param reg_mobile , email_id ,card_issu_parent , card_issu_dlr_map_cd , card_issu_loc_cd , card_vin , user_id , dob ,
 *  OS_Type ,tnc_approve_date , enrol_sms_confirm
 *  This is Generating Loyalty Card Number for customer who Doesnt have Loyalty card number and can be generated only once 
 * 
 * 
 */

// TC 1 :- Valid Input
public class SaveEnrollmentFormTest extends BaseLib {
	
    @Test(priority = 23, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_ValidInput", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.ValidInput(bodyData); 
    	System.out.println(bodyData);
        Assert.assertEquals(SaveEnrollmentForm.code, 200);


    }
    
    
    @Test(priority = 24, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_BlankRegMobile", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_BlankReg_mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Blankreg_mobile(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("REG_MOBILE CAN NOT BE BLANK"), "Reg Mobile Number is Blank");	


    }
    
    @Test(priority = 25, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_InvalidRegMobile", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_InvalidReg_mobile(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Invalidreg_mobile(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("GIVEN VIN ALREADY MAPPED WITH OTHER CARD."), "Vin Is mapped with other card");	


    }
    
    @Test(priority = 26, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_BlankEmail", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_BlankEmail(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.BlankEmail(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("EMAIL_ID CAN NOT BE BLANK"), "");	


    }
    
    
    @Test(priority = 27, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_Blank_card_issu_parent", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_Blank_card_issu_parent(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Blank_card_issu_parent(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("CARD_ISSU_PARENT CAN NOT BE BLANK"), "");	


    }
    
    ///
    
    @Test(priority = 28, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_Blank_card_issu_dlr_map_cd", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_Blank_card_issu_dlr_map_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Blank_card_issu_dlr_map_cd(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("CARD_ISSU_DLR_MAP_CD CAN NOT BE BLANK"), "");	


    }
    
    @Test(priority = 29, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_Blank_card_issu_loc_cd", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_Blank_card_issu_loc_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Blank_card_issu_loc_cd(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("CARD_ISSU_LOC_CD CAN NOT BE BLANK"), "");	


    }
    
    @Test(priority = 30, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_Blank_card_vin", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_Blank_card_vin(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Blank_card_vin(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("ORA-01403: no data found"), "");	


    }
    
    @Test(priority = 31, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_Blank_user_id", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_Blank_user_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Blank_user_id(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("USER ID CAN NOT BE BLANK."), "");	


    }
    
    @Test(priority = 32, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_Blank_OS_Type", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_Blank_OS_Type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.Blank_OS_Type(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("PLATFORM_OS CAN NOT BE BLANK"), "");	


    }
    
    @Test(priority = 33, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_InvalidVIN", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_InvalidVIN(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.InvalidVIN(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("ORA-01403: no data found"), "");	


    }
    
    @Test(priority = 34, groups = {"Sanity", "Regression"}, dataProvider = "SaveEnrollmentForm_IncorrectMapping", dataProviderClass = DataProviderSource.class)
    public void SaveEnrollmentForm_IncorrectMapping(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	SaveEnrollmentFormPojo SaveEnrollmentFormPojo = new SaveEnrollmentFormPojo(data.get("reg_mobile") , data.get("email_id") , data.get("card_issu_parent"),data.get("card_issu_dlr_map_cd") , data.get("card_issu_loc_cd") , data.get("card_vin"),data.get("user_id") , data.get("dob") , data.get("OS_Type"),data.get("tnc_approve_date") , data.get("enrol_sms_confirm") );
    	String bodyData=jsonSerializer.serialize(SaveEnrollmentFormPojo); 
    	SaveEnrollmentForm.IncorrectMapping(bodyData); 
        Assert.assertEquals(SaveEnrollmentForm.code, 200);
        Assert.assertTrue(SaveEnrollmentForm.error_msg.equalsIgnoreCase("ENROLLMENT ALREADY EXISTS AGAINST THE GIVEN MOBILE AND CARD_TYPE."), "");	


    }
}
