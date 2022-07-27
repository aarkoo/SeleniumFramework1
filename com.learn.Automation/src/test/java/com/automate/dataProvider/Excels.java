package com.automate.dataProvider;



public class Excels {

	public static void main(String[] args) throws Throwable {
		
		String pathname=System.getProperty("user.dir");
		Excelutils demo = new Excelutils(pathname+"/Excel/data1.xlsx", "Sheet1");
		
		Excelutils.getrowcount();
		Excelutils.getColumnCount();
		Excelutils.getcelldata(0, 0);
		

	}

	
}