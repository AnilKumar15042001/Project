package components;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

public class AppCommon {

	public static WebDriver driver;
	public static Properties properties;
	public static Workbook workbook;
	public static Sheet sheet;
	public static Cell cell;
	public static Row row;
	public static FileInputStream fileInputStream;
	public static String testName;
	
	public static Map<String,String> dataDrivenMap;
}
