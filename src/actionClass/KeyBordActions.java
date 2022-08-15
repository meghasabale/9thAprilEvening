package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// 1 create Actions class object
		
		Actions act=new Actions(driver);
		// 2 find element
		driver.findElement(By.linkText("Create New Account")).click();
		  
		//WebElement day = driver.findElement(By.id("day")).click();
		//driver.findElement(By.id("day")).click();
		driver.findElement(By.id("month")).click();
		
		// 3 take action
		
		//act.click(day).perform();
		Thread.sleep(1000);
		/*act.sendKeys(Keys.ARROW_UP).perform();	
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();*/
		
		for(int i=0;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();	
			Thread.sleep(1000);
		}

		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
	}

}
