package com.tmb.pages;

import org.openqa.selenium.By;


import com.learn.driver.Drivermanager;

public final class LoginPage extends BasePage {
	
	public final By loginbtn=By.xpath("(//*[contains(text(),'Login')])[2]");

	public final By username=By.xpath("//*[@id='input-email']");
	
	public final By password= By.xpath("//*[@id='input-password']");
	
	public final By submitbtn =By.xpath("(//*[contains(text(),'Login')])[5]");
	
	
  
	
	
	
	
	public LoginPage clickonLoginBtn()
	{
		
		click(loginbtn);
		
		return this;
	}
	
	
	
	public LoginPage enterusername(String user)
	{
	
		sendKeys(username, user);
		
		return this;
	}
	
	public LoginPage enterpassword(String pwd )
	{
		
		
		sendKeys(password, pwd);
		
		return this;
		
	}
	
	public AccountPINPage clicklogin()
	{
		
		click(submitbtn);
		
		return new AccountPINPage();
	}
	
	public static String getthetitle()
	{
		return getPageTitle();
	}
}
