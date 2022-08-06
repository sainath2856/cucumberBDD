package com.selenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleClass1
{
	public WebElement reuse;
	
	public HandleClass1(WebDriver driver)
	{
		this.reuse=driver.findElement(By.xpath("//a[@href='/en-us/how-to-wash-clothes']"));
	}

}
