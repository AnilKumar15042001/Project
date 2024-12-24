package pages;

import static components.AppCommon.*;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class Register_Page {

	public By firstName=By.xpath("//input[@name='firstNames']");
	public By lastName=By.xpath("//input[@name='lastName']");
	public By organization=By.xpath("//input[@name='organizationName']");
	public By email_Address=By.xpath("//input[@name='email']");
	public By password=By.xpath("//td[@class='form_field']//input[@name='password']");
	public By repeat_Password=By.xpath("//input[@name='passwordConfirmation']");
	public By country_Of_Residence=By.xpath("//select[@name='selectedCountryResidence']");
	public By mailing_Address=By.xpath("//input[@name='mailingAddress']");
	public By phone=By.xpath("//input[@name='phone']");
	public By fax=By.xpath("//input[@name='fax']");
	public By web_Site=By.xpath("//input[@name='webSite']");
	public By preferred_Languag=By.xpath("//select[@name='selectedLanguage']");
	public By checkBox=By.xpath("//input[@name='agree']");
	public By register_Btn=By.xpath("//button[@class='submit']");
	
	public void setFirstName(String txt_FirstName) throws Exception {
		ElementUtils.textField(firstName, txt_FirstName);
	}
	public void setLastName(String txt_LastName) throws Exception {
		ElementUtils.textField(lastName, txt_LastName);
	}
	public void setOrganization(String txt_Organization) throws Exception {
		ElementUtils.textField(organization, txt_Organization);
	}
	public void setEmail_Address(String txt_Email_Address) throws Exception {
		ElementUtils.textField(email_Address, txt_Email_Address);
	}
	public void setPassword(String txt_Password) throws Exception {
		ElementUtils.textField(password, txt_Password);
	}
	public void setRepeat_Password(String txt_Repeat_Password) throws Exception {
		ElementUtils.textField(repeat_Password, txt_Repeat_Password);
	}
	public void setCountry_Of_Residence(String txt_Country_Of_Residence) throws Exception {
		ElementUtils.performClick(country_Of_Residence);
		ElementUtils.selectElement(txt_Country_Of_Residence, By.tagName("option"));
	}
	public void setMailing_Address(String txt_Mailing_Address) throws Exception {
		ElementUtils.textField(mailing_Address, txt_Mailing_Address);
	}
	public void setPhone(String txt_Phone) throws Exception {
		ElementUtils.textField(phone, txt_Phone);
	}
	public void setFax(String txt_Fax) throws Exception {
		ElementUtils.textField(fax, txt_Fax);
	}
	public void setWeb_Site(String txt_Web_Site) throws Exception {
		ElementUtils.textField(web_Site, txt_Web_Site);
	}
	public void setPreferred_Languag(String txt_Preferred_Languag) throws Exception {
		ElementUtils.performClick(country_Of_Residence);
		ElementUtils.selectElement(txt_Preferred_Languag, By.tagName("option"));
	}
	public void setCheckBox() throws Exception {
		ElementUtils.performClick(checkBox);
	}
	public void setRegister_Btn() throws Exception {
		ElementUtils.performClick(register_Btn);
	}
	
	public void performRegister() throws Exception {
		setFirstName(dataDrivenMap.get("First name"));
		setLastName(dataDrivenMap.get("Last name"));
		setOrganization(dataDrivenMap.get("Organization"));
		setEmail_Address(dataDrivenMap.get("Email address"));
		setPassword(dataDrivenMap.get("Password"));
		setRepeat_Password(dataDrivenMap.get("Repeat password"));
		setCountry_Of_Residence(dataDrivenMap.get("Country of residence"));
		setMailing_Address(dataDrivenMap.get("Mailing Address"));
		setPhone(dataDrivenMap.get("Phone"));
		setFax(dataDrivenMap.get("Fax"));
		setWeb_Site(dataDrivenMap.get("Web Site"));
		setPreferred_Languag(dataDrivenMap.get("Preferred language"));
		setCheckBox();
		setRegister_Btn();
	}
}
