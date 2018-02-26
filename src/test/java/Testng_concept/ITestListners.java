package Testng_concept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListners implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+ " is Starting..... ");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"is Successfully Executed ....");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Failed .....");
		
	}

	public void onTestSkipped(ITestResult result) {
	 
		 System.out.println(result.getName()+" Skipped ....");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		System.out.println(result.getName()+ "Partically Passed ");
		
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	
	


