package Selenium_Concept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cookiesHandling {
	
	
	RemoteWebDriver driver ;
	
	@Test(invocationCount = 2)
	public void LaunchBrowser(){
		
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browser_Driver/chromedriver.exe");	
	 
	   driver = new ChromeDriver() ;
	   
	   driver.get("http://www.facebook.com");
	   
	   
	    
	   
	     driver.findElement(By.id("email")).sendKeys("murariraj.two@gmail.com");
	     driver.findElement(By.id("pass")).sendKeys("9934099340");
	     driver.findElement(By.id("loginbutton")).click();
	     
	     
	     
	String ActualText =       driver.findElement(By.xpath("//span[text()='Murari']")).getText();
	     
	       
	     
	     
	    Assert.assertTrue(ActualText.contains("Murari"));
	    
	    
	    
	    Set <Cookie > allCookies= driver.manage().getCookies();
	       
	          
	       for(Cookie  cookie : allCookies) {
	            driver.manage().addCookie(cookie);
	        }
	 
	            driver.close();
	    
	    
	       
	   
	   
	   
		
	}

}
