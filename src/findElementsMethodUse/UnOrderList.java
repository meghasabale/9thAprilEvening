package findElementsMethodUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderList 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(list.size());
		
		for(WebElement l:list)  // see list elements
		{
			System.out.println(l.getText());
		}
		
		for(WebElement l:list) //click on specific element--->honda city
		{	
			String expectedResult = "honda city";
			String actualResult = l.getText();
			
			if(actualResult.equals(expectedResult))
			{
				l.click();
				break;
			}
				
		}
		driver.findElement(By.linkText("Images")).click();


	}

}
