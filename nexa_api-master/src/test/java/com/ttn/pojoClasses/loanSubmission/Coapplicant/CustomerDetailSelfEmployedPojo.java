/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDetailSelfEmployedPojo {
	
 	    @JsonProperty("enquiry_id")
         private String enquiry_id;
 	

     	@JsonProperty("first_name")
	    private String first_name;
     	
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
     	    	
     	@JsonProperty("residence_type")
	    private String residence_type;
     	
     	@JsonProperty("solicit_flag")
	    private String solicit_flag;  
     	
     	@JsonProperty("credit_check_flag")
	    private String credit_check_flag;
     	
     	@JsonProperty("pan_number")
	    private String pan_number;
     	
     	@JsonProperty("residing_since")
	    private String residing_since;
   
      	@JsonProperty("employment_type")
	    private String employment_type;
     	
    	@JsonProperty("sub_employment_id")
	    private String sub_employment_id;  
     	
     	@JsonProperty("current_emi")
	    private String current_emi;    
     	  
     	@JsonProperty("auth_mobile")
	    private String auth_mobile;

     	
     	@JsonProperty("self_work_experience_in_years")
	    private String self_work_experience_in_years;
     	
     	@JsonProperty("self_work_experience_in_months")
	    private String self_work_experience_in_months;
     	
     	@JsonProperty("tenure_of_business_in_years")
	    private String tenure_of_business_in_years;
     	
      	@JsonProperty("tenure_of_business_in_months")
	    private String tenure_of_business_in_months;

		public CustomerDetailSelfEmployedPojo(String enquiry_id, String first_name, String last_name, String email,
				String mobile, String dob, String city, String state, String dealer, String registration,
				String is_customer_co_applicant_type, String car_model, String car_variant, String residence_type,
				String solicit_flag, String credit_check_flag, String pan_number, String residing_since,
				String employment_type, String sub_employment_id, String current_emi, String auth_mobile,
				String self_work_experience_in_years, String self_work_experience_in_months,
				String tenure_of_business_in_years, String tenure_of_business_in_months) {
			this.enquiry_id = enquiry_id;
			this.first_name = first_name;
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
			this.residence_type = residence_type;
			this.solicit_flag = solicit_flag;
			this.credit_check_flag = credit_check_flag;
			this.pan_number = pan_number;
			this.residing_since = residing_since;
			this.employment_type = employment_type;
			this.sub_employment_id = sub_employment_id;
			this.current_emi = current_emi;
			this.auth_mobile = auth_mobile;
			this.self_work_experience_in_years = self_work_experience_in_years;
			this.self_work_experience_in_months = self_work_experience_in_months;
			this.tenure_of_business_in_years = tenure_of_business_in_years;
			this.tenure_of_business_in_months = tenure_of_business_in_months;
		}

		public String getEnquiry_id() {
			return enquiry_id;
		}

		public void setEnquiry_id(String enquiry_id) {
			this.enquiry_id = enquiry_id;
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

		public String getResidence_type() {
			return residence_type;
		}

		public void setResidence_type(String residence_type) {
			this.residence_type = residence_type;
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

		public String getResiding_since() {
			return residing_since;
		}

		public void setResiding_since(String residing_since) {
			this.residing_since = residing_since;
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

		public String getCurrent_emi() {
			return current_emi;
		}

		public void setCurrent_emi(String current_emi) {
			this.current_emi = current_emi;
		}

		public String getAuth_mobile() {
			return auth_mobile;
		}

		public void setAuth_mobile(String auth_mobile) {
			this.auth_mobile = auth_mobile;
		}

		public String getSelf_work_experience_in_years() {
			return self_work_experience_in_years;
		}

		public void setSelf_work_experience_in_years(String self_work_experience_in_years) {
			this.self_work_experience_in_years = self_work_experience_in_years;
		}

		public String getSelf_work_experience_in_months() {
			return self_work_experience_in_months;
		}

		public void setSelf_work_experience_in_months(String self_work_experience_in_months) {
			this.self_work_experience_in_months = self_work_experience_in_months;
		}

		public String getTenure_of_business_in_years() {
			return tenure_of_business_in_years;
		}

		public void setTenure_of_business_in_years(String tenure_of_business_in_years) {
			this.tenure_of_business_in_years = tenure_of_business_in_years;
		}

		public String getTenure_of_business_in_months() {
			return tenure_of_business_in_months;
		}

		public void setTenure_of_business_in_months(String tenure_of_business_in_months) {
			this.tenure_of_business_in_months = tenure_of_business_in_months;
		}
      	
      	
    
      	
	
     	

	}
