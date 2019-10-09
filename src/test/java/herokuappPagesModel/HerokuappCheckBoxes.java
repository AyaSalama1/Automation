package herokuappPagesModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HerokuappCheckBoxes {

	// Variables
	private WebDriver driver;
	private String url = "http://the-internet.herokuapp.com/checkboxes";

	// Locator

	// Constructor
	public HerokuappCheckBoxes(WebDriver driver) {
		this.driver = driver;
	}
	// Keywords

	public void navigateToUrl() {
		driver.navigate().to(url);
	}

	public void checkFirstCheckbox() {
		driver.findElement(By.xpath("(//div[@id='content']//input[@type='checkbox'])[1]")).click();
	}

	public void assertCheckboxesAreChecked() {

		Assert.assertTrue(
				driver.findElement(By.xpath("(//div[@id='content']//input[@type='checkbox'])[1]")).isSelected());
		Assert.assertTrue(
				driver.findElement(By.xpath("(//div[@id='content']//input[@type='checkbox'])[2]")).isSelected());
	}
}
