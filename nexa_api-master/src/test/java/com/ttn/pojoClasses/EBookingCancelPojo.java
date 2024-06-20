package com.ttn.pojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Deepanshu Tyagi
 *
 */

public class EBookingCancelPojo {
	@JsonProperty("p_Website_booking_Ref_no")
	private String p_Website_booking_Ref_no;
	
	@JsonProperty("p_DMS_booking_no")
	private String p_DMS_booking_no;
	
	@JsonProperty("p_dealer_Cd")
	private String p_dealer_Cd;
	
	@JsonProperty("p_for_Cd")
	private String p_for_Cd;
	
	@JsonProperty("p_flag")
	private String p_flag;

	
	public EBookingCancelPojo(String p_Website_booking_Ref_no, String p_DMS_booking_no, String p_dealer_Cd,String p_for_Cd, String p_flag) {
		this.p_Website_booking_Ref_no = p_Website_booking_Ref_no;
		this.p_DMS_booking_no = p_DMS_booking_no;
		this.p_dealer_Cd = p_dealer_Cd;
		this.p_for_Cd = p_for_Cd;
		this.p_flag = p_flag;
	}


	public String getP_Website_booking_Ref_no() {
		return p_Website_booking_Ref_no;
	}


	public void setP_Website_booking_Ref_no(String p_Website_booking_Ref_no) {
		this.p_Website_booking_Ref_no = p_Website_booking_Ref_no;
	}


	public String getP_DMS_booking_no() {
		return p_DMS_booking_no;
	}


	public void setP_DMS_booking_no(String p_DMS_booking_no) {
		this.p_DMS_booking_no = p_DMS_booking_no;
	}


	public String getP_dealer_Cd() {
		return p_dealer_Cd;
	}


	public void setP_dealer_Cd(String p_dealer_Cd) {
		this.p_dealer_Cd = p_dealer_Cd;
	}


	public String getP_for_Cd() {
		return p_for_Cd;
	}


	public void setP_for_Cd(String p_for_Cd) {
		this.p_for_Cd = p_for_Cd;
	}


	public String getP_flag() {
		return p_flag;
	}


	public void setP_flag(String p_flag) {
		this.p_flag = p_flag;
	}

	


	
}

