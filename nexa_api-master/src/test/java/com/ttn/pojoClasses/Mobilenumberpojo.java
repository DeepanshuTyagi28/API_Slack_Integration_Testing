package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class Mobilenumberpojo {

	private String mobile_no;
	private String VIN;

	
	/**
	 * 
	 * @param mobile_no , VIN Number 
	 * 
	 */
	public Mobilenumberpojo(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getmobile_no() {
		return mobile_no;
	}

	public void setmobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	
}

