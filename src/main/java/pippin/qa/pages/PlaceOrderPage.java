package pippin.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pippin.qa.base.TestBase;

public class PlaceOrderPage extends TestBase{
	
	//Page Factory - OR:
	
		@FindBy(xpath="//a/strong[text()='Place Order']")
		WebElement placeOrderBtn;
		
		@FindBy(xpath="//div/span[text()='Full Search']")
		WebElement fullSearchOption;
		
		@FindBy(xpath="//input[@placeholder='Owner/Seller']")
		WebElement ownerName;
		
		@FindBy(id="search-box")
		WebElement propertySearch;
		
		@FindBy(xpath="//input[@placeholder='Client Reference *']")
		WebElement clientRef;
		
		@FindBy(xpath="//button[contains(text(),'Upload Documents')]")
		WebElement uploadDocBtn;
		
		@FindBy(xpath="//div[contains(text(),'sample1.pdf')]/parent::div/button/span/i[contains(text(),'delete')]")
		WebElement deleteBtn1;
		
		@FindBy(xpath="//div[contains(text(),'sample2.pdf')]/parent::div/button/span/i[contains(text(),'delete')]")
		WebElement deleteBtn2;
		
		@FindBy(id="conOk")
		WebElement okBtn;
		
		@FindBy(xpath="//button[contains(text(),'Continue')]")
		WebElement continueBtn;
		
		@FindBy(xpath="//input[@type='checkbox']")
		WebElement checkbox;
		
		@FindBy(xpath="//button[contains(text(),'Submit')]")
		WebElement submitBtn;
		
		//Initializing the Page Objects:
		public PlaceOrderPage(){
			PageFactory.initElements(driver, this);

}
		public void placeNewOrder(String oName, String address, String clRef){

			placeOrderBtn.click();
			fullSearchOption.click();
			ownerName.sendKeys(oName);
			propertySearch.sendKeys(address);
			JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", propertySearch);
	    	clientRef.sendKeys(clRef);
	    	uploadDocBtn.sendKeys("C:/Lavanya_eclipse/sample one.pdf");
	    	uploadDocBtn.sendKeys("C:/Lavanya_eclipse/sample two.pdf");
	    	uploadDocBtn.sendKeys("C:/Lavanya_eclipse/sample three.pdf");
	    	deleteBtn1.click();
	    	deleteBtn2.click();
	    	okBtn.click();
	    	continueBtn.click();
	    	checkbox.click();
	    			
			}
}
		
		
	