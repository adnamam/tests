package seleniumProj.sProj;

import org.junit.Test;

public class TestTime extends BaseTest{
	
	@Test
	public void doStuff() {
		HeaderPage header = getHeaderPage();
		header.search("saturn");
	}

}
