/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoApplicantLoanSubmissionPojo {
	
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

      	@JsonProperty("processing_fee_display")
	    private String processing_fee_display;
      	
     	@JsonProperty("interest_rate")
	    private String interest_rate;

      	@JsonProperty("emi")
	    private String emi;
     	
     	@JsonProperty("min_cibil_score")
	    private String min_cibil_score;
     	
     	@JsonProperty("max_cibil_score")
	    private String max_cibil_score;

      	@JsonProperty("expected_tenure")
	    private String expected_tenure;

      	
		public CoApplicantLoanSubmissionPojo(String enquiry_id, String current_emi, String financier_id,
				String loan_amount, String loan_type, String tenure, String processing_fee_display,
				String interest_rate, String emi, String min_cibil_score, String max_cibil_score,
				String expected_tenure) {
			this.enquiry_id = enquiry_id;
			this.current_emi = current_emi;
			this.financier_id = financier_id;
			this.loan_amount = loan_amount;
			this.loan_type = loan_type;
			this.tenure = tenure;
			this.processing_fee_display = processing_fee_display;
			this.interest_rate = interest_rate;
			this.emi = emi;
			this.min_cibil_score = min_cibil_score;
			this.max_cibil_score = max_cibil_score;
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


		public String getMin_cibil_score() {
			return min_cibil_score;
		}


		public void setMin_cibil_score(String min_cibil_score) {
			this.min_cibil_score = min_cibil_score;
		}


		public String getMax_cibil_score() {
			return max_cibil_score;
		}


		public void setMax_cibil_score(String max_cibil_score) {
			this.max_cibil_score = max_cibil_score;
		}


		public String getExpected_tenure() {
			return expected_tenure;
		}


		public void setExpected_tenure(String expected_tenure) {
			this.expected_tenure = expected_tenure;
		}
     	
    
     
    
	}
