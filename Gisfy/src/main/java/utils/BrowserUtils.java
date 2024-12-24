package utils;

import static components.AppCommon.dataDrivenMap;
import static components.AppCommon.driver;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserUtils {

	public static void openBrowser() throws Exception {
		switch (dataDrivenMap.get("Browser")) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:System.out.println("Invalid Browser!...");
		return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	public static void enterUrl() throws Exception {
		driver.navigate().to(PropertiesUtils.getKeyValue("url"));
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
}
