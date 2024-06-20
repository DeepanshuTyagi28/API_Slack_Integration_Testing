package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class SaveEnrollmentFormPojo {

	private String reg_mobile;
	private String email_id;
	private String card_issu_parent;
	private String card_issu_dlr_map_cd;
	private String card_issu_loc_cd;
	private String card_vin;
	private String user_id;
	private String dob;
	private String OS_Type;
	private String tnc_approve_date;
	private String enrol_sms_confirm;


	
	/**
	 * 
	 * @param reg_mobile , email_id ,card_issu_parent , card_issu_dlr_map_cd , card_issu_loc_cd , card_vin , user_id , dob , OS_Type ,tnc_approve_date , enrol_sms_confirm
	 * 
	 */
	
	public SaveEnrollmentFormPojo(String reg_mobile , String email_id , String card_issu_parent ,String card_issu_dlr_map_cd , String card_issu_loc_cd , String card_vin ,String user_id , String dob , String OS_Type , String tnc_approve_date , String enrol_sms_confirm) {
		this.reg_mobile = reg_mobile;
		this.email_id = email_id;
		this.card_issu_parent = card_issu_parent;
		this.card_issu_dlr_map_cd = card_issu_dlr_map_cd;
		this.card_issu_loc_cd = card_issu_loc_cd;
		this.card_vin = card_vin;
		this.user_id = user_id;
		this.dob = dob;
		this.OS_Type = OS_Type;
		this.tnc_approve_date = tnc_approve_date;
		this.enrol_sms_confirm = enrol_sms_confirm;

	}
	
	
	//reg_mobile

	public String getreg_mobile() {
		return reg_mobile;
	}

	public void setreg_mobile(String reg_mobile) {
		this.reg_mobile = reg_mobile;
	}
	
	
	
	//email_id

	public String getemail_id() {
		return email_id;
	}

	public void setemail_id(String email_id) {
		this.email_id = email_id;
	}
	
	
	
	//PMC

	public String getcard_issu_parent() {
		return card_issu_parent;
	}

	public void setcard_issu_parent(String card_issu_parent) {
		this.card_issu_parent = card_issu_parent;
	}
	
	//card_issu_dlr_map_cd

	public String getcard_issu_dlr_map_cd() {
		return card_issu_dlr_map_cd;
	}

	public void setcard_issu_dlr_map_cd(String card_issu_dlr_map_cd) {
		this.card_issu_dlr_map_cd = card_issu_dlr_map_cd;
	}
	
	
	//card_issu_loc_cd

	public String getcard_issu_loc_cd() {
		return card_issu_loc_cd;
	}

	public void setcard_issu_loc_cd(String card_issu_loc_cd) {
		this.card_issu_loc_cd = card_issu_loc_cd;
	}
	
	
	//card_vin

	public String getcard_vin() {
		return card_vin;
	}

	public void setcard_vin(String card_vin) {
		this.card_vin = card_vin;
	}
	
	
	//user_id

	public String getuser_id() {
		return user_id;
	}

	public void setuser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	
	//reg_mobile

	public String getdob() {
		return dob;
	}

	public void setdob(String dob) {
		this.dob = dob;
	}
	
	
	
	//OS_Type

	public String getOS_Type() {
		return OS_Type;
	}

	public void setOS_Type(String OS_Type) {
		this.OS_Type = OS_Type;
	}
	
	
	
	//tnc_approve_date

	public String gettnc_approve_date() {
		return tnc_approve_date;
	}

	public void settnc_approve_date(String tnc_approve_date) {
		this.tnc_approve_date = tnc_approve_date;
	}
	
	
	
	
	//reg_mobile

	public String getenrol_sms_confirm() {
		return enrol_sms_confirm;
	}

	public void setenrol_sms_confirm(String enrol_sms_confirm) {
		this.enrol_sms_confirm = enrol_sms_confirm;
	}
	
	
	
	
	
	
	
	
}

