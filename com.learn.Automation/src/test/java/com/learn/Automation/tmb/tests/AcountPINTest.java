package com.learn.Automation.tmb.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.learn.driver.Drivermanager;
import com.tmb.pages.AccountPINPage;
import com.tmb.pages.LoginPage;

public class AcountPINTest extends BaseTest{
	
	private AcountPINTest()
	{
		
	}
	
	
 
	@Test
	public void accountpinpagetest()
	{
		new LoginPage().clickonLoginBtn().enterusername("arkoakash1992@gmail.com").enterpassword("Abcdefgh1@").clicklogin().getAccPINTitle();
	    new AccountPINPage().enterPIN("2414").Continue();
	
	}
	
	@Test
	public void stop()
	{
		Drivermanager.getdriver().close();
	}
	
}
