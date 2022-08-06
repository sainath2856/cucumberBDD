package com.selenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.selenium.uistore.HomePageLocator;

public class HoverObject
{
	HomePageLocator hp;
	
	public void hover(WebDriver driver) throws InterruptedException
	{
		hp=new HomePageLocator(driver);
		hp.search.click();
		hp.onclick.sendKeys("shampoo");
		hp.press.click();
		Thread.sleep(3000);
		
	}


}
