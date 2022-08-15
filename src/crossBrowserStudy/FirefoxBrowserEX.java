package crossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserEX
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\web driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com");

	}

}//geckodriver
