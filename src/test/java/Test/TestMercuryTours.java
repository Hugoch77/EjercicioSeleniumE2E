package Test;

import org.testng.annotations.Test;

import Pages.MTLandingPage;
import Pages.PostRegisterPage;
import Pages.RegisterPage;
import Pages.SignOnPage;
import Pages.SupportPage;
import TestNGUtils.BeforeAfterClass;

public class TestMercuryTours extends BeforeAfterClass {
	
	@Test
	public void testMercuryTours() {
		
		MTLandingPage landPage = new MTLandingPage(driver);
		RegisterPage regPage = new RegisterPage(driver);
		PostRegisterPage postRegPage = new PostRegisterPage(driver);
		SignOnPage sOnPage = new SignOnPage(driver);
		SupportPage suppPage = new SupportPage(driver);
		
		String userName = "hugoch";
		String password = "password";
		
		landPage.clickRegisterBtn();
		
		regPage.inRegisterPageConfirmation();
		regPage.fillRegisterInfo("Hugo", "Chavez", "3545411223", "test@test.com", "123 lock", "Queretaro", "Queretaro", "11803", "mexico", userName, password, password);
		regPage.clickEnviarBtn();
		
		postRegPage.registerConfirmation();
		postRegPage.clickSignInBtn();
		
		sOnPage.signOnPageConfirm();
		sOnPage.fillUserAndPassword(userName, password);
		sOnPage.clickSupportBtn();
		
		suppPage.confirmSupportPage();
		suppPage.clickBackToHomeBtn();
	}
	
}
