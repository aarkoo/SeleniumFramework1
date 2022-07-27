package com.learn.driver;

import org.openqa.selenium.WebDriver;

public class Drivermanager {
	
	
	private Drivermanager()
	{
		
	}
	
	
	
private static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver>();
	
	public static WebDriver getdriver()
	{
		return dr.get();
		
	}
	
	
	public static void setdriver(WebDriver driverref)
	{
		dr.set(driverref);
	}
	
	public static void unload()
	{
		dr.remove();
	}
	
	
}
