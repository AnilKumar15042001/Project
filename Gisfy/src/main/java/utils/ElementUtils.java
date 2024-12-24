package utils;

import static components.AppCommon.driver;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ElementUtils {

	public static WebElement element;
	public static WebElement locateElements(By by) throws InterruptedException {
		
		try {
			for(int i=0;i<5;i++)
			{
				element=driver.findElement(by);
				break;
			}
		} catch (NoSuchElementException e) {
			Thread.sleep(1000);
		}
		return element;
	}
	
	public static void performClick(By by) throws Exception {
//		Assert.assertTrue(locateElements(by).isDisplayed() && locateElements(by).isEnabled(),"Element is not displayed and not enabled");
		locateElements(by).click();
	}
	
	public static void selectElement(String value,By by) {
		try
		{
			List<WebElement> options = driver.findElements(by);
			for (WebElement option : options) {
				if (option.getText().equalsIgnoreCase(value)) {
					option.click();
					break;
				}
			}
		}
		catch (NoSuchElementException e) {
			System.out.println("Element not found!..."+by);
		}
	}
	
	public static void textField(By by, String value) throws Exception {
		Assert.assertTrue(locateElements(by).isDisplayed() && locateElements(by).isEnabled(),"Text field is not displayed and not enabled");
		locateElements(by).sendKeys(value);
	}
}
