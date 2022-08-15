package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigetMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\web driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(200);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(200);
		driver.navigate().back();
		Thread.sleep(200);
		driver.navigate().refresh();
		Thread.sleep(200);
		driver.navigate().forward();
		
		

	}

}
