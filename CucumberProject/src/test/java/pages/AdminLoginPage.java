package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AdminLoginPage {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement loginbutton;
	@FindBy(how=How.XPATH,using="/html/head/title")
	public static WebElement message;
	@FindBy(how = How.XPATH,using = "//h4[contains(text(),'Add Product')]")
	public static WebElement addproduct;
	@FindBy(how=How.ID,using="categorydropid")
	public static WebElement scat;
	public static void select()
	{
		Select name = new Select(scat);
		name.selectByIndex(1);
	}
	@FindBy(how=How.ID,using="subcategorydropid")
	public static WebElement subcategory;

	public static void selectsub()
	{
		Select name1 = new Select(subcategory);
		name1.selectByIndex(2);

	}
	@FindBy(how=How.ID,using="prodid")
	public static WebElement pdtname; 

	@FindBy(how=How.ID,using="priceid")
	public static WebElement price;
	@FindBy(how=How.ID,using="quantityid")
	public static WebElement quantity;
	@FindBy(how=How.ID,using="brandid")
	public static WebElement brand;
	@FindBy(how=How.ID,using="description")
	public static WebElement description;
	@FindBy(how=How.CSS,using="input[value='Add Product']")
	public static WebElement addpdtbtn;
	@FindBy(how=How.XPATH,using="//div/div/div/form/b/i")
	public static WebElement regsuccessfully;
	
}
