package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class SearchCityPojo {

	private String search_text;
	private String financier_id;

	
	/**
	 * 
	 * @param search_text , financier_id 
	 * 
	 */
	public SearchCityPojo(String search_text , String financier_id  ) {
		this.search_text = search_text;
		this.financier_id = financier_id;


	}

	//search_text
	public String getsearch_text() {
		return search_text;
	}

	public void setsearch_text(String search_text) {
		this.search_text = search_text;
	}
	
	
	//financier_id 
	
	public String getfinancier_id() {
		return financier_id;
	}

	public void setfinancier_id(String financier_id) {
		this.financier_id = financier_id;
	}

	
	
	
	
}

