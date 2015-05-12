package seleniumProj.sProj;

import org.junit.Test;

public class TestTime extends BaseTest{
	
	@Test
	public void doStuff() {
		HomePage homePage = getHomePage();
		homePage.search("saturn");
	}

}
