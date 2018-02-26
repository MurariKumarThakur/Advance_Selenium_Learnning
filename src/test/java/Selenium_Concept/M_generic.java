package Selenium_Concept;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class M_generic {

	WebDriver driver;

	M_generic obj;

	WebElement web;

	public void LunchBrowser(String browserName) {

		String dirPath = System.getProperty("user.dir");
		System.out.println(dirPath);

		if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", dirPath + "/browser_Driver/geckodriver.exe");

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", dirPath + "/browser_Driver/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("internetExplorer")) {

			System.out.println("For Internet Explorer Code is not implemented ");

		} else {

			System.out.println("browser is not Specifying  ");
		}

	}

	public void loadUrl(String url) {

		driver.get(url);

	}

	public void TakeScreenShot(String ImageLocation, String ImageName) throws IOException {

		TakesScreenshot Sc = (TakesScreenshot) driver;
		File file = Sc.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File(System.getProperty("user.dir") + ImageLocation + ImageName + ".jpeg"));

	}

	@AfterMethod
	public void TakeFailureScreenShot(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {

			TakeScreenShot("/FailureScreenShot/", result.getName());

		}

	}

	public void click(By locator) {

		driver.findElement(locator).click();

	}

	public void sendKeys(By locator, String testData) {

		driver.findElement(locator).sendKeys(testData);

	}

	public void browserMaximize() {

		driver.manage().window().maximize();
	}

	public void mouseOver(By locator) {

		web = driver.findElement(locator);

		Actions a = new Actions(driver);

		a.moveToElement(web).build().perform();

	}

	public void scroll(By locator) {

		web = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", web);

	}

	// browser command
	public void CaptureTitle(Method m, String expectedTitle, String FieldName) {

		String actualTitle = driver.getTitle();

		if (actualTitle == expectedTitle) {

			System.out.println("Passed ::-- " + FieldName + "Title Matching ");

		} else {

			System.out.println("Failed ::-- " + FieldName + "Title Is Not  Matching ");

		}

	}

	public void getCurrentUrl(String expectedUrl, String fieldName) {

		String actualUrl = driver.getCurrentUrl();

		if (actualUrl == expectedUrl) {

			System.out.println("passed ::--" + fieldName + "Url Is Matching ");

		} else {

			System.out.println("Failed ::--" + fieldName + "Url is Not Matching");
		}

	}

	public void getPageSource(String fieldName) {

		String pageSource = driver.getPageSource();

		if (pageSource.isEmpty()) {

			System.out.println("Failed ::-- " + fieldName + "PageSource Is not Captured ");

		} else {

			System.out.println("Passed ::-- " + fieldName + "PageSorce is Captured");
		}

	}

	public void close() {

		driver.close();
	}

	public void quit() {

		driver.quit();
	}

	// navigation command

	public void navigateToOtherUrl(String url) {

		driver.navigate().to(url);

	}

	public void navigationForward() {

		driver.navigate().forward();

	}

	public void navigateBackward() {

		driver.navigate().back();
	}

	public void refreshBrowser() {

		driver.navigate().refresh();
	}
	// WebElementCommand

	public void Clear(By locator) {

		driver.findElement(locator).clear();
	}

	public void Submit(By locator) {

		driver.findElement(locator).submit();
	}

	// not Recommended
	public void IsDisplayed(By locator) throws IOException {

		boolean b = driver.findElement(locator).isDisplayed();

		if (b == true) {

		}
		
		
	}

}
