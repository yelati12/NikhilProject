package com.actiTime.testUtills;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class Utills {
	public static WebDriver driver;
	//Based on Config Properties file input browser will be decided and that browser will
	//be invoked from this method
	public static WebDriver selectBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("chrome browser");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\com\\actiTime\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if(browser.equalsIgnoreCase("IE")){
			System.out.println("Internet Explorer");
			System.setProperty("webdriver.IE.driver", System.getProperty("user.dir")+"\\src\\com\\actiTime\\BrowserDrivers\\iexplore.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
	}
		return null;
	}
	
	//Custom method for implicit wait and also logs are written to Reporter.log file
	public void implicitWait(int timeInsec){
		Reporter.log("waiting for page to load......");
		try{
			driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
			Reporter.log("Page is loaded");
		}catch(Throwable error){
			Reporter.log("Timeout for Page Load Request to complete after "+ timeInsec +" Seconds");
			Assert.assertTrue("Timeout for page load request after "+timeInsec+" second", false);
		}
		}
	
	//custom method for thread.sleep
	public void driverwait() throws InterruptedException{
		Reporter.log("Waiting for 30 seconds");
		Thread.sleep(30000);
	}
	
	}

