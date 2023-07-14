package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import TestNGUtils.BeforeAfterClass;
import UtilitiesPackage.Utilities;

public class PostRegisterPage extends BeforeAfterClass {

	@FindBy(xpath = "//font[contains(text(),'Thank you for registering')]")
	private WebElement messageConfirm;

	public PostRegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	Utilities utils = new Utilities();

	public void registerConfirmation() {
		String expected = "Thank you for registering";
		String actual = utils.getText(driver, messageConfirm);
		Assert.assertTrue(actual.contains(expected), "Something went wrong");
	}

}
