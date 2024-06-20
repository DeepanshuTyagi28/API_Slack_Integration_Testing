package com.ttn.pojoClasses;
/**
 * @author Deepanshu Tyagi
 *
 */

public class CompanyOfferPojo {

	private String dealer_code;
	private String variant_code;
	private String model_code;
	private String fuel_type;
	private String  company_id;

	

	public CompanyOfferPojo(String dealer_code, String variant_code, String model_code, String fuel_type, String company_id) {
		this.dealer_code = dealer_code;
		this.variant_code = variant_code;
		this.model_code = model_code;
		this.fuel_type = fuel_type;
		this.company_id = company_id;

	}
	
	//dealer_code
	public String getdealer_code() {
		return dealer_code;
	}


	public void setdealer_code(String dealer_code) {
		this.dealer_code = dealer_code;
	}


	//variant_code
	public String getvariant_code() {
		return variant_code;
	}


	public void setvariant_code(String variant_code) {
		this.variant_code = variant_code;
	}


	//model_code
	public String getmodel_code() {
		return model_code;
	}


	public void setmodel_code(String model_code) {
		this.model_code = model_code;
	}


	//fuel_type
		public String getfuel_type() {
			return fuel_type;
		}


		public void setfuel_type(String fuel_type) {
			this.fuel_type = fuel_type;
		}
		
   //company_id
		public String getcompany_id() {
			return company_id;
		}


		public void setcompany_id(String company_id) {
			this.company_id = company_id;
		}

	
}

