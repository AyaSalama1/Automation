package task5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import googlePagesModel.GoogleHomePage;
import googlePagesModel.SearchPage;

public class Task5_AssertTheSecondResult {
	WebDriver driver;
	GoogleHomePage homePage;
	SearchPage results;

	@Test
	public void searchInGoogleThenNavigateToSecondPageAndAssertTheSecondResult() {
		homePage.navigateToUrl();
		homePage.searchForQuery("Cucumber IO");
		results.navigateToNewPage(1);
		results.assertLinkContain(2, "https://www.linkedin.com");

	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		results = new SearchPage(driver);
		homePage = new GoogleHomePage(driver);

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
