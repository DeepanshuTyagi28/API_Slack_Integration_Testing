/**
 * 
 */
package com.ttn.CommonUtils;

import org.testng.ITestContext;

/**
 * @author Akhilesh Kumar
 *
 */
public class ValueSetup {
	
	public static String retrieveDrpLaunchValue(ITestContext context) {
        String drpLaunchValue = context.getSuite().getParameter("drp.launch");
        return drpLaunchValue;
    }

}
