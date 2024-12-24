package pages;

import static components.AppCommon.*;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class Login_Page {

	
	public By email_Field=By.xpath("//span[contains(text(),'Email:')]/following-sibling::input[@name='username']");
	public By password_Field=By.xpath("//span[contains(text(),'Password:')]/following-sibling::input[@class='text']");
	public By login_Btn=By.xpath("//td[@class='submit-btn']//input[@value='Log in']");
	
	
	
	public By email_Text=By.xpath("//input[@value='Email']");
	public By password_Text=By.xpath("//input[@value='Password: ']");
	public By btn_Login=By.xpath("//input[@value='Log In']");
	public By login_DD=By.xpath("//span[contains(text(),'Log In')]");
	
	
	
	public void setBtn_Login() throws Exception {
		ElementUtils.performClick(btn_Login);
	}

	public void setEmail_Field(String txt_Email_Field) throws Exception {
//		ElementUtils.textField(email_Field, txt_Email_Field);
		ElementUtils.textField(email_Text, txt_Email_Field);
	}
	
	public void setPassword_Field(String txt_Password_Field) throws Exception {
//		ElementUtils.textField(password_Field, txt_Password_Field);
		ElementUtils.textField(password_Text, txt_Password_Field);
	}

	public void setLogin_Btn() throws Exception {
//		ElementUtils.performClick(login_Btn);
		ElementUtils.performClick(btn_Login);
	}
	
	public void performLogin() throws Exception {
		setEmail_Field(dataDrivenMap.get("Email address"));
		setPassword_Field(dataDrivenMap.get("Password"));
		setLogin_Btn();
	}
}
