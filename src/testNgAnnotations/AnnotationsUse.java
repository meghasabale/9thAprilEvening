package testNgAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsUse 
{

	
  @Test
  public void validateUserId1()
  {
	  Reporter.log("UserID validated====> Test Method 1 running", true);
	  
  }
  @Test
  public void validateUserId2()
  {
	  Reporter.log("UserID validated1=====>Test2 Method running", true);
	  
  }
  @Test
  public void validateUserId3()
  {
	  Reporter.log("UserID validated2====>Test method is running", true);
	  
  }
  @BeforeMethod
  public void login()//run before every Test method====> define once in the program
  {
	  Reporter.log("Login done====>Before Method running", true);
	  
  }
  @AfterMethod
  public void logOut()  // run After every Test Method===> define once in the program
  {
	  Reporter.log("Logout done====>After Method running", true);
	  
  }
  @AfterClass
  public void myMethod()
  {
	  Reporter.log("close broser====>After class is running", true);
	  //driver.close();
  }
 
  @BeforeClass
  public void kiteLaunch()
	{
		Reporter.log("kite launch=====>Before class running", true);
	}
  
}
