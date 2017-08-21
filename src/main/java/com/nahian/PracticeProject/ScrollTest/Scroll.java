package com.nahian.PracticeProject.ScrollTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Scroll {
	
	

	
		WebDriver driver;
		String URL = "https://www.linkedin.com/";

		@BeforeClass
		public void setUp() {
			System.setProperty("webdriver.gecko.driver", "D:/local drive E/selenium/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
			//driver.manage().window().maximize();
		}

		@Test(priority=1)
		public void scrollingToBottomofAPage() {
			driver.navigate().to(URL);
			 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

		/*@Test(priority=2)
		public void scrollingToElementofAPage() {
			driver.navigate().to(URL+"directory/companies?trk=hb_ft_companies_dir");
			WebElement element = driver.findElement(By.linkText("Import/Export"));
			((JavascriptExecutor) driver).executeScript(
	                "arguments[0].scrollIntoView();", element);
		}*/
		
		@Test(priority=2)
		public void scrollingByCoordinatesofAPage() {
			driver.navigate().to(URL+"job/?trk=hb_ft_jobs");
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		}
		
	
	}


