package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\web driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		//sendKeys() use
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Megha sabale");
		Thread.sleep(2000);
		
		// clear() use
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		// click() use
		
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		
		// getText() use
		
		String text=driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println(text);
		
	}

}
