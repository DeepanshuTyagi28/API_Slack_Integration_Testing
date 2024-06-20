/**
 * 
 */
package com.ttn.TestCases;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Hashtable;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ttn.Builder.BaseLib;
import com.ttn.BusinessLogic.VehicleDetailsWithRegNoStage;
import com.ttn.CommonUtils.DataProviderSource;
import com.ttn.CommonUtils.MyPropertyNamingStrategy;
import com.ttn.pojoClasses.VehicleDetailsWithRegNoPojo;

/**
 * @author Akhilesh Kumar
 *
 */
public class Vehicle_Details_with_Reg_No_Stage_Test extends BaseLib {

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void vehicle_Details_with_Reg_No_Valid_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo(data.get("pn_loc_cd"),
				data.get("pn_dealer_cd"), data.get("pn_reg_num"));
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.validInputVehicleDetailsWithRegNoStage(bodyData);
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void vehicle_Details_with_invalid_pn_reg_num_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo(data.get("pn_loc_cd"),
				data.get("pn_dealer_cd"), data.get("pn_reg_num") + "1");
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidInputVehicleDetailsWithRegNoStage(bodyData);
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void vehicle_Details_with_Reg_No_With_Invalid_pn_loc_cd_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo(
				data.get("pn_loc_cd") + "A", data.get("pn_dealer_cd"), data.get("pn_reg_num"));
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidInputVehicleDetailsWithRegNoStage(bodyData);
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void vehicle_Details_with_Reg_No_With_invalid_pn_dealer_cd_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo(data.get("pn_loc_cd"),
				data.get("pn_dealer_cd") + "B", data.get("pn_reg_num"));
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidTwoAndThreeInputFieldsVehicleDetailsWithRegNoStage(bodyData);
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void vehicle_Details_with_Reg_No_All_Invalid_Input_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo(
				data.get("pn_loc_cd") + "C", data.get("pn_dealer_cd") + "C", data.get("pn_reg_num") + "C");
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidTwoAndThreeInputFieldsVehicleDetailsWithRegNoStage(bodyData);
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void invalid_vehicle_Details_with_Reg_No_Blank_pn_loc_cd_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo("",
				data.get("pn_dealer_cd"), data.get("pn_reg_num"));
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidInputVehicleDetailsWithRegNoStage(bodyData);
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void invalid_vehicle_Details_with_Reg_No_Blank_pn_dealer_cd_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo(data.get("pn_loc_cd"),
				"", data.get("pn_reg_num"));
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidInputVehicleDetailsWithRegNoStage(bodyData);
	}

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void invalid_vehicle_Details_with_Reg_No_Blank_pn_reg_num_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo(data.get("pn_loc_cd"),
				data.get("pn_dealer_cd"), "");
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidInputVehicleDetailsWithRegNoStage(bodyData);
	}

	// All blanck

	@Test(groups = { "Sanity", "Regression",
			"NEXA" }, dataProvider = "vehicle_Details_with_Reg_No_Stage_Test", dataProviderClass = DataProviderSource.class)
	public void invalid_vehicle_Details_with_Reg_No_Blank_Test(Hashtable<String, String> data)
			throws JsonGenerationException, JsonMappingException, IOException, SerializeException {
		VehicleDetailsWithRegNoPojo vehicleDetailsWithRegNoPojo = new VehicleDetailsWithRegNoPojo("", "", "");
		JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
		String bodyData = jsonSerializer.serialize(vehicleDetailsWithRegNoPojo);
		VehicleDetailsWithRegNoStage.invalidInputVehicleDetailsWithRegNoStage(bodyData);
	}

}
