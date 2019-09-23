package com.actiTime.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.actiTime.testUtills.Utills;

  public class TestBase extends Utills {
  public static Properties Repository = new Properties();
  public File f;
  public FileInputStream FI;

    public void init(String browser) throws IOException{
//Loads properties file
	loadPropertiesFile();
//To get browser value from property file
	selectBrowser(Repository.getProperty(browser));
	implicitWait(30);
//To get url value from property file
	driver.get(Repository.getProperty("url"));
}

//Loads properties file method
    public void loadPropertiesFile() throws IOException {
	//loads config.properties file
	f = new File(System.getProperty("user.dir")+"\\src\\com\\actiTime\\config\\config.properties");
	FI = new FileInputStream(f);
	Repository.load(FI);
	//loads loginPage.properties file
	f = new File(System.getProperty("user.dir")+"\\src\\com\\actiTime\\pageLocators\\loginPage.properties");
	FI = new FileInputStream(f);
	Repository.load(FI);
	//loads reportsPage.properties file
	f = new File(System.getProperty("user.dir")+"\\src\\com\\actiTime\\pageLocators\\reportsPage.properties");
	FI = new FileInputStream(f);
	Repository.load(FI);
	//loads TaskPage.properties file
	f = new File(System.getProperty("user.dir")+"\\src\\com\\actiTime\\pageLocators\\TaskPage.properties");
	FI = new FileInputStream(f);
	Repository.load(FI);
	//loads timeTracksPage.properties file
	f = new File(System.getProperty("user.dir")+"\\src\\com\\actiTime\\pageLocators\\timeTracksPage.properties");
	FI = new FileInputStream(f);
	Repository.load(FI);
}

//this method getLocator accepts string and find the value of that string in properties file
//and splits the value into 2 strings by _ and based on first string it will decide what is the
//locator type and passes the second string as that particular locator type
   public static WebElement getLocator(String locator) throws Exception{
	String locatorType = locator.split("_")[0];
	String locatorValue = locator.split("_")[1];
	
	if(locatorType.toLowerCase().equals("id"))
		return driver.findElement(By.id(locatorValue));
	else if(locatorType.toLowerCase().equals("name"))
		return driver.findElement(By.name(locatorValue));
	else if((locatorType.toLowerCase().equals("classname"))
		    || (locatorType.toLowerCase().equals("class")))
		return driver.findElement(By.className(locatorValue));
	else if((locatorType.toLowerCase().equals("tagname"))
		    || (locatorType.toLowerCase().equals("tag")))
		return driver.findElement(By.tagName(locatorValue));
	else if((locatorType.toLowerCase().equals("linktext"))
		    || (locatorType.toLowerCase().equals("link")))
		return driver.findElement(By.linkText(locatorValue));
	else if((locatorType.toLowerCase().equals("cssselector"))
		    || (locatorType.toLowerCase().equals("css")))
		return driver.findElement(By.cssSelector(locatorValue));
	else if(locatorType.toLowerCase().equals("partiallinktext"))
		return driver.findElement(By.partialLinkText(locatorValue));
	else if(locatorType.toLowerCase().equals("xpath"))
		return driver.findElement(By.xpath(locatorValue));
	else
		throw new Exception("Unknown locator type '" + locatorType + "'");
	
	
	}

//this is a wrapper method which accepts string(locator= argument which returns another method
//it basically returns locator value from Repository
    public WebElement getWebElement(String locator) throws Exception{
    	  return getLocator(Repository.getProperty(locator));
      }
    
//this method closes the browser
     public void closeBrowser(){
    	 driver.quit();
     }

//     public Object[][] getData(String ExcelName, String testcase){
//    	 Data = new Xls_Reader(System.getProperty("user.dir")+"//src//com//actiTime//testData//"+ExcelName);
//    	 int rowNum = Data.getRowCount(testcase);
//    	 int colNum = Data.getColumnCount(testcase);
//    	 Object sampleData[][] = new Object[rowNum - 1][colNum];
//    	 for(int i=2; i<=rowNum; i++){
//    	 for(int j=0; j< colNum; j++){
//    		 sampleData[i-2][j] = Data.getCellData(testcase, j, i);
//    	 }
//    	 }
//    	 return sampleData;
//     }


}
