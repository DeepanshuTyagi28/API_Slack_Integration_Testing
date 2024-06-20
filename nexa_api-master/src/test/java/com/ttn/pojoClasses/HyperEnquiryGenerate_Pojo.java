/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 * @since 05/01/2023
 *
 */
public class HyperEnquiryGenerate_Pojo {
	
	private  int  p_pmc ;
    private String p_web_refid ;
    private  int p_book_flag ;
    private String p_book_date ;
    private String  p_title ;
    private String p_Cust_first_name ;
    private String p_Cust_middle_name ;
    private String p_Cust_last_name ;
    private String p_add1 ;
    private String p_add2 ;
    private String p_add3 ;
    private String p_city ;
    private String p_state ;
    private String p_pin ;
    private String p_Mobile_no ;
    private String p_Email_id ;
    private String p_Dealer_code ;
    private String p_for_code ;
    private String p_book_pref_date ;
    private String p_book_pref_time ;
    private String p_customer_type ;
    private String p_Model_cd ;
    private String p_Variant_Cd ;
    private String p_Color ;
    private String p_test_drive_place ;
    private String P_UTM_SOURCE ;
    private String P_UTM_MEDIUM ;
    private String P_UTM_CAMPAIGN ;
    private String P_UTM_KEYWORD ;
    private String P_UTM_ADGROUPNAME ;
    private String P_UTM_TERM ;
    private String P_UTM_CONTENT ;
    private String p_hyper_ref_id ;
    private String p_buyer_type ;
    private String p_enq_source ;
    private String p_enq_mode ;
    private String  p_old_car_make ;
    private String p_old_car_model ;
    
