package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium1stCode 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://hotstar.com/");
	}

}
