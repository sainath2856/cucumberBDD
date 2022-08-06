package stepDefination;

import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.selenium.uistore.HandleClass1;
import com.selenium.uistore.HomePageLocator;
import com.selenium.uistore.ManageClass;
import com.selenium.utilities.ReadConfig;
import com.selenium.utilities.ScreenShots;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination
{
	public WebElement search;
	public WebElement onclick;
	public WebElement press;
	
	public WebElement demo;
	public WebElement reuse;
	
	ReadConfig rd=new ReadConfig();
	ExtentHtmlReporter ext;
	ExtentReports er;
	ExtentTest et;
	
	WebDriver driver;
	private static Logger demologger=LogManager.getLogger(StepDefination.class.getName());
	@Before
	public void extent()
	{
		ext=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/ExtentReport/testcase1.html"));
		er=new ExtentReports();
		er.attachReporter(ext);
		ext.config().setDocumentTitle("Extent Report");
	}
	@After(order=1)
	public void screen() throws IOException
	{
		et.pass("executed ",MediaEntityBuilder.createScreenCaptureFromPath(ScreenShots.shot(driver)).build());
	
		driver.close();
		er.flush();
	}
	@After(order=0)
	public void screen1()
	{
		driver.quit();
		
	}
	//TestCase_1
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() throws IOException
	{
		demologger.info("loading dove page");
		et=er.createTest("open dove website..");
		System.setProperty("webdriver.chrome.driver",rd.getchromePath());
		driver=new ChromeDriver();	
	}
	
	@And("I open dove home page")
	public void i_open_dove_home_page() {
		
		driver.get(rd.getApplicationURL());
		driver.manage().window().maximize();	
	}
	
	@When("I verify search Functionality on dove web page")
	public void i_verify_search_functionality_on_dove_web_page() throws InterruptedException
	{	
		et=er.createTest("FirstTest Graph");
		et.log(Status.INFO,"Executed successfully");
		Thread.sleep(3000);
		this.search=driver.findElement(By.xpath("//button[@class='o-navbar-label js-search-btn']"));
		this.onclick=driver.findElement(By.xpath("(//*[@placeholder='Type something here...'])[2]"));
		this.press=driver.findElement(By.xpath("(//button[@title='search'])[3]"));
		HomePageLocator hp;
		hp=new HomePageLocator(driver);
		Thread.sleep(3000);
		hp.search.click();
		Thread.sleep(2000);
		hp.onclick.sendKeys("shampoo");
		hp.press.click();
	}

	
	
//	//TestCase_2
	@When("I verify StopTheBeautyTest page on dove web page")
	public void i_verify_stop_the_beauty_test_page_on_dove_web_page() throws InterruptedException {
		demologger.info("opening website successfull");
		
		et=er.createTest("FirstTest2 Graph");
		et.log(Status.INFO,"Executed successfully");
		
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		
	}
	
//	//TestCase_3
	@When("I verify Prohibited Use on dove web page")
	public void i_verify_prohibited_use_on_dove_web_page() {
		
		demologger.info("execution processing...");
		
		et=er.createTest("FirstTest3 Graph");
		et.log(Status.INFO,"Executed successfully");
		
		
		
	}


	
	
}
