package pippin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pippin.qa.base.TestBase;
import pippin.qa.pages.LoginAndPlaceOrderPage;


public class LoginAndPlaceOrderTest extends TestBase{
	LoginAndPlaceOrderPage loginAndPlaceOrderPage;
	
	public LoginAndPlaceOrderTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginAndPlaceOrderPage = new LoginAndPlaceOrderPage();	
	}
	
	
	@Test(priority=1)
	public void loginAndPlaceNewOrderTest() throws InterruptedException{
		loginAndPlaceOrderPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginAndPlaceOrderPage.placeNewOrder("Lavanya Pokala", "3845 wineville avenue o", "LavanyaPokala_25_06_1993");
		
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
