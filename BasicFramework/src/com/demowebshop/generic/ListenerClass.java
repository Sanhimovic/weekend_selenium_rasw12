package com.demowebshop.generic;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerClass extends Base_Class implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Tc passed "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "TC fail "+result.getName());
		GetScreenshot.getPhoto(driver,result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "TC Skipped "+result.getName());
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		test.log(Status.FAIL, "Failed due to timeout "+result.getName());
	}

}
