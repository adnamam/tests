package seleniumProj.sProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumProj.utilities.BasePage;

public class ContentPage extends BasePage{

	public ContentPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickFirstAddToBasket() {
		WebElement el = driver.findElement(By.id("gridview-1425-body"));
		List<WebElement> stuff = el.findElements(By.tagName("tr"));
		WebElement els = stuff.get(0);
		els.findElement(By.xpath("*/div//*[2]")).click();
	}
	
	public void downloadBasketGuy() {
		WebElement removeItems = driver.findElement(By.id("button-1457-btnIconEl"));
//		String val = removeItems.getCssValue("unselectable");
//		System.out.println("The value is:::::" + val);
		boolean en = removeItems.isEnabled();
		System.out.println("The value is:::::" + en);
		
	}

}
