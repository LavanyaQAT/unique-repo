package pippin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pippin.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(id="Email_Address")
	WebElement username;
	
	@FindBy(name="User_Password")
	WebElement password;
	
	@FindBy(id="loginBtnLogin")
	WebElement loginBtn;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public PlaceOrderPage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new PlaceOrderPage();
	}
	
}
