/**
 * 
 */
package com.ttn.TestCases;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Hashtable;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.juneau.serializer.SerializeException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.VehicleDetailsByMobileNumber;
import com.ttn.BusinessLogic.TestDriveBusinessLogic.MobileOpenEnq;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.TestCases.BookTestDriveTestCases.TestDriveModeTest;
import com.ttn.pojoClasses.MobOpenEnqPojo;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.slf4j.LoggerFactory;
import org.slf4j.*;

/**
 * @author Akhilesh Kumar
 * @since 12/07/2022
 * @see VehicleDetailsByMobileNumber
 * @about Test class for vehicleDetailsByMobileNumber
 */
public class VehicleDetailsByMobileNumberTest extends BaseLib {

	protected static Logger logtest = LoggerFactory.getLogger(VehicleDetailsByMobileNumberTest.class);

	@Test(groups = { "Sanity",
			"Regression","NEXA"  }, dataProvider = "validInput_MobileOpenEnqTest_Positive_Test", dataProviderClass = DataProviderSource.class, enabled = false)
	public void validInput_MobileOpenEnqTest_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logtest.info("Execution start of :" + methodNameUsingClassInstance);

		MobOpenEnqPojo mobOpenEnqPojo = new MobOpenEnqPojo(Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, mobOpenEnqPojo);
		String bodyData = sw.toString();

		MobileOpenEnq.validInputMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logtest.info("Expected status code 200");
		logtest.info("Expected message : SUCCESS");
		Assert.assertEquals(MobileOpenEnq.message, "SUCCESS");
		logtest.info("Ectual message :" + MobileOpenEnq.message);

		logtest.info("Test case executed successfully");

	}

	@Test(groups = { "Sanity",
			"Regression","NEXA"  }, dataProvider = "validInput_MobileOpenEnqTest_Positive_Test", dataProviderClass = DataProviderSource.class, enabled = false)
	public void invalidInput_MobileOpenEnqTest_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logtest.info("Execution start of :" + methodNameUsingClassInstance);

		MobOpenEnqPojo mobOpenEnqPojo = new MobOpenEnqPojo(Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"),
				data.get("P_MUL_DEALER_CD"), data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, mobOpenEnqPojo);
		String bodyData = sw.toString();

		MobileOpenEnq.validInputMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logtest.info("Expected status code 200");
		logtest.info("Expected message : SUCCESS");
		Assert.assertEquals(MobileOpenEnq.message, "SUCCESS");
		logtest.info("Ectual message :" + MobileOpenEnq.message);

		logtest.info("Test case executed successfully");

	}

}
