package seleniumProj.sProj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumProj.utilities.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void search(String searchText) {
		WebElement searchBox = driver.findElement(By.id("searchbox-1022-inputEl"));
		searchBox.clear();
		searchBox.sendKeys(searchText);
		driver.findElement(By.id("ext-gen1088")).click();
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("tabpanel-1054-body"));
		driver.findElement(By.id("ext-comp-1396-body"));
		driver.findElement(By.xpath(".//*[@id='ext-comp-1396-body']"));
		WebElement el = driver.findElement(By.id("gridview-1425-body"));
		List<WebElement> stuff = el.findElements(By.tagName("tr"));
		String text = stuff.get(0).getText();
//		String text = driver.findElement(By.id("ext-gen3010")).getText();
		System.out.println(text);
	}

}
