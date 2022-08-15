package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		// 1 create Actions class object
		
		Actions act=new Actions(driver);
		List<WebElement> NoOfRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("No of Rows in Table is : "+NoOfRows.size());
		    
		List<WebElement> NoOfCols = driver.findElements(By.xpath("(//table[@id='product']//tr)[1]/th"));
		System.out.println("No of Columns in Table is : "+NoOfCols.size());

		// print header
		for(WebElement c:NoOfCols)
		{
			System.out.print(c.getText()+" | ");
		}
		System.out.println();

		//to print rows
		
		for(WebElement r:NoOfRows)
		{
			System.out.print(r.getText()+" | ");
			
			System.out.println();

		}
		System.out.println();
	}

}
