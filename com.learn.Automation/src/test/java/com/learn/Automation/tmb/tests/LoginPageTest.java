package com.learn.Automation.tmb.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.automate.dataProvider.Excelutils;
import com.learn.driver.Drivermanager;
import com.tmb.pages.LoginPage;



public final  class LoginPageTest extends BaseTest{
	
	
	
	public Excelutils excel;
	

	
	@Test(dataProvider ="test1")
	public void loginpagetest(String username, String password)
	{
		
		
		new LoginPage().clickonLoginBtn().enterusername(username).enterpassword(password).clicklogin().getAccPINTitle();
		
		
		
	}
	
	/*
	@DataProvider(name="test1")
	public  String[][] getdata() throws Throwable
	{
		String excelpath="C:\\Users\\logic\\Desktop\\data1.xlsx";
		String data[][]= testdata(excelpath, "Sheet1");	
		
		return data;
	}
	
	
	
	public static String[][] testdata(String excelpath, String sheetname) throws Throwable
	{
		
	Excelutils excel = new Excelutils(excelpath, sheetname);
		
	int rowcount=	excel.getrowcount();
	
	int columncount =excel.getColumnCount();
	
	String data[][] = new String[rowcount-1][columncount];
	
	for(int i=1; i< rowcount; i++)
	{
		for(int j=0;j < columncount; j++)
		{
		String celldata=	excel.getcelldata(i, j);
		//System.out.print(celldata+ " ");
		
		   data[i-1][j]= celldata;
		   
		}
	}
	
	return data;
		
	}
	
	*/
	

	
	
	
	
	
	@Test
	public void c()
	{
		Drivermanager.getdriver().close();
	}
	
	
	
	
	

}
