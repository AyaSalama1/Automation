package herokuappPagesModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HerokuappDragAndDrop {

	
	
	// Variables
	private WebDriver driver;
	private String url = "http://the-internet.herokuapp.com/drag_and_drop";
	Actions action;

	// Locator
	private By columnA = By.xpath("//div[@id='column-a']");
	private By columnB = By.xpath("//div[@id='column-b']");

	// Constructor
	public HerokuappDragAndDrop(WebDriver driver) {
		this.driver = driver;
	}
	// Keywords

	public void navigateToUrl() {
		driver.navigate().to(url);
	}

	public void dragAToB() {
		action = new Actions(driver);
		;
		action.dragAndDrop(driver.findElement(columnA), driver.findElement(columnB)).clickAndHold().build().perform();
		
		
		
	}

	public void assertCheckboxesAreChecked() {

	}
}
