package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.GenerateEnquiry;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.GenerateEnquiryPojo;



/**
 * @author Deepanshu Tyagi
 * This class is used to verify SP-Fetch Dealer details functionality.
 */


/**
 * @param  
 */

// TC 1 :- Valid Input
public class GenerateEnqiryTest extends BaseLib {
	
    @Test(priority = 35, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_ValidInput", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.ValidInput(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Enquiry already exists"));	


    }
    
	
    @Test(priority = 36, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Blank_mul_dlr_code", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Blank_mul_dlr_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Blank_mul_dlr_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong Dealer"));	


    }
    
	
    @Test(priority = 37, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Invalid_mul_dlr_code", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Invalid_mul_dlr_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Invalid_mul_dlr_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong Dealer"));	


    }
    
	
    @Test(priority = 38, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Blank_for_cd", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Blank_for_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Blank_for_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong Dealer"));	


    }
    
	
    @Test(priority = 39, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Invalid_for_cd", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Invalid_for_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Invalid_for_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong Dealer"));	


    }
    
	
    @Test(priority = 40, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Invalid_buyer_type", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Invalid_buyer_type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Invalid_buyer_type(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Invalid type of buyer"));	


    }
    
	
    @Test(priority = 41, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Blank_ref_type", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Blank_ref_type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Blank_ref_type(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong REF TYPE"));	


    }
    
	
    @Test(priority = 42, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Invalid_ref_type", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Invalid_ref_type(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Invalid_ref_type(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong REF TYPE"));	


    }
    
	
    @Test(priority = 43, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Blank_model_cd", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Blank_model_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Blank_model_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong Model and Dealer combination"));	


    }
    
	
    @Test(priority = 44, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Invalid_model_cd", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Invalid_model_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Invalid_model_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Wrong Model and Dealer combination"));	


    }
    
	
    @Test(priority = 45, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Blank_variant_cd", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Blank_variant_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Blank_variant_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);


    }
    
	
    @Test(priority = 46, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Blank_color_cd", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Blank_color_cd(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Blank_color_cd(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("ORA-01403"));	


    }
    
	
    @Test(priority = 47, groups = {"Sanity", "Regression"}, dataProvider = "GenerateEnquiry_Existing_transaction_id", dataProviderClass = DataProviderSource.class)
    public void GenerateEnqiryTest_Existing_transaction_id(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	GenerateEnquiryPojo GenerateEnquiryPojo = new GenerateEnquiryPojo(data.get("mul_dlr_cd") , data.get("for_cd") , data.get("buyer_type"),data.get("ref_type") , data.get("ref_no") , data.get("ref_name"),data.get("ref_phone_no") , data.get("mode") , data.get("source"),data.get("title") , data.get("fname"), data.get("mobile_no") , data.get("email"),data.get("model_cd") , data.get("variant_cd") , data.get("color_cd"),data.get("transaction_id") , data.get("stage") , data.get("action"),data.get("mid_name") , data.get("l_name") );
    	String bodyData=jsonSerializer.serialize(GenerateEnquiryPojo); 
    	GenerateEnquiry.Existing_transaction_id(bodyData); 
        Assert.assertEquals(GenerateEnquiry.code, 200);
        Assert.assertTrue(GenerateEnquiry.error_msg.contains("Enquiry already exists"));	


    }
    
    

}
