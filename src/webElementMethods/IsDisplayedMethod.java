package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.quit();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		
		//  locator by using Xpath
		
	WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		// locator using classname
		
		//driver.findElement(By.className("inputs displayed-class"));
		
	//  locator by using Id
		
		//driver.findElement(By.id("displayed-text"));
		
		//locator by using Name
		
		//driver.findElement(By.name("show-hide"));
		
		WebElement showbutton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		
		WebElement hidebutton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		
		hidebutton.click();
		Thread.sleep(500);
		//showbutton.click();
		
		
		
		if(textbox.isDisplayed())
		{
			System.out.println("text box is displayed");
			textbox.sendKeys("Megha");
		}
		else
		{
			System.out.println("text box is not displayed, click on show button");
			showbutton.click();
			textbox.sendKeys("Megha Sabale");
		}
		
		
		
		
	}

}
