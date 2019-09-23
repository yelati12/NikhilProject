package com.actiTime.pageLibrary.loginPage;

import org.testng.Reporter;
import com.actiTime.testBase.TestBase;

public class LoginPage extends TestBase{

	public void loginToApplication() throws Exception{
		//actiTime.login.username this will be from loginPage.properties file
				//"userName" will be from Config.properties file
				Reporter.log("Entering Username in the Username Textbox");
				getWebElement("actiTime.login.username").sendKeys(Repository.getProperty("userName"));
				Reporter.log("Entering Password in the Password Textbox");
				getWebElement("actiTime.login.password").sendKeys(Repository.getProperty("password"));
				//driverwait() from  Utills class as this TestLogin extends TestBase 
				//and TestBase extends Utills we can call driverwait() method directly
				Reporter.log("Clicking on Login button");
				getWebElement("actiTime.login.loginButton").click();
				driverwait();
				}
	
	public void loginToApplication(String Uname, String PSWD) throws Exception
	{
				Reporter.log("Entering Username in the Username Textbox");
				getWebElement("actiTime.login.username").sendKeys(Uname);
				Reporter.log("Entering Password in the Password Textbox");
				getWebElement("actiTime.login.password").sendKeys(PSWD);
				Reporter.log("Clicking on Login button");
				getWebElement("actiTime.login.loginButton").click();
				driverwait();
				}
}
