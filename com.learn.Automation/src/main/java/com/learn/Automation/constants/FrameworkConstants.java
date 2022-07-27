package com.learn.Automation.constants;

public final class FrameworkConstants {
	
	
	private FrameworkConstants()
	{
		
	}
	
	
	private static final String chromedriverpath=System.getProperty("user.dir")+ "/src/test/resources/executables/chromedriver.exe";
    
	private static final String configfilepath=System.getProperty("user.dir")+"/src/test/resources/Config/config.properties";
	
	public static String getchromedriverpath()
	{
		return chromedriverpath;
	}

	
	public static String getConfigfilepath() {
		return configfilepath;
	}


	

	
}
