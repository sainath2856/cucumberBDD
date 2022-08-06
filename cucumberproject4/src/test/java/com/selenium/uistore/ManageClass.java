package com.selenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageClass
{
	public WebElement demo;
	
	
	public ManageClass(WebDriver driver) throws InterruptedException
	{
		this.demo=driver.findElement(By.xpath("//a[@href='https://www.pggoodeveryday.com/']"));
	
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	}
	
	

}
