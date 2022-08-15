package screenShots;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomNameScreenshots
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:\\facebook.com");
		Thread.sleep(1000);
		
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String random = RandomString.make(4);
			
			File Dest=new File("C:\\Users\\Pramod\\Videos\\Captures\\screenShot\\facebookSnapshot"+random+".png");
			
		FileHandler.copy(src, Dest);

	}

}
