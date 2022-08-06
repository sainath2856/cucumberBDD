package com.selenium.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots
{
	public static String shot(WebDriver driver) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String varname=System.getProperty("user.dir")+"./ScreenShots/image_001.png";
		FileHandler.copy(file,new File(varname));
		return varname;
	}
	

}
