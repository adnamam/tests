package seleniumProj.sProj;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumProj.utilities.WebDriverManager;

public class BaseTest {
	
	public HeaderPage getHeaderPage() {
		driver().get("http://mast.stsci.edu/portal/Mashup/Clients/Mast/Portal.html");
		return getPage(HeaderPage.class);
	}
	
	/**
	 * Get a page with the default driver
	 * 
	 * @param page the class object of the page to retrieve
	 * @return the page
	 */
	public static <T> T getPage(Class<T> page) {
		try {
			return PageFactory.initElements(driver(), page);
		}
		catch (Exception e) {
			throw new IllegalStateException("Failed to load page: " + page.getName(), e);
		}
	}
	
	public static WebDriver driver() {
		return WebDriverManager.get().driver();
	}
	
	@After
	public void cleanUp() {
		WebDriverManager.get().quit();
	}

}
