package org.genericLib;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation_Class 
{
	/***
	 * used to monitor the Test Execution
	 */
	public void onTestStart(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"-------> Execution Start");
	}

	public void onTestSuccess(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"------->Testscript Executed Successfully");
	}

	public void onTestFailure(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"------->Testscript Failed");
	}

	public void onTestSkipped(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		Reporter.log(methodName+"-------->Skipped");
	}

	public void onStart(ITestContext context)
	{
		Reporter.log("Suite Started");
	}

	public void onFinish(ITestContext context) 
	{
		Reporter.log("Suite Finished");
	}	
}
