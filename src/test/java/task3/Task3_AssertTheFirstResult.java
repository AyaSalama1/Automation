package task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import googlePagesModel.GoogleHomePage;
import googlePagesModel.SearchPage;

public class Task3_AssertTheFirstResult {
	WebDriver driver;
	GoogleHomePage homePage;
	SearchPage results;

	@Test
	public void searchInGoogleAndAssertTheFirstResult() {
		homePage.navigateToUrl();
		homePage.searchForQuery("Selenium WebDriver");
		results.assertTextContent(1, "Selenium - Web Browser Automation");
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		results = new SearchPage(driver);
		homePage = new GoogleHomePage(driver);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
