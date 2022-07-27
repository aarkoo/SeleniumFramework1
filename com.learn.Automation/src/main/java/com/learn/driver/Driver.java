package com.learn.driver;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.learn.Automation.constants.FrameworkConstants;
import com.learn.utilities.Readproperty;

public class Driver {
	
	private Driver()
	{
		
	}
	

	
	
	
	public static void initDriver() throws Exception
	{
		
		if(Objects.isNull(Drivermanager.getdriver()))
			
		{
		
		System.setProperty("webdriver.chrome.driver", FrameworkConstants.getchromedriverpath());
		
		
	    Drivermanager.setdriver(new ChromeDriver());
	    Drivermanager.getdriver().get(Readproperty.get("url"));
		
	    Drivermanager.getdriver().manage().window().maximize();
		
		}
	}
	
	public static void quitDriver()
	{
		if(Objects.nonNull(Drivermanager.getdriver()))
		{
		Drivermanager.getdriver().quit();
		Drivermanager.unload();
			
		}
		
	}

}
