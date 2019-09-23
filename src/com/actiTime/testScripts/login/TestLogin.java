package com.actiTime.testScripts.login;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.actiTime.DataProvider.DPC;
import com.actiTime.pageLibrary.loginPage.LoginPage;
import com.actiTime.testBase.TestBase;

public class TestLogin extends TestBase {

	@BeforeMethod
	public void setUp() throws IOException{
	init("browser");
	}
	
	@Test(dataProvider="actiTime",dataProviderClass=DPC.class)
	public void testLogin(String Uname, String PSWD) throws Exception{
		/*TestLogin obj = new TestLogin();
		//obj.loginToApplication();
		//new LoginPage().loginToApplication();
	 //if you only want to call one method you can directly create object of that class
	 //and call the method
		obj.getWebElement("actiTime.login.username").sendKeys(Uname);
		obj.getWebElement("actiTime.login.password").sendKeys(PSWD);
		obj.getWebElement("actiTime.login.loginButton").click();
		Thread.sleep(3000);*/
		LoginPage obj = new LoginPage();
		obj.loginToApplication(Uname, PSWD);
}
	
	@AfterMethod
	public void testDown(){
		closeBrowser();
	}

}
