package stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import common.common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.dummypage;
import utils.dummybase;

public class orderFlowSteps  {
Properties prop=new Properties();
public WebDriver driver;
dummypage obj_dummypage;

public void init() throws IOException
{
	File directory =new File(".");
	String configfilepath=directory.getCanonicalPath();
	FileInputStream fis=new FileInputStream(configfilepath +"/resources/config.properties");
	prop.load(fis);
}



	@Given("user able to launch browser and select Place of service")
	public void user_able_to_launch_browser_and_select_place_of_service() throws IOException {
		init();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(prop.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ExtentCucumberAdapter.addTestStepLog("step1");
	}
	
	@Given("I click on {string} color vehicle")
	public void i_click_on_color_vehicle(String col) throws InterruptedException {
		//driver=testContextSetup.pageObjectManager.driver;
		obj_dummypage=new dummypage(driver);
		obj_dummypage.drivethrough.click();
		obj_dummypage.getvehicleColor(col).click();
		obj_dummypage.vehicleModels.click();
		obj_dummypage.Lane.click();
		obj_dummypage.menu.click();	
	}
	
	@When("I click the product {string} and navigate to {string}")
	public void i_click_the_product_and_navigate_to(String productname, String section) {
		
		obj_dummypage.formproductNameXpathWithText(productname).click();
	    obj_dummypage.formXpathWithText(section).click();
	}

	@Then("validate prices for products {string}")
	public void validate_prices_for_products_french_fries_sm_french_fries_lg_cole_slaw_lg(String products) throws InterruptedException {
	    String allproducts=products;
	    String[] product=allproducts.split(",");
	    LinkedHashMap<String,String> expected=new LinkedHashMap<String,String>();
	    for(String p:product)
	    {
	    	String p_org=p;
	    	if(!p.contains("cole"))
	    	{
	    		p=p.replace("_", " ").replace("-", " - ");
	    	}
	    	else
	    	{
	    		p=p.replace("_", " ").replace("-", " -");
	    	}
	    	
	    	expected.put(p, prop.getProperty(p_org));
	    }
	    System.out.println(expected);
	    
	    for(String s:expected.keySet())
	    {
	    	String str="//*[text()='"+s+"']/parent::div/following-sibling::div/span";
	    	WebElement ele=driver.findElement(By.xpath(str));
	    	Thread.sleep(2000);
	    	String actualval=ele.getText().replace("+ ", "");
	    	System.out.println("Actual Price for product:: "+s+" is : "+actualval);
	    	if(expected.get(s).equals(actualval))
	    	{
	    		System.out.println("No Change in price: Where actual price is-"
	    				+ " "+actualval+" and Expected price is "+expected.get(s)+" for product:: "+s+"");
	    	}
	    	else
	    	{
	    		ExtentCucumberAdapter.addTestStepLog("<B> Change in price: Where actual price is-"
	    				+ " "+actualval+" and Expected price is "+expected.get(s)+" for product:: "+s+" </B>");
	    		System.out.println("Change in price: Where actual price is-"
	    				+ " "+actualval+" and Expected price is "+expected.get(s)+" for product:: "+s+"");
	    	}
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@When("user able add to card food items")
	public void user_able_add_to_card_food_items() throws InterruptedException {
	    	
		WebElement Tenders7combo=driver.findElement(By.xpath("(//*[text()='7 Express Tenders Combo'])[1]/following::div[@class='card-footer'][1]/div[1]"));
		
		String Tenders7combooo=Tenders7combo.getText();

		String rate="$17.39";
		
		if (rate.equals(Tenders7combooo))
		{
			System.out.println("7 Express Tenders Combo rate is same as per document");
			ExtentCucumberAdapter.addTestStepLog("7 Express Tenders Combo rate is same as per document");
		}
		else {
			System.out.println("7 Express Tenders Combo rate not same as per Aggrement");
			ExtentCucumberAdapter.addTestStepLog("7 Express Tenders Combo rate is same as per document");
		}

	}

	@Then("user able to see total bill amount")
	public void user_able_to_see_total_bill_amount() {
	    
		System.out.println("compare price");
	}
	
	@When("I navigate to {string}")
	public void i_navigate_to(String section) {
		
	    obj_dummypage.formXpathWithText(section).click();
	}
	
	
	
	
}
