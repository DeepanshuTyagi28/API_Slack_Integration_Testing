/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 * @since 06/01/2023
 * @info Vehicle_Details_with_Reg_No Booking service 
 *
 */
public class VehicleDetailsWithRegNoPojo {
	

	    private String pn_loc_cd;
	    private String pn_dealer_cd;
	    private String pn_reg_num;
	    
	    public VehicleDetailsWithRegNoPojo(String pn_loc_cd, String pn_dealer_cd, String pn_reg_num) {
	        this.pn_loc_cd = pn_loc_cd;
	        this.pn_dealer_cd = pn_dealer_cd;
	        this.pn_reg_num = pn_reg_num;
	    }
	    
	    public String getPn_loc_cd() {
	        return pn_loc_cd;
	    }
	    
	    public void setPn_loc_cd(String pn_loc_cd) {
	        this.pn_loc_cd = pn_loc_cd;
	    }
	    
	    public String getPn_dealer_cd() {
	        return pn_dealer_cd;
	    }
	    
	    public void setPn_dealer_cd(String pn_dealer_cd) {
	        this.pn_dealer_cd = pn_dealer_cd;
	    }
	    
	    public String getPn_reg_num() {
	        return pn_reg_num;
	    }
	    
	    public void setPn_reg_num(String pn_reg_num) {
	        this.pn_reg_num = pn_reg_num;
	    }
	}
