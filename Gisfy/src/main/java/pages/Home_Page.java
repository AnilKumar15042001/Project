package pages;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class Home_Page {

	
	public By information_Technology_Link=By.xpath("//a[@title='Information technology tenders']");
	public By register_Link=By.xpath("//a[contains(.,'Register')]");
	public By home_Btn=By.xpath("//span[text()='Home']");

	public void setInformation_Technology() throws Exception {
		ElementUtils.performClick(information_Technology_Link);
	}
	
	public void setRgister() throws Exception {
		ElementUtils.performClick(register_Link);
	}
	
	public void setHome_Btn() throws Exception {
		ElementUtils.performClick(home_Btn);
	}
}
