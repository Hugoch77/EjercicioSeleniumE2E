package TestNGUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import UtilitiesPackage.Utilities;

public class BeforeAfterClass extends Utilities {

	public WebDriver driver;
	
	@Parameters({ "Browser", "url" })
	@BeforeTest
	public void beforeTest(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Projects\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Eclipse\\Projects\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void afterTest() {
		driver.manage().deleteAllCookies();
		driver.close();
		
		System.out.println("Test concluded");
		
	}

}
