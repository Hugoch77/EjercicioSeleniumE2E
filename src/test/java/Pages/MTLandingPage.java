package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilitiesPackage.Utilities;

public class MTLandingPage extends Utilities {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(.,'REGISTER')]")
	private WebElement registerBtn;

	public MTLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	Utilities utils = new Utilities();
	
	public void clickRegisterBtn() {
		utils.clickBtn(driver, registerBtn);
	}
	
}
