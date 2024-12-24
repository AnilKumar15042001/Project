package pages;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class information_Technology {

	public By linkText_IT_Services=By.xpath("//div[@class='eca_header']/ancestor::div[@id='categoriesBodyAjax']/descendant::a[contains(text(),'IT services: consulting')]");
	public By linkText_Acquisition_Of_Services=By.cssSelector("a[href='/tenders/np-notice.do?keywords=&noticeId=89304325']");
	public By bidding_Documents=By.xpath("//span[contains(text(),'Bidding Documents (1)')]");
	public By download=By.xpath("//a[text()='download']");
	
	public void setBidding_Documents() throws Exception {
		ElementUtils.performClick(bidding_Documents);
	}

	public void set_IT_Services() throws Exception {
		ElementUtils.performClick(linkText_IT_Services);
	}
	
	public void setLinkText_Acquisition_Of_Services() throws Exception {
		ElementUtils.performClick(linkText_Acquisition_Of_Services);
	}

	public void setDownload() throws Exception {
		ElementUtils.performClick(download);
	}
	
	
}
