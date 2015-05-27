package seleniumProj.sProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumProj.utilities.BasePage;

public class HeaderPage extends BasePage {

	public HeaderPage(WebDriver driver) {
		super(driver);
	}
	
	public ContentPage search(String searchText) {
		WebElement searchBox = driver.findElement(By.id("searchbox-1022-inputEl"));
		searchBox.clear();
		searchBox.sendKeys(searchText);
		driver.findElement(By.id("ext-gen1088")).click();
		return getPage(ContentPage.class);
	}
	
	/**
	 * Selects given collection from dropdown menu
	 * 1: All MAST Observations; 2: All VO Collections; 3: Hubble Source Catalog
	 * @param selection
	 */
	public void selectCollection(int selection) {
		driver.findElement(By.id("ext-gen1084")).click();
		driver.findElement(By.xpath(".//*[@id='boundlist-1045-listEl']/ul/li["+selection+"]")).click();
	}
		

		
		//interacting with search results
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.id("tabpanel-1054-body"));
//		driver.findElement(By.id("ext-comp-1396-body"));
//		driver.findElement(By.xpath(".//*[@id='ext-comp-1396-body']"));
//		WebElement el = driver.findElement(By.id("gridview-1425-body"));
//		List<WebElement> stuff = el.findElements(By.tagName("tr"));
//		String text = stuff.get(0).getText();
		
		
		//////DATABASE STUFF
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		DriverManager.getConnection("TerminalServer.stsci.edu", user, password)

}