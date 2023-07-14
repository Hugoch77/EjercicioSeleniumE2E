package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UtilitiesPackage.Utilities;

public class RegisterPage extends Utilities {

	WebDriver driver;
	
	@FindBy(name = "firstName")
	private WebElement eleFirstName;

	@FindBy(name = "lastName")
	private WebElement eleLastName;

	@FindBy(name = "phone")
	private WebElement elePhoneNumber;

	@FindBy(id = "userName")
	private WebElement eleEmail;

	@FindBy(name = "address1")
	private WebElement eleAddress;

	@FindBy(name = "city")
	private WebElement eleCity;

	@FindBy(name = "state")
	private WebElement eleState;

	@FindBy(name = "postalCode")
	private WebElement elePostalCode;

	@FindBy(name = "country")
	private WebElement eleCountry;

	@FindBy(name = "email")
	private WebElement eleUserName;

	@FindBy(name = "password")
	private WebElement elePassword;

	@FindBy(name = "confirmPassword")
	private WebElement eleConfirmPassword;

	@FindBy(name = "submit")
	private WebElement eleEnviarBtn;

	@FindBy(xpath = "//font[contains(text(),'To create your account')]")
	private WebElement messageRegPage;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	Utilities utils = new Utilities();

	public void inRegisterPageConfirmation() {
		String expected = "To create your account";
		String actual = utils.getText(driver, messageRegPage);
		Assert.assertTrue(actual.contains(expected), "Something went wrong");
	}

	public void fillRegisterInfo(String firstNname, String lastName, String phoneNumber, String email, String address,
			String city, String state, String postalCode, String country, String userName, String password,
			String confirmPassword) {
		utils.sendText(driver, eleFirstName, firstNname);
		utils.sendText(driver, eleLastName, lastName);
		utils.sendText(driver, elePhoneNumber, phoneNumber);
		utils.sendText(driver, eleEmail, email);
		utils.sendText(driver, eleAddress, address);
		utils.sendText(driver, eleCity, city);
		utils.sendText(driver, eleState, state);
		utils.sendText(driver, elePostalCode, postalCode);
		utils.dropdown(driver, eleCountry, country);
		utils.sendText(driver, eleUserName, userName);
		utils.sendText(driver, elePassword, password);
		utils.sendText(driver, eleConfirmPassword, confirmPassword);
	}
	public void clickEnviarBtn() {
		utils.clickBtn(driver, eleEnviarBtn);
	}

}
