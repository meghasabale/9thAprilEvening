package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartReveiws
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.name("q")).sendKeys("i phone 13");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		WebElement reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		System.out.println("Review of I Phone 13 is: "+reviews.getText());

	}

}
