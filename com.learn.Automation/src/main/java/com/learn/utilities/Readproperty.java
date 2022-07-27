package com.learn.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.learn.Automation.constants.FrameworkConstants;

public final class Readproperty {
	
	
	
	private Readproperty(){
		
		
	}
	
	
	private static Properties pro= new Properties();
	private static final Map<String, String> CONFIG= new HashMap<String, String>();
	
	static {
		
		
		try
		{
			FileInputStream fil= new FileInputStream(FrameworkConstants.getConfigfilepath());
		    pro.load(fil);
		    
		    for(Object key :pro.keySet())
		    {
		    	CONFIG.put(String.valueOf(key), String.valueOf(pro.getProperty((String) key).trim()));
		    }
		    
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
	}
	//
	
	
	public static String get(String key) throws Exception
	{
		if(Objects.isNull(key) || 	Objects.isNull(CONFIG.get(key)))
		{
			throw new Exception();
		}
		
		
		return CONFIG.get(key);
	}
	
	
	

}
