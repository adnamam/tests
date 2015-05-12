package seleniumProj.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

	public static final int IMPLICIT_WAIT = 2;

	/**
	 * Instantiate a page object with the currently active (or new if none)
	 * driver
	 *
	 * @param pageClass
	 *            the page to load
	 * @return the page object
	 */
	public static <T> T getPage(Class<T> pageClass) {
		return PageFactory.initElements(driver(), pageClass);
	}

	public static WebDriver driver() {
		return WebDriverManager.get().driver();
	}

	/**
	 * Get a driver wait object with the default implicit wait time
	 * 
	 * @return a default WebDriverWait object
	 */
	public static WebDriverWait driverWait() {
		return driverWait(IMPLICIT_WAIT);
	}

	/**
	 * Get a driver wait object with the provided timeout
	 * 
	 * @param timeoutInSeconds
	 *            the maximum wait time in seconds
	 * @return a WebDriverWait object
	 */
	public static WebDriverWait driverWait(int timeoutInSeconds) {
		return new WebDriverWait(driver(), timeoutInSeconds);
	}

}
