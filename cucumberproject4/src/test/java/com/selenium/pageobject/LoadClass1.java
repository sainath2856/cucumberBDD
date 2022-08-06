package com.selenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.selenium.uistore.HandleClass1;

public class LoadClass1
{
	HandleClass1 hc;
	
	public void handle(WebDriver driver)
	{
		hc=new HandleClass1(driver);
		hc.reuse.click();
		
	}

}
