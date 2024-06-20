/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 * @since 05/01/2023
 *
 */
public class GetTestDriveSlotPojo {
    private String P_MSPIN;
    private int P_PMC;
    private String P_VIN_NUM;
    private String P_FROM_DATE;
    private String P_TO_DATE;

    public GetTestDriveSlotPojo(String P_MSPIN, int P_PMC, String P_VIN_NUM, String P_FROM_DATE, String P_TO_DATE) {
        this.P_MSPIN = P_MSPIN;
        this.P_PMC = P_PMC;
        this.P_VIN_NUM = P_VIN_NUM;
        this.P_FROM_DATE = P_FROM_DATE;
        this.P_TO_DATE = P_TO_DATE;
    }

    public String getP_MSPIN() {
        return P_MSPIN;
    }

    public void setP_MSPIN(String P_MSPIN) {
        this.P_MSPIN = P_MSPIN;
    }

    public int getP_PMC() {
        return P_PMC;
    }

    public void setP_PMC(int P_PMC) {
        this.P_PMC = P_PMC;
    }

    public String getP_VIN_NUM() {
        return P_VIN_NUM;
    }

    public void setP_VIN_NUM(String P_VIN_NUM) {
        this.P_VIN_NUM = P_VIN_NUM;
    }

    public String getP_FROM_DATE() {
        return P_FROM_DATE;
    }

    public void setP_FROM_DATE(String P_FROM_DATE) {
        this.P_FROM_DATE = P_FROM_DATE;
    }

    public String getP_TO_DATE() {
        return P_TO_DATE;
    }

    public void setP_TO_DATE(String P_TO_DATE) {
        this.P_TO_DATE = P_TO_DATE;
    }
}
