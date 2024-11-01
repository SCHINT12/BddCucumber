package common;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
public class common {
	public WebDriver driver;
	public common()
	{
		this.driver=driver;
	}

	public boolean click(WebDriver driver,WebElement ele,String elementName)
	{
		boolean flag=false;
		try
		{
			if(ele.isDisplayed())
			{
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("arguments[0].style.border='2px solid red'", ele);
				js.executeScript("arguments[0].style.background='yellow'", ele);
				ele.click();
				flag=true;
				ExtentCucumberAdapter.addTestStepLog("<B> user should click the "+elementName+" </B>");
			}
		}
		
		catch(Exception e)
		{
			ExtentCucumberAdapter.addTestStepLog("user is not able to click the <B> "+elementName+" </B>");

		}
		return flag;
	}
	
}

