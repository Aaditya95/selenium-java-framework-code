package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest
{
	@Test(dataProviderClass = ReadXLSdata.class , dataProvider = "testdata")
  public void loginTest(String username , String password) throws InterruptedException
  {
		
		System.out.println("Clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		
		
  }
	
			
}
