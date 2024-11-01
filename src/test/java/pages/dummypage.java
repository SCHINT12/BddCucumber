package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dummypage {
	
	
	
WebDriver driver;

	@FindBy(id="driveThroughBtn")
	public static WebElement drivethrough;
	
	@FindBy(xpath="//*[@class='vehicleColor rippleEffect redColor']")
	public static WebElement vehiclecolour;
	
	@FindBy(xpath="//*[@class='vehicleInfo rippleEffect carModel']")
	public static WebElement vehicleModels;
	
	@FindBy(xpath="//*[text()='Lane1']")
	public static WebElement Lane;
	
	@FindBy(xpath="//*[@class='menuBtn']")
	public static WebElement menu;
	
	public dummypage(WebDriver rdriver)
	{
		this.driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getvehicleColor(String color)
	{
		String vehcolor="//*[text()='"+color+"']";
		WebElement vehcolor_ele=driver.findElement(By.xpath(vehcolor));
		return vehcolor_ele;
	}
	
	public WebElement formproductNameXpathWithText(String text)
	{
		
		WebElement ele=driver.findElement(By.xpath("//*[text()='"+text+"']/following::div[@class='card-footer'][1]/div[2]"));
		
		
		// By.xpath("//*[text()='8 Boneless Hot Wings Combo']/following::div[@class='card-footer'][1]/div[2]
		return ele;
	}
	
	public WebElement formXpathWithText(String text)
	{
		
		WebElement ele=driver.findElement(By.xpath("//*[text()='"+text+"']"));
		return ele;
	}
	

	
	
	

}
