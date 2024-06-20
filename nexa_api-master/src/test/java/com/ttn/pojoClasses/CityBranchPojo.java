package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class CityBranchPojo {

	private String search_text;
	private String financier_id;
	private String city;
	
	

	public CityBranchPojo(String search_text, String financier_id, String city) {
		this.search_text = search_text;
		this.financier_id = financier_id;
		this.city = city;
	}
	
	
	public String getSearch_text() {
		return search_text;
	}


	public void setSearch_text(String search_text) {
		this.search_text = search_text;
	}


	public String getFinancier_id() {
		return financier_id;
	}


	public void setFinancier_id(String financier_id) {
		this.financier_id = financier_id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}




	
}

