package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.FetchDealerDetails;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.DealerDetailpojo;


/**
 * @author Deepanshu Tyagi
 * This class is used to verify SP-Fetch Dealer details functionality.
 */

// TC 1 :- Valid Input
public class FetchDealerDetailsTest extends BaseLib {
	
    @Test(priority = 13, groups = {"Sanity", "Regression"}, dataProvider = "FetchDealerdetails_ValidInput", dataProviderClass = DataProviderSource.class)
    public void  FetchDealerDetailsTest_ValidDealerDetail(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DealerDetailpojo DealerDetailpojo = new DealerDetailpojo(data.get("MUL_DEALER_CD") , data.get("FOR_CD") , data.get("PMC"));
    	String bodyData=jsonSerializer.serialize(DealerDetailpojo);    
    	FetchDealerDetails.ValidInput(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
		Assert.assertEquals(FetchDealerDetails.responseBody.contains("P_DEALER_MAP_CD"), true);	 
        Assert.assertTrue(FetchDealerDetails.DealerCode.equalsIgnoreCase(data.get("P_DEALER_MAP_CD")), "Dealer ID & Dealer Mapped code doent matched ");	


    }
 
    @Test(priority = 14, groups = {"Sanity", "Regression"}, dataProvider = "FetchDealerdetails_BlankDealerCode", dataProviderClass = DataProviderSource.class)
    public void  FetchDealerDetailsTest_BlankDealerCode(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DealerDetailpojo DealerDetailpojo = new DealerDetailpojo(data.get("MUL_DEALER_CD") , data.get("FOR_CD") , data.get("PMC"));
    	String bodyData=jsonSerializer.serialize(DealerDetailpojo);    
    	FetchDealerDetails.BlankDealerCode(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
	    Assert.assertTrue(FetchDealerDetails.p_error_msg.equalsIgnoreCase("ORA-01403: no data found"), "Dealer code is mandatory field");				

    }
   
    @Test(priority = 15, groups = {"Sanity", "Regression"}, dataProvider = "FetchDealerdetails_InvalidDealerCode", dataProviderClass = DataProviderSource.class)
    public void  FetchDealerDetailsTest_InvalidDealerCode(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DealerDetailpojo DealerDetailpojo = new DealerDetailpojo(data.get("MUL_DEALER_CD") , data.get("FOR_CD") , data.get("PMC"));
    	String bodyData=jsonSerializer.serialize(DealerDetailpojo);    
    	FetchDealerDetails.InvalidDealerCode(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
	    Assert.assertTrue(FetchDealerDetails.p_error_msg.equalsIgnoreCase("ORA-01403: no data found"), "Dealer code is Invalid");				

    }
    
    //
    @Test(priority = 16, groups = {"Sanity", "Regression"}, dataProvider = "FetchDealerdetails_BlankFor_CD", dataProviderClass = DataProviderSource.class)
    public void  FetchDealerDetailsTest_BlankFor_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DealerDetailpojo DealerDetailpojo = new DealerDetailpojo(data.get("MUL_DEALER_CD") , data.get("FOR_CD") , data.get("PMC"));
    	String bodyData=jsonSerializer.serialize(DealerDetailpojo);    
    	FetchDealerDetails.Blank_For_CD(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
	    Assert.assertTrue(FetchDealerDetails.p_error_msg.equalsIgnoreCase("ORA-01403: no data found"), "Any Message ");				

    }
    
    
    @Test(priority = 17, groups = {"Sanity", "Regression"}, dataProvider = "FetchDealerdetails_InvalidFor_CD", dataProviderClass = DataProviderSource.class)
    public void  FetchDealerDetailsTest_InvalidFor_CD(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DealerDetailpojo DealerDetailpojo = new DealerDetailpojo(data.get("MUL_DEALER_CD") , data.get("FOR_CD") , data.get("PMC"));
    	String bodyData=jsonSerializer.serialize(DealerDetailpojo);    
    	FetchDealerDetails.Invalid_For_CD(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 200);
	    Assert.assertTrue(FetchDealerDetails.p_error_msg.equalsIgnoreCase("ORA-01403: no data found"), "Any Message ");				

    }
    
    @Test(priority = 18, groups = {"Sanity", "Regression"}, dataProvider = "FetchDealerdetails_BlankPMC", dataProviderClass = DataProviderSource.class)
    public void  FetchDealerDetailsTest_Blank_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DealerDetailpojo DealerDetailpojo = new DealerDetailpojo(data.get("MUL_DEALER_CD") , data.get("FOR_CD") , data.get("PMC"));
    	String bodyData=jsonSerializer.serialize(DealerDetailpojo);    
    	FetchDealerDetails.Blank_PMC(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 500);

    }
    
    @Test(priority = 19, groups = {"Sanity", "Regression"}, dataProvider = "FetchDealerdetails_InvalidPMC", dataProviderClass = DataProviderSource.class)
    public void  FetchDealerDetailsTest_Invalid_PMC(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	DealerDetailpojo DealerDetailpojo = new DealerDetailpojo(data.get("MUL_DEALER_CD") , data.get("FOR_CD") , data.get("PMC"));
    	String bodyData=jsonSerializer.serialize(DealerDetailpojo);    
    	FetchDealerDetails.Invalid_PMC(bodyData); 
        Assert.assertEquals(FetchDealerDetails.code, 500);

    }
}
