package task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import googlePagesModel.GoogleHomePage;

public class Task1_AssertPageTitle {
	WebDriver driver;
	GoogleHomePage homePage;
	
	@Test
	public void navigateToGoogleHomePageAndAssertPageTitle() {
		homePage.navigateToUrl();
		homePage.assertPageTitle();
	}
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new GoogleHomePage(driver);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
