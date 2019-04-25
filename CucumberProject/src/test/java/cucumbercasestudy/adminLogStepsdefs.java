package cucumbercasestudy;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.AdminLoginPage;

import selenium.tests.DriverUtility;

public class adminLogStepsdefs {
	
	WebDriver driver;
	@Before
	public void init()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, AdminLoginPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("url of the TestMeApp")
	public void url_of_the_TestMeApp() {
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@When("user enters the data for login")
	public void user_enters_the_data_for_login() {
	    AdminLoginPage.username.sendKeys("admin");
	    AdminLoginPage.password.sendKeys("Password456");
	    AdminLoginPage.loginbutton.click();
	    AdminLoginPage.addproduct.click();
	}

	@Then("user  login successfully")
	public void user_login_successfully() {
	   // Assert.assertTrue(AdminLoginPage.message.getText().contains("admin"));
	}
	

}
