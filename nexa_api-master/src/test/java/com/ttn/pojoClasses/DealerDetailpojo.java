package com.ttn.pojoClasses;

/**
 * @author Deepanshu Tyagi
 *
 */

public class DealerDetailpojo {

	private String MUL_DEALER_CD;
	private String PMC;
	private String FOR_CD;

	
	/**
	 * 
	 * @param MUL_DEALER_CD , PMC , FOR_CD
	 * 
	 */
	
	public DealerDetailpojo(String MUL_DEALER_CD , String FOR_CD , String PMC) {
		this.MUL_DEALER_CD = MUL_DEALER_CD;
		this.FOR_CD = FOR_CD;
		this.PMC = PMC;

	}
	
	
	//MUL_DEALER_CD

	public String getMUL_DEALER_CD() {
		return MUL_DEALER_CD;
	}

	public void setMUL_DEALER_CD(String MUL_DEALER_CD) {
		this.MUL_DEALER_CD = MUL_DEALER_CD;
	}
	
	
	
	//FOR_CD

	public String getFOR_CD() {
		return FOR_CD;
	}

	public void setFOR_CD(String FOR_CD) {
		this.FOR_CD = FOR_CD;
	}
	
	
	
	//PMC

	public String getPMC() {
		return PMC;
	}

	public void setPMC(String PMC) {
		this.PMC = PMC;
	}
	
	
}

