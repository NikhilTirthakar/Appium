package com.maven1.MyMaven1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Appium 
{
  WebDriver driver;
	
	@Test
	public void f() 
	{

		
		driver.findElement(By.name("email")).sendKeys("shilpa");
		
		driver.findElement(By.name("pass")).sendKeys("shilpa");
		
		driver.findElement(By.name("login")).click();
	}
	@BeforeTest
	public void beforeTest() throws MalformedURLException 
	{

		DesiredCapabilities desiredCapabilities=DesiredCapabilities.android();
		desiredCapabilities.setCapability("browserName", "chrome");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "4.4.4");
		desiredCapabilities.setCapability("deviceName", "Nikhil");
		
		driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
		driver.get("https://www.facebook.com/login/");
	}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}


}
