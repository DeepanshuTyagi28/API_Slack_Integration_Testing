package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class SwitchTokenPojo {

	private String mobile;
	private String channel_id;

	
	/**
	 * 
	 * @param mobile_no , VIN Number 
	 * 
	 */
	public SwitchTokenPojo(String mobile , String channel_id) {
		this.mobile = mobile;
		this.channel_id = channel_id;


	}

	//Mobile
	public String getmobile() {
		return mobile;
	}

	public void setmobile(String mobile) {
		this.mobile = mobile;
	}
	
	//channel_id 
	
	public String getchannel_id() {
		return channel_id;
	}

	public void setchannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	
	
	
	
}

