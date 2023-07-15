package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilitiesPackage.Utilities;

public class PostRegisterPage extends Utilities {

	WebDriver driver;
	
	@FindBy(xpath = "//font[contains(text(),'Thank you for registering')]")
	private WebElement messageConfirm;
	
	@FindBy(xpath = "//a[contains(text(),' sign-in ')]")
	private WebElement signInBtn;

	public PostRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	Utilities utils = new Utilities();

	public void registerConfirmation() {
		String expected = "Thank you for registering";
		String actual = utils.getText(driver, messageConfirm);
		Assert.assertTrue(actual.contains(expected), "Something went wrong");
	}
	
	public void clickSignInBtn() {
		utils.clickBtn(driver, signInBtn);
	}

}
