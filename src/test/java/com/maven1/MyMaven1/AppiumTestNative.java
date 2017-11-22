package com.maven1.MyMaven1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTestNative 
{
WebDriver driver;
	
	@Test
	public void f() throws InterruptedException 
	{

		Thread.sleep(5000);
		//WebElement loginID=driver.findElement(By.id("com.advait.ps.couponmate:id/autolocbut"));
		
		WebElement loginID=driver.findElement(By.id("com.demo.amanora:id/loginNewbie"));
		loginID.click();
		driver.findElement(By.id("com.demo.amanora:id/OffersLayout")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		
		
	}
	@BeforeTest
	public void beforeTest() throws MalformedURLException 
	{

		//File app=new File("Resources/CouponMate.apk");
		File app=new File("Resources/TheMallApp.apk"); 
		
		DesiredCapabilities desiredCapabilities=DesiredCapabilities.android();
		//desiredCapabilities.setCapability("browserName", "chrome");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "5.1.1");
		desiredCapabilities.setCapability("deviceName", "Lenovo");
		desiredCapabilities.setCapability("app", app.getAbsolutePath());
		
		driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
		
	}

	@AfterTest
	public void afterTest() 
	{
		//driver.quit();
	}


}
