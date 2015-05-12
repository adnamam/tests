package seleniumProj.sProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumProj.utilities.BasePage;

public class HeaderPage extends BasePage {

	public HeaderPage(WebDriver driver) {
		super(driver);
	}
	
	public void search(String searchText) {
		WebElement searchBox = driver.findElement(By.id("searchbox-1022-inputEl"));
		searchBox.clear();
		searchBox.sendKeys(searchText);
		driver.findElement(By.id("ext-gen1088")).click();
		
	}

}
