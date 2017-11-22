package com.maven1.MyMaven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM 
{
   WebDriver driver;
   
   @BeforeTest
   public void orangehrm() throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
//	   
	   
   }
   
   @Test
   public void testone() throws InterruptedException
   {
	          driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	          driver.findElement(By.id("txtPassword")).sendKeys("admin");
	          driver.findElement(By.id("btnLogin")).click();
	          Thread.sleep(1000);
	          driver.navigate().back();
	          driver.findElement(By.id("txtUsername")).clear();
	          Thread.sleep(1000);
   }
   @Test(priority=1)
   public void testtwo() throws InterruptedException
   {
	  
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       //driver.findElement(By.id("txtPassword")).sendKeys("admin");
	   Thread.sleep(1000);
       driver.findElement(By.id("btnLogin")).click();
       //Thread.sleep(1000);
      // driver.navigate().back();
       driver.findElement(By.id("txtUsername")).clear();
       driver.findElement(By.id("spanMessage")).clear();
       
       Thread.sleep(2000);
   }
   @Test(priority=2)
   public void testthree() throws InterruptedException
   {
	   Thread.sleep(1000);
	   //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       driver.findElement(By.id("txtPassword")).sendKeys("admin");
       Thread.sleep(1000);
       driver.findElement(By.id("btnLogin")).click();
       //Thread.sleep(1000);
      // driver.navigate().back();
       driver.findElement(By.id("txtPassword")).clear();
       driver.findElement(By.id("spanMessage")).clear();
       Thread.sleep(1000);
   }
   @Test(priority=3)
   public void testfour() throws InterruptedException
   {
	   Thread.sleep(2000);
	   //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       //driver.findElement(By.id("txtPassword")).sendKeys("admin");
       //Thread.sleep(1000);
       driver.findElement(By.id("btnLogin")).click();
       //Thread.sleep(1000);
      // driver.navigate().back();
       //driver.findElement(By.id("txtPassword")).clear();
       driver.findElement(By.id("spanMessage")).clear();
       Thread.sleep(1000);
   }
   @AfterTest
   public void afterclass() throws InterruptedException
	{
	  Thread.sleep(2000);
      driver.quit();
	}
}
