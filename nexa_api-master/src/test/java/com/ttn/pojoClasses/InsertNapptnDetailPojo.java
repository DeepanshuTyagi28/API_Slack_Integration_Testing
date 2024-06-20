/**
 * 
 */
package com.ttn.pojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Akhilesh Kumar
 * @since 05/01/2023
 * @apiNote INSERT_NAPPNT_DTL from booking services
 *
 */
public class InsertNapptnDetailPojo {
	 @JsonProperty("pn_dealer_cd")
	    private String pn_dealer_cd;

	    @JsonProperty("pn_loc_cd")
	    private String pn_loc_cd;

	    @JsonProperty("pn_user_id")
	    private String pn_user_id;

	    @JsonProperty("pn_reg_num")
	    private String pn_reg_num;

	    @JsonProperty("pn_odometer")
	    private String pn_odometer;

	    @JsonProperty("pn_srvtype_cd")
	    private String pn_srvtype_cd;

	    @JsonProperty("pn_appnt_type")
	    private String pn_appnt_type;

	    @JsonProperty("pn_appnt_date")
	    private String pn_appnt_date;

	    @JsonProperty("pn_currentsa_cd")
	    private String pn_currentsa_cd;

	    @JsonProperty("pn_slot_cd")
	    private String pn_slot_cd;

	    @JsonProperty("pn_slottime_cd")
	    private String pn_slottime_cd;

	    @JsonProperty("pn_pickuptype")
	    private String pn_pickuptype;

	    @JsonProperty("pn_pickuploc")
	    private String pn_pickuploc;

	    @JsonProperty("pn_pickuptime")
	    private String pn_pickuptime;

	    @JsonProperty("pn_pickupaddr")
	    private String pn_pickupaddr;

	    @JsonProperty("pn_droploc")
	    private String pn_droploc;

	    @JsonProperty("pn_droptime")
	    private String pn_droptime;

	    @JsonProperty("pn_dropaddr")
	    private String pn_dropaddr;

	    @JsonProperty("pn_driver")
	    private String pn_driver;

	    @JsonProperty("pn_vehicleno")
	    private String pn_vehicleno;

	    @JsonProperty("pn_pickupremarks")
	    private String pn_pickupremarks;

	    @JsonProperty("pn_remark_non_prev_sa")
	    private String pn_remark_non_prev_sa;

	    @JsonProperty("pn_demand_jobs")
	    private String pn_demand_jobs;

	    @JsonProperty("pn_drop_driver")
	    private String pn_drop_driver;

	    @JsonProperty("pn_mobile_no")
	    private String pn_mobile_no;


	/**
	 * @param pn_dealer_cd
	 * @param pn_loc_cd
	 * @param pn_user_id
	 * @param pn_reg_num
	 * @param pn_odometer
	 * @param pn_srvtype_cd
	 * @param pn_appnt_type
	 * @param pn_appnt_date
	 * @param pn_currentsa_cd
	 * @param pn_slot_cd
	 * @param pn_slottime_cd
	 * @param pn_pickuptype
	 * @param pn_pickuploc
	 * @param pn_pickuptime
	 * @param pn_pickupaddr
	 * @param pn_droploc
	 * @param pn_droptime
	 * @param pn_dropaddr
	 * @param pn_driver
	 * @param pn_vehicleno
	 * @param pn_pickupremarks
	 * @param pn_remark_non_prev_sa
	 * @param pn_demand_jobs
	 * @param pn_drop_driver
	 * @param pn_mobile_no
	 */
	public InsertNapptnDetailPojo(@JsonProperty("pn_dealer_cd") String pn_dealer_cd,
            @JsonProperty("pn_loc_cd") String pn_loc_cd,
            @JsonProperty("pn_user_id") String pn_user_id,
            @JsonProperty("pn_reg_num") String pn_reg_num,
            @JsonProperty("pn_odometer") String pn_odometer,
            @JsonProperty("pn_srvtype_cd") String pn_srvtype_cd,
            @JsonProperty("pn_appnt_type") String pn_appnt_type,
            @JsonProperty("pn_appnt_date") String pn_appnt_date,
            @JsonProperty("pn_currentsa_cd") String pn_currentsa_cd,
            @JsonProperty("pn_slot_cd") String pn_slot_cd,
            @JsonProperty("pn_slottime_cd") String pn_slottime_cd,
            @JsonProperty("pn_pickuptype") String pn_pickuptype,
            @JsonProperty("pn_pickuploc") String pn_pickuploc,
            @JsonProperty("pn_pickuptime") String pn_pickuptime,
            @JsonProperty("pn_pickupaddr") String pn_pickupaddr,
            @JsonProperty("pn_droploc") String pn_droploc,
            @JsonProperty("pn_droptime") String pn_droptime,
            @JsonProperty("pn_dropaddr") String pn_dropaddr,
            @JsonProperty("pn_driver") String pn_driver,
            @JsonProperty("pn_vehicleno") String pn_vehicleno,
            @JsonProperty("pn_pickupremarks") String pn_pickupremarks,
            @JsonProperty("pn_remark_non_prev_sa") String pn_remark_non_prev_sa,
            @JsonProperty("pn_demand_jobs") String pn_demand_jobs,
            @JsonProperty("pn_drop_driver") String pn_drop_driver,
            @JsonProperty("pn_mobile_no") String pn_mobile_no) {
		super();
		this.pn_dealer_cd = pn_dealer_cd;
		this.pn_loc_cd = pn_loc_cd;
		this.pn_user_id = pn_user_id;
		this.pn_reg_num = pn_reg_num;
		this.pn_odometer = pn_odometer;
		this.pn_srvtype_cd = pn_srvtype_cd;
		this.pn_appnt_type = pn_appnt_type;
		this.pn_appnt_date = pn_appnt_date;
		this.pn_currentsa_cd = pn_currentsa_cd;
		this.pn_slot_cd = pn_slot_cd;
		this.pn_slottime_cd = pn_slottime_cd;
		this.pn_pickuptype = pn_pickuptype;
		this.pn_pickuploc = pn_pickuploc;
		this.pn_pickuptime = pn_pickuptime;
		this.pn_pickupaddr = pn_pickupaddr;
		this.pn_droploc = pn_droploc;
		this.pn_droptime = pn_droptime;
		this.pn_dropaddr = pn_dropaddr;
		this.pn_driver = pn_driver;
		this.pn_vehicleno = pn_vehicleno;
		this.pn_pickupremarks = pn_pickupremarks;
		this.pn_remark_non_prev_sa = pn_remark_non_prev_sa;
		this.pn_demand_jobs = pn_demand_jobs;
		this.pn_drop_driver = pn_drop_driver;
		this.pn_mobile_no = pn_mobile_no;
	}

