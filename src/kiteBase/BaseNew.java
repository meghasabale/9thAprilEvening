package kiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteUtility.UtilityNew;

public class BaseNew 
{
	protected static WebDriver driver;
	public void openApplication() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityNew.readDataFromPropertyFile("URL"));
		Reporter.log("Lanching kite Application",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void captureScreenShots(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\Pramod\\Videos\\Captures\\screenShot\\Scrrenshot"+TCID+".png");
	
		FileHandler.copy(src, Dest);
		Reporter.log("TakenScreenshot",true);
		
	}

}
