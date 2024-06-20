package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class Mobilenumberspojo {

	private String mobile;
	private String channel;
	private String otp;

	
	/**
	 * 
	 * @param mobile_no , VIN Number 
	 * 
	 */
	public Mobilenumberspojo(String mobile , String channel ,String otp ) {
		this.mobile = mobile;
		this.channel = channel;
		this.otp = otp;


	}

	//Mobile
	public String getmobile() {
		return mobile;
	}

	public void setmobile(String mobile) {
		this.mobile = mobile;
	}
	
	//Channel 
	
	public String getchannel() {
		return channel;
	}

	public void setchannel(String channel) {
		this.channel = channel;
	}
	
	
	//OTP 
	
	public String getotp() {
		return otp;
	}

	public void setotp(String otp) {
		this.otp = otp;
	}
	
	
	
	
	
}

