package utils;

import static components.AppCommon.driver;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshotUtils {

	public static void getScreenShot(String fileName) throws IOException {
		TakesScreenshot screenshot=((TakesScreenshot) driver);
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\"+fileName+Math.random()+".png"));
	}
}
