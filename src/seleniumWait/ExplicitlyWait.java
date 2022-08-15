package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com");
		WebElement stdReview = driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));

		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(500));
		w.until(ExpectedConditions.visibilityOf(stdReview));
	}

}
