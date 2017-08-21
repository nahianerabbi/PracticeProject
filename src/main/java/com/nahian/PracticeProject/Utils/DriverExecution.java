package com.nahian.PracticeProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class DriverExecution {

	static {
		
		System.setProperty("webdriver.gecko.driver", "D:/local drive E/selenium/geckodriver.exe");
	}
	
	public static WebDriver driver = new FirefoxDriver();
	
	@Test
	public void testexecution(){
		System.out.println("Driver executed");
	}
	
	private DriverExecution ()
	{
		
	}
}
