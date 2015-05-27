package seleniumProj.sProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumProj.utilities.BasePage;

public class FiltersPage extends BasePage{

	public FiltersPage(WebDriver driver) {
		super(driver);
	}
	
	/**'
	 * 
	 * @param s - which radio button you want to select:
	 * 1: all; 2: checked; 3: unchecked
	 */
	public void filterRadioButtons(int s) {
		driver.findElement(By.id("radiofield-112"+s+"-inputEl")).click();
	}
	
	

}
