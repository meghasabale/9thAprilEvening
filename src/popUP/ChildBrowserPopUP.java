package popUP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/links/");
		
		driver.findElement(By.name("multiple")).click();
		
		String IdOfMainPage = driver.getWindowHandle();
		System.out.println("MainPage :   "+IdOfMainPage);
		
		Set<String> IdOfAllPage = driver.getWindowHandles();
		System.out.println("AllPage :  "+IdOfAllPage);
		
		ArrayList <String>al=new ArrayList<String>(IdOfAllPage);
		String NewIdOfMainPage = al.get(0);
		String IDOfChild1Page = al.get(1);
		String IDOfChild2Page = al.get(2);
		//driver.quit();
		
		driver.switchTo().window(IDOfChild1Page);
		driver.close();
		driver.switchTo().window(IDOfChild2Page);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Selenium");
		//Thread.sleep(3000);

		driver.close();
		
		driver.switchTo().window(NewIdOfMainPage);
		
		 WebElement xt = driver.findElement(By.xpath("//p[contains(text(),'in new tab')]"));
		
		//xt.getText();
		
		System.out.println(xt.getText());
				
		driver.close();
		
		
		
		
		
	}

}
