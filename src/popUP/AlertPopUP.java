package popUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUP 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();
		Thread.sleep(1000);

		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		Thread.sleep(1000);

		
		/*driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
		Thread.sleep(1000);
		Alert alt1 = driver.switchTo().alert();

		alt1.dismiss();
		*/

	}

}
