/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 * @info Vehicle_Details by using mobile number 
 *
 */
public class BookingServiceVehicleDetails {

	    private String P_MOBILE;

		/**
		 * @param p_MOBILE
		 */
		public BookingServiceVehicleDetails(String p_MOBILE) {
			
			this.P_MOBILE = p_MOBILE;
		}

		/**
		 * @return the p_MOBILE
		 */
		public String getP_MOBILE() {
			return P_MOBILE;
		}

		/**
		 * @param p_MOBILE the p_MOBILE to set
		 */
		public void setP_MOBILE(String p_MOBILE) {
			P_MOBILE = p_MOBILE;
		}
	    

}