	/**
	 * @return the pn_dealer_cd
	 */
	public String getPn_dealer_cd() {
		return pn_dealer_cd;
	}

	/**
	 * @param pn_dealer_cd the pn_dealer_cd to set
	 */
	public void setPn_dealer_cd(String pn_dealer_cd) {
		this.pn_dealer_cd = pn_dealer_cd;
	}

	/**
	 * @return the pn_loc_cd
	 */
	public String getPn_loc_cd() {
		return pn_loc_cd;
	}

	/**
	 * @param pn_loc_cd the pn_loc_cd to set
	 */
	public void setPn_loc_cd(String pn_loc_cd) {
		this.pn_loc_cd = pn_loc_cd;
	}

	/**
	 * @return the pn_user_id
	 */
	public String getPn_user_id() {
		return pn_user_id;
	}

	/**
	 * @param pn_user_id the pn_user_id to set
	 */
	public void setPn_user_id(String pn_user_id) {
		this.pn_user_id = pn_user_id;
	}

	/**
	 * @return the pn_reg_num
	 */
	public String getPn_reg_num() {
		return pn_reg_num;
	}

	/**
	 * @param pn_reg_num the pn_reg_num to set
	 */
	public void setPn_reg_num(String pn_reg_num) {
		this.pn_reg_num = pn_reg_num;
	}

	/**
	 * @return the pn_odometer
	 */
	public String getPn_odometer() {
		return pn_odometer;
	}

	/**
	 * @param pn_odometer the pn_odometer to set
	 */
	public void setPn_odometer(String pn_odometer) {
		this.pn_odometer = pn_odometer;
	}

	/**
	 * @return the pn_srvtype_cd
	 */
	public String getPn_srvtype_cd() {
		return pn_srvtype_cd;
	}

	/**
	 * @param pn_srvtype_cd the pn_srvtype_cd to set
	 */
	public void setPn_srvtype_cd(String pn_srvtype_cd) {
		this.pn_srvtype_cd = pn_srvtype_cd;
	}

	/**
	 * @return the pn_appnt_type
	 */
	public String getPn_appnt_type() {
		return pn_appnt_type;
	}

	/**
	 * @param pn_appnt_type the pn_appnt_type to set
	 */
	public void setPn_appnt_type(String pn_appnt_type) {
		this.pn_appnt_type = pn_appnt_type;
	}

	/**
	 * @return the pn_appnt_date
	 */
	public String getPn_appnt_date() {
		return pn_appnt_date;
	}

	/**
	 * @param pn_appnt_date the pn_appnt_date to set
	 */
	public void setPn_appnt_date(String pn_appnt_date) {
		this.pn_appnt_date = pn_appnt_date;
	}

	/**
	 * @return the pn_currentsa_cd
	 */
	public String getPn_currentsa_cd() {
		return pn_currentsa_cd;
	}

	/**
	 * @param pn_currentsa_cd the pn_currentsa_cd to set
	 */
	public void setPn_currentsa_cd(String pn_currentsa_cd) {
		this.pn_currentsa_cd = pn_currentsa_cd;
	}

	/**
	 * @return the pn_slot_cd
	 */
	public String getPn_slot_cd() {
		return pn_slot_cd;
	}

	/**
	 * @param pn_slot_cd the pn_slot_cd to set
	 */
	public void setPn_slot_cd(String pn_slot_cd) {
		this.pn_slot_cd = pn_slot_cd;
	}

