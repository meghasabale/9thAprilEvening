package kiteLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteEx 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		//uid=ELR321   password=Dhana1111
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		UserId.sendKeys("ELR321");
		Password.sendKeys("Dhana1111");
		Thread.sleep(500);
		loginButton.click();
		Thread.sleep(500);
		WebElement upin = driver.findElement(By.id("pin"));
		upin.sendKeys("982278");
		
		WebElement continuebButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continuebButton.click();
		Thread.sleep(200);
		WebElement myLogin = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserId = myLogin.getText();
		String expectedId="ELR321";
		
		if(actualUserId.equals(expectedId))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
		
		//myLogin.click();
		
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		Thread.sleep(200);
		logoutButton.click();
		driver.close();
	}
}
