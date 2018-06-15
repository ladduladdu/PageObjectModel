package com.OrangeHrm.constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class OrangeHrmConstants 
{
		public static WebDriver driver;
		public static String url="http://orangehrm.qedgetech.com/";
		public static void launchApp()
		{
			driver=new FirefoxDriver();
			driver.get(url);
		}
		public static void closeApp()
		{
			driver.close();
		}
}
