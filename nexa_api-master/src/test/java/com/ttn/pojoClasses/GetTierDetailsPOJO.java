package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class GetTierDetailsPOJO {

	private String tier;
	private String category;

	
	/**
	 * 
	 * @param mobile_no , VIN Number 
	 * 
	 */
	public GetTierDetailsPOJO(String tier , String category) {
		this.tier = tier;
		this.category = category;

	}
	
	// Tier

	public String gettier() {
		return tier;
	}

	public void settier(String tier) {
		this.tier = tier;
	}
	
	
	
	//Category
	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}
	
	
}

