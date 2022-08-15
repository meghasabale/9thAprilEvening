package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodStudy 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1. to enter url in browser or to open an application
		
		driver.get("https://amazon.com/");
		
		//2. to close the current tab of the browser opened by selenium tool
		
	//	driver.close();
		
		//3. to close all the tabs present in browser opened by selenium tool.
		
		//driver.quit();
		
		//4. Maximise / minimize() -use to maximize/minimizethe browser
		
		driver.manage().window().maximize();
		
		
		driver.manage().window().minimize();
		
		
		
	}

}
