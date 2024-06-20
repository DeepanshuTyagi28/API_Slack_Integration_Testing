package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class SaveEnrollmentFormPojo2 {

	private String P_PMC;
	private String P_DLR_CD;
	

	
	/**
	 * 
	 * 
	 */
	
	public SaveEnrollmentFormPojo2(String P_PMC , String P_DLR_CD ) {
		this.P_PMC = P_PMC;
		this.P_DLR_CD = P_DLR_CD;
		
	}
	
	
	//reg_mobile

	public String getP_PMC() {
		return P_PMC;
	}

	public void setP_PMC(String P_PMC) {
		this.P_PMC = P_PMC;
	}
	
	
	
	//email_id

	public String getP_DLR_CD() {
		return P_DLR_CD;
	}

	public void setP_DLR_CD(String P_DLR_CD) {
		this.P_DLR_CD = P_DLR_CD;
	}
	
	
	
	
	
	
}

