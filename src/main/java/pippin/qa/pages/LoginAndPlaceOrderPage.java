package pippin.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pippin.qa.base.TestBase;

public class LoginAndPlaceOrderPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(id="Email_Address")
	WebElement username;
	
	@FindBy(name="User_Password")
	WebElement password;
	
	@FindBy(id="loginBtnLogin")
	WebElement loginBtn;

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
	
	@FindBy(xpath="//input[@id='file-upload']")
	WebElement uploadDocBtn;
	
	@FindBy(xpath="//div[contains(text(),'sampleone.pdf')]/parent::div/button/span/i[contains(text(),'delete')]")
	WebElement deleteBtnOne;
	
	@FindBy(xpath="//input[@value='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(id="errDOk")
	WebElement errorBtn;
	
	@FindBy(xpath="//div[contains(text(),'sampletwo.pdf')]/parent::div/button/span/i[contains(text(),'delete')]")
	WebElement deleteBtnTwo;
	
	@FindBy(id="conOk")
	WebElement okBtn;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continueBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submitBtn;
	
	@FindBy(id="ordDetBtnSendMsg")
	WebElement msgBtn;
	
	@FindBy(id="msg-area")
	WebElement msgArea;
	
	@FindBy(id="msgSend")
	WebElement sendMsg;
	
	@FindBy(xpath="//icon/i[@d='flex']")
	WebElement ddLogout;
	
	@FindBy(xpath="//button[text()='Logout']")
	WebElement optLogout;
	
	
	//Initializing the Page Objects:
	public LoginAndPlaceOrderPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public void login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void placeNewOrder(String oName, String address, String clRef) throws InterruptedException{

		placeOrderBtn.click();
		fullSearchOption.click();
		ownerName.sendKeys(oName);
		propertySearch.sendKeys(address);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", propertySearch);
    	clientRef.sendKeys(clRef);
    	uploadDocBtn.sendKeys("C:\\Lavanya_eclipse\\sampleone.pdf");
    	Thread.sleep(8000);
    	uploadDocBtn.sendKeys("C:\\Lavanya_eclipse\\sampletwo.pdf");
    	Thread.sleep(8000);
    	js.executeScript("arguments[0].click();", deleteBtnOne);
    	confirmBtn.click();   	
    	Thread.sleep(5000);
    	js.executeScript("arguments[0].click();", deleteBtnTwo);
    	confirmBtn.click();   	
    	continueBtn.click();
    	js.executeScript("arguments[0].click();", checkbox);
    	submitBtn.click();
    	msgBtn.click();
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	Date date = new Date();
    	msgArea.sendKeys("Lavanya_" + 200032 + "_" + sdf.format(date));
        sendMsg.click();
        ddLogout.click();
        optLogout.click();    	
    			
		}
	
}
