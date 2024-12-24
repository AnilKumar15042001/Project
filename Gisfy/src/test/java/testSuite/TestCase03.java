package testSuite;

import org.testng.annotations.Test;

public class TestCase03 extends BaseClass{

	@Test
	public void testCase03() throws Exception {
//		home_Page.setRgister();
//		register_Page.performRegister();
//		home_Page.setHome_Btn();
		home_Page.setInformation_Technology();
		information_Technology.set_IT_Services();
		information_Technology.setLinkText_Acquisition_Of_Services();
		information_Technology.setBidding_Documents();
		login_Page.performLogin();
		System.out.println("Success");
	}
}
