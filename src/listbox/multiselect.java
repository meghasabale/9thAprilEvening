package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.xpath("(//input[@role='listbox'])[1]"));
		//driver.findElement(By.xpath("(//span[@class='select-arrow'])[1]"));
Select s =new Select(list);
s.getOptions();
		Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();

	}
	

}
