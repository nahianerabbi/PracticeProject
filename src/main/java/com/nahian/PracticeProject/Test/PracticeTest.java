package com.nahian.PracticeProject.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.nahian.PracticeProject.Utils.DriverExecution;



public class PracticeTest {

	private WebDriver driver = null;

	@Test(priority=1)
	public void FindPdf()throws InterruptedException{
		
		driver =DriverExecution.driver ;
		driver.get("http://www.istqb.org/downloads/category/2-foundation-level-documents.html");
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[3]/table[4]/tbody/tr/td[4]/p/a/img")).click();
		String geturl= driver.getCurrentUrl();
		Assert.assertTrue(geturl.contains(".pdf"));
		
		
	}
	/*@Test
	public void testVerifyPDFInURL() {
		driver =DriverExecution.driver ;
		driver.get("http://www.princexml.com/samples/");
		driver.findElement(By.linkText("PDF flyer")).click();
		String getURL = driver.getCurrentUrl();
		Assert.assertTrue(getURL.contains(".pdf"));
	}*/
	
	
}
