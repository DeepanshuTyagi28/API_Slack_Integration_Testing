/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 * @since 05/01/2023
 * @implNote This pojo class use for create request  body for BATD api
 *
 */
public class ScheduleTestdrivePojo  {
    private String P_MSPIN;
    private int p_pmc;
    private String P_DEALER_CD;
    private String P_FOR_CD;
    private String p_vin;
    private String P_TD_SCHD_IN_NUM;
    private String P_enq_num;
    private String P_model;
    private String p_variant_cd;
    private String p_Td_location;
    private String p_Td_status;
    private String p_Td_date;
    private String p_Td_startTime;
    private String p_Td_endTime;
    private String p_Address1;
    private String p_Address2;
    private String p_Address3;
    private String p_Ofc_address1;
    private String p_Ofc_address2;
    private String p_Ofc_address3;
    private String p_td_op_type;

    public ScheduleTestdrivePojo(String P_MSPIN, int p_pmc, String P_DEALER_CD, String P_FOR_CD, String p_vin, String P_TD_SCHD_IN_NUM, String P_enq_num, String P_model, String p_variant_cd, String p_Td_location, String p_Td_status, String p_Td_date, String p_Td_startTime, String p_Td_endTime, String p_Address1, String p_Address2, String p_Address3, String p_Ofc_address1, String p_Ofc_address2, String p_Ofc_address3, String p_td_op_type) {
        this.P_MSPIN = P_MSPIN;
        this.p_pmc = p_pmc;
        this.P_DEALER_CD = P_DEALER_CD;
        this.P_FOR_CD = P_FOR_CD;
        this.p_vin = p_vin;
        this.P_TD_SCHD_IN_NUM = P_TD_SCHD_IN_NUM;
        this.P_enq_num = P_enq_num;
        this.P_model = P_model;
        this.p_variant_cd = p_variant_cd;
        this.p_Td_location = p_Td_location;
        this.p_Td_status = p_Td_status;
        this.p_Td_date = p_Td_date;
        this.p_Td_startTime = p_Td_startTime;
        this.p_Td_endTime = p_Td_endTime;
        this.p_Address1 = p_Address1;
        this.p_Address2 = p_Address2;
        this.p_Address3 = p_Address3;
        this.p_Ofc_address1 = p_Ofc_address1;
        this.p_Ofc_address2 = p_Ofc_address2;
        this.p_Ofc_address3 = p_Ofc_address3;
        this.p_td_op_type = p_td_op_type;
    }

    // getters and setters omitted for brevity
}
