/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 *
 */
public class TdModePjo {

	private String P_MSPIN;
    private String P_USER_ID;
    private int P_PMC;
    private String P_STATUS;
    private String P_MODEL;
    private String P_MUL_DEALER_CD;
    private String P_FOR_CD;
    private String P_TRANSMISSION_TYPE;

    public TdModePjo(String P_MSPIN, String P_USER_ID, int P_PMC, String P_STATUS, String P_MODEL, String P_MUL_DEALER_CD, String P_FOR_CD, String P_TRANSMISSION_TYPE) {
        this.P_MSPIN = P_MSPIN;
        this.P_USER_ID = P_USER_ID;
        this.P_PMC = P_PMC;
        this.P_STATUS = P_STATUS;
        this.P_MODEL = P_MODEL;
        this.P_MUL_DEALER_CD = P_MUL_DEALER_CD;
        this.P_FOR_CD = P_FOR_CD;
        this.P_TRANSMISSION_TYPE = P_TRANSMISSION_TYPE;
    }

    public String getP_MSPIN() {
        return P_MSPIN;
    }

    public void setP_MSPIN(String P_MSPIN) {
        this.P_MSPIN = P_MSPIN;
    }

    public String getP_USER_ID() {
        return P_USER_ID;
    }

    public void setP_USER_ID(String P_USER_ID) {
        this.P_USER_ID = P_USER_ID;
    }

    public int getP_PMC() {
        return P_PMC;
    }

    public void setP_PMC(int P_PMC) {
        this.P_PMC = P_PMC;
    }

    public String getP_STATUS() {
        return P_STATUS;
    }

    public void setP_STATUS(String P_STATUS) {
        this.P_STATUS = P_STATUS;
    }

    public String getP_MODEL() {
        return P_MODEL;
    }

    public void setP_MODEL(String P_MODEL) {
        this.P_MODEL = P_MODEL;
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

    public String getP_TRANSMISSION_TYPE() {
        return P_TRANSMISSION_TYPE;
    }

    public void setP_TRANSMISSION_TYPE(String P_TRANSMISSION_TYPE) {
        this.P_TRANSMISSION_TYPE = P_TRANSMISSION_TYPE;
    }
}
