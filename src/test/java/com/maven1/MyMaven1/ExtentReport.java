package com.maven1.MyMaven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport<Extent>
{
	WebDriver driver;
	ExtentTest text;
	ExtentReports extent;
	ExtentHtmlReporter htmlreport;
   @BeforeTest
   public void beforetest()
   {
	   htmlreport= new ExtentHtmlReporter("Selenium.html");
	   htmlreport.setAppendExisting(true);
	   
	   extent=  new ExtentReports();
	   extent.attachReporter(htmlreport);
	   
	   text= extent.createTest("My First Test");
	   
	   text.log(Status.PASS, "My Name is Niks");
	   
	   
	   System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	   ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);  
		text.log(Status.PASS, "Browser has run suceesfully");
		
		driver. get("http://opensource.demo.orangehrmlive.com/");   
		text.log(Status.PASS, "My Site is Running Successfully");
		//text.log(Status.FAIL, "My Site is not Running Successfully");
		
   }
   @Test
   public void test1()
   {
	 
	 
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   text.log(Status.PASS, "Proper Username is entered");
       driver.findElement(By.id("txtPassword")).sendKeys("admi");
       text.log(Status.FAIL, "Incorrect Password is entered");
       driver.findElement(By.id("btnLogin")).click();
       text.log(Status.FAIL, "Then Login Falied");

	 
   }
   @AfterTest
   public void aftertest()
   {
	   driver.close();
	   extent.flush();
	   
	   
   }
}
