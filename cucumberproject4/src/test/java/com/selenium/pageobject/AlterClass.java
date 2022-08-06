package com.selenium.pageobject;

import org.openqa.selenium.WebDriver;

import com.selenium.uistore.ManageClass;

public class AlterClass
{
	ManageClass mc;
	
	public void demo(WebDriver driver) throws InterruptedException
	{
		mc=new ManageClass(driver);
		mc.demo.click();
		
		
	}
}
