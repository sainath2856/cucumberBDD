package com.selenium.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageLocator
{
	public WebElement search;
	public WebElement onclick;
	public WebElement press;
	
	public HomePageLocator(WebDriver driver)
	{
	
		this.search=driver.findElement(By.xpath("//button[@class='o-navbar-label js-search-btn']"));
		this.onclick=driver.findElement(By.xpath("(//*[@placeholder='Type something here...'])[2]"));
		this.press=driver.findElement(By.xpath("((//button[@title='search'])[3]"));
	
	}

	
}

