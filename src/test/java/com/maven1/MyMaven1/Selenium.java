package com.maven1.MyMaven1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Selenium 
{
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("This is Before Test");
		  //Initilalisation//
		  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe"); // initialisation of chrome driver
		  driver = new ChromeDriver(); // initlaisation of webdriver
		  driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=467090950138889&extra_1=s|c|164408433073|e|facebook|&placement=&creative=164408433073&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D314089859%26adgroupid%3D22351009379%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D1t1%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9062095%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI6LDJiJSp1gIV04ZoCh0X4g5UEAAYASAAEgJ0VvD_BwE"); //get the url
		  driver.manage().window().maximize();
		  
	  }
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("This is Test Mehthod");
	  
	  driver.findElement(By.id("u_0_g")).sendKeys("Nikhil");
	  driver.findElement(By.id("u_0_i")).sendKeys("Tirthakar");
	  driver.findElement(By.id("u_0_l")).sendKeys("nikhil.tirthakar@gmail.com");
	  driver.findElement(By.id("u_0_o")).sendKeys("nikhil.tirthakar@gmail.com");
	  driver.findElement(By.id("u_0_s")).sendKeys("123");
	  driver.findElement(By.id("day")).sendKeys("14");
	  driver.findElement(By.id("month")).sendKeys("Nov");
	  driver.findElement(By.id("year")).sendKeys("1986");
	 
	  // driver.findElement(By.id("birthday-help")).click();
	 //driver.findElement(By.partialLinkText("Why do I need")).click();
	  driver.findElement(By.partialLinkText("Why do I need to provide my date of birth?")).click();
	 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains (text(),'OK')]")).click();
	  
	  //driver.findElement(By.id("u_0_8")).click();
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click(); // relative path
	  //driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click(); // relative path
	  
	  driver.findElement(By.cssSelector("input[type='radio'][value='2']")).click();
	  //driver.findElement(By.className("_42ft _42fu layerCancel uiOverlayButton selected _42g-")).click();
	  
	  
	  
	 // driver.findElement(By.xpath("//button[@type='submit']")).click();
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
	  
	  
	 
  }
  

  @AfterTest
  public void afterTest()
  {
	  System.out.println("This is After Test");
	 //driver.close();
  }

}
