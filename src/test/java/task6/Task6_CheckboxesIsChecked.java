package task6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import herokuappPagesModel.HerokuappCheckBoxes;

public class Task6_CheckboxesIsChecked {
	WebDriver driver;
	HerokuappCheckBoxes checkboxesPage;

	@Test
	public void checkTheCheckboxAndAssertThatCheckboxesIsChecked() {
		checkboxesPage.navigateToUrl();
		checkboxesPage.checkFirstCheckbox();
		checkboxesPage.assertCheckboxesAreChecked();
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		checkboxesPage = new HerokuappCheckBoxes(driver);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
