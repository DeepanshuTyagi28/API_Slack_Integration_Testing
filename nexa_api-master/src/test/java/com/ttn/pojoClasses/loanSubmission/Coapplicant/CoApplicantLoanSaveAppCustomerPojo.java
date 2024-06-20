/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoApplicantLoanSaveAppCustomerPojo {
	
     	@JsonProperty("is_co_applicant_journey")
	    private String is_co_applicant_journey;
     
      	@JsonProperty("channel_id")
	    private String channel_id;
     	
     	@JsonProperty("financier_id")
	    private String financier_id;

      	@JsonProperty("enquiry_id")
	    private String enquiry_id;
     	
     	@JsonProperty("mobile")
	    private String mobile;

      	@JsonProperty("title")
	    private String title;

      	@JsonProperty("marital_status")
	    private String marital_status;
      	
     	@JsonProperty("father_name")
	    private String father_name;

      	@JsonProperty("gender")
	    private String gender;
     	
     	@JsonProperty("pan")
	    private String pan;
     	
     	@JsonProperty("aadhar")
	    private String aadhar;

      	@JsonProperty("gross_annual_income")
	    private String gross_annual_income;

      	@JsonProperty("no_of_dependents")
	    private String no_of_dependents;
     	
     	@JsonProperty("education")
	    private String education;
     	
     	@JsonProperty("work_experience_years")
	    private String work_experience_years;

      	@JsonProperty("work_experience_months")
	    private String work_experience_months;
     
     	@JsonProperty("first_name")
	    private String first_name;

      	@JsonProperty("middle_name")
	    private String middle_name;
     	
     	@JsonProperty("last_name")
	    private String last_name;
     	
     	@JsonProperty("email")
	    private String email;

      	@JsonProperty("dob")
	    private String dob;     	
      	
     	@JsonProperty("mother_name")
	    private String mother_name;

      	@JsonProperty("nationality")
	    private String nationality;
     
     	@JsonProperty("residence_type")
	    private String residence_type;

      	@JsonProperty("staying_since")
	    private String staying_since;
     	
     	@JsonProperty("employment_type")
	    private String employment_type;

		public CoApplicantLoanSaveAppCustomerPojo(String is_co_applicant_journey, String channel_id,
				String financier_id, String enquiry_id, String mobile, String title, String marital_status,
				String father_name, String gender, String pan, String aadhar, String gross_annual_income,
				String no_of_dependents, String education, String work_experience_years, String work_experience_months,
				String first_name, String middle_name, String last_name, String email, String dob, String mother_name,
				String nationality, String residence_type, String staying_since, String employment_type) {
			this.is_co_applicant_journey = is_co_applicant_journey;
			this.channel_id = channel_id;
			this.financier_id = financier_id;
			this.enquiry_id = enquiry_id;
			this.mobile = mobile;
			this.title = title;
			this.marital_status = marital_status;
			this.father_name = father_name;
			this.gender = gender;
			this.pan = pan;
			this.aadhar = aadhar;
			this.gross_annual_income = gross_annual_income;
			this.no_of_dependents = no_of_dependents;
			this.education = education;
			this.work_experience_years = work_experience_years;
			this.work_experience_months = work_experience_months;
			this.first_name = first_name;
			this.middle_name = middle_name;
			this.last_name = last_name;
			this.email = email;
			this.dob = dob;
			this.mother_name = mother_name;
			this.nationality = nationality;
			this.residence_type = residence_type;
			this.staying_since = staying_since;
			this.employment_type = employment_type;
		}

		public String getIs_co_applicant_journey() {
			return is_co_applicant_journey;
		}

		public void setIs_co_applicant_journey(String is_co_applicant_journey) {
			this.is_co_applicant_journey = is_co_applicant_journey;
		}

		public String getChannel_id() {
			return channel_id;
		}

		public void setChannel_id(String channel_id) {
			this.channel_id = channel_id;
		}

		public String getFinancier_id() {
			return financier_id;
		}

		public void setFinancier_id(String financier_id) {
			this.financier_id = financier_id;
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

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getMarital_status() {
			return marital_status;
		}

		public void setMarital_status(String marital_status) {
			this.marital_status = marital_status;
		}

		public String getFather_name() {
			return father_name;
		}

		public void setFather_name(String father_name) {
			this.father_name = father_name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
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

		public String getGross_annual_income() {
			return gross_annual_income;
		}

		public void setGross_annual_income(String gross_annual_income) {
			this.gross_annual_income = gross_annual_income;
		}

		public String getNo_of_dependents() {
			return no_of_dependents;
		}

		public void setNo_of_dependents(String no_of_dependents) {
			this.no_of_dependents = no_of_dependents;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
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

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getMiddle_name() {
			return middle_name;
		}

		public void setMiddle_name(String middle_name) {
			this.middle_name = middle_name;
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

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getMother_name() {
			return mother_name;
		}

		public void setMother_name(String mother_name) {
			this.mother_name = mother_name;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getResidence_type() {
			return residence_type;
		}

		public void setResidence_type(String residence_type) {
			this.residence_type = residence_type;
		}

		public String getStaying_since() {
			return staying_since;
		}

		public void setStaying_since(String staying_since) {
			this.staying_since = staying_since;
		}

		public String getEmployment_type() {
			return employment_type;
		}

		public void setEmployment_type(String employment_type) {
			this.employment_type = employment_type;
		}

     
    
	}
