package com.ttn.CommonUtils;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;

public class DataProviderSource {

	protected static Logger logger = LoggerFactory.getLogger(DataProviderSource.class);

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);

		Object data[][] = DataProviderExcelReader.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Positive_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] BookTestDriveHyperEnquiryGenerateWithInValidCityNameTest(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("BookTestDriveHyperEnquiryGenerateWithInValidCityNameTest",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] BookTestDriveHyperEnquryGenerateNegativeBuyerTypeTest(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("BookTestDriveHyperEnquryGenerateNegativeBuyerTypeTest",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_used_refid__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_used_refid__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Model__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Model__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_with_wrong_deler_code__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_with_wrong_deler_code__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_with_p_Variant_Cd_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_with_p_Variant_Cd_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_with_wrong_name_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_with_wrong_name_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Source__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Source__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Mode__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_P_Enq_Mode__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Date__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Date__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Refid__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Without_Refid__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] BookTestDriveHyperEnquiryGenerateWithInValidStateNameTest(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("BookTestDriveHyperEnquiryGenerateWithInValidStateNameTest",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] BookTestDriveHyperEnquiryGenerateWithInValidAdressNameTest(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("BookTestDriveHyperEnquiryGenerateWithInValidAdressNameTest", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] BookTestDriveHyperEnquiryGenerateWithInValidAddress2NameTest(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("BookTestDriveHyperEnquiryGenerateWithInValidAddress2NameTest", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] BookTestDriveHyperEnquiryGenerateWithInValidCAddress3NameTest(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("BookTestDriveHyperEnquiryGenerateWithInValidCAddress3NameTest", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Flag__Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader
				.read_data("Book_Test_Drive_Hyper_Enqury_Genrate_Negative_Wrong_Flag__Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validSP_GET_LOYALITY_CUST_DETAILS_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validSP_GET_LOYALITY_CUST_DETAILS_Positive_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] invalidSP_GET_LOYALITY_CUST_DETAILS_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("invalidSP_GET_LOYALITY_CUST_DETAILS_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] getDetailsByUniqueId_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("getDetailsByUniqueId_Positive_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] schedule_Test_Drive_Positive_Input_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		Object data[][] = DataProviderExcelReader.read_data("schedule_Test_Drive_Positive_Input_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] schedule_Test_Drive_Positive_Input_Test1(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("schedule_Test_Drive_Positive_Input_Test1", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] schedule_Test_Drive_Negative_Input_PreBook_TimeSlot_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("schedule_Test_Drive_Negative_Input_PreBook_TimeSlot_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] schedule_Test_Drive_Negative_P_FOR_CD_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("schedule_Test_Drive_Negative_P_FOR_CD_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] mobile_Testdrive_Test_Positive_Input_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("mobile_Testdrive_Test_Positive_Input_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] mobile_Testdrive_Test_Negative_P_MOBILE_Input_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("mobile_Testdrive_Test_Negative_P_MOBILE_Input_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] mobile_Testdrive_Test_Negative_P_PMC_Input_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("mobile_Testdrive_Test_Negative_P_PMC_Input_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] mobile_Testdrive_Test_Negative_Blanck_Input_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("mobile_Testdrive_Test_Negative_Blanck_Input_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Positive_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Appnt_type_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Appnt_type_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Dealer_Cd_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Dealer_Cd_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Loc_Cd_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Loc_Cd_Negative_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Loc_Cd_Blank_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Loc_Cd_Blank_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_User_Id_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_User_Id_Negative_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_User_Id_Blank_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_User_Id_Blank_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Reg_Num_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Reg_Num_Negative_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Reg_Blank_Num_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Reg_Blank_Num_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Srvtype_Cd_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Srvtype_Cd_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Currentsa_Cd_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Currentsa_Cd_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Slot_Cd_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Slot_Cd_Negative_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Slottime_Cd_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Slottime_Cd_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_Pickuptype_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_Pickuptype_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] insert_Napptn_Detail_Pn_PickuptimeNegative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("insert_Napptn_Detail_Pn_PickuptimeNegative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] spGetTierBadgesTest_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("spGetTierBadgesTest_Positive_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] spGetTierBadgesTest_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("spGetTierBadgesTest_Negative_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] spGetTierBadgesBlankNegative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("spGetTierBadgesBlankNegative_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_With_PVinNum_GetTestDriveSlot_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_With_PVinNum_GetTestDriveSlot_Positive_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_Without_PVinNum_GetTestDriveSlot_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_Without_PVinNum_GetTestDriveSlot_Positive_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_Wit_P_MSPIN_GetTestDriveSlot_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_Wit_P_MSPIN_GetTestDriveSlot_Positive_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_Without_Date_GetTestDriveSlot_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_Without_Date_GetTestDriveSlot_Positive_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_TestDriveModeTest_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_TestDriveModeTest_Positive_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_TestDriveModeTest_P_MSPIN_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_TestDriveModeTest_P_MSPIN_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_TestDriveModeTest_P_USER_ID_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_TestDriveModeTest_P_USER_ID_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_MobileOpenEnqTest_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_MobileOpenEnqTest_Positive_Test", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] invalidInput_MobileOpenEnqTest_P_FOR_CD_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("invalidInput_MobileOpenEnqTest_P_FOR_CD_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] invalidInput_MobileOpenEnqTest_P_PMC_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("invalidInput_MobileOpenEnqTest_P_PMC_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] invalidInput_MobileOpenEnq_P_MOBILE_Blank_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("invalidInput_MobileOpenEnq_P_MOBILE_Blank_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] invalidInput_MobileOpenEnq_P_MOBILE_Negative_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("invalidInput_MobileOpenEnq_P_MOBILE_Negative_Test",
				SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] validInput_EbookingGetEnqDetailTest_Positive_Test(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("validInput_EbookingGetEnqDetailTest_Positive_Test",
				SheetName);

		return data;
	}

	////////////////////////////

	@org.testng.annotations.DataProvider
	public Object[][] CheckLoyaltyCustomer_ExistingCustomer(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckLoyaltyCustomer_ExistingCustomer", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] CheckLoyaltyCustomer_NonExistingCustomer(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckLoyaltyCustomer_NonExistingCustomer", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] CheckLoyaltyCustomer_Invalidinput(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckLoyaltyCustomer_Invalidinput", SheetName);

		return data;
	}

/////////////////////////////////
	// SP-CHECK-MARUTI-OWNER API

	@org.testng.annotations.DataProvider
	public Object[][] CheckMarutiOwner_ExistingCustomer_Input(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckMarutiOwner_ExistingCustomer_Input", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] CheckMarutiOwner_NonExistingCustomer_Input(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckMarutiOwner_NonExistingCustomer_Input", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] CheckMarutiOwner_Invalid_Input(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckMarutiOwner_Invalid_Input", SheetName);

		return data;
	}

	// check msil Customer

	@org.testng.annotations.DataProvider
	public Object[][] CheckMSILCustomer_ExistingCustomer(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckMSILCustomer_ExistingCustomer", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] CheckMSILCustomer_NonExistingCustomer(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckMSILCustomer_NonExistingCustomer", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] CheckMSILCustomer_InvalidInputtype(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("CheckMSILCustomer_InvalidInputtype", SheetName);

		return data;
	}

	// FetchDealerDetailsTest

	@org.testng.annotations.DataProvider
	public Object[][] FetchDealerdetails_ValidInput(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchDealerdetails_ValidInput", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] FetchDealerdetails_BlankDealerCode(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchDealerdetails_BlankDealerCode", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] FetchDealerdetails_InvalidDealerCode(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchDealerdetails_InvalidDealerCode", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] FetchDealerdetails_BlankFor_CD(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchDealerdetails_BlankFor_CD", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] FetchDealerdetails_InvalidFor_CD(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchDealerdetails_InvalidFor_CD", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] FetchDealerdetails_BlankPMC(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchDealerdetails_BlankPMC", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] FetchDealerdetails_InvalidPMC(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchDealerdetails_InvalidPMC", SheetName);

		return data;
	}
	// GenerateEnqiryTest

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_ValidInput", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Blank_mul_dlr_code(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Blank_mul_dlr_code", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Invalid_mul_dlr_code(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Invalid_mul_dlr_code", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Blank_for_cd(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Blank_for_cd", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Invalid_for_cd(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Invalid_for_cd", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Invalid_buyer_type(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Invalid_buyer_type", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Blank_ref_type(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Blank_ref_type", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Invalid_ref_type(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Invalid_ref_type", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Blank_model_cd(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Blank_model_cd", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Invalid_model_cd(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Invalid_model_cd", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Blank_variant_cd(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Blank_variant_cd", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Blank_color_cd(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Blank_color_cd", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GenerateEnquiry_Existing_transaction_id(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GenerateEnquiry_Existing_transaction_id", SheetName);

		return data;
	}

	// Get MSGA

	@org.testng.annotations.DataProvider
	public Object[][] STest_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("STest_ValidInput", SheetName);

		return data;
	}

	// get card Transaction

	@org.testng.annotations.DataProvider
	public Object[][] GetCardTransaction_ExistingCard(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetCardTransaction_ExistingCard", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetCardTransaction_NonExistingCard(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetCardTransaction_NonExistingCard", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetCardTransaction_InvalidCard(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetCardTransaction_InvalidCard", SheetName);

		return data;
	}

	// get tier details by id

	@org.testng.annotations.DataProvider
	public Object[][] GetTierDetailsBYID_ValidTier(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierDetailsBYID_ValidTier", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetTierDetailsBYID_BlankTier(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierDetailsBYID_BlankTier", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetTierDetailsBYID_InvalidTier(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierDetailsBYID_InvalidTier", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetTierDetailsBYID_Valid_category(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierDetailsBYID_Valid_category", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetTierDetailsBYID_Invalid_category(ITestContext context)
			throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierDetailsBYID_Invalid_category", SheetName);

		return data;
	}
	// get TiersBadgesTest

	@org.testng.annotations.DataProvider
	public Object[][] GetTierBadges_ValidTier(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierBadges_ValidTier", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetTierBadges_InvalidTier(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierBadges_InvalidTier", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] GetTierBadges_BlankTier(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("GetTierBadges_BlankTier", SheetName);

		return data;
	}
	// LoyaltyCustomerDetailsTest

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_ValidInput", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_BlankRegMobile(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_BlankRegMobile", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_InvalidRegMobile(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_InvalidRegMobile", SheetName);

		return data;
	}
	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_BlankEmail(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_BlankEmail", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_Blank_card_issu_parent(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_Blank_card_issu_parent", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_Blank_card_issu_dlr_map_cd(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_Blank_card_issu_dlr_map_cd", SheetName);

		return data;
	}
	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_Blank_card_issu_loc_cd(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_Blank_card_issu_loc_cd", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_Blank_card_vin(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_Blank_card_vin", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_Blank_user_id(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_Blank_user_id", SheetName);

		return data;
	}
	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_Blank_OS_Type(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_Blank_OS_Type", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_InvalidVIN(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_InvalidVIN", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] SaveEnrollmentForm_IncorrectMapping(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SaveEnrollmentForm_IncorrectMapping", SheetName);

		return data;
	}
	@org.testng.annotations.DataProvider
	public Object[][] LoyaltyCustomerDetails_ExistingCard(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("LoyaltyCustomerDetails_ExistingCard", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] LoyaltyCustomerDetails_NonExistingCard(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("LoyaltyCustomerDetails_NonExistingCard", SheetName);

		return data;
	}

	@org.testng.annotations.DataProvider
	public Object[][] LoyaltyCustomerDetails_InValidCard(ITestContext context) throws EncryptedDocumentException, IOException {

		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("LoyaltyCustomerDetails_InValidCard", SheetName);

		return data;
	}
	
	
	
	
///////////ARENA TC DATA PROVIDERS
	
//FMP_SEND OTP

@org.testng.annotations.DataProvider
public Object[][] SendOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("SendOTP_ValidInput",SheetName);
	return data;
} 

@org.testng.annotations.DataProvider
public Object[][] SendOTP_Blank_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("SendOTP_Blank_MobileNumber",SheetName);
	return data;
} 


@org.testng.annotations.DataProvider
public Object[][] SendOTP_Invalid_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("SendOTP_Invalid_MobileNumber",SheetName);
	return data;
} 

@org.testng.annotations.DataProvider
public Object[][] SendOTP_Blank_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("SendOTP_Blank_Channel",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] SendOTP_Invalid_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("SendOTP_Invalid_Channel",SheetName);
	return data;
}
//Fetch OTP

@org.testng.annotations.DataProvider
public Object[][] FetchOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("FetchOTP_ValidInput",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] FetchOTP_InvalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("FetchOTP_InvalidInput",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] FetchOTP_UnGeneratedMobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("FetchOTP_UnGeneratedMobileNumber",SheetName);
	return data;
}

// Verify OTP

@org.testng.annotations.DataProvider
public Object[][] VerifyOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("VerifyOTP_ValidInput",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] VerifyOTP_AlredayVerifiedOTP(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("VerifyOTP_AlredayVerifiedOTP",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] VerifyOTP_Invalid_OTP_FORMAT(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("VerifyOTP_Invalid_OTP_FORMAT",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] VerifyOTP_Invalid_OTP(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("VerifyOTP_Invalid_OTP",SheetName);
	return data;
}


// ACTIVE ENQUIRY

@org.testng.annotations.DataProvider
public Object[][] ActiveEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("ActiveEnquiry_ValidInput",SheetName);
	return data;
}


@org.testng.annotations.DataProvider
public Object[][] ActiveEnquiry_Blank_AuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("ActiveEnquiry_Blank_AuthToken",SheetName);
	return data;
}


@org.testng.annotations.DataProvider
public Object[][] ActiveEnquiry_Invalid_AuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("ActiveEnquiry_Invalid_AuthToken",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] ActiveEnquiry_Blank_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("ActiveEnquiry_Blank_MobileNumber",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] ActiveEnquiry_Invalid_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("ActiveEnquiry_Invalid_MobileNumber",SheetName);
	return data;
}

// Search City 

@org.testng.annotations.DataProvider
public Object[][] Searchcity_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("Searchcity_ValidInput",SheetName);
	return data;
}	
@org.testng.annotations.DataProvider
public Object[][] Searchcity_Blank_search_text(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("Searchcity_Blank_search_text",SheetName);
	return data;
}	
@org.testng.annotations.DataProvider
public Object[][] Searchcity_Blank_search_text_ShortLength(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("Searchcity_Blank_search_text_ShortLength",SheetName);
	return data;
}	
@org.testng.annotations.DataProvider
public Object[][] Searchcity_Blank_financier_id(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("Searchcity_Blank_financier_id",SheetName);
	return data;
}	
@org.testng.annotations.DataProvider
public Object[][] Searchcity_Invalid_financier_id(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("Searchcity_Invalid_financier_id",SheetName);
	return data;
}



// Search City  Branch

@org.testng.annotations.DataProvider
public Object[][] CityBranchSearch_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CityBranchSearch_ValidInput",SheetName);
	return data;
}	

@org.testng.annotations.DataProvider
public Object[][] CityBranchSearch_Blank_search_text(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CityBranchSearch_Blank_search_text",SheetName);
	return data;
}	

@org.testng.annotations.DataProvider
public Object[][] CityBranchSearch_Blank_search_text_ShortLength(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CityBranchSearch_Blank_search_text_ShortLength",SheetName);
	return data;
}	

@org.testng.annotations.DataProvider
public Object[][] CityBranchSearch_Blank_financier_id(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CityBranchSearch_Blank_financier_id",SheetName);
	return data;
}	

@org.testng.annotations.DataProvider
public Object[][] CityBranchSearch_Invalid_financier_id(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CityBranchSearch_Invalid_financier_id",SheetName);
	return data;
}	
@org.testng.annotations.DataProvider
public Object[][] CityBranchSearch_Blank_City(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CityBranchSearch_Blank_City",SheetName);
	return data;
}


// PriceSummary/CompanyOffers

@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_ValidInput",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Blank_dealer_code(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Blank_dealer_code",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Invalid_dealer_code(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Invalid_dealer_code",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Blank_variant_code(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Blank_variant_code",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Invalid_variant_code(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Invalid_variant_code",SheetName);
	return data;
}

@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Blank_model_code(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Blank_model_code",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Invalid_model_code(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Invalid_model_code",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Blank_company_id(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Blank_company_id",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Invalid_company_id(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Invalid_company_id",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Blank_fuel_type(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Blank_fuel_type",SheetName);
	return data;
}
@org.testng.annotations.DataProvider
public Object[][] CompanyOffer_Invalid_fuel_type(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanyOffer_Invalid_fuel_type",SheetName);
	return data;
}


// PriceSummary/CompanySearch

@org.testng.annotations.DataProvider
public Object[][] CompanySearch_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanySearch_ValidInput",SheetName);
	return data;
}


@org.testng.annotations.DataProvider
public Object[][] CompanySearch_InvalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
	String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
	logger.info("Data file is :" + SheetName);
	Object data[][] = DataProviderExcelReader.read_data("CompanySearch_InvalidInput",SheetName);
	return data;
}




//FMP_SEND CAMPAIGN OTP

	@org.testng.annotations.DataProvider
	public Object[][] SendCampaignOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SendCampaignOTP_ValidInput",SheetName);
		return data;
	} 

	@org.testng.annotations.DataProvider
	public Object[][] SendCampaignOTP_Blank_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SendCampaignOTP_Blank_MobileNumber",SheetName);
		return data;
	} 
	

	@org.testng.annotations.DataProvider
	public Object[][] SendCampaignOTP_Invalid_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SendCampaignOTP_Invalid_MobileNumber",SheetName);
		return data;
	} 

	@org.testng.annotations.DataProvider
	public Object[][] SendCampaignOTP_Blank_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SendCampaignOTP_Blank_Channel",SheetName);
		return data;
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] SendCampaignOTP_Invalid_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("SendCampaignOTP_Invalid_Channel",SheetName);
		return data;
	}
	
	
// Fetch Campaign OTP	
	
	@org.testng.annotations.DataProvider
	public Object[][] FetchCampaignOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchCampaignOTP_ValidInput",SheetName);
		return data;
	} 

	@org.testng.annotations.DataProvider
	public Object[][] FetchCampaignOTP_InvalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchCampaignOTP_InvalidInput",SheetName);
		return data;
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] FetchCampaignOTP_UnGeneratedMobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("FetchCampaignOTP_UnGeneratedMobileNumber",SheetName);
		return data;
	}
	
	
	
	
	
// Verify Campaign OTP	
	
	@org.testng.annotations.DataProvider
	public Object[][] VerifyCampaignOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("VerifyCampaignOTP_ValidInput",SheetName);
		return data;
	} 

	@org.testng.annotations.DataProvider
	public Object[][] VerifyCampaignOTP_AlredayVerifiedOTP(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("VerifyCampaignOTP_AlredayVerifiedOTP",SheetName);
		return data;
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] VerifyCampaignOTP_Invalid_OTP_FORMAT(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("VerifyCampaignOTP_Invalid_OTP_FORMAT",SheetName);
		return data;
	}
	@org.testng.annotations.DataProvider
	public Object[][] VerifyCampaignOTP_Invalid_OTP(ITestContext context) throws EncryptedDocumentException, IOException {
		String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
		logger.info("Data file is :" + SheetName);
		Object data[][] = DataProviderExcelReader.read_data("VerifyCampaignOTP_Invalid_OTP",SheetName);
		return data;
	}
	
	
	
	// Verify Active Campaign Enquiry	
	
			@org.testng.annotations.DataProvider
			public Object[][] ActiveCampaignEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ActiveCampaignEnquiry_ValidInput",SheetName);
				return data;
			} 

			@org.testng.annotations.DataProvider
			public Object[][] ActiveCampaignEnquiry_Blank_AuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ActiveCampaignEnquiry_Blank_AuthToken",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] ActiveCampaignEnquiry_Invalid_AuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ActiveCampaignEnquiry_Invalid_AuthToken",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ActiveCampaignEnquiry_Blank_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ActiveCampaignEnquiry_Blank_MobileNumber",SheetName);
				return data;
			}	
			@org.testng.annotations.DataProvider
			public Object[][] ActiveCampaignEnquiry_Invalid_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ActiveCampaignEnquiry_Invalid_MobileNumber",SheetName);
				return data;
			}	
	

			
			
			// Switch campaign Token	
			
			@org.testng.annotations.DataProvider
			public Object[][] SwitchTokenCampaign_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SwitchTokenCampaign_ValidInput",SheetName);
				return data;
			} 

			@org.testng.annotations.DataProvider
			public Object[][] SwitchTokenCampaign_Blank_AuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SwitchTokenCampaign_Blank_AuthToken",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] SwitchTokenCampaign_Invalid_AuthToken(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SwitchTokenCampaign_Invalid_AuthToken",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SwitchTokenCampaign_Blank_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SwitchTokenCampaign_Blank_MobileNumber",SheetName);
				return data;
			}	
			@org.testng.annotations.DataProvider
			public Object[][] SwitchTokenCampaign_Invalid_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SwitchTokenCampaign_Invalid_MobileNumber",SheetName);
				return data;
			}	
			
			@org.testng.annotations.DataProvider
			public Object[][] SwitchTokenCampaign_Blank_channel_id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SwitchTokenCampaign_Blank_channel_id",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] SwitchTokenCampaign_Invalid_channel_id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SwitchTokenCampaign_Invalid_channel_id",SheetName);
				return data;
			}
			
			
   //  Customer Enquiry			
	
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_ValidInput",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_FirstName(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_FirstName",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_FirstName(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_FirstName",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Email(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Email",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Email(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Email",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Mobile",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_DOB(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_DOB",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_DOB(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_DOB",SheetName);
				return data;
			}		
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_city(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_city",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_city(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_city",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_state(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_state",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_State(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_State",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Dealer(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Dealer",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Dealer(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Dealer",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Car_model(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Car_model",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Car_model(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Car_model",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Car_Variant(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Car_Variant",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Car_Variant(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Car_Variant",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Disclaimer_Flag(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Disclaimer_Flag",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Disclaimer_Flag(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Disclaimer_Flag",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Channel",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Channel",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Color_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Color_Code",SheetName);
				return data;
			}		
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Color_Description(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Color_Description",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Color_Indicator(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Color_Indicator",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Color_Indicator(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Color_Indicator",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Blank_Fuel_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Blank_Fuel_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerEnquiry_Invalid_Fuel_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CustomerEnquiry_Invalid_Fuel_Type",SheetName);
				return data;
			}				
			
			
			
			// Dealer FMP SEND OTP 
			
			@org.testng.annotations.DataProvider
			public Object[][] SendDealerFMPOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SendDealerFMPOTP_ValidInput",SheetName);
				return data;
			}	
			
			@org.testng.annotations.DataProvider
			public Object[][] SendDealerFMPOTP_InvalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SendDealerFMPOTP_InvalidInput",SheetName);
				return data;
			}	
			
			
		// verify Dealer OTP	
			
			@org.testng.annotations.DataProvider
			public Object[][] VerifyDealerFMPOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("VerifyDealerFMPOTP_ValidInput",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] VerifyDealerFMPOTP_Blank_MSPIN(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("VerifyDealerFMPOTP_Blank_MSPIN",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] VerifyDealerFMPOTP_Invalid_MSPIN(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("VerifyDealerFMPOTP_Invalid_MSPIN",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] VerifyDealerFMPOTP_Blank_OTP(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("VerifyDealerFMPOTP_Blank_OTP",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] VerifyDealerFMPOTP_Invalid_OTP(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("VerifyDealerFMPOTP_Invalid_OTP",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] VerifyDealerFMPOTP_Invalid_OTP_Format(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("VerifyDealerFMPOTP_Invalid_OTP_Format",SheetName);
				return data;
			}
			
			//Akhliesh Data Provider Added
			@org.testng.annotations.DataProvider
			public Object[][] vehicle_Details_with_Reg_No_Stage_Test(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("vehicle_Details_with_Reg_No_Stage_Test",SheetName);
				return data;
			}
			
            //FMP DEALER Active Enquiry
			@org.testng.annotations.DataProvider
			public Object[][] DealerActiveEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("DealerActiveEnquiry_ValidInput",SheetName);
				return data;
			}	
			
			@org.testng.annotations.DataProvider
			public Object[][] DealerActiveEnquiry_Blank_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("DealerActiveEnquiry_Blank_Mobile",SheetName);
				return data;
			}

	          //   DMS ARENA Enquiry Generate
			
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_ExistingEnquiry(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_ExistingEnquiry",SheetName);
				return data;
			}	
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_web_refid(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_web_refid",SheetName);
				return data;
			}	
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_book_date(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_book_date",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Invalid_P_book_flag(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Invalid_P_book_flag",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_tittle(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_tittle",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_Cust_first_name(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_Cust_first_name",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_Model_cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_Model_cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Invalid_P_Model_cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Invalid_P_Model_cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_Variant_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_Variant_Cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Invalid_P_Variant_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Invalid_P_Variant_Cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_Color(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_Color",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Invalid_P_Color(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Invalid_P_Color",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_Dealer_code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_Dealer_code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Invalid_P_Dealer_code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Invalid_P_Dealer_code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_for_code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_for_code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Invalid_P_for_code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Invalid_P_for_code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_Blank_P_customer_type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_Blank_P_customer_type",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] EnquiryGenerate_ValidInput_LostStatusEnquiry(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EnquiryGenerate_ValidInput_LostStatusEnquiry",SheetName);
				return data;
			}
			
			
			// DMS Enquiry Cancellation
			
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_Blank_P_dealer_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_Blank_P_dealer_Cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_Invalid_P_dealer_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_Invalid_P_dealer_Cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_Blank_P_for_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_Blank_P_for_Cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_Invalid_P_for_Cd(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_Invalid_P_for_Cd",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_Blank_P_flag(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_Blank_P_flag",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_Invalid_P_flag(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_Invalid_P_flag",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookingCancel_ValidInput_LostStatus(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookingCancel_ValidInput_LostStatus",SheetName);
				return data;
			}
			
			
			
			//  Download Sanction Letter -Send OTP
			
			@org.testng.annotations.DataProvider
			public Object[][] SendOTP_DownloadSanctionLetter(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SendOTP_DownloadSanctionLetter",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] FetchOTP_DownloadSanctionLetter(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("FetchOTP_DownloadSanctionLetter",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] VerifyOTP_DownloadSanctionLetter(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("VerifyOTP_DownloadSanctionLetter",SheetName);
				return data;
			}
			
			
			// E Book Status 
			
			@org.testng.annotations.DataProvider
			public Object[][] EBookStatus_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookStatus_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookStatus_Blank_WebBookingRef(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookStatus_Blank_WebBookingRef",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookStatus_Invalid_WebBookingRef(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookStatus_Invalid_WebBookingRef",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] EBookStatus_ValidInput_LostStatusEnquiry(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("EBookStatus_ValidInput_LostStatusEnquiry",SheetName);
				return data;
			}
// Loan Submission
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_ValidInput",SheetName);
				return data;
			}
			
//Selected Car			
			
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_EnquiryID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_EnquiryID",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_EnquiryID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_EnquiryID",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_color_description(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_color_description",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Color_Indicator(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Color_Indicator",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Color_Indicator(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Color_Indicator",SheetName);
				return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Customer_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Customer_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Customer_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Customer_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Buyer_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Buyer_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Buyer_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Buyer_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Sales_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Sales_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Sales_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Sales_Type",SheetName);
				return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Fuel_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Fuel_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Fuel_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Fuel_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_AC_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_AC_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_AC_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_AC_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Dealer_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Dealer_Code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Dealer_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Dealer_Code",SheetName);
				return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Model_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Model_Code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Model_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Model_Code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Variant_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Variant_Code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_Variant_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_Variant_Code",SheetName);
				return data;
			}	
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_State_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_State_Code",SheetName);
				return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_State_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_State_Code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_Color_Code(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_Color_Code",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_On_Road_Price(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_On_Road_Price",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_On_Road_Price(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_On_Road_Price",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Blank_TCS(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Blank_TCS",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SelectedCar_Invalid_TCS(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SelectedCar_Invalid_TCS",SheetName);
				return data;
			}	
			
			
	// Primary App Personal Details		
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Enquiry_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Enquiry_Id",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Invalid_Enquiry_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Invalid_Enquiry_Id",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_mobile",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Invalid_mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Invalid_mobile",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_auth_mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_auth_mobile",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Invalid_auth_mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Invalid_auth_mobile",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Credit_Check_Flag(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Credit_Check_Flag",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Employment_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Employment_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_City(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_City",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Residence_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Residence_Type",SheetName);
				return data;
			}
			
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Annual_Salary(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Annual_Salary",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_State(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_State",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_First_Name(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_First_Name",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Email(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Email",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Work_Experience_Years(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Work_Experience_Years",SheetName);
				return data;
			}	
			
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Car_Model(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Car_Model",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Sub_Employment_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Sub_Employment_Id",SheetName);
				return data;
			}

			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Car_Variant(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Car_Variant",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Pan_Number(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Pan_Number",SheetName);
				return data;
			}	
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Dealer(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Dealer",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] PrimaryAppPersonalDetail_Blank_Net_Annual_Income(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("PrimaryAppPersonalDetail_Blank_Net_Annual_Income",SheetName);
				return data;
			}
			
	// Loan Applicant API
			
			@org.testng.annotations.DataProvider
			public Object[][] LoanApplicant_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("LoanApplicant_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] LoanApplicant_Blank_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("LoanApplicant_Blank_EnqID",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] LoanApplicant_Invalid_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("LoanApplicant_Invalid_EnqID",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] LoanApplicant_Blank_financier_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("LoanApplicant_Blank_financier_Id",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] LoanApplicant_Invalid_financier_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("LoanApplicant_Invalid_financier_Id",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] LoanApplicant_Blank_is_co_applicant_journey(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("LoanApplicant_Blank_is_co_applicant_journey",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] LoanApplicant_Invalid_is_co_applicant_journey(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("LoanApplicant_Invalid_is_co_applicant_journey",SheetName);
				return data;
			}
			
			
			
			
	// Check Loan offer API
			
			@org.testng.annotations.DataProvider
			public Object[][] CheckLoanOffer_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CheckLoanOffer_ValidInput",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CheckLoanOffer_Blank_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CheckLoanOffer_Blank_EnqID",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CheckLoanOffer_Invalid_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CheckLoanOffer_Invalid_EnqID",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CheckLoanOffer_Blank_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CheckLoanOffer_Blank_Mobile",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CheckLoanOffer_Invalid_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CheckLoanOffer_Invalid_Mobile",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CheckLoanOffer_Blank_interest_rate(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CheckLoanOffer_Blank_interest_rate",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] CheckLoanOffer_Invalid_interest_rate(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("CheckLoanOffer_Invalid_interest_rate",SheetName);
				return data;
			}
			
	// Apply Loan API		
			
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Blank_loan_Amount(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Blank_loan_Amount",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Invalid_loan_Amount(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Invalid_loan_Amount",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Blank_loan_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Blank_loan_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Invalid_loan_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Invalid_loan_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Blank_Tenure(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Blank_Tenure",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Invalid_Tenure(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Invalid_Tenure",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Blank_Processing_Fee(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Blank_Processing_Fee",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Invalid_Processing_Fee(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Invalid_Processing_Fee",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Blank_EMI(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Blank_EMI",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] ApplyLoan_Invalid_EMI(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("ApplyLoan_Invalid_EMI",SheetName);
				return data;
			}
			
			// Save Aadhar Consent 
			
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Blank_Applicant_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Blank_Applicant_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Invalid_Applicant_Type(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Invalid_Applicant_Type",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Blank_language(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Blank_language",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Blank_Content(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Blank_Content",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Blank_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Blank_EnqID",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Invalid_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Invalid_EnqID",SheetName);
				return data;
			}
			
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Blank_Consent(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Blank_Consent",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Invalid_Consent(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Invalid_Consent",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Blank_Doc_Type_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Blank_Doc_Type_Id",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Invalid_Doc_Type_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Invalid_Doc_Type_Id",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Blank_User_IP(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Blank_User_IP",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveAadharConsent_Invalid_User_IP(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveAadharConsent_Invalid_User_IP",SheetName);
				return data;
			}
			
			
	           // All Offer API
			
			@org.testng.annotations.DataProvider
			public Object[][] AllOffer_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("AllOffer_ValidInput",SheetName);
				return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] AllOffer_Blank_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("AllOffer_Blank_EnqID",SheetName);
				return data;
			}		
			@org.testng.annotations.DataProvider
			public Object[][] AllOffer_Invalid_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("AllOffer_Invalid_EnqID",SheetName);
				return data;
			}
			
			
          // Co Applicant Save Selected Offer 
			
			@org.testng.annotations.DataProvider
			public Object[][] SaveSelectedOffer_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveSelectedOffer_ValidInput",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveSelectedOffer_Blank_Financier_Id(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveSelectedOffer_Blank_Financier_Id",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveSelectedOffer_Blank_Financier_Name(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveSelectedOffer_Blank_Financier_Name",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveSelectedOffer_Blank_DownPayment(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveSelectedOffer_Blank_DownPayment",SheetName);
				return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] SaveSelectedOffer_Blank_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
				String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
				logger.info("Data file is :" + SheetName);
				Object data[][] = DataProviderExcelReader.read_data("SaveSelectedOffer_Blank_Mobile",SheetName);
				return data;
			}
			
			
			
			// CO Applicant Customer Detail Salaried 
			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerDetail_ValidInput_Salaried(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CustomerDetail_ValidInput_Salaried",SheetName);
			return data;
			}				
			@org.testng.annotations.DataProvider
			public Object[][] CustomerDetail_ValidInput_SelfEmployed(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CustomerDetail_ValidInput_SelfEmployed",SheetName);
			return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerDetail_ValidInput_NIS(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CustomerDetail_ValidInput_NIS",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CustomerDetail_Blank_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CustomerDetail_Blank_EnqID",SheetName);
			return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] CustomerDetail_Blank_AuthMobile(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CustomerDetail_Blank_AuthMobile",SheetName);
			return data;
			}
			
	    	// Arena Services  Get State Master
			
			@org.testng.annotations.DataProvider
			public Object[][] GetStateMaster_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("GetStateMaster_ValidInput",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] GetStateMaster_InvalidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("GetStateMaster_InvalidInput",SheetName);
			return data;
			}
			
			
			
			// Send OTP CO-Applicant Journey
			
			@org.testng.annotations.DataProvider
			public Object[][] SendOTP_CoApplicantJourney(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("SendOTP_CoApplicantJourney",SheetName);
			return data;
			}	
			
			//Fetch CO-Applicant OTP
			@org.testng.annotations.DataProvider
			public Object[][] FetchOTP_CoApplicantCustomerJourney(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("FetchOTP_CoApplicantCustomerJourney",SheetName);
			return data;
			}	
			
			//Verify/Token Generation CO-Applicant OTP
			@org.testng.annotations.DataProvider
			public Object[][] VerifyOTP_CoApplicantCustomerJourney(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("VerifyOTP_CoApplicantCustomerJourney",SheetName);
			return data;
			}
			
			// CO-Applicant CREATE ENQUIRY
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantCreateEnquiry_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantCreateEnquiry_ValidInput",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantCreateEnquiry_Blank_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantCreateEnquiry_Blank_MobileNumber",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantCreateEnquiry_Invalid_MobileNumber(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantCreateEnquiry_Invalid_MobileNumber",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantCreateEnquiry_Blank_CarModel(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantCreateEnquiry_Blank_CarModel",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantCreateEnquiry_Blank_CarVariant(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantCreateEnquiry_Blank_CarVariant",SheetName);
			return data;
			}
			
			
			// Validate CoApllicant OTP
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantValidateOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantValidateOTP_ValidInput",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantValidateOTP_Blank_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantValidateOTP_Blank_Mobile",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantValidateOTP_Invalid_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantValidateOTP_Invalid_Mobile",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantValidateOTP_Blank_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantValidateOTP_Blank_Channel",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantValidateOTP_Invalid_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantValidateOTP_Invalid_Channel",SheetName);
			return data;
			}		@org.testng.annotations.DataProvider
			public Object[][] CoApplicantValidateOTP_Blank_OTP(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantValidateOTP_Blank_OTP",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantValidateOTP_Invalid_OTP(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantValidateOTP_Invalid_OTP",SheetName);
			return data;
			}
			
			
			// CoApplicant Selected Car
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantSelectedCar_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantSelectedCar_ValidInput",SheetName);
			return data;
			}	
			
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantSelectedCar_BlankEnquiryID(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantSelectedCar_BlankEnquiryID",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantSelectedCar_InvalidEnquiryID(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantSelectedCar_InvalidEnquiryID",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantSelectedCar_Blank_StateCode(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantSelectedCar_Blank_StateCode",SheetName);
			return data;
			}
			
			
			
			
	       // CoApplicant Check Enquiry Using Mobile Number		
			
			@org.testng.annotations.DataProvider
			public Object[][] CheckCoApplicant_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CheckCoApplicant_ValidInput",SheetName);
			return data; 
			}
			@org.testng.annotations.DataProvider
			public Object[][] CheckCoApplicant_Blank_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CheckCoApplicant_Blank_Channel",SheetName);
			return data; 
			}
			@org.testng.annotations.DataProvider
			public Object[][] CheckCoApplicant_Invalid_Channel(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CheckCoApplicant_Invalid_Channel",SheetName);
			return data; 
			}
			@org.testng.annotations.DataProvider
			public Object[][] CheckCoApplicant_Blank_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CheckCoApplicant_Blank_Mobile",SheetName);
			return data; 
			}
			@org.testng.annotations.DataProvider
			public Object[][] CheckCoApplicant_Invalid_Mobile(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CheckCoApplicant_Invalid_Mobile",SheetName);
			return data; 
			}
			
			
			
			
			
			public Object[][] ValidateCoApplicantOTP_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("ValidateCoApplicantOTP_ValidInput",SheetName);
			return data;
			}
			
			//CoApllicant Save Loan App Customer
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantSaveLoanAppCustomer_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantSaveLoanAppCustomer_ValidInput",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantSaveLoanAppCustomer_InvalidEnqID(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantSaveLoanAppCustomer_InvalidEnqID",SheetName);
			return data;
			}
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantSaveLoanAppCustomer_Blank_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantSaveLoanAppCustomer_Blank_EnqID",SheetName);
			return data;
			}
			
			
			//CoApllicant Loan Submission 
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantLoanSubmission_ValidInput(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantLoanSubmission_ValidInput",SheetName);
			return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantLoanSubmission_Blank_EnqID(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantLoanSubmission_Blank_EnqID",SheetName);
			return data;
			}			
			@org.testng.annotations.DataProvider
			public Object[][] CoApplicantLoanSubmission_Blank_Financier_Id(ITestContext context) throws EncryptedDocumentException, IOException {
			String SheetName = context.getCurrentXmlTest().getParameter("SheetName");
			logger.info("Data file is :" + SheetName);
			Object data[][] = DataProviderExcelReader.read_data("CoApplicantLoanSubmission_Blank_Financier_Id",SheetName);
			return data;
			}
			
			
					
}