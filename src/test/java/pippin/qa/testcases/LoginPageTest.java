package pippin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import pippin.qa.base.TestBase;
import pippin.qa.pages.LoginPage;
import pippin.qa.pages.PlaceOrderPage;


public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	PlaceOrderPage placeOrderPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	
	@Test(priority=1)
	public void loginTest(){
		placeOrderPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
