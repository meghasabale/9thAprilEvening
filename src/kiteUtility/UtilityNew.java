package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew 
{
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop =new Properties();
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\Pramod\\eclipse-workspace\\MySelenium\\myProperty.properties");
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		return value;
				
	}
	
	/*public static void captureScreenShots(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\Pramod\\Videos\\Captures\\screenShot\\Scrrenshot"+TCID+".png");
	
		FileHandler.copy(src, Dest);
		Reporter.log("TakenScreenshot",true);
		
	}*/

}
