package task4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import googlePagesModel.GoogleHomePage;
import googlePagesModel.SearchPage;

public class Task4_AssertTheFourthResult {
	WebDriver driver;
	GoogleHomePage homePage;
	SearchPage results;

	@Test
	public void searchInGoogleAndAssertTheFourthResult() {
		homePage.navigateToUrl();
		homePage.searchForQuery("TestNG");
		results.waitForSearchResults(30);
		results.assertTextContent(4, "TestNG Tutorial");
	}

	@BeforeClass
	public void beforeClass() {
		System.getProperty("webdriver.gecko.driver", "src\\test\\resources\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		results = new SearchPage(driver);
		homePage = new GoogleHomePage(driver);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
