package com.ttn.listeners;
/**
 * This Java program demonstrates the Listener Class of PRISM-Framework.
 *
 * @author TTN
 */

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ttn.Builder.BaseLib;
import com.ttn.CommonUtils.GlobalVariables;

public class MyProjectListener extends BaseLib implements ITestListener{


	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	// ITestListener
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		

	}

	// ITestListener
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	// ITestListener
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	// ITestListener
	@Override
	public void onTestFailure(ITestResult result) {
   
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		GlobalVariables.TEST_RESULT_COUNT.add("skip");
		
	}
}
