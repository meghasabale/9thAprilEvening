package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		Thread.sleep(1000);
		//checkbox1.click();
		if(checkbox1.isSelected())
		{
			System.out.println("Check Box is Alreay selected");
		}
		else
		{
			checkbox1.click();
			System.out.println("check box is selected now");
		}

	}

}
