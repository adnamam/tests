package seleniumProj.sProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumProj.utilities.BasePage;

public class ContentPage extends BasePage{

	public ContentPage(WebDriver driver) {
		super(driver);
	}
	
	public String stuff() {
		return driver.findElement(By.id("tab-7779-btnInnerEl")).getText();
	}

}
