package task7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import herokuappPagesModel.HerokuappUploadImage;

public class Task7_UploadImage {
	WebDriver driver;
	HerokuappUploadImage uploadImage;

	@Test
	public void uploadAImageAndAssertTheImageIsUploaded() {
		uploadImage.navigateToUrl();
		uploadImage.selectTheImage("src\\test\\resources\\Images\\passed.png");
		uploadImage.uploadTheSelectedImage();
		uploadImage.assertTheImageIsUploaded();

	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		uploadImage = new HerokuappUploadImage(driver);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
