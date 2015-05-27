package seleniumProj.sProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumProj.utilities.BasePage;

public class FiltersPage extends BasePage{

	public FiltersPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 
	 * @param s - which radio button you want to select:
	 * 1: all; 2: checked; 3: unchecked
	 */
	public void filterRadioButtons(int s) {
		driver.findElement(By.id("radiofield-112"+s+"-inputEl")).click();
	}
	
	public void getTabs() {
		//get all of the tab elements
		List<WebElement> tabs = driver.findElements(By.cssSelector("a[id*='tab-10']"));
		//get the first child of the tabs
		List<WebElement> tabChildren = tabs.get(0).findElements(By.xpath(".//*"));
		System.out.println(tabChildren);
		
		for(int i=0; i<tabChildren.size()-1; i++) {
			System.out.println(tabs.get(i).getText());
		}
	}
	
	
	

}
