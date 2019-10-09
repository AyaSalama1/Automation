package task8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import herokuappPagesModel.HerokuappDragAndDrop;

public class Task8_DragAToB {
	WebDriver driver;
	HerokuappDragAndDrop dragAndDrop;

	@Test
	public void dragAToBAndAssertThatAIsInTheCorrectLocation() {
		dragAndDrop.navigateToUrl();
		dragAndDrop.dragAToB();

	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		dragAndDrop = new HerokuappDragAndDrop(driver);

	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

}
