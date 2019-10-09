package googlePagesModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleHomePage {

	// Variables
	private WebDriver driver;
	private String url = "https://www.google.com/ncr";
	private String title = "Google";

	// Locator
	private By searchbox = By.name("q");
	private By googleLogo = By.id("hplogo");

	// Constructor
	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;

	}
	// Keywords

	public void navigateToUrl() {
		driver.navigate().to(url);
	}

	public void assertPageTitle() {
		Assert.assertEquals(driver.getTitle(), title);

	}

	public void searchForQuery(String query) {
		driver.findElement(searchbox).sendKeys(query, Keys.ENTER);

	}

	public void assertGoogleLogo() {
		Assert.assertTrue(driver.findElement(googleLogo).isDisplayed());
	}
}
