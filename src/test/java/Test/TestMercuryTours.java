package Test;

import org.testng.annotations.Test;

import Pages.MTLandingPage;
import Pages.PostRegisterPage;
import Pages.RegisterPage;
import TestNGUtils.BeforeAfterClass;

public class TestMercuryTours extends BeforeAfterClass {

	MTLandingPage landPage = new MTLandingPage(driver);
	RegisterPage regPage = new RegisterPage(driver);
	PostRegisterPage postRegPage = new PostRegisterPage(driver);
	
	@Test
	public void testMercuryTours() {
		landPage.clickRegisterBtn();
		
		regPage.inRegisterPageConfirmation();
		regPage.fillRegisterInfo("Hugo", "Chavez", "3545411223", "test@test.com", "123 lock", "Queretaro", "Queretaro", "11803", "mexico", "hugoch", "password", "password");
		regPage.clickEnviarBtn();
		
		postRegPage.registerConfirmation();
	}
	
}
