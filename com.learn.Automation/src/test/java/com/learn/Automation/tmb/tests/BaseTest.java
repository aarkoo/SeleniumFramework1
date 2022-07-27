package com.learn.Automation.tmb.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.learn.Automation.constants.FrameworkConstants;
import com.learn.driver.Driver;
import com.learn.driver.Drivermanager;

public class BaseTest {

	protected BaseTest()
	{
		
	}
	
	
 public	WebDriver driver;	
	
	@BeforeMethod
	protected void setup() throws Exception
	{
		
		Driver.initDriver(); 
		Drivermanager.getdriver().manage().window().maximize();
		Drivermanager.getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	/*
	@AfterMethod
	protected void teardown() throws Throwable
	{
		Thread.sleep(3500);
		Driver.quitDriver();
	}
 */
	
}
