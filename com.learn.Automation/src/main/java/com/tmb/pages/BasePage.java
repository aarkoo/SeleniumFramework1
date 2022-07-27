package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.learn.driver.Drivermanager;

public class BasePage {
	
	

	protected void click(By by)
	{
		Drivermanager.getdriver().findElement(by).click();
	}
	
	protected void sendKeys(By by, String value)
	{
		Drivermanager.getdriver().findElement(by).sendKeys(value);
	}
	
	protected static String getPageTitle()
	{
	   return 	Drivermanager.getdriver().getTitle();
	}
	
	
	
	
	
	
}
