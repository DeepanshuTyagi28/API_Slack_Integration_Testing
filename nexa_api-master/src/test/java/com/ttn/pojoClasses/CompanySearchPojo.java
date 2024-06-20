package com.ttn.pojoClasses;
/*
 * @author Deepanshu Tyagi
 */

public class CompanySearchPojo {

	private String search_text;

	
	public CompanySearchPojo(String search_text) {
		this.search_text = search_text;
	}

	
	public String getSearch_text() {
		return search_text;
	}

	public void setSearch_text(String search_text) {
		this.search_text = search_text;
	}
	
	
}

