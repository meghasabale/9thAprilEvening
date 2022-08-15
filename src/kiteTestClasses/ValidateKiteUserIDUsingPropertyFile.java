package kiteTestClasses;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteBase.BaseNew;
import kiteUserIDUsingTestNG.KiteHomePage;
import kiteUserIDUsingTestNG.KiteLoginPage;
import kiteUserIDUsingTestNG.KitePinPageClass;
import kiteUtility.Utility;
import kiteUtility.UtilityNew;
@Listeners(kiteUtility.Listener.class)
public class ValidateKiteUserIDUsingPropertyFile extends BaseNew
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
	  login.sendUserId(UtilityNew.readDataFromPropertyFile("UN"));
	  login.sendPassword(UtilityNew.readDataFromPropertyFile("PWD"));
	  
	  login.clickOnLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendPin(UtilityNew.readDataFromPropertyFile("PIN"));
	  pin.clickOnContinueButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  
  @Test
  public void validateKiteUserID() throws EncryptedDocumentException, IOException
  {
	  String TCID = "123456";
	  
	Assert.assertEquals(home.getActualUserID(),UtilityNew.readDataFromPropertyFile("UN1"),"TC failed actual and expected are not matching");
	Reporter.log("validated actual and expected userID TC is passed",true);
	Assert.fail();
	//UtilityNew.captureScreenShots(driver, TCID);
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
