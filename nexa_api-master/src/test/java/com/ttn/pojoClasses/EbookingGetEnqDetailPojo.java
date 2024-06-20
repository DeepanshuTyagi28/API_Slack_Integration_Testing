/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 *
 */
public class EbookingGetEnqDetailPojo {

	private int P_PMC;
	private String P_MOBILE;
	private String P_MUL_DEALER_CD;
	private String P_FOR_CD;

	public EbookingGetEnqDetailPojo(int P_PMC, String P_MOBILE, String P_MUL_DEALER_CD, String P_FOR_CD) {
		this.P_PMC = P_PMC;
		this.P_MOBILE = P_MOBILE;
		this.P_MUL_DEALER_CD = P_MUL_DEALER_CD;
		this.P_FOR_CD = P_FOR_CD;
	}

	public int getP_PMC() {
		return P_PMC;
	}

	public void setP_PMC(int P_PMC) {
		this.P_PMC = P_PMC;
	}

	public String getP_MOBILE() {
		return P_MOBILE;
	}

	public void setP_MOBILE(String P_MOBILE) {
		this.P_MOBILE = P_MOBILE;
	}

	public String getP_MUL_DEALER_CD() {
		return P_MUL_DEALER_CD;
	}

	public void setP_MUL_DEALER_CD(String P_MUL_DEALER_CD) {
		this.P_MUL_DEALER_CD = P_MUL_DEALER_CD;
	}

	public String getP_FOR_CD() {
		return P_FOR_CD;
	}

	public void setP_FOR_CD(String P_FOR_CD) {
		this.P_FOR_CD = P_FOR_CD;
	}
}
