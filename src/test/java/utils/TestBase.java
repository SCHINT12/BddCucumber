package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//resources//config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		String browser = prop.getProperty("browser");



		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();// driver gets the life
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
			driver.manage().window().maximize();
		}




		return driver;

	}



}

