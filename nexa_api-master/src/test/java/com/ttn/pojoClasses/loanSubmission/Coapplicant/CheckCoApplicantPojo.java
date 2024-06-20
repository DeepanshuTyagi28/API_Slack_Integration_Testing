/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckCoApplicantPojo {
	
     	@JsonProperty("channel")
	    private String channel;
     	
     	@JsonProperty("mobile")
	    private String mobile;

		public CheckCoApplicantPojo(String channel, String mobile) {
			this.channel = channel;
			this.mobile = mobile;
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

     
    
	}
