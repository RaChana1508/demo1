package cucumbercasestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddCartPage;



public class addCartStepDefs {
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, AddCartPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	
	
	@When("larry added a headphone to the cart")
	public void larry_added_a_headphone_to_the_cart() {
		AddCartPage.username.sendKeys("Lalitha");
		AddCartPage.password.sendKeys("Password123");
		AddCartPage.loginbutton.click();
		AddCartPage.search.sendKeys("headset");
		AddCartPage.finddetails.click();
	    
	}

	@When("checkout and fill transaction details")
	public void checkout_and_fill_transaction_details() {
	    
	}

	@Then("product is ordered successfully.")
	public void product_is_ordered_successfully() {
	    
	}

}
