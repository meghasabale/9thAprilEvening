package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		// 1 create Actions class object
		
		Actions act=new Actions(driver);
		
		// 2 find Elements
		
		WebElement srcContent = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		act.dragAndDrop(srcContent, dest);
		
		//act.clickAndHold(srcContent).moveToElement(dest).release().build().perform();
		
		
	}

}
