/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 * @since 05/01/2023
 * @Info This Pojo class use for create object for api of Mobile_Testdrive
 *       working -> by mobile number return td info
 *
 */
public class MobileTestdrivePojo {
	private String P_PMC;
	private String P_MOBILE;

	public MobileTestdrivePojo(String P_PMC, String P_MOBILE) {
		this.P_PMC = P_PMC;
		this.P_MOBILE = P_MOBILE;
	}

	public String getP_PMC() {
		return P_PMC;
	}

	public void setP_PMC(String P_PMC) {
		this.P_PMC = P_PMC;
	}

	public String getP_MOBILE() {
		return P_MOBILE;
	}

	public void setP_MOBILE(String P_MOBILE) {
		this.P_MOBILE = P_MOBILE;
	}
}
