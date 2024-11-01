package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.Before;

public class dummybase {
	
	public Properties prop=new Properties();
	
	@Before	
	public void config() throws IOException
	{
		File directory =new File(".");
		String configfilepath=directory.getCanonicalPath();
		FileInputStream fis=new FileInputStream(configfilepath +"/resources/config.properties");
		System.out.println(fis);
		prop.load(fis);
	}

}
