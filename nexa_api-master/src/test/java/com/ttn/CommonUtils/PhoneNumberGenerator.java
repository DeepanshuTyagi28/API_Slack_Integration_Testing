package com.ttn.CommonUtils;


import java.util.Random;

public  class PhoneNumberGenerator {
	
	public static  String randomMobileNumber ;

    public static  String generateMobileNumber() {
    	Random random = new Random();
    	int rendomInt = random.nextInt(99999);
    	String str1 = String.valueOf(rendomInt);
    	
        return randomMobileNumber = "97186"+str1;
        
    }
    

}

