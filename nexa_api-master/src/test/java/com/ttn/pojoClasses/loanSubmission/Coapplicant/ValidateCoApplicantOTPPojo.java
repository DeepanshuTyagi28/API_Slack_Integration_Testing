/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidateCoApplicantOTPPojo {
	
     	@JsonProperty("channel")
	    private String channel;
     	
     	@JsonProperty("mobile")
	    private String mobile;

       	@JsonProperty("otp")
	    private String otp;
     	
     	@JsonProperty("applicant_type")
	    private String applicant_type;

		public ValidateCoApplicantOTPPojo(String channel, String mobile, String otp, String applicant_type) {
			this.channel = channel;
			this.mobile = mobile;
			this.otp = otp;
			this.applicant_type = applicant_type;
		}

		
		public String getChannel() {
			return channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}

		
		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		
		public String getOtp() {
			return otp;
		}

		public void setOtp(String otp) {
			this.otp = otp;
		}

		
		public String getApplicant_type() {
			return applicant_type;
		}

		public void setApplicant_type(String applicant_type) {
			this.applicant_type = applicant_type;
		}


     
    
	}
