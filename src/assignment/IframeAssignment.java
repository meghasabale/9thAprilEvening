package assignment;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;


public class IframeAssignment
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(5000);
		
		driver.switchTo().frame("frame1");
		
		WebElement textbox = driver.findElement(By.tagName("input"));
		textbox.sendKeys("Iframe Study");
		
		driver.switchTo().frame("frame3");
		
		WebElement checkbox = driver.findElement(By.id("a"));
		checkbox.click();
		boolean check = checkbox.isSelected();
		
		System.out.println("Checkbox is selected "+check);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement listbox = driver.findElement(By.id("animals"));
		
		Select s=new Select(listbox);
		s.selectByIndex(1);
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();
		//System.out.println("Back to Frame 1");
		driver.switchTo().frame("frame1");

		textbox.clear();
		
		textbox.sendKeys("Back to Frame 1");
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	File dest=new File("C:\\Users\\Pramod\\Videos\\Captures\\screenShot\\Iframe.png");
		
		//FileHandler.copy(src,dest);
		

		
		
		
		
		

	}

}
