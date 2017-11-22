package com.maven1.MyMaven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Parallel
{
    static WebDriver driver;
	public static void main(String[] args) 
	{
	    System.setProperty("driver.chrome.driver", "Resources/chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);  
		driver.get("http://opensource.demo.orangehrmlive.com/");
	   
            
	}

}
