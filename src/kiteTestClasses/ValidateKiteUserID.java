package kiteTestClasses;

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

import kiteBase.Base;
import kiteUserIDUsingTestNG.KiteHomePage;
import kiteUserIDUsingTestNG.KiteLoginPage;
import kiteUserIDUsingTestNG.KitePinPageClass;
import kiteUtility.Utility;

public class ValidateKiteUserID extends Base
{
	KitePinPageClass pin;
	KiteLoginPage login;
	KiteHomePage home;
	
 @BeforeClass
 public void launchKite() throws EncryptedDocumentException, IOException
	{
	 	openApplication();
		pin=new KitePinPageClass(driver);
		login=new KiteLoginPage(driver);
		home=new KiteHomePage(driver);
	}
 
  @BeforeMethod
  public void loginToKite() throws EncryptedDocumentException, IOException
	{
	  login.sendUserId(Utility.readDataFromExcel(0,1));
	  login.sendPassword(Utility.readDataFromExcel(1,1));
	  
	  login.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendPin(Utility.readDataFromExcel(2,1));
	  pin.clickOnContinueButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  
  @Test
  public void validateKiteUserID() throws EncryptedDocumentException, IOException
  {
	  String TCID = "1234";
	  
	Assert.assertEquals(home.getActualUserID(),Utility.readDataFromExcel(0, 0),"TC failed actual and expected are not matching");
	Reporter.log("validated actual and expected userID TC is passed",true);
	
	Utility.captureScreenshot(driver, TCID);
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
