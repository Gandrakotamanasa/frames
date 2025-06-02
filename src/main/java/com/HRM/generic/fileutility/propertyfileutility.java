package com.HRM.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfileutility {

public String getdatafromproperties(String key) throws IOException
{
	FileInputStream fs=new FileInputStream("./ConfigAppData/commondata.properties");
	Properties pro=new Properties();
	pro.load(fs);
	 String data=pro.getProperty(key);
	return data;
	
}
	
		
	

	
}

	
