package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class MspinPojo {

	private String mspin;
	private String otp;
	private String channel;

	
	/**
	 * 
	 * @param mspin  
	 * 
	 */
	public MspinPojo(String mspin , String otp , String channel) {
		this.mspin = mspin;
		this.otp = otp;
		this.channel = channel;

	}

	
	public String getmspin() {
		return mspin;
	}

	public void setmspin(String mspin) {
		this.mspin = mspin;
	}
	
	
	
	
	
	public String getotp() {
		return otp;
	}

	public void setotp(String otp) {
		this.otp = otp;
	}
	
	
	
	
	public String getchannel() {
		return channel;
	}

	public void setchannel(String channel) {
		this.channel = channel;
	}
}

