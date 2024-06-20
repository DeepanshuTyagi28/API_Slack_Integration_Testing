package com.ttn.pojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Deepanshu Tyagi
 *
 */

public class EnquiryGeneratePojo {
	
	@JsonProperty("p_pmc")
	private String p_pmc;
	
	@JsonProperty("p_web_refid")
	private String p_web_refid;
	
	@JsonProperty("p_book_date")
	private String p_book_date;
	
	@JsonProperty("p_book_flag")
	private String p_book_flag;
	
	@JsonProperty("p_title")
	private String p_title;
	
	@JsonProperty("p_Cust_first_name")
	private String p_Cust_first_name;
	
	@JsonProperty("p_Cust_middle_name")
	private String p_Cust_middle_name;
	
	@JsonProperty("p_Cust_last_name")
	private String p_Cust_last_name;
	
	@JsonProperty("p_Mobile_no")
	private String p_Mobile_no;
	
	@JsonProperty("p_add1")
	private String p_add1;
	
	@JsonProperty("p_add2")
	private String p_add2;
	
	@JsonProperty("p_add3")
	private String p_add3;
	//
	@JsonProperty("p_Model_cd")
	private String p_Model_cd;
	
	@JsonProperty("p_Variant_Cd")
	private String p_Variant_Cd;
	
	@JsonProperty("p_Color")
	private String p_Color;
	
	@JsonProperty("p_Dealer_code")
	private String p_Dealer_code;
	
	@JsonProperty("p_for_code")
	private String p_for_code;
	
	@JsonProperty("p_customer_type")
	private String p_customer_type;
	
	@JsonProperty("p_city")
	private String p_city;
	
	@JsonProperty("p_state")
	private String p_state;
	
	@JsonProperty("p_pin")
	private String p_pin;
	
	@JsonProperty("p_Email_id")
	private String p_Email_id;
	
	@JsonProperty("p_book_pref_date")
	private String p_book_pref_date;
	
	@JsonProperty("p_book_pref_time")
	private String p_book_pref_time;
	
	@JsonProperty("p_test_drive_place")
	private String p_test_drive_place;
	
	@JsonProperty("p_enq_mode")
	private String p_enq_mode;
	
	@JsonProperty("p_enq_source")
	private String p_enq_source;
	
	@JsonProperty("p_platform")
	private String p_platform;
	
	private String P_Account_Number;
	private String P_Tracking_Id;
	private String P_Bank_Ref_No;	
	private String P_Order_Status;
	private String P_Payment_Mode;
	private String P_Amount;
	

