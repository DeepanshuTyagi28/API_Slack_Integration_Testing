/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveSelectedOfferPojo {
	
     	@JsonProperty("enquiry_id")
	    private String enquiry_id;
     	
     	@JsonProperty("mobile")
	    private String mobile;
     	
     	@JsonProperty("financier_id")
	    private String financier_id;
     	
     	@JsonProperty("financier_name")
	    private String financier_name;
     	
     	@JsonProperty("loan_type")
	    private String loan_type;
     	
     	@JsonProperty("interest_rate")
	    private String interest_rate;
     	
     	@JsonProperty("tenure")
	    private String tenure;
     	
     	@JsonProperty("down_payment")
	    private String down_payment;
     	
     	@JsonProperty("interest_rate_type")
	    private String interest_rate_type;
     	
     	@JsonProperty("loan_amount")
	    private String loan_amount;
     	
     	@JsonProperty("max_loan_amount")
	    private String max_loan_amount;
     	
     	@JsonProperty("emi")
	    private String emi;
     	
     	@JsonProperty("processing_fee")
	    private String processing_fee;
     	
     	@JsonProperty("ltv")
	    private String ltv;
     	
     	@JsonProperty("processing_fee_display")
	    private String processing_fee_display;  
     	
     	@JsonProperty("ltv_based_on")
	    private String ltv_based_on;
     	
     	@JsonProperty("component_ltv_amount")
	    private String component_ltv_amount;
     	
     	@JsonProperty("employment_type")
	    private String employment_type;  
     	
     	@JsonProperty("branch_code")
	    private String branch_code;
     	
     	@JsonProperty("branch_name")
	    private String branch_name;
     	
     	@JsonProperty("sales_promo_code")
	    private String sales_promo_code;    
     	
     	@JsonProperty("credit_promo_code")
	    private String credit_promo_code;

     	
		public SaveSelectedOfferPojo(String enquiry_id, String mobile, String financier_id, String financier_name,
				String loan_type, String interest_rate, String tenure, String down_payment, String interest_rate_type,
				String loan_amount, String max_loan_amount, String emi, String processing_fee, String ltv,
				String processing_fee_display, String ltv_based_on, String component_ltv_amount, String employment_type,
				String branch_code, String branch_name, String sales_promo_code, String credit_promo_code) {
			this.enquiry_id = enquiry_id;
			this.mobile = mobile;
			this.financier_id = financier_id;
			this.financier_name = financier_name;
			this.loan_type = loan_type;
			this.interest_rate = interest_rate;
			this.tenure = tenure;
			this.down_payment = down_payment;
			this.interest_rate_type = interest_rate_type;
			this.loan_amount = loan_amount;
			this.max_loan_amount = max_loan_amount;
			this.emi = emi;
			this.processing_fee = processing_fee;
			this.ltv = ltv;
			this.processing_fee_display = processing_fee_display;
			this.ltv_based_on = ltv_based_on;
			this.component_ltv_amount = component_ltv_amount;
			this.employment_type = employment_type;
			this.branch_code = branch_code;
			this.branch_name = branch_name;
			this.sales_promo_code = sales_promo_code;
			this.credit_promo_code = credit_promo_code;
		}

		
		
		public String getEnquiry_id() {
			return enquiry_id;
		}

		public void setEnquiry_id(String enquiry_id) {
			this.enquiry_id = enquiry_id;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getFinancier_id() {
			return financier_id;
		}

		public void setFinancier_id(String financier_id) {
			this.financier_id = financier_id;
		}

		public String getFinancier_name() {
			return financier_name;
		}

		public void setFinancier_name(String financier_name) {
			this.financier_name = financier_name;
		}

		public String getLoan_type() {
			return loan_type;
		}

		public void setLoan_type(String loan_type) {
			this.loan_type = loan_type;
		}

		public String getInterest_rate() {
			return interest_rate;
		}

		public void setInterest_rate(String interest_rate) {
			this.interest_rate = interest_rate;
		}

		public String getTenure() {
			return tenure;
		}

		public void setTenure(String tenure) {
			this.tenure = tenure;
		}

		public String getDown_payment() {
			return down_payment;
		}

		public void setDown_payment(String down_payment) {
			this.down_payment = down_payment;
		}

		public String getInterest_rate_type() {
			return interest_rate_type;
		}

		public void setInterest_rate_type(String interest_rate_type) {
			this.interest_rate_type = interest_rate_type;
		}

		public String getLoan_amount() {
			return loan_amount;
		}

		public void setLoan_amount(String loan_amount) {
			this.loan_amount = loan_amount;
		}

		public String getMax_loan_amount() {
			return max_loan_amount;
		}

		public void setMax_loan_amount(String max_loan_amount) {
			this.max_loan_amount = max_loan_amount;
		}

		public String getEmi() {
			return emi;
		}

		public void setEmi(String emi) {
			this.emi = emi;
		}

		public String getProcessing_fee() {
			return processing_fee;
		}

		public void setProcessing_fee(String processing_fee) {
			this.processing_fee = processing_fee;
		}

		public String getLtv() {
			return ltv;
		}

		public void setLtv(String ltv) {
			this.ltv = ltv;
		}

		public String getProcessing_fee_display() {
			return processing_fee_display;
		}

		public void setProcessing_fee_display(String processing_fee_display) {
			this.processing_fee_display = processing_fee_display;
		}

		public String getLtv_based_on() {
			return ltv_based_on;
		}

		public void setLtv_based_on(String ltv_based_on) {
			this.ltv_based_on = ltv_based_on;
		}

		public String getComponent_ltv_amount() {
			return component_ltv_amount;
		}

		public void setComponent_ltv_amount(String component_ltv_amount) {
			this.component_ltv_amount = component_ltv_amount;
		}

		public String getEmployment_type() {
			return employment_type;
		}

		public void setEmployment_type(String employment_type) {
			this.employment_type = employment_type;
		}

		public String getBranch_code() {
			return branch_code;
		}

		public void setBranch_code(String branch_code) {
			this.branch_code = branch_code;
		}

		public String getBranch_name() {
			return branch_name;
		}

		public void setBranch_name(String branch_name) {
			this.branch_name = branch_name;
		}

		public String getSales_promo_code() {
			return sales_promo_code;
		}

		public void setSales_promo_code(String sales_promo_code) {
			this.sales_promo_code = sales_promo_code;
		}

		public String getCredit_promo_code() {
			return credit_promo_code;
		}

		public void setCredit_promo_code(String credit_promo_code) {
			this.credit_promo_code = credit_promo_code;
		}
     	
    
	}
