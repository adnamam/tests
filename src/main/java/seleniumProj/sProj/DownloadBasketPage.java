package seleniumProj.sProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumProj.utilities.BasePage;

public class DownloadBasketPage extends BasePage{

	public DownloadBasketPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isWindowDisplayed() {
		return driver.findElement(By.id("window-1011")).isDisplayed();
	}

}