	public EnquiryGeneratePojo(String p_pmc, String p_web_refid, String p_book_date, String p_book_flag, String p_title,
			String p_Cust_first_name, String p_Cust_middle_name, String p_Cust_last_name, String p_Mobile_no,
			String p_add1, String p_add2, String p_add3, String p_Model_cd, String p_Variant_Cd, String p_Color,
			String p_Dealer_code, String p_for_code, String p_customer_type, String p_city, String p_state,
			String p_pin, String p_Email_id, String p_Tracking_Id, String p_Bank_Ref_No, String p_Order_Status,
			String p_Payment_Mode, String p_Amount, String p_book_pref_date, String p_book_pref_time,
			String p_test_drive_place, String p_enq_mode, String p_enq_source, String p_platform,
			String p_Account_Number)
	{
		
		this.p_pmc = p_pmc;
		this.p_web_refid = p_web_refid;
		this.p_book_date = p_book_date;
		this.p_book_flag = p_book_flag;
		this.p_title = p_title;
		this.p_Cust_first_name = p_Cust_first_name;
		this.p_Cust_middle_name = p_Cust_middle_name;
		this.p_Cust_last_name = p_Cust_last_name;
		this.p_Mobile_no = p_Mobile_no;
		this.p_add1 = p_add1;
		this.p_add2 = p_add2;
		this.p_add3 = p_add3;
		this.p_Model_cd = p_Model_cd;
		this.p_Variant_Cd = p_Variant_Cd;
		this.p_Color = p_Color;
		this.p_Dealer_code = p_Dealer_code;
		this.p_for_code = p_for_code;
		this.p_customer_type = p_customer_type;
		this.p_city = p_city;
		this.p_state = p_state;
		this.p_pin = p_pin;
		this.p_Email_id = p_Email_id;
		P_Tracking_Id = p_Tracking_Id;
		P_Bank_Ref_No = p_Bank_Ref_No;
		P_Order_Status = p_Order_Status;
		P_Payment_Mode = p_Payment_Mode;
		P_Amount = p_Amount;
		this.p_book_pref_date = p_book_pref_date;
		this.p_book_pref_time = p_book_pref_time;
		this.p_test_drive_place = p_test_drive_place;
		this.p_enq_mode = p_enq_mode;
		this.p_enq_source = p_enq_source;
		this.p_platform = p_platform;
		P_Account_Number = p_Account_Number;
	}
	
	
	
	
	public String getP_pmc() {
		return p_pmc;
	}
	public void setP_pmc(String p_pmc) {
		this.p_pmc = p_pmc;
	}
	
	
	public String getP_web_refid() {
		return p_web_refid;
	}
	public void setP_web_refid(String p_web_refid) {
		this.p_web_refid = p_web_refid;
	}
	public String getP_book_date() {
		return p_book_date;
	}
	public void setP_book_date(String p_book_date) {
		this.p_book_date = p_book_date;
	}
	public String getP_book_flag() {
		return p_book_flag;
	}
	public void setP_book_flag(String p_book_flag) {
		this.p_book_flag = p_book_flag;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getP_Cust_first_name() {
		return p_Cust_first_name;
	}
	public void setP_Cust_first_name(String p_Cust_first_name) {
		this.p_Cust_first_name = p_Cust_first_name;
	}
	public String getP_Cust_middle_name() {
		return p_Cust_middle_name;
	}
	public void setP_Cust_middle_name(String p_Cust_middle_name) {
		this.p_Cust_middle_name = p_Cust_middle_name;
	}
	public String getP_Cust_last_name() {
		return p_Cust_last_name;
	}
	public void setP_Cust_last_name(String p_Cust_last_name) {
		this.p_Cust_last_name = p_Cust_last_name;
	}
	public String getP_Mobile_no() {
		return p_Mobile_no;
	}
	public void setP_Mobile_no(String p_Mobile_no) {
		this.p_Mobile_no = p_Mobile_no;
	}
	public String getP_add1() {
		return p_add1;
	}
	public void setP_add1(String p_add1) {
		this.p_add1 = p_add1;
	}
	public String getP_add2() {
		return p_add2;
	}
	public void setP_add2(String p_add2) {
		this.p_add2 = p_add2;
	}
	public String getP_add3() {
		return p_add3;
	}
	public void setP_add3(String p_add3) {
		this.p_add3 = p_add3;
	}
	public String getP_Model_cd() {
		return p_Model_cd;
	}
	public void setP_Model_cd(String p_Model_cd) {
		this.p_Model_cd = p_Model_cd;
	}
	public String getP_Variant_Cd() {
		return p_Variant_Cd;
	}
	public void setP_Variant_Cd(String p_Variant_Cd) {
		this.p_Variant_Cd = p_Variant_Cd;
	}
	public String getP_Color() {
		return p_Color;
	}
	public void setP_Color(String p_Color) {
		this.p_Color = p_Color;
	}
	public String getP_Dealer_code() {
		return p_Dealer_code;
	}
	public void setP_Dealer_code(String p_Dealer_code) {
		this.p_Dealer_code = p_Dealer_code;
	}
	public String getP_for_code() {
		return p_for_code;
	}
	public void setP_for_code(String p_for_code) {
		this.p_for_code = p_for_code;
	}
	public String getP_customer_type() {
		return p_customer_type;
	}
	public void setP_customer_type(String p_customer_type) {
		this.p_customer_type = p_customer_type;
	}
	public String getP_city() {
		return p_city;
	}
	public void setP_city(String p_city) {
		this.p_city = p_city;
	}
	public String getP_state() {
		return p_state;
	}
	public void setP_state(String p_state) {
		this.p_state = p_state;
	}
	public String getP_pin() {
		return p_pin;
	}
	public void setP_pin(String p_pin) {
		this.p_pin = p_pin;
	}
	public String getP_Email_id() {
		return p_Email_id;
	}
	public void setP_Email_id(String p_Email_id) {
		this.p_Email_id = p_Email_id;
	}
	public String getP_Tracking_Id() {
		return P_Tracking_Id;
	}
	public void setP_Tracking_Id(String p_Tracking_Id) {
		P_Tracking_Id = p_Tracking_Id;
	}
	public String getP_Bank_Ref_No() {
		return P_Bank_Ref_No;
	}
	public void setP_Bank_Ref_No(String p_Bank_Ref_No) {
		P_Bank_Ref_No = p_Bank_Ref_No;
	}
	public String getP_Order_Status() {
		return P_Order_Status;
	}
	public void setP_Order_Status(String p_Order_Status) {
		P_Order_Status = p_Order_Status;
	}
	public String getP_Payment_Mode() {
		return P_Payment_Mode;
	}
	public void setP_Payment_Mode(String p_Payment_Mode) {
		P_Payment_Mode = p_Payment_Mode;
	}
	public String getP_Amount() {
		return P_Amount;
	}
	public void setP_Amount(String p_Amount) {
		P_Amount = p_Amount;
	}
	public String getP_book_pref_date() {
		return p_book_pref_date;
	}
	public void setP_book_pref_date(String p_book_pref_date) {
		this.p_book_pref_date = p_book_pref_date;
	}
	public String getP_book_pref_time() {
		return p_book_pref_time;
	}
	public void setP_book_pref_time(String p_book_pref_time) {
		this.p_book_pref_time = p_book_pref_time;
	}
	public String getP_test_drive_place() {
		return p_test_drive_place;
	}
	public void setP_test_drive_place(String p_test_drive_place) {
		this.p_test_drive_place = p_test_drive_place;
	}
	public String getP_enq_mode() {
		return p_enq_mode;
	}
	public void setP_enq_mode(String p_enq_mode) {
		this.p_enq_mode = p_enq_mode;
	}
	public String getP_enq_source() {
		return p_enq_source;
	}
	public void setP_enq_source(String p_enq_source) {
		this.p_enq_source = p_enq_source;
	}
	public String getP_platform() {
		return p_platform;
	}
	public void setP_platform(String p_platform) {
		this.p_platform = p_platform;
	}
	public String getP_Account_Number() {
		return P_Account_Number;
	}
	public void setP_Account_Number(String p_Account_Number) {
		P_Account_Number = p_Account_Number;
	}
	
	

	
}

