package seleniumProj.sProj;

import org.junit.Assert;

import org.junit.Test;

public class TestTime extends BaseTest{
	
	@Test
	public void doStuff() {
		HeaderPage header = getHeaderPage();
		ContentPage contentPage = header.search("saturn");
		contentPage.clickFirstAddToBasket();
		contentPage.downloadBasketGuy();
		
		DownloadBasketPage db = getPage(DownloadBasketPage.class);
		Assert.assertTrue(db.isWindowDisplayed());
		
	}

}
