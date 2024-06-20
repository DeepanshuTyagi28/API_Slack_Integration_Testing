/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllOfferPojo {
	
     	@JsonProperty("enquiry_id")
	    private String enquiry_id;
     	
     	@JsonProperty("tenure")
	    private String tenure;

		public AllOfferPojo(String enquiry_id, String tenure) {
			this.enquiry_id = enquiry_id;
			this.tenure = tenure;
		}

		
		public String getEnquiry_id() {
			return enquiry_id;
		}

		public void setEnquiry_id(String enquiry_id) {
			this.enquiry_id = enquiry_id;
		}

		
		
		public String getTenure() {
			return tenure;
		}

		public void setTenure(String tenure) {
			this.tenure = tenure;
		}
   
	}
