/**
 * 
 */
package com.ttn.pojoClasses.loanSubmission.Coapplicant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoApplicantLoanOfferPojo {
	
	    private String enquiry_id;
	//    private String tenure;

	    
		public CoApplicantLoanOfferPojo(String enquiry_id) {
			this.enquiry_id = enquiry_id;
	//		this.tenure = tenure;
		}

		
		public String getEnquiry_id() {
			return enquiry_id;
		}

		public void setEnquiry_id(String enquiry_id) {
			this.enquiry_id = enquiry_id;
		}

		
//		
//		public String getTenure() {
//			return tenure;
//		}
//
//		public void setTenure(String tenure) {
//			this.tenure = tenure;
//		}
//     	
	   

	}
