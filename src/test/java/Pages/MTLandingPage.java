package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestNGUtils.BeforeAfterClass;
import UtilitiesPackage.Utilities;

public class MTLandingPage extends BeforeAfterClass {
	
	@FindBy(xpath = "//a[contains(.,'REGISTER')]")
	private WebElement registerBtn;

	public MTLandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	Utilities utils = new Utilities();
	
	public void clickRegisterBtn() {
		utils.clickBtn(driver, registerBtn);
	}
	
}
