package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base
{
	protected WebDriver driver;
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Lanching kite Application",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}

}
