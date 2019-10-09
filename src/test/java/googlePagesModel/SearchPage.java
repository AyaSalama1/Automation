package googlePagesModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPage {

	// Variables
	private WebDriver driver;

	// locators

	// Constructor
	public SearchPage(WebDriver driver) {
		this.driver = driver;

	}

	// Keywords
	public void waitForSearchResults(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public void navigateToNewPage(int pageNo) {
		driver.findElement(By.xpath("(//div[@id='navcnt']//a)[" + pageNo + "]")).click();

	}

	public void assertTextContent(int indexValue, String assertionValue) {
		Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='srg']//div[@class='ellip'])[" + indexValue + "]"))
				.getText().contentEquals(assertionValue));
	}

	public void assertLinkContain(int indexValue, String assertionValue) {

		Assert.assertTrue(
				driver.findElement(By.xpath("(//div[@class='srg']//div[@class='TbwUpd']//cite)[" + indexValue + "]"))
						.getText().contains(assertionValue));

	}
}
