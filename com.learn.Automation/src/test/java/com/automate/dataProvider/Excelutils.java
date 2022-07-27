package com.automate.dataProvider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	String excelpath;
	String sheetname;
	
	
	
	public Excelutils(String excelpath, String sheetname) throws IOException
	{
		this.excelpath=excelpath;
		this.sheetname= sheetname;
		
		workbook= new XSSFWorkbook(excelpath);
	    sheet = workbook.getSheet(sheetname);
	}
	
	
	public static int getrowcount() throws IOException
	{
		
		  int rowcount=0;
	      rowcount=sheet.getPhysicalNumberOfRows();
	     
	      return rowcount;
		
	}
	
	public static int  getColumnCount() throws IOException
	{
		int colcount=0;
		 
	      colcount=sheet.getRow(0).getPhysicalNumberOfCells();
	    
	      return colcount;
		
	}
	
	public static String getcelldata(int rownum,int colnum) throws Throwable
	{
		String celldata=null;
	     
	   celldata=   sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	  
	   return celldata;
	     
	}
	
	/*
	public static void getcelldataNos() throws Throwable
	{
		 pathname=System.getProperty("user.dir");
		 workbook= new XSSFWorkbook(pathname+"/Excel/data1.xlsx");
	     sheet = workbook.getSheet("Sheet1");
	     
	  int  celldata1=   (int) sheet.getRow(0).getCell(0).getNumericCellValue();
	  System.out.println(celldata1);
	     
	}
	*/
	
	
	
	
}
