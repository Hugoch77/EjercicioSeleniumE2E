package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilitiesPackage.Utilities;

public class SupportPage {

	WebDriver driver;
	
	@FindBy(xpath = "(//font[@size='2'])[5]")
	WebElement eleSupportMessage;
	
	@FindBy(xpath = "//img[@src='images/home.gif']")
	WebElement eleBackToHome;
	
	public SupportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	Utilities utils = new Utilities();
	
	public void confirmSupportPage() {
		String expected = "Please press your browser's back";
		String actual = utils.getText(driver, eleSupportMessage);
		Assert.assertTrue(actual.contains(expected), "Something went wrong");
	}
	
	public void clickBackToHomeBtn() {
		utils.clickBtn(driver, eleBackToHome);
	}
	
}
