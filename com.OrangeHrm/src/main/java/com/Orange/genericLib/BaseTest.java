package com.Orange.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.TimeBombSkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant{
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun = true)
	public void toConnectTheServer() {
		Reporter.log("====to Connect the Server", true);
	}
	
	@BeforeTest(alwaysRun = true)
	public void toConnectTheDatabase() {
		Reporter.log("===to Connect the database===", true);
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional ("Chrome")String browser ) throws IOException{
		Reusability r = new Reusability();
		//to fetch the browser
		//String browser = r.getDataFromProperty(PROP_PATH,"browser");
		//to fetch the url
		String url = r.getDataFromProperty(PROP_PATH,"url");
		
		if(browser.equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		else
			Reporter.log("Invalid Browser", true);
		sdriver = driver;
		// maximizing
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		//driver.quit();
		Reporter.log("===close the browser====", true);
	}
	
	@AfterTest(alwaysRun = true)
	public void toClosetheConnectionWithDataBase1()
	{
		Reporter.log("====to close connection with database==", true);
	}
	
	@AfterSuite(alwaysRun = true)
	public void toClosetheConnectionWithServer()
	{
		Reporter.log("====to close connection with server==", true);
	}

}
