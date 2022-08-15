package KiteExelTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserIdExel
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		
		File Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		//Sheet mySheet = myworkbook.getSheet("Sheet3");

		String UID = mySheet.getRow(0).getCell(1).getStringCellValue();
		String password = mySheet.getRow(1).getCell(1).getStringCellValue();
		String pin = mySheet.getRow(2).getCell(1).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserId.sendKeys(UID);
		Password.sendKeys(password);
		Thread.sleep(500);
		loginButton.click();
		Thread.sleep(500);
		WebElement upin = driver.findElement(By.id("pin"));
		upin.sendKeys(pin);
		
		WebElement continuebButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continuebButton.click();
		Thread.sleep(200);
		WebElement myLogin = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserId = myLogin.getText();
		String expectedId="ELR321";
		if(actualUserId.equals(expectedId))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
		
		myLogin.click();
		
		Thread.sleep(200);
		//WebElement logoutButton = driver.findElement(By.linkText(" Logout"));
		WebElement logoutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		Thread.sleep(200);
		logoutButton.click();
		driver.close();
	}

}
