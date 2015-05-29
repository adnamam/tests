package seleniumProj.sProj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumProj.utilities.BasePage;

public class ContentPage extends BasePage{
	
	//tip text for action buttons
	private static final String downloadNow = "Download Associated Data Now";
	private static final String downloadBasket = "Add Associated Files to Download Basket";
	private static final String showDetails= "Show Details";
	private static final String spectralViewer= "Spectral Viewer";
	private static final String focusAstroView= "Focus AstroView on these Coordinates";
	

	public ContentPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Clicks the first download now button listed in table
	 */
	public void clickFirstDownloadNow() {
		clickFirstActionButton(downloadNow);
	}
	
	/**
	 * Clicks the first add to basket button listed in table
	 */
	public void clickFirstAddToBasket() {
		clickFirstActionButton(downloadBasket);
	}
	
	/**
	 * Clicks the first show details button listed in table
	 */
	public void clickFirstShowDetails() {
		clickFirstActionButton(showDetails);
	}
	
	/**
	 * Clicks the first spectral viewer button listed in table
	 */
	public void clickFirstSpectralViewer() {
		clickFirstActionButton(spectralViewer);
	}
	
	/**
	 * Clicks the first focus astroviwer button listed in table
	 */
	public void clickFirstFocusAstroView() {
		clickFirstActionButton(focusAstroView);
	}
	
	/**
	 * Clicks first action button
	 * @param action - tip text for action string
	 */
	private void clickFirstActionButton(String action) {
		//set the action text 
		String actionText = null;
		switch(action) {
		case downloadNow:
			actionText = downloadNow;
			break;
		case downloadBasket:
			actionText = downloadBasket;
			break;
		case showDetails:
			actionText = showDetails;
			break;
		case spectralViewer:
			actionText = spectralViewer;
			break;
		case focusAstroView:
			actionText = focusAstroView;
			break;
		}
		//get first row
		WebElement tableEl = driver.findElement(By.id("gridview-1425-body"));
		List<WebElement> tableRows = tableEl.findElements(By.tagName("tr"));
		WebElement firstTableRowEl = tableRows.get(0);
		//get action elements in first row
		List<WebElement> actions= firstTableRowEl.findElements(By.xpath("*/div//*"));
		
		//check text for action element, click once text matches
		for(int i=1; i<actions.size()-1; i++) {
			WebElement currentEl = actions.get(i);
			if (currentEl.getAttribute("data-qtip").equals(actionText)) {
				currentEl.click();
				break;
			}
		}
		
		//this is what worked for specifically searching Saturn
//		firstTableRowEl.findElement(By.xpath("*/div//*[2]")).click();
		
	}
}