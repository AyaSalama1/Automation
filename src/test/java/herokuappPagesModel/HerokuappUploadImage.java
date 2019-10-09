package herokuappPagesModel;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HerokuappUploadImage {

	// Variables
	private WebDriver driver;
	private String url = "http://the-internet.herokuapp.com/upload";

	// Locator
	private By browse = By.id("file-upload");
	private By upload = By.id("file-submit");
	private By image = By.id("uploaded-files");

	// Constructor
	public HerokuappUploadImage(WebDriver driver) {
		this.driver = driver;
	}
	// Keywords

	public void navigateToUrl() {
		driver.navigate().to(url);
	}

	private String getPath(String path) {
		File file = new File(path);
		path = file.getAbsolutePath();
		return path;
	}

	public void selectTheImage(String ImageLink) {
		driver.findElement(browse).sendKeys(getPath(ImageLink));
	}

	public void uploadTheSelectedImage() {
		driver.findElement(upload).click();
	}

	public void assertTheImageIsUploaded() {
		Assert.assertTrue(driver.findElement(image).isDisplayed());

	}
}
