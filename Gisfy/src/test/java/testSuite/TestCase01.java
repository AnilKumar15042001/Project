package testSuite;

import org.testng.annotations.Test;

import pages.Home_Page;
import pages.Register_Page;

public class TestCase01 extends BaseClass{

	@Test
	public void testCase01() throws Exception {
		home_Page.setRgister();
		login_Page.performLogin();
		home_Page.setHome_Btn();
		home_Page.setInformation_Technology();
		information_Technology.set_IT_Services();
		information_Technology.setLinkText_Acquisition_Of_Services();
		information_Technology.setBidding_Documents();
		information_Technology.setDownload();
		System.out.println("Success");
	}
}
