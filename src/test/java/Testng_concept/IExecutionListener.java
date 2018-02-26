package Testng_concept;

import java.lang.reflect.Method;

public class IExecutionListener implements org.testng.IExecutionListener{
    public void onExecutionStart() {
	
		
		System.out.println( "Test case starting ");
		
	}

	public void onExecutionFinish() {
	
		 System.out.println(" Test case Ending ");
		
	}

	

	
}
