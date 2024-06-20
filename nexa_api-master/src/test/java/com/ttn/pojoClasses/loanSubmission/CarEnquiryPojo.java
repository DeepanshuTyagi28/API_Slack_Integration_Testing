package com.ttn.pojoClasses.loanSubmission;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CarEnquiryPojo {
    @JsonProperty("enquiry_id")
    public final String enquiry_id;

    @JsonProperty("car_summary")
    public final CarSummary car_summary;

    public CarEnquiryPojo(String enquiry_id, CarSummary car_summary) {
        this.enquiry_id = enquiry_id;
        this.car_summary = car_summary;
    }

    public static class CarSummary {
        @JsonProperty("color_description")
        public final String color_description;

        @JsonProperty("color_code")
        public final String color_code;

        @JsonProperty("color_indicator")
        public final String color_indicator;

        @JsonProperty("company_id")
        public final String company_id;

        @JsonProperty("company_name")
        public final String company_name;

        @JsonProperty("customer_type")
        public final String customer_type;

        @JsonProperty("buyer_type")
        public final String buyer_type;

        @JsonProperty("registration_tenure")
        public final String registration_tenure;

        @JsonProperty("share_capital")
        public final String share_capital;

        @JsonProperty("sales_type")
        public final String sales_type;

        @JsonProperty("fuel_type")
        public final String fuel_type;

        @JsonProperty("ac_type")
        public final String ac_type;

        @JsonProperty("dealer_code")
        public final String dealer_code;

        @JsonProperty("model_code")
        public final String model_code;

        @JsonProperty("variant_code")
        public final String variant_code;

        @JsonProperty("for_code")
        public final String for_code;

        @JsonProperty("state_code")
        public final String state_code;

        @JsonProperty("on_road_price")
        public final String on_road_price;

        @JsonProperty("ex_showroom_price")
        public final String ex_showroom_price;

        @JsonProperty("tcs")
        public final String tcs;

        @JsonProperty("insurance_data")
        public final List<InsuranceData> insurance_data;

        public CarSummary(String color_description, String color_code, String color_indicator, String company_id,
                          String company_name, String customer_type, String buyer_type, String registration_tenure,
                          String share_capital, String sales_type, String fuel_type, String ac_type, String dealer_code,
                          String model_code, String variant_code, String for_code, String state_code,
                          String on_road_price, String ex_showroom_price, String tcs, List<InsuranceData> insurance_data)
        {
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
            this.insurance_data = insurance_data;
        }
    }

    public static class InsuranceData {
        @JsonProperty("amount")
        public final String amount;

        @JsonProperty("name")
        public final String name;

        public InsuranceData(String amount, String name) {
            this.amount = amount;
            this.name = name;
        }
    }
}