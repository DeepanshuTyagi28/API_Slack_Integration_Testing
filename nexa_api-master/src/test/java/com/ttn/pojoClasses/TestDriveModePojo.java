/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 *
 */
public class TestDriveModePojo {
	private String P_MSPIN;
	private String P_USER_ID;
	private int P_PMC;
	private String P_STATUS;
	private String P_MODEL;
	private String P_MUL_DEALER_CD;
	private String P_FOR_CD;
	private String P_TRANSMISSION_TYPE;

	public TestDriveModePojo(String P_MSPIN, String P_USER_ID, int P_PMC, String P_STATUS, String P_MODEL,
			String P_MUL_DEALER_CD, String P_FOR_CD, String P_TRANSMISSION_TYPE) {
		this.P_MSPIN = P_MSPIN;
		this.P_USER_ID = P_USER_ID;
		this.P_PMC = P_PMC;
		this.P_STATUS = P_STATUS;
		this.P_MODEL = P_MODEL;
		this.P_MUL_DEALER_CD = P_MUL_DEALER_CD;
		this.P_FOR_CD = P_FOR_CD;
		this.P_TRANSMISSION_TYPE = P_TRANSMISSION_TYPE;
	}

	// getters and setters omitted for brevity

	/**
	 * @return the p_MSPIN
	 * @since 05/01/23
	 */
	public String getP_MSPIN() {
		return P_MSPIN;
	}

	/**
	 * @param p_MSPIN the p_MSPIN to set
	 * @since 05/01/23
	 */
	public void setP_MSPIN(String p_MSPIN) {
		P_MSPIN = p_MSPIN;
	}

	/**
	 * @return the p_USER_ID
	 * @since 05/01/23
	 */
	public String getP_USER_ID() {
		return P_USER_ID;
	}

	/**
	 * @param p_USER_ID the p_USER_ID to set
	 * @since 05/01/23
	 */
	public void setP_USER_ID(String p_USER_ID) {
		P_USER_ID = p_USER_ID;
	}

	/**
	 * @return the p_PMC
	 * @since 05/01/23
	 */
	public int getP_PMC() {
		return P_PMC;
	}

	/**
	 * @param p_PMC the p_PMC to set
	 * @since 05/01/23
	 */
	public void setP_PMC(int p_PMC) {
		P_PMC = p_PMC;
	}

	/**
	 * @return the p_STATUS
	 * @since 05/01/23
	 */
	public String getP_STATUS() {
		return P_STATUS;
	}

	/**
	 * @param p_STATUS the p_STATUS to set
	 * @since 05/01/23
	 */
	public void setP_STATUS(String p_STATUS) {
		P_STATUS = p_STATUS;
	}

	/**
	 * @return the p_MODEL
	 * @since 05/01/23
	 */
	public String getP_MODEL() {
		return P_MODEL;
	}

	/**
	 * @param p_MODEL the p_MODEL to set
	 * @since 05/01/23
	 */
	public void setP_MODEL(String p_MODEL) {
		P_MODEL = p_MODEL;
	}

	/**
	 * @return the p_MUL_DEALER_CD
	 */
	public String getP_MUL_DEALER_CD() {
		return P_MUL_DEALER_CD;
	}

	/**
	 * @param p_MUL_DEALER_CD the p_MUL_DEALER_CD to set
	 * @since 05/01/23
	 */
	public void setP_MUL_DEALER_CD(String p_MUL_DEALER_CD) {
		P_MUL_DEALER_CD = p_MUL_DEALER_CD;
	}

	/**
	 * @return the p_FOR_CD
	 * @since 05/01/23
	 */
	public String getP_FOR_CD() {
		return P_FOR_CD;
	}

	/**
	 * @param p_FOR_CD the p_FOR_CD to set
	 * @since 05/01/23
	 */
	public void setP_FOR_CD(String p_FOR_CD) {
		P_FOR_CD = p_FOR_CD;
	}

	/**
	 * @return the p_TRANSMISSION_TYPE
	 * @since 05/01/23
	 */
	public String getP_TRANSMISSION_TYPE() {
		return P_TRANSMISSION_TYPE;
	}

	/**
	 * @param p_TRANSMISSION_TYPE the p_TRANSMISSION_TYPE to set
	 * @since 05/01/23
	 */
	public void setP_TRANSMISSION_TYPE(String p_TRANSMISSION_TYPE) {
		P_TRANSMISSION_TYPE = p_TRANSMISSION_TYPE;
	}

}
