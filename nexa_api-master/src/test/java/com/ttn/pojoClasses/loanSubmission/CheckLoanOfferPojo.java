/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckLoanOfferPojo {
	
     	@JsonProperty("enquiry_id")
	    private String enquiry_id;
     	
     	@JsonProperty("mobile")
	    private String mobile;
     	
     	@JsonProperty("model_code")
	    private String model_code;
     	
     	@JsonProperty("ex_show_room_price")
	    private String ex_show_room_price;
     	
     	@JsonProperty("on_road_price")
	    private String on_road_price;
     	
     	@JsonProperty("loan_amount")
	    private String loan_amount;
     	
     	@JsonProperty("tenure")
	    private String tenure;
     	
     	@JsonProperty("down_payment")
	    private String down_payment;
     	
     	@JsonProperty("estimated_emi")
	    private String estimated_emi;
     	
     	@JsonProperty("processing_fee")
	    private String processing_fee;
     	
     	@JsonProperty("variant_code")
	    private String variant_code;
     	
     	@JsonProperty("dob")
	    private String dob;
     	
     	@JsonProperty("employment_type")
	    private String employment_type;
     	
     	@JsonProperty("gender")
	    private String gender;
     	
     	@JsonProperty("first_name")
	    private String first_name;
     	
     	@JsonProperty("last_name")
	    private String last_name;  
     	
     	@JsonProperty("email")
	    private String email;
     	     	
     	@JsonProperty("pan")
	    private String pan;  
     	
     	@JsonProperty("aadhar")
	    private String aadhar;
     	
     	@JsonProperty("net_annual_income")
	    private String net_annual_income;
     	
     	@JsonProperty("residence_type")
	    private String residence_type;    
     	
     	@JsonProperty("employer_type")
	    private String employer_type;
     	
     	@JsonProperty("interest_rate")
	    private String interest_rate;
     	

		public CheckLoanOfferPojo(String enquiry_id, String mobile, String model_code, String ex_show_room_price,
				String on_road_price, String loan_amount, String tenure, String down_payment, String estimated_emi,
				String processing_fee, String variant_code, String dob, String employment_type, String gender,
				String first_name, String last_name, String email, String pan, String aadhar, String net_annual_income,
				String residence_type, String employer_type, String interest_rate) {
			this.enquiry_id = enquiry_id;
			this.mobile = mobile;
			this.model_code = model_code;
			this.ex_show_room_price = ex_show_room_price;
			this.on_road_price = on_road_price;
			this.loan_amount = loan_amount;
			this.tenure = tenure;
			this.down_payment = down_payment;
			this.estimated_emi = estimated_emi;
			this.processing_fee = processing_fee;
			this.variant_code = variant_code;
			this.dob = dob;
			this.employment_type = employment_type;
			this.gender = gender;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
			this.pan = pan;
			this.aadhar = aadhar;
			this.net_annual_income = net_annual_income;
			this.residence_type = residence_type;
			this.employer_type = employer_type;
			this.interest_rate = interest_rate;
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


		public String getModel_code() {
			return model_code;
		}


		public void setModel_code(String model_code) {
			this.model_code = model_code;
		}


		public String getEx_show_room_price() {
			return ex_show_room_price;
		}


		public void setEx_show_room_price(String ex_show_room_price) {
			this.ex_show_room_price = ex_show_room_price;
		}


		public String getOn_road_price() {
			return on_road_price;
		}


		public void setOn_road_price(String on_road_price) {
			this.on_road_price = on_road_price;
		}


		public String getLoan_amount() {
			return loan_amount;
		}


		public void setLoan_amount(String loan_amount) {
			this.loan_amount = loan_amount;
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


		public String getEstimated_emi() {
			return estimated_emi;
		}


		public void setEstimated_emi(String estimated_emi) {
			this.estimated_emi = estimated_emi;
		}


		public String getProcessing_fee() {
			return processing_fee;
		}


		public void setProcessing_fee(String processing_fee) {
			this.processing_fee = processing_fee;
		}


		public String getVariant_code() {
			return variant_code;
		}


		public void setVariant_code(String variant_code) {
			this.variant_code = variant_code;
		}


		public String getDob() {
			return dob;
		}


		public void setDob(String dob) {
			this.dob = dob;
		}


		public String getEmployment_type() {
			return employment_type;
		}


		public void setEmployment_type(String employment_type) {
			this.employment_type = employment_type;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getFirst_name() {
			return first_name;
		}


		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}


		public String getLast_name() {
			return last_name;
		}


		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPan() {
			return pan;
		}


		public void setPan(String pan) {
			this.pan = pan;
		}


		public String getAadhar() {
			return aadhar;
		}


		public void setAadhar(String aadhar) {
			this.aadhar = aadhar;
		}


		public String getNet_annual_income() {
			return net_annual_income;
		}


		public void setNet_annual_income(String net_annual_income) {
			this.net_annual_income = net_annual_income;
		}


		public String getResidence_type() {
			return residence_type;
		}


		public void setResidence_type(String residence_type) {
			this.residence_type = residence_type;
		}


		public String getEmployer_type() {
			return employer_type;
		}


		public void setEmployer_type(String employer_type) {
			this.employer_type = employer_type;
		}


		public String getInterest_rate() {
			return interest_rate;
		}


		public void setInterest_rate(String interest_rate) {
			this.interest_rate = interest_rate;
		}
     	
     	
	

	}
