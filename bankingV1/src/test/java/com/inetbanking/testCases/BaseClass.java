package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public String baseURL="http://demo.guru99.com/v4/";
	public String username="mngr266311";
	public String password="YvuzYtY";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
			

}