	/**
	 * @param p_pmc
	 * @param p_web_refid
	 * @param p_book_flag
	 * @param p_book_date
	 * @param p_title
	 * @param p_Cust_first_name
	 * @param p_Cust_middle_name
	 * @param p_Cust_last_name
	 * @param p_add1
	 * @param p_add2
	 * @param p_add3
	 * @param p_city
	 * @param p_state
	 * @param p_pin
	 * @param p_Mobile_no
	 * @param p_Email_id
	 * @param p_Dealer_code
	 * @param p_for_code
	 * @param p_book_pref_date
	 * @param p_book_pref_time
	 * @param p_customer_type
	 * @param p_Model_cd
	 * @param p_Variant_Cd
	 * @param p_Color
	 * @param p_test_drive_place
	 * @param p_UTM_SOURCE
	 * @param p_UTM_MEDIUM
	 * @param p_UTM_CAMPAIGN
	 * @param p_UTM_KEYWORD
	 * @param p_UTM_ADGROUPNAME
	 * @param p_UTM_TERM
	 * @param p_UTM_CONTENT
	 * @param p_hyper_ref_id
	 * @param p_buyer_type
	 * @param p_enq_source
	 * @param p_enq_mode
	 * @param p_old_car_make
	 * @param p_old_car_model
	 */
	public HyperEnquiryGenerate_Pojo(int p_pmc, String p_web_refid, int p_book_flag, String p_book_date, String p_title,
			String p_Cust_first_name, String p_Cust_middle_name, String p_Cust_last_name, String p_add1, String p_add2,
			String p_add3, String p_city, String p_state, String p_pin, String p_Mobile_no, String p_Email_id,
			String p_Dealer_code, String p_for_code, String p_book_pref_date, String p_book_pref_time,
			String p_customer_type, String p_Model_cd, String p_Variant_Cd, String p_Color, String p_test_drive_place,
			 String p_hyper_ref_id,
			String p_buyer_type, String p_enq_source, String p_enq_mode, String p_old_car_make,
			String p_old_car_model ) {
		
		this.p_pmc = p_pmc;
		this.p_web_refid = p_web_refid;
		this.p_book_flag = p_book_flag;
		this.p_book_date = p_book_date;
		this.p_title = p_title;
		this.p_Cust_first_name = p_Cust_first_name;
		this.p_Cust_middle_name = p_Cust_middle_name;
		this.p_Cust_last_name = p_Cust_last_name;
		this.p_add1 = p_add1;
		this.p_add2 = p_add2;
		this.p_add3 = p_add3;
		this.p_city = p_city;
		this.p_state = p_state;
		this.p_pin = p_pin;
		this.p_Mobile_no = p_Mobile_no;
		this.p_Email_id = p_Email_id;
		this.p_Dealer_code = p_Dealer_code;
		this.p_for_code = p_for_code;
		this.p_book_pref_date = p_book_pref_date;
		this.p_book_pref_time = p_book_pref_time;
		this.p_customer_type = p_customer_type;
		this.p_Model_cd = p_Model_cd;
		this.p_Variant_Cd = p_Variant_Cd;
		this.p_Color = p_Color;
		this.p_test_drive_place = p_test_drive_place;
		//this.P_UTM_SOURCE = P_UTM_SOURCE;
		//this.P_UTM_MEDIUM = P_UTM_MEDIUM;
		//this.P_UTM_CAMPAIGN = P_UTM_CAMPAIGN;
		//this.P_UTM_KEYWORD = P_UTM_KEYWORD;
		//this.P_UTM_ADGROUPNAME = P_UTM_ADGROUPNAME;
		//this.P_UTM_TERM = P_UTM_TERM;
		//this.P_UTM_CONTENT = P_UTM_CONTENT;
		this.p_hyper_ref_id = p_hyper_ref_id;
		this.p_buyer_type = p_buyer_type;
		this.p_enq_source = p_enq_source;
		this.p_enq_mode = p_enq_mode;
		this.p_old_car_make = p_old_car_make;
		this.p_old_car_model = p_old_car_model;
	}
	/**
	 * @return the p_pmc
	 */
	public int getP_pmc() {
		return p_pmc;
	}
	/**
	 * @param p_pmc the p_pmc to set
	 */
	public void setP_pmc(int p_pmc) {
		this.p_pmc = p_pmc;
	}
	/**
	 * @return the p_web_refid
	 */
	public String getP_web_refid() {
		return p_web_refid;
	}
	/**
	 * @param p_web_refid the p_web_refid to set
	 */
	public void setP_web_refid(String p_web_refid) {
		this.p_web_refid = p_web_refid;
	}
	/**
	 * @return the p_book_flag
	 */
	public int getP_book_flag() {
		return p_book_flag;
	}
	/**
	 * @param p_book_flag the p_book_flag to set
	 */
	public void setP_book_flag(int p_book_flag) {
		this.p_book_flag = p_book_flag;
	}
	/**
	 * @return the p_book_date
	 */
	public String getP_book_date() {
		return p_book_date;
	}
	/**
	 * @param p_book_date the p_book_date to set
	 */
	public void setP_book_date(String p_book_date) {
		this.p_book_date = p_book_date;
	}
	/**
	 * @return the p_title
	 */
	public String getP_title() {
		return p_title;
	}
	/**
	 * @param p_title the p_title to set
	 */
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	/**
	 * @return the p_Cust_first_name
	 */
	public String getP_Cust_first_name() {
		return p_Cust_first_name;
	}
	/**
	 * @param p_Cust_first_name the p_Cust_first_name to set
	 */
	public void setP_Cust_first_name(String p_Cust_first_name) {
		this.p_Cust_first_name = p_Cust_first_name;
	}
	/**
	 * @return the p_Cust_middle_name
	 */
	public String getP_Cust_middle_name() {
		return p_Cust_middle_name;
	}
	/**
	 * @param p_Cust_middle_name the p_Cust_middle_name to set
	 */
	public void setP_Cust_middle_name(String p_Cust_middle_name) {
		this.p_Cust_middle_name = p_Cust_middle_name;
	}
	/**
	 * @return the p_Cust_last_name
	 */
	public String getP_Cust_last_name() {
		return p_Cust_last_name;
	}
	/**
	 * @param p_Cust_last_name the p_Cust_last_name to set
	 */
	public void setP_Cust_last_name(String p_Cust_last_name) {
		this.p_Cust_last_name = p_Cust_last_name;
	}
	/**
	 * @return the p_add1
	 */
	public String getP_add1() {
		return p_add1;
	}
	/**
	 * @param p_add1 the p_add1 to set
	 */
	public void setP_add1(String p_add1) {
		this.p_add1 = p_add1;
	}
	/**
	 * @return the p_add2
	 */
	public String getP_add2() {
		return p_add2;
	}
	/**
	 * @param p_add2 the p_add2 to set
	 */
	public void setP_add2(String p_add2) {
		this.p_add2 = p_add2;
	}
	/**
	 * @return the p_add3
	 */
	public String getP_add3() {
		return p_add3;
	}
	/**
	 * @param p_add3 the p_add3 to set
	 */
	public void setP_add3(String p_add3) {
		this.p_add3 = p_add3;
	}
	/**
	 * @return the p_city
	 */
	public String getP_city() {
		return p_city;
	}
	/**
	 * @param p_city the p_city to set
	 */
	public void setP_city(String p_city) {
		this.p_city = p_city;
	}
	/**
	 * @return the p_state
	 */
	public String getP_state() {
		return p_state;
	}
	/**
	 * @param p_state the p_state to set
	 */
	public void setP_state(String p_state) {
		this.p_state = p_state;
	}
	/**
	 * @return the p_pin
	 */
	public String getP_pin() {
		return p_pin;
	}
	/**
	 * @param p_pin the p_pin to set
	 */
	public void setP_pin(String p_pin) {
		this.p_pin = p_pin;
	}
	/**
	 * @return the p_Mobile_no
	 */
	public String getP_Mobile_no() {
		return p_Mobile_no;
	}
	/**
	 * @param p_Mobile_no the p_Mobile_no to set
	 */
	public void setP_Mobile_no(String p_Mobile_no) {
		this.p_Mobile_no = p_Mobile_no;
	}
	/**
	 * @return the p_Email_id
	 */
	public String getP_Email_id() {
		return p_Email_id;
	}
	/**
	 * @param p_Email_id the p_Email_id to set
	 */
	public void setP_Email_id(String p_Email_id) {
		this.p_Email_id = p_Email_id;
	}
	/**
	 * @return the p_Dealer_code
	 */
	public String getP_Dealer_code() {
		return p_Dealer_code;
	}
	/**
	 * @param p_Dealer_code the p_Dealer_code to set
	 */
	public void setP_Dealer_code(String p_Dealer_code) {
		this.p_Dealer_code = p_Dealer_code;
	}
	/**
	 * @return the p_for_code
	 */
	public String getP_for_code() {
		return p_for_code;
	}
	/**
	 * @param p_for_code the p_for_code to set
	 */
	public void setP_for_code(String p_for_code) {
		this.p_for_code = p_for_code;
	}
	/**
	 * @return the p_book_pref_date
	 */
	public String getP_book_pref_date() {
		return p_book_pref_date;
	}
	/**
	 * @param p_book_pref_date the p_book_pref_date to set
	 */
	public void setP_book_pref_date(String p_book_pref_date) {
		this.p_book_pref_date = p_book_pref_date;
	}
	/**
	 * @return the p_book_pref_time
	 */
	public String getP_book_pref_time() {
		return p_book_pref_time;
	}
	/**
	 * @param p_book_pref_time the p_book_pref_time to set
	 */
	public void setP_book_pref_time(String p_book_pref_time) {
		this.p_book_pref_time = p_book_pref_time;
	}
	/**
	 * @return the p_customer_type
	 */
	public String getP_customer_type() {
		return p_customer_type;
	}
	/**
	 * @param p_customer_type the p_customer_type to set
	 */
	public void setP_customer_type(String p_customer_type) {
		this.p_customer_type = p_customer_type;
	}
	/**
	 * @return the p_Model_cd
	 */
	public String getP_Model_cd() {
		return p_Model_cd;
	}
	/**
	 * @param p_Model_cd the p_Model_cd to set
	 */
	public void setP_Model_cd(String p_Model_cd) {
		this.p_Model_cd = p_Model_cd;
	}
	/**
	 * @return the p_Variant_Cd
	 */
	public String getP_Variant_Cd() {
		return p_Variant_Cd;
	}
	/**
	 * @param p_Variant_Cd the p_Variant_Cd to set
	 */
	public void setP_Variant_Cd(String p_Variant_Cd) {
		this.p_Variant_Cd = p_Variant_Cd;
	}
	/**
	 * @return the p_Color
	 */
	public String getP_Color() {
		return p_Color;
	}
	/**
	 * @param p_Color the p_Color to set
	 */
	public void setP_Color(String p_Color) {
		this.p_Color = p_Color;
	}
	/**
	 * @return the p_test_drive_place
	 */
	public String getP_test_drive_place() {
		return p_test_drive_place;
	}
	/**
	 * @param p_test_drive_place the p_test_drive_place to set
	 */
	public void setP_test_drive_place(String p_test_drive_place) {
		this.p_test_drive_place = p_test_drive_place;
	}
	/**
	 * @return the p_UTM_SOURCE
	 */
	public String getP_UTM_SOURCE() {
		return P_UTM_SOURCE;
	}
	/**
	 * @param p_UTM_SOURCE the p_UTM_SOURCE to set
	 */
	public void setP_UTM_SOURCE(String P_UTM_SOURCE) {
		this.P_UTM_SOURCE = P_UTM_SOURCE;
	}
	/**
	 * @return the p_UTM_MEDIUM
	 */
	public String getP_UTM_MEDIUM() {
		return P_UTM_MEDIUM;
	}
	/**
	 * @param p_UTM_MEDIUM the p_UTM_MEDIUM to set
	 */
	public void setP_UTM_MEDIUM(String P_UTM_MEDIUM) {
		this.P_UTM_MEDIUM = P_UTM_MEDIUM;
	}
	/**
	 * @return the p_UTM_CAMPAIGN
	 */
	public String getP_UTM_CAMPAIGN() {
		return P_UTM_CAMPAIGN;
	}
	/**
	 * @param p_UTM_CAMPAIGN the p_UTM_CAMPAIGN to set
	 */
	public void setP_UTM_CAMPAIGN(String P_UTM_CAMPAIGN) {
		this.P_UTM_CAMPAIGN = P_UTM_CAMPAIGN;
	}
	/**
	 * @return the p_UTM_KEYWORD
	 */
	public String getP_UTM_KEYWORD() {
		return P_UTM_KEYWORD;
	}
	/**
	 * @param p_UTM_KEYWORD the p_UTM_KEYWORD to set
	 */
	public void setP_UTM_KEYWORD(String P_UTM_KEYWORD) {
		this.P_UTM_KEYWORD = P_UTM_KEYWORD;
	}
	/**
	 * @return the p_UTM_ADGROUPNAME
	 */
	public String getP_UTM_ADGROUPNAME() {
		return P_UTM_ADGROUPNAME;
	}
	/**
	 * @param p_UTM_ADGROUPNAME the p_UTM_ADGROUPNAME to set
	 */
	public void setP_UTM_ADGROUPNAME(String P_UTM_ADGROUPNAME) {
		this.P_UTM_ADGROUPNAME = P_UTM_ADGROUPNAME;
	}
	/**
	 * @return the p_UTM_TERM
	 */
	public String getP_UTM_TERM() {
		return P_UTM_TERM;
	}
	/**
	 * @param p_UTM_TERM the p_UTM_TERM to set
	 */
	public void setP_UTM_TERM(String P_UTM_TERM) {
		this.P_UTM_TERM = P_UTM_TERM;
	}
	/**
	 * @return the p_UTM_CONTENT
	 */
	public String getP_UTM_CONTENT() {
		return P_UTM_CONTENT;
	}
	/**
	 * @param p_UTM_CONTENT the p_UTM_CONTENT to set
	 */
	public void setP_UTM_CONTENT(String P_UTM_CONTENT) {
		this.P_UTM_CONTENT = P_UTM_CONTENT;
	}
	/**
	 * @return the p_hyper_ref_id
	 */
	public String getP_hyper_ref_id() {
		return p_hyper_ref_id;
	}
	/**
	 * @param p_hyper_ref_id the p_hyper_ref_id to set
	 */
	public void setP_hyper_ref_id(String p_hyper_ref_id) {
		this.p_hyper_ref_id = p_hyper_ref_id;
	}
	/**
	 * @return the p_buyer_type
	 */
	public String getP_buyer_type() {
		return p_buyer_type;
	}
	/**
	 * @param p_buyer_type the p_buyer_type to set
	 */
	public void setP_buyer_type(String p_buyer_type) {
		this.p_buyer_type = p_buyer_type;
	}
	/**
	 * @return the p_enq_source
	 */
	public String getP_enq_source() {
		return p_enq_source;
	}
	/**
	 * @param p_enq_source the p_enq_source to set
	 */
	public void setP_enq_source(String p_enq_source) {
		this.p_enq_source = p_enq_source;
	}
	/**
	 * @return the p_enq_mode
	 */
	public String getP_enq_mode() {
		return p_enq_mode;
	}
	/**
	 * @param p_enq_mode the p_enq_mode to set
	 */
	public void setP_enq_mode(String p_enq_mode) {
		this.p_enq_mode = p_enq_mode;
	}
	/**
	 * @return the p_old_car_make
	 */
	public String getP_old_car_make() {
		return p_old_car_make;
	}
	/**
	 * @param p_old_car_make the p_old_car_make to set
	 */
	public void setP_old_car_make(String p_old_car_make) {
		this.p_old_car_make = p_old_car_make;
	}
	/**
	 * @return the p_old_car_model
	 */
	public String getP_old_car_model() {
		return p_old_car_model;
	}
	/**
	 * @param p_old_car_model the p_old_car_model to set
	 */
	public void setP_old_car_model(String p_old_car_model) {
		this.p_old_car_model = p_old_car_model;
	}
	
    

}
