package com.ttn.pojoClasses.loanSubmission;

import java.util.ArrayList;
import java.util.List;

public class NestedPojo 
      {
	
    private String enquiry_id;
    private CarSummary car_summary;

    public static class CarSummary {
        private String color_description;
        private String color_code;
        private String color_indicator;
        private String company_id;
        private String company_name;
        private String customer_type;
        private String buyer_type;
        private String registration_tenure;
        private String share_capital;
        private String sales_type;
        private String fuel_type;
        private String ac_type;
        private String dealer_code;
        private String model_code;
        private String variant_code;
        private String for_code;
        private String state_code;
        private String on_road_price;
        private String ex_showroom_price;
        private String tcs;
        private List<InsuranceData> insurance_data;

        public static class InsuranceData {
            private String amount;
            private String name;

            
            public InsuranceData(String amount, String name) {
                this.amount = amount;
                this.name = name;
            }
        }

        
        public CarSummary(String color_description, String color_code, String color_indicator, String company_id,
                String company_name, String customer_type, String buyer_type, String registration_tenure,
                String share_capital, String sales_type, String fuel_type, String ac_type, String dealer_code,
                String model_code, String variant_code, String for_code, String state_code, String on_road_price,
                String ex_showroom_price, String tcs ) {
            this.color_description = color_description;
            this.color_code = color_code;
            this.color_indicator = color_indicator;
            this.company_id = company_id;
            this.company_name = company_name;
            this.customer_type = customer_type;
            this.buyer_type = buyer_type;
            this.registration_tenure = registration_tenure;
            this.share_capital = share_capital;
            this.sales_type = sales_type;
            this.fuel_type = fuel_type;
            this.ac_type = ac_type;
            this.dealer_code = dealer_code;
            this.model_code = model_code;
            this.variant_code = variant_code;
            this.for_code = for_code;
            this.state_code = state_code;
            this.on_road_price = on_road_price;
            this.ex_showroom_price = ex_showroom_price;
            this.tcs = tcs;
            this.insurance_data = new ArrayList<>();
        }

        public void addInsuranceData(String amount, String name) {
            insurance_data.add(new InsuranceData(amount, name));
        }
    }

    
    public NestedPojo(String enquiry_id, CarSummary car_summary) {
        this.enquiry_id = enquiry_id;
        this.car_summary = car_summary;
    }
}