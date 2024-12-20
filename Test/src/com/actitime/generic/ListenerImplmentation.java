package com.actitime.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplmentation extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		//String res = result.getName();
		//Reporter.log(res,true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+"has been passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			String res = result.getName();
			TakesScreenshot ts=(TakesScreenshot) d;
			File scr=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./errorshot/"+res+".png");
			FileUtils.copyFile(scr, dest);
		} catch (Exception e) {
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+"has been skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}