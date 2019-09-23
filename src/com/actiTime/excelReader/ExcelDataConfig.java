package com.actiTime.excelReader;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
		XSSFWorkbook wb;
		XSSFSheet sheet1;
		
		public static void main(String[] args){
			ExcelDataConfig obj = new ExcelDataConfig("C:\\Users\\Nikhil\\workspace\\Login\\src\\ExcelData\\Input.xlsx");
			System.out.println(obj.getData(0, 0, 0));
			System.out.println(obj.getData(0, 0, 1));
			System.out.println(obj.getData(0, 1, 0));
			System.out.println(obj.getData(0, 1, 1));
			System.out.println(obj.getRowCount(0));
			
		}
		
		//Constructor of this class when instantiated returns the excel workbook from the provided excel file.
		//excelpath is the string variable where we need to pass the path of input excel file
		//src is the file object
		//fis is the file input stream object
		public ExcelDataConfig(String excelpath){
		try{
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		}
		catch (Exception e){
		System.out.println(e.getMessage());
		}
		}
		
		//method to getData from the excel cell by providing sheet number, row index and cell index
		public String getData(int sheetindex,int row,int column){
		sheet1 = wb.getSheetAt(sheetindex);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		}
		
		//method to get row count by providing sheet index as the parameter
		public int getRowCount(int sheetindex){
		int row = wb.getSheetAt(sheetindex).getLastRowNum();
		row = row+1;
		return row;
		}
		
		
		}


