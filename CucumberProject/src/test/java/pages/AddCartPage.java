package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCartPage {

	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement loginbutton;
	@FindBy(how=How.ID,using="myInput")
	public static WebElement search;
	@FindBy(how=How.CSS,using="input[value='FIND DETAILS']")
	public static WebElement finddetails;
	
	
	
}
