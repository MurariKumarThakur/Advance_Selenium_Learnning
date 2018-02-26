package Selenium_Concept;


import java.io.IOException;
import java.lang.reflect.Method;


import org.openqa.selenium.By;


import org.testng.ITestResult;

import org.testng.annotations.Test;

public class impMethod extends M_generic {



	@Test
	public void emailIDVerification(Method  m ) {
		
		System.out.println(m.getName() +"is Executing -------");

		LunchBrowser("chrome");
		loadUrl("http://www.gmail.com");
		
 driver.findElement(By.xpath("//input[@type='eail']")).sendKeys("murariraj.one@gmail.com");
	}

	// @AfterMethod
	public void AfterMethod(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {


		}

	}

	@Test(priority = 1)
	public void EnterEmailID(Method m) {

		System.out.println("Test Case " + m.getName() + " Executing ");
		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("murariraj.one@gmail.com");
	}

}
