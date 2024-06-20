package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class CustomerEnquiryPojo {

	private String first_name;
	private String last_name;
	private String email;
	private String mobile;
	private String dob;
	private String city;
	private String state;
	private String dealer;
	private String car_model;
	private String car_variant;
	private String disclaimer_flag;
	private String channel;
	private String color_code;
	private String color_description;
	private String color_indicator;
	private String fuel_type;
	private String force_create_flag;
	private String existing_enquiry_id;
	
	
	
	public CustomerEnquiryPojo(String first_name, String last_name, String email, String mobile, String dob,String city, String state, String dealer, String car_model, String car_variant, String disclaimer_flag,String channel, String color_code, String color_description, String color_indicator, String fuel_type,String force_create_flag, String existing_enquiry_id) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
		this.state = state;
		this.dealer = dealer;
		this.car_model = car_model;
		this.car_variant = car_variant;
		this.disclaimer_flag = disclaimer_flag;
		this.channel = channel;
		this.color_code = color_code;
		this.color_description = color_description;
		this.color_indicator = color_indicator;
		this.fuel_type = fuel_type;
		this.force_create_flag = force_create_flag;
		this.existing_enquiry_id = existing_enquiry_id;
	}
	
	
	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDealer() {
		return dealer;
	}


	public void setDealer(String dealer) {
		this.dealer = dealer;
	}


	public String getCar_model() {
		return car_model;
	}


	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}


	public String getCar_variant() {
		return car_variant;
	}


	public void setCar_variant(String car_variant) {
		this.car_variant = car_variant;
	}


	public String getDisclaimer_flag() {
		return disclaimer_flag;
	}


	public void setDisclaimer_flag(String disclaimer_flag) {
		this.disclaimer_flag = disclaimer_flag;
	}


	public String getChannel() {
		return channel;
	}


	public void setChannel(String channel) {
		this.channel = channel;
	}


	public String getColor_code() {
		return color_code;
	}


	public void setColor_code(String color_code) {
		this.color_code = color_code;
	}


	public String getColor_description() {
		return color_description;
	}


	public void setColor_description(String color_description) {
		this.color_description = color_description;
	}


	public String getColor_indicator() {
		return color_indicator;
	}


	public void setColor_indicator(String color_indicator) {
		this.color_indicator = color_indicator;
	}


	public String getFuel_type() {
		return fuel_type;
	}


	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}


	public String getForce_create_flag() {
		return force_create_flag;
	}


	public void setForce_create_flag(String force_create_flag) {
		this.force_create_flag = force_create_flag;
	}


	public String getExisting_enquiry_id() {
		return existing_enquiry_id;
	}


	public void setExisting_enquiry_id(String existing_enquiry_id) {
		this.existing_enquiry_id = existing_enquiry_id;
	}


	

}

