/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDetailPojo {
	
     	@JsonProperty("first_name")
	    private String first_name;
     	
     	@JsonProperty("enquiry_id")
	    private String enquiry_id;
     	
     	@JsonProperty("last_name")
	    private String last_name;
     	
     	@JsonProperty("email")
	    private String email;
     	
     	@JsonProperty("mobile")
	    private String mobile;
     	
     	@JsonProperty("dob")
	    private String dob;
     	
     	@JsonProperty("city")
	    private String city;
     	
     	@JsonProperty("state")
	    private String state;
     	
     	@JsonProperty("dealer")
	    private String dealer;
     	
     	@JsonProperty("registration")
	    private String registration;
     	
     	@JsonProperty("is_customer_co_applicant_type")
	    private String is_customer_co_applicant_type;
     	
     	@JsonProperty("car_model")
	    private String car_model;
     	
     	@JsonProperty("car_variant")
	    private String car_variant;
     	
     	@JsonProperty("employment_type")
	    private String employment_type;
     	
     	@JsonProperty("sub_employment_id")
	    private String sub_employment_id;  
     	
     	@JsonProperty("residence_type")
	    private String residence_type;
     	
     	@JsonProperty("employer_type")
	    private String employer_type;
     	
     	@JsonProperty("solicit_flag")
	    private String solicit_flag;  
     	
     	@JsonProperty("credit_check_flag")
	    private String credit_check_flag;
     	
     	@JsonProperty("pan_number")
	    private String pan_number;
     	
     	@JsonProperty("employer")
	    private String employer;    
     	
     	@JsonProperty("aadhar_number")
	    private String aadhar_number;
     	
     	@JsonProperty("annual_salary")
	    private String annual_salary;
     	
     	@JsonProperty("net_annual_income")
	    private String net_annual_income;
     	
     	@JsonProperty("current_emi")
	    private String current_emi;
     	
     	@JsonProperty("residing_since")
	    private String residing_since;
     	
     	@JsonProperty("work_experience_years")
	    private String work_experience_years;
     	
     	@JsonProperty("work_experience_months")
	    private String work_experience_months;
	    
     	@JsonProperty("auth_mobile")
	    private String auth_mobile;

	    
		public CustomerDetailPojo(String first_name, String enquiry_id, String last_name, String email, String mobile,
				String dob, String city, String state, String dealer, String registration,
				String is_customer_co_applicant_type, String car_model, String car_variant, String employment_type,
				String sub_employment_id, String residence_type, String employer_type, String solicit_flag,
				String credit_check_flag, String pan_number, String employer, String aadhar_number,
				String annual_salary, String net_annual_income, String current_emi, String residing_since,
				String work_experience_years, String work_experience_months , String auth_mobile) {
			
			this.first_name = first_name;
			this.enquiry_id = enquiry_id;
			this.last_name = last_name;
			this.email = email;
			this.mobile = mobile;
			this.dob = dob;
			this.city = city;
			this.state = state;
			this.dealer = dealer;
			this.registration = registration;
			this.is_customer_co_applicant_type = is_customer_co_applicant_type;
			this.car_model = car_model;
			this.car_variant = car_variant;
			this.employment_type = employment_type;
			this.sub_employment_id = sub_employment_id;
			this.residence_type = residence_type;
			this.employer_type = employer_type;
			this.solicit_flag = solicit_flag;
			this.credit_check_flag = credit_check_flag;
			this.pan_number = pan_number;
			this.employer = employer;
			this.aadhar_number = aadhar_number;
			this.annual_salary = annual_salary;
			this.net_annual_income = net_annual_income;
			this.current_emi = current_emi;
			this.residing_since = residing_since;
			this.work_experience_years = work_experience_years;
			this.work_experience_months = work_experience_months;
			this.auth_mobile = auth_mobile;

			
		}


		public String getFirst_name() {
			return first_name;
		}


		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}


		public String getEnquiry_id() {
			return enquiry_id;
		}


		public void setEnquiry_id(String enquiry_id) {
			this.enquiry_id = enquiry_id;
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


		public String getMobile() {
			return mobile;
		}


		public void setMobile(String mobile) {
			this.mobile = mobile;
		}


		public String getDob() {
			return dob;
		}


		public void setDob(String dob) {
			this.dob = dob;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getDealer() {
			return dealer;
		}


		public void setDealer(String dealer) {
			this.dealer = dealer;
		}


		public String getRegistration() {
			return registration;
		}


		public void setRegistration(String registration) {
			this.registration = registration;
		}


		public String getIs_customer_co_applicant_type() {
			return is_customer_co_applicant_type;
		}


		public void setIs_customer_co_applicant_type(String is_customer_co_applicant_type) {
			this.is_customer_co_applicant_type = is_customer_co_applicant_type;
		}


		public String getCar_model() {
			return car_model;
		}


		public void setCar_model(String car_model) {
			this.car_model = car_model;
		}


		public String getCar_variant() {
			return car_variant;
		}


		public void setCar_variant(String car_variant) {
			this.car_variant = car_variant;
		}


		public String getEmployment_type() {
			return employment_type;
		}


		public void setEmployment_type(String employment_type) {
			this.employment_type = employment_type;
		}


		public String getSub_employment_id() {
			return sub_employment_id;
		}


		public void setSub_employment_id(String sub_employment_id) {
			this.sub_employment_id = sub_employment_id;
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


		public String getSolicit_flag() {
			return solicit_flag;
		}


		public void setSolicit_flag(String solicit_flag) {
			this.solicit_flag = solicit_flag;
		}


		public String getCredit_check_flag() {
			return credit_check_flag;
		}


		public void setCredit_check_flag(String credit_check_flag) {
			this.credit_check_flag = credit_check_flag;
		}


		public String getPan_number() {
			return pan_number;
		}


		public void setPan_number(String pan_number) {
			this.pan_number = pan_number;
		}


		public String getEmployer() {
			return employer;
		}


		public void setEmployer(String employer) {
			this.employer = employer;
		}


		public String getAadhar_number() {
			return aadhar_number;
		}


		public void setAadhar_number(String aadhar_number) {
			this.aadhar_number = aadhar_number;
		}


		public String getAnnual_salary() {
			return annual_salary;
		}


		public void setAnnual_salary(String annual_salary) {
			this.annual_salary = annual_salary;
		}


		public String getNet_annual_income() {
			return net_annual_income;
		}


		public void setNet_annual_income(String net_annual_income) {
			this.net_annual_income = net_annual_income;
		}


		public String getCurrent_emi() {
			return current_emi;
		}


		public void setCurrent_emi(String current_emi) {
			this.current_emi = current_emi;
		}


		public String getResiding_since() {
			return residing_since;
		}


		public void setResiding_since(String residing_since) {
			this.residing_since = residing_since;
		}


		public String getWork_experience_years() {
			return work_experience_years;
		}


		public void setWork_experience_years(String work_experience_years) {
			this.work_experience_years = work_experience_years;
		}


		public String getWork_experience_months() {
			return work_experience_months;
		}


		public void setWork_experience_months(String work_experience_months) {
			this.work_experience_months = work_experience_months;
		}
		
		
		
		
		public String getauth_mobile() {
			return auth_mobile;
		}


		public void setauth_mobile(String auth_mobile) {
			this.auth_mobile = auth_mobile;
		}

	}
