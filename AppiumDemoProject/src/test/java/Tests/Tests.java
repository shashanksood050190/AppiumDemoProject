package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tests extends BaseClass{

	@Test
	public void testOne()
	{
		ExtentTest test1 = extent.createTest("Test One", "Sample test case for demo");
		test1.log(Status.INFO, "Test One started");
		
		driver.get("http://www.google.com");
		test1.log(Status.PASS, "Navigated to https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.log(Status.PASS, "Entered automation in google search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test1.log(Status.PASS, "Hit the keyboard enter key");
		
		System.out.println("completed test one");
		test1.log(Status.INFO, "Test one completed");
		
		
	}
	
	@Test
	public void testTwo()
	{
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Shashank");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("completed test one");
		
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.findElement(By.id("txtUsername")).click();
		    driver.findElement(By.id("txtUsername")).clear();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).click();
		    driver.findElement(By.id("txtPassword")).clear();
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		  //  driver.findElement(By.id("btnLogin")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("welcome")).click();
		    driver.findElement(By.linkText("Logout")).click();
	}
	
}
