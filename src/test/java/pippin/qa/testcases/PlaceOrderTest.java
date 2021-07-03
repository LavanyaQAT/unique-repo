package pippin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pippin.qa.base.TestBase;
import pippin.qa.pages.PlaceOrderPage;
import pippin.qa.pages.LoginPage;


public class PlaceOrderTest extends TestBase {
	LoginPage loginPage;
	PlaceOrderPage placeOrderPage;



	public PlaceOrderTest() {
		super();
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();


		loginPage = new LoginPage();
		placeOrderPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void placeNewOrder(){
		placeOrderPage.placeNewOrder("Lavanya Pokala", "3845 wineville avenue o", "LavanyaPokala_25_06_1993");
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
