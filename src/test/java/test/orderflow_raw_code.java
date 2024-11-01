package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orderflow_raw_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://paymentstage.speedlane.ai/device?did=QXV0b21hdGlvbg==");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
		
		WebElement SelectPOS=driver.findElement(By.id("driveThroughBtn"));
		SelectPOS.click();
		
		WebElement vehiclecolour=driver.findElement(By.xpath("//*[@class='vehicleColor rippleEffect redColor']"));
		vehiclecolour.click();
	
		WebElement vehicleModels=driver.findElement(By.xpath("//*[@class='vehicleInfo rippleEffect carModel']"));
		vehicleModels.click();
		
		WebElement Lane=driver.findElement(By.xpath("//*[text()='Lane1']"));
		Lane.click();
	
		WebElement GotoMenu=driver.findElement(By.xpath("//*[@class='menuBtn']"));
		GotoMenu.click();
		
		WebElement Boneless8=driver.findElement(By.xpath("//*[text()='8 Boneless Hot Wings Combo']/following::div[@class='card-footer'][1]/div[2]"));
		Boneless8.click();
		
		// add items under "Sauce Extras" 
		
		driver.findElement(By.xpath("//*[text()='Sauce Extras']")).click();
		
		WebElement extrabbq=driver.findElement(By.xpath("//*[text()='extra bbq']/following::div[1]"));
		
		String extrabbqrate=extrabbq.getText();
		
		System.out.println(extrabbqrate);
		
		WebElement addextraBBQ=driver.findElement(By.xpath("//*[text()='extra bbq']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		addextraBBQ.click();
		
		WebElement addextragravy=driver.findElement(By.xpath("//*[text()='extra bbq']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		addextragravy.click();
		
		// add items under "Sides" 
		
		driver.findElement(By.xpath("//*[text()='Sides']")).click();
		
		WebElement frenchfires=driver.findElement(By.xpath("//*[text()='french fries - sm']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		frenchfires.click();
	
		WebElement greenbeansm=driver.findElement(By.xpath("//*[text()='green beans - sm']/parent::div/preceding-sibling::div/child::a[@class='counterAdd']"));
		greenbeansm.click();
		
		WebElement Addorder=driver.findElement(By.xpath("//*[@class='btnText lh36']"));
		Addorder.click();
		
		
		System.out.println("done");

	}

}
