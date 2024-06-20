package com.ttn.TestCases.LoyaltyTestCases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.LoyalityBusinessLogic.GetTiersBadges;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.pojoClasses.Tierpojo;



/**
 * @author Deepanshu Tyagi
 * This class is used to verify SP-GET-TIER-BADGES details functionality.
 */

// TC 1 :- Valid Tier
public class GetTiersBadgesTest extends BaseLib{
	
    @Test(priority = 10, groups = {"Sanity", "Regression"}, dataProvider = "GetTierBadges_ValidTier", dataProviderClass = DataProviderSource.class)
    public void GetTiersBadges_ValidTier(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Tierpojo Tierpojo = new Tierpojo(data.get("tier"));
    	String bodyData=jsonSerializer.serialize(Tierpojo);    	
    	GetTiersBadges.ValidTier(bodyData); 
        Assert.assertEquals(GetTiersBadges.code, 200);
        Assert.assertTrue(GetTiersBadges.TIER.equalsIgnoreCase(data.get("tier")), "Tier Mismatched");	


    }
    
    
    @Test(priority = 11, groups = {"Sanity", "Regression"}, dataProvider = "GetTierBadges_InvalidTier", dataProviderClass = DataProviderSource.class)
    public void GetTiersBadges_InvalidTier(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Tierpojo Tierpojo = new Tierpojo(data.get("tier"));
    	String bodyData=jsonSerializer.serialize(Tierpojo);    	
    	GetTiersBadges.InvalidTier(bodyData); 
        Assert.assertEquals(GetTiersBadges.code, 200);


    }
    
    @Test(priority = 12, groups = {"Sanity", "Regression"}, dataProvider = "GetTierBadges_BlankTier", dataProviderClass = DataProviderSource.class)
    public void GetTiersBadges_BlankTier(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;    	
    	Tierpojo Tierpojo = new Tierpojo(data.get("tier"));
    	String bodyData=jsonSerializer.serialize(Tierpojo);    	
    	GetTiersBadges.BlankTier(bodyData); 
        Assert.assertEquals(GetTiersBadges.code, 200);


    }
    
}
