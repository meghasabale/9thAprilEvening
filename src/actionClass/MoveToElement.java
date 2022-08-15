package actionClass;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		// to create Action class object
		
		Actions act=new Actions(driver);
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		act.moveToElement(aboutUs).perform();
		 //click by using Webelement Method
		//aboutUs.click();
		
		String CurrentTabId = driver.getWindowHandle();
		
		System.out.println("Curent tab id:"+CurrentTabId);
		
		// click by using action class method
		act.click().perform();
		
		String newTabId = driver.getWindowHandle();
		System.out.println("new tab id:"+newTabId);

		driver.navigate().back();
		
		driver.switchTo().window(CurrentTabId);
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		act.moveToElement(radio1).perform();
		act.click().perform();
		
		//act.click(radio1).perform();
		
	

	}

}
