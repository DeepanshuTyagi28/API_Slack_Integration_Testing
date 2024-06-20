/**
 * 
 */
package com.ttn.pojoClasses.arenaService;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetStateMasterPojo {
	
   //  	@JsonProperty("enquiry_id")
	    private String P_PMC;

		public GetStateMasterPojo(String p_PMC) {
			P_PMC = p_PMC;
		}

		
		public String getP_PMC() {
			return P_PMC;
		}

		public void setP_PMC(String p_PMC) {
			P_PMC = p_PMC;
		}
   
    
	}
