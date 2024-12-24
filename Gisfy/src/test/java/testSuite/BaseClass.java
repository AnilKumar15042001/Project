package testSuite;


import static components.AppCommon.testName;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pages.Home_Page;
import pages.Login_Page;
import pages.Register_Page;
import pages.information_Technology;
import utils.BrowserUtils;
import utils.ExcelUtils;
import utils.PropertiesUtils;

public class BaseClass {

	Home_Page home_Page=new Home_Page();
	information_Technology information_Technology=new information_Technology();
	Register_Page register_Page=new Register_Page();
	Login_Page login_Page=new Login_Page();
	
	@BeforeMethod
	public void getCurrentMethodAndClass(ITestResult result) throws Exception {
		testName=result.getMethod().getMethodName();
		ExcelUtils.loadTestData(PropertiesUtils.getKeyValue("filePath"), testName);
	}
	
	@BeforeMethod
	@Parameters
	public void invokeApp() throws Exception {
		BrowserUtils.openBrowser();
		BrowserUtils.enterUrl();
	}
	
	@AfterMethod
	public void tearDownApp() {
//		BrowserUtils.closeBrowser();
	}
}
