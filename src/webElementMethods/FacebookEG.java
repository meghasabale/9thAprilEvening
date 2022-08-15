package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookEG
{

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Megha");
		driver.findElement(By.id("pass")).sendKeys("megha123");
	 WebElement icon = driver.findElement(By.xpath("//div[contains(@id,'u_0_c')]"));
	icon.click(); 
		if(icon.isSelected())
		{
			System.out.println("password is selected");
		}
	else
		{
			//icon.click();
			System.out.println("password is selected now");
		}
		Thread.sleep(200);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	}

}
