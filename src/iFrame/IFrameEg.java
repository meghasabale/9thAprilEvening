package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameEg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(5000);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		driver.switchTo().defaultContent();
	
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		

	}

}
