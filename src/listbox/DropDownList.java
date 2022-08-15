package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:\\facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("month"));

		Select s= new Select(listBox);
		//s.selectByIndex(0);
		//s.selectByVisibleText("Aug");
		s.selectByValue("12");
		Thread.sleep(1000);

		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		for(int i=0;i<=12;i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(200);
		}
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		for(int i=0;i<=10;i++)
		{
			s2.selectByIndex(i);
			Thread.sleep(200);

		}

}
}



