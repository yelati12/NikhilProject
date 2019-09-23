package com.actiTime.DataProvider;

import org.testng.annotations.DataProvider;
import com.actiTime.excelReader.ExcelDataConfig;

public class DPC {
//Data Provider name is actiTime
@DataProvider(name="actiTime")
//if we dont declare the Object[][] as Static it can't be used in the 
//other class if not throws an exception
//pass data is the method name
public static Object[][] passdata(){
//here creating an object for ExcelDataConfig class and providing the input file path  
//and the constructor in ExcelDataConfig class will be invoked
ExcelDataConfig obj = new ExcelDataConfig("C:\\Users\\Nikhil\\workspace\\SeleniumProject\\src\\com\\actiTime\\testData\\LoginData.xlsx");
//we are passing the available row count to rows
int rows = obj.getRowCount(0);
//creating object for Object array
Object[][] data = new Object[rows][2];
//for loop for getting data from excel sheet and storing in Object Array variable data
//Object[rows][2]; rows is number of times test get executed, 2 is number of 
//parameter to be passed
for(int i=0;i<rows;i++)
{
data[i][0]=obj.getData(0,i,0);
data[i][1]=obj.getData(0,i,1);
}
return data;
}
}