	/**
	 * @return the pn_slottime_cd
	 */
	public String getPn_slottime_cd() {
		return pn_slottime_cd;
	}

	/**
	 * @param pn_slottime_cd the pn_slottime_cd to set
	 */
	public void setPn_slottime_cd(String pn_slottime_cd) {
		this.pn_slottime_cd = pn_slottime_cd;
	}

	/**
	 * @return the pn_pickuptype
	 */
	public String getPn_pickuptype() {
		return pn_pickuptype;
	}

	/**
	 * @param pn_pickuptype the pn_pickuptype to set
	 */
	public void setPn_pickuptype(String pn_pickuptype) {
		this.pn_pickuptype = pn_pickuptype;
	}

	/**
	 * @return the pn_pickuploc
	 */
	public String getPn_pickuploc() {
		return pn_pickuploc;
	}

	/**
	 * @param pn_pickuploc the pn_pickuploc to set
	 */
	public void setPn_pickuploc(String pn_pickuploc) {
		this.pn_pickuploc = pn_pickuploc;
	}

	/**
	 * @return the pn_pickuptime
	 */
	public String getPn_pickuptime() {
		return pn_pickuptime;
	}

	/**
	 * @param pn_pickuptime the pn_pickuptime to set
	 */
	public void setPn_pickuptime(String pn_pickuptime) {
		this.pn_pickuptime = pn_pickuptime;
	}

	/**
	 * @return the pn_pickupaddr
	 */
	public String getPn_pickupaddr() {
		return pn_pickupaddr;
	}

	/**
	 * @param pn_pickupaddr the pn_pickupaddr to set
	 */
	public void setPn_pickupaddr(String pn_pickupaddr) {
		this.pn_pickupaddr = pn_pickupaddr;
	}

	/**
	 * @return the pn_droploc
	 */
	public String getPn_droploc() {
		return pn_droploc;
	}

	/**
	 * @param pn_droploc the pn_droploc to set
	 */
	public void setPn_droploc(String pn_droploc) {
		this.pn_droploc = pn_droploc;
	}

	/**
	 * @return the pn_droptime
	 */
	public String getPn_droptime() {
		return pn_droptime;
	}

	/**
	 * @param pn_droptime the pn_droptime to set
	 */
	public void setPn_droptime(String pn_droptime) {
		this.pn_droptime = pn_droptime;
	}

	/**
	 * @return the pn_dropaddr
	 */
	public String getPn_dropaddr() {
		return pn_dropaddr;
	}

	/**
	 * @param pn_dropaddr the pn_dropaddr to set
	 */
	public void setPn_dropaddr(String pn_dropaddr) {
		this.pn_dropaddr = pn_dropaddr;
	}

	/**
	 * @return the pn_driver
	 */
	public String getPn_driver() {
		return pn_driver;
	}

	/**
	 * @param pn_driver the pn_driver to set
	 */
	public void setPn_driver(String pn_driver) {
		this.pn_driver = pn_driver;
	}

	/**
	 * @return the pn_vehicleno
	 */
	public String getPn_vehicleno() {
		return pn_vehicleno;
	}

	/**
	 * @param pn_vehicleno the pn_vehicleno to set
	 */
	public void setPn_vehicleno(String pn_vehicleno) {
		this.pn_vehicleno = pn_vehicleno;
	}

	/**
	 * @return the pn_pickupremarks
	 */
	public String getPn_pickupremarks() {
		return pn_pickupremarks;
	}

	/**
	 * @param pn_pickupremarks the pn_pickupremarks to set
	 */
	public void setPn_pickupremarks(String pn_pickupremarks) {
		this.pn_pickupremarks = pn_pickupremarks;
	}

	/**
	 * @return the pn_remark_non_prev_sa
	 */
	public String getPn_remark_non_prev_sa() {
		return pn_remark_non_prev_sa;
	}

	/**
	 * @param pn_remark_non_prev_sa the pn_remark_non_prev_sa to set
	 */
	public void setPn_remark_non_prev_sa(String pn_remark_non_prev_sa) {
		this.pn_remark_non_prev_sa = pn_remark_non_prev_sa;
	}

	/**
	 * @return the pn_demand_jobs
	 */
	public String getPn_demand_jobs() {
		return pn_demand_jobs;
	}

	/**
	 * @param pn_demand_jobs the pn_demand_jobs to set
	 */
	public void setPn_demand_jobs(String pn_demand_jobs) {
		this.pn_demand_jobs = pn_demand_jobs;
	}

	/**
	 * @return the pn_drop_driver
	 */
	public String getPn_drop_driver() {
		return pn_drop_driver;
	}

	/**
	 * @param pn_drop_driver the pn_drop_driver to set
	 */
	public void setPn_drop_driver(String pn_drop_driver) {
		this.pn_drop_driver = pn_drop_driver;
	}

	/**
	 * @return the pn_mobile_no
	 */
	public String getPn_mobile_no() {
		return pn_mobile_no;
	}

	/**
	 * @param pn_mobile_no the pn_mobile_no to set
	 */
	public void setPn_mobile_no(String pn_mobile_no) {
		this.pn_mobile_no = pn_mobile_no;
	}

}
