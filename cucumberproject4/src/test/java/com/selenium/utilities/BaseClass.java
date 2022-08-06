package com.selenium.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass
{
	ReadConfig rd=new ReadConfig();
	public String url=rd.getApplicationURL();
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",rd.getchromePath());
		driver=new ChromeDriver();
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}