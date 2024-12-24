package utils;

import static components.AppCommon.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {

	public static Properties getPropertyValue() throws Exception {
		
		try
		{
			properties=new Properties();
			properties.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\configuration\\global.properties"));
			return properties;
		}
		catch (Exception e) {
			e.printStackTrace();
			return properties;
		}
	}

	public static String getKeyValue(String key) throws Exception {
		return getPropertyValue().getProperty(key);
	}
}
