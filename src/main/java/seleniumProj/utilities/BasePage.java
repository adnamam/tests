package seleniumProj.utilities;

import org.openqa.selenium.WebDriver;

public class BasePage extends CommonUtils{

	/** Shared driver across pages */
	protected final WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}	
}
