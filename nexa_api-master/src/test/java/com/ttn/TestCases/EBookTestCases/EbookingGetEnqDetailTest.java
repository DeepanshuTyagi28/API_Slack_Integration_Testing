/**
 * 
 */
package com.ttn.TestCases.EBookTestCases;

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
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.TestDriveBusinessLogic.MobileOpenEnq;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.TestCases.BookTestDriveTestCases.MobileOpenEnqTest;
import com.ttn.TestCases.BookTestDriveTestCases.TestDriveModeTest;
import com.ttn.pojoClasses.EbookingGetEnqDetailPojo;

/**
 * @author Akhilesh Kumar
 * @apiNote Test cases for ebooking
 *
 */
public class EbookingGetEnqDetailTest extends BaseLib {
	protected Logger logger = LoggerFactory.getLogger(MobileOpenEnqTest.class);

	/**
	 * @author Akhilesh Kumar
	 * @apiNote positive test case for ebooking
	 *
	 */
	@Test(groups = { "Sanity",
			"Regression","NEXA"}, dataProvider = "validInput_EbookingGetEnqDetailTest_Positive_Test", dataProviderClass = DataProviderSource.class)
	public void validInput_EbookingGetEnqDetailTest_Positive_Test(Hashtable<String, String> data)
			throws EncryptedDocumentException, IOException, SerializeException {

		String methodNameUsingClassInstance = new TestDriveModeTest() {
		}.getClass().getEnclosingMethod().getName();
		logger.info("Execution start of :" + methodNameUsingClassInstance);
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;

		EbookingGetEnqDetailPojo ebookingGetEnqDetailPojo = new EbookingGetEnqDetailPojo(
				Integer.parseInt(data.get("P_PMC")), data.get("P_MOBILE"), data.get("P_MUL_DEALER_CD"),
				data.get("P_FOR_CD"));
		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw, ebookingGetEnqDetailPojo);
		String bodyData = sw.toString();

		MobileOpenEnq.validInputMobileOpenEnq(bodyData);
		Assert.assertEquals(MobileOpenEnq.code, 200);
		logger.info("Expected status code 200");
		logger.info("Expected message : SUCCESS");
		Assert.assertEquals(MobileOpenEnq.message, "SUCCESS");
		logger.info("Ectual message :" + MobileOpenEnq.message);
		logger.info("Test case executed successfully");

	}

}
