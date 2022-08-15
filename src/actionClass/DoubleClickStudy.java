package actionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickStudy
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		// 1 create Actions class object
		
		Actions act=new Actions(driver);
		
		// 2 Find Element
		
		WebElement dblClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		// 3 perform action 
		
		//act.click(dblClick).perform();
		act.moveToElement(dblClick).doubleClick().build().perform();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
