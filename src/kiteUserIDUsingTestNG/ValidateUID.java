package kiteUserIDUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUID
{
	WebDriver driver;
	File Myfile;
	Workbook myworkbook;
	Sheet mySheet;
	KitePinPageClass pin;
	KiteLoginPage login;
	KiteHomePage home;
	
 @BeforeClass
 public void launchKite() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Myfile=new File("D:\\apachi poi\\MyExel.xlsx");
		myworkbook = WorkbookFactory.create(Myfile);
		mySheet = myworkbook.getSheet("Sheet3");
		
		pin=new KitePinPageClass(driver);
		login=new KiteLoginPage(driver);
		home=new KiteHomePage(driver);
	}
 
  @BeforeMethod
  public void loginToKite()
	{
	  login.sendUserId(mySheet.getRow(0).getCell(1).getStringCellValue());
	  login.sendPassword(mySheet.getRow(1).getCell(1).getStringCellValue());
	  
	  login.clickOnLoginButton();
	  
	  pin.sendPin(mySheet.getRow(2).getCell(1).getStringCellValue());
	  pin.clickOnContinueButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  
  @Test
  public void validateKiteUserID()
  {
	  String expectedUserID = mySheet.getRow(0).getCell(1).getStringCellValue(); 
	  String actualUserID =home.getActualUserID();
	  
	Assert.assertEquals(actualUserID,expectedUserID,"TC failed actual and expected are not matching");
	Reporter.log("validated actual and expected userID TC is passed",true);
  }
  
  @AfterMethod
  public void logOutKite() throws InterruptedException
  {
	  home.logout();
	  Reporter.log("Clicking on logout button",true);
  }
  
  @AfterClass
  public void closeKiteApp()
  {
	  Reporter.log("Closing browser",true);
	  driver.close();
  }
}
