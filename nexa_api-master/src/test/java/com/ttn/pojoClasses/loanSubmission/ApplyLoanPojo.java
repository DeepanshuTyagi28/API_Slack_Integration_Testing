/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplyLoanPojo {
	
     	@JsonProperty("enquiry_id")
	    private String enquiry_id;
     	
     	@JsonProperty("current_emi")
	    private String current_emi;
     	
     	@JsonProperty("financier_id")
	    private String financier_id;
     	
     	@JsonProperty("loan_amount")
	    private String loan_amount;
     	
     	@JsonProperty("loan_type")
	    private String loan_type;
     	
     	@JsonProperty("tenure")
	    private String tenure;
     	
     	@JsonProperty("doc_list")
	    private String doc_list;
     	
     	@JsonProperty("message")
	    private String message;
     	
     	@JsonProperty("processing_fee")
	    private String processing_fee;
     	
     	@JsonProperty("processing_fee_display")
	    private String processing_fee_display;
     	
     	@JsonProperty("interest_rate")
	    private String interest_rate;
     	
     	@JsonProperty("emi")
	    private String emi;
     	
     	@JsonProperty("expected_tenure")
	    private String expected_tenure;

     	
		public ApplyLoanPojo(String enquiry_id, String current_emi, String financier_id, String loan_amount,
				String loan_type, String tenure, String doc_list, String message, String processing_fee,
				String processing_fee_display, String interest_rate, String emi, String expected_tenure) {
			
			this.enquiry_id = enquiry_id;
			this.current_emi = current_emi;
			this.financier_id = financier_id;
			this.loan_amount = loan_amount;
			this.loan_type = loan_type;
			this.tenure = tenure;
			this.doc_list = doc_list;
			this.message = message;
			this.processing_fee = processing_fee;
			this.processing_fee_display = processing_fee_display;
			this.interest_rate = interest_rate;
			this.emi = emi;
			this.expected_tenure = expected_tenure;
		}

		public String getEnquiry_id() {
			return enquiry_id;
		}

		public void setEnquiry_id(String enquiry_id) {
			this.enquiry_id = enquiry_id;
		}

		public String getCurrent_emi() {
			return current_emi;
		}

		public void setCurrent_emi(String current_emi) {
			this.current_emi = current_emi;
		}

		public String getFinancier_id() {
			return financier_id;
		}

		public void setFinancier_id(String financier_id) {
			this.financier_id = financier_id;
		}

		public String getLoan_amount() {
			return loan_amount;
		}

		public void setLoan_amount(String loan_amount) {
			this.loan_amount = loan_amount;
		}

		public String getLoan_type() {
			return loan_type;
		}

		public void setLoan_type(String loan_type) {
			this.loan_type = loan_type;
		}

		public String getTenure() {
			return tenure;
		}

		public void setTenure(String tenure) {
			this.tenure = tenure;
		}

		public String getDoc_list() {
			return doc_list;
		}

		public void setDoc_list(String doc_list) {
			this.doc_list = doc_list;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getProcessing_fee() {
			return processing_fee;
		}

		public void setProcessing_fee(String processing_fee) {
			this.processing_fee = processing_fee;
		}

		public String getProcessing_fee_display() {
			return processing_fee_display;
		}

		public void setProcessing_fee_display(String processing_fee_display) {
			this.processing_fee_display = processing_fee_display;
		}

		public String getInterest_rate() {
			return interest_rate;
		}

		public void setInterest_rate(String interest_rate) {
			this.interest_rate = interest_rate;
		}

		public String getEmi() {
			return emi;
		}

		public void setEmi(String emi) {
			this.emi = emi;
		}

		public String getExpected_tenure() {
			return expected_tenure;
		}

		public void setExpected_tenure(String expected_tenure) {
			this.expected_tenure = expected_tenure;
		}
     	
     	

	}
