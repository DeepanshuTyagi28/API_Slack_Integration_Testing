/**
 * 
 */
package com.ttn.pojoClasses;

/**
 * @author Akhilesh Kumar
 * @apiNote GetDetailsByUniqueId
 *
 */
public class GetDetailsByUniqueId_Loyelty_Pojo {
	private String tier;
	private String u_id;
	
	/**
	 * @return the tier
	 */
	public String getTier() {
		return tier;
	}

	/**
	 * @param tier the tier to set
	 */
	public void setTier(String tier) {
		this.tier = tier;
	}

	/**
	 * @return the u_id
	 */
	public String getU_id() {
		return u_id;
	}

	/**
	 * @param u_id the u_id to set
	 */
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	/**
	 * @param tier
	 * @param u_id
	 */
	public GetDetailsByUniqueId_Loyelty_Pojo(String tier, String u_id) {
	    super();
		this.tier = tier;
		this.u_id = u_id;
	}
	

}
