package com.tmb.pages;

import org.openqa.selenium.By;

import com.learn.driver.Drivermanager;
// final used so that it cant be inherited
public final class AccountPINPage extends BasePage {
	

	
	public final By enterPIN=By.xpath("//*[@id='input-pin']");
	
	public final By continueBtn=By.xpath("//*[contains(text(),'Continue')]");
	
	
	public static String getAccPINTitle()
	{
		return Drivermanager.getdriver().getTitle();	
	}
	
	
	
	public AccountPINPage enterPIN(String PIN)
	{
		Drivermanager.getdriver().findElement(enterPIN).sendKeys(PIN);
		
		return this;
	}
	
	public AccountHOMEpage Continue()
	{
		click(continueBtn);
		
		return new AccountHOMEpage();
	}


}
