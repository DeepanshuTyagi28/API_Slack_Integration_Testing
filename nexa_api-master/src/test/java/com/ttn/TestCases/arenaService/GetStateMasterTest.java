package com.ttn.TestCases.arenaService;

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
import com.ttn.BusinessLogic.ArenaService.GetStateMaster;
import com.ttn.BusinessLogic.Campaign.SendCampaignOTP;
import com.ttn.BusinessLogic.DMS.EnquiryGenerate;
import com.ttn.BusinessLogic.DealerFMP.DealerActiveEnquiry;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.CommonUtils.RandomNumber;
import com.ttn.pojoClasses.EnquiryGeneratePojo;
import com.ttn.pojoClasses.Mobilenumberspojo;
import com.ttn.pojoClasses.MspinPojo;
import com.ttn.pojoClasses.arenaService.GetStateMasterPojo;
/**
 * @author Deepanshu Tyagi
 * This class is used to Verify DMS Generate Enquiry
 */

//Method is used to Verify Functionality to Arena Services : Get State Master
    public class GetStateMasterTest extends BaseLib {

    @Test(groups = {"Sanity", "Regression" , "ARENA"}, dataProvider = "GetStateMaster_ValidInput", dataProviderClass = DataProviderSource.class)
    public void getStateMaster_ValidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	GetStateMasterPojo GetStateMasterPojo = new GetStateMasterPojo(data.get("P_PMC") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, GetStateMasterPojo);
        String bodyData=sw.toString();  
        GetStateMaster.validInput(bodyData);
        Assert.assertEquals(GetStateMaster.code, 200,"Status Code Validation Failed for Arena Service get State Master API");
    } 
    
	
  //Method is used to Verify Functionality to Arena Services : Get State Master with invalid Input

    @Test(groups = {"Sanity", "Regression" , "ARENA"}, dataProvider = "GetStateMaster_InvalidInput", dataProviderClass = DataProviderSource.class)
    public void getStateMaster_InvalidInput(Hashtable<String, String> data) throws EncryptedDocumentException, IOException, SerializeException
    {
    	GetStateMasterPojo GetStateMasterPojo = new GetStateMasterPojo(data.get("P_PMC") );	
    	ObjectMapper mapper = new ObjectMapper();
	    mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, GetStateMasterPojo);
        String bodyData=sw.toString();  
        GetStateMaster.invalidInput(bodyData);
        Assert.assertEquals(GetStateMaster.code, 200,"");
        Assert.assertEquals(GetStateMaster.message,  "Input string was not in a correct format.");
    } 
    
    }	
	