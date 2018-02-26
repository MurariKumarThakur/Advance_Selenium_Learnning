package Testng_concept;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(Testng_concept.ITestListners.class)

//@Listeners(Testng_concept.IExecutionListener.class)

public class basic_testng {
	@Test
	public void  beforeSuite(){
		
		
	}
	@Test
	public void afterSuite(){
		
		
		
	}
	@Test
	public void beforeTest(){
		
		
	}
	@Test
	public void afterTest(){
		
		
		
	}
	@Test
	public void beforeClass(){
		
		
	}
	@Test
	public void afterClass(){
		
		
	}
	@Test
	public void beforeMethod(){
		
	 String name = "Murari";
	 Assert.assertEquals(name, "sohan","Actual name is not matching with expected ");
		
	}
	@Test
	public void afterMethod(){
		
		
		
	}
	@Test
	public void TestCase1(){
		
		
		
	}

}
