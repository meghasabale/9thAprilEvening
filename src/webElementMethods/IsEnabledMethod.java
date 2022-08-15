package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");

		Thread.sleep(2000);
		 
		WebElement signIn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signIn.click();
		
		Thread.sleep(1000);
		
		WebElement otpbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		boolean result=otpbutton.isEnabled();
		
		System.out.println("OTP button enabled is:" +result);
		
		WebElement mobno=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
		
		mobno.sendKeys("9555658545");
		
		Thread.sleep(100);
		
		boolean result1=otpbutton.isEnabled();
		
		System.out.println("OTP button Enabled is:"+result1);
		
		if(result1)
		{
			
			otpbutton.click();
			System.out.println("OTP Button clicked");
		}
		else
		{
		
			System.out.println("Failed");
		}


	}

}
