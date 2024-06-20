/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveAadharConsentPojo {
	
     	@JsonProperty("enquiry_id")
	    private String enquiry_id;
     	
     	@JsonProperty("language")
	    private String language;
     	
     	@JsonProperty("content")
	    private String content;
     	
     	@JsonProperty("applicant_type")
	    private String applicant_type;
     	
     	@JsonProperty("consent")
	    private String consent;
     	
     	@JsonProperty("doc_type_id")
	    private String doc_type_id;
     	
     	@JsonProperty("proof_type_id")
	    private String proof_type_id;
     	
     	@JsonProperty("user_ip")
	    private String user_ip;

     	
		public SaveAadharConsentPojo(String enquiry_id, String language, String content, String applicant_type,
				String consent, String doc_type_id, String proof_type_id, String user_ip)
		{
			this.enquiry_id = enquiry_id;
			this.language = language;
			this.content = content;
			this.applicant_type = applicant_type;
			this.consent = consent;
			this.doc_type_id = doc_type_id;
			this.proof_type_id = proof_type_id;
			this.user_ip = user_ip;
		}


		
		
		public String getEnquiry_id() {
			return enquiry_id;
		}


		public void setEnquiry_id(String enquiry_id) {
			this.enquiry_id = enquiry_id;
		}


		public String getLanguage() {
			return language;
		}


		public void setLanguage(String language) {
			this.language = language;
		}


		public String getContent() {
			return content;
		}


		public void setContent(String content) {
			this.content = content;
		}


		public String getApplicant_type() {
			return applicant_type;
		}


		public void setApplicant_type(String applicant_type) {
			this.applicant_type = applicant_type;
		}


		public String getConsent() {
			return consent;
		}


		public void setConsent(String consent) {
			this.consent = consent;
		}


		public String getDoc_type_id() {
			return doc_type_id;
		}


		public void setDoc_type_id(String doc_type_id) {
			this.doc_type_id = doc_type_id;
		}


		public String getProof_type_id() {
			return proof_type_id;
		}


		public void setProof_type_id(String proof_type_id) {
			this.proof_type_id = proof_type_id;
		}


		public String getUser_ip() {
			return user_ip;
		}


		public void setUser_ip(String user_ip) {
			this.user_ip = user_ip;
		}

     	
     
	}
