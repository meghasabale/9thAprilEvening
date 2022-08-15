package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClassEG
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		// 1 create Actions class object
		
		Actions act=new Actions(driver);
		
		// 2 find Elements
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		// 3 take action
		
		//act.contextClick(rightClick).perform();
		act.moveToElement(rightClick).contextClick().build().perform();
		
	}

}
