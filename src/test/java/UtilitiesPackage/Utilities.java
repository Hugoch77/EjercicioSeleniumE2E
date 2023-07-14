package UtilitiesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	public void sendText(WebDriver driver, WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void clickBtn(WebDriver driver, WebElement element) {
		element.click();
	}
	
	public void dropdown(WebDriver driver, WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value.toUpperCase());
	}
	
	public String getText(WebDriver driver, WebElement element) {
		String text = element.getText();
		return text;
	}
	
}
