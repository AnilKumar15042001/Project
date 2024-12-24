package testSuite;

import org.testng.annotations.Test;

public class TestCase02 extends BaseClass{

	@Test
	public void testCase02() throws Exception {
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
