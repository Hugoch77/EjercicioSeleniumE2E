package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilitiesPackage.Utilities;

public class SignOnPage {

	WebDriver driver;
	
	@FindBy(xpath = "(//font[@size='2'])[1]")
	WebElement eleSignOnMessage;
	
	@FindBy(name = "userName")
	WebElement eleUserName;
	
	@FindBy(name = "password")
	WebElement elePassword;
	
	@FindBy(name = "submit")
	WebElement eleSubmitBtn;
	
	@FindBy(xpath = "//a[contains(text(),'SUPPORT')]")
	WebElement eleSupportBtn;
	
	public SignOnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	Utilities utils = new Utilities();
	
	public void signOnPageConfirm() {
		String expected = "Enter your user information";
		String actual = utils.getText(driver, eleSignOnMessage);
		Assert.assertTrue(actual.contains(expected), "Something went wrong");
	}
	
	public void fillUserAndPassword(String userName, String password) {
		utils.sendText(driver, eleUserName, userName);
		utils.sendText(driver, elePassword, password);
	}
	
	public void clickSubmitBtn() {
		utils.clickBtn(driver, eleSubmitBtn);
	}
	
	public void clickSupportBtn() {
		utils.clickBtn(driver, eleSupportBtn);
	}
	
}
