package com.ttn.pojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Deepanshu Tyagi
 *
 */

public class EBookStatusPojo {

	@JsonProperty("p_pmc")
	private String p_pmc;
	
	@JsonProperty("p_web_booking_ref_no")
	private String p_web_booking_ref_no;
	
	
	public EBookStatusPojo(String p_pmc, String p_web_booking_ref_no) {
		this.p_pmc = p_pmc;
		this.p_web_booking_ref_no = p_web_booking_ref_no;
	}
	
	
	public String getP_pmc() {
		return p_pmc;
	}
	public void setP_pmc(String p_pmc) {
		this.p_pmc = p_pmc;
	}
	
	
	
	public String getP_web_booking_ref_no() {
		return p_web_booking_ref_no;
	}
	public void setP_web_booking_ref_no(String p_web_booking_ref_no) {
		this.p_web_booking_ref_no = p_web_booking_ref_no;
	}


}

