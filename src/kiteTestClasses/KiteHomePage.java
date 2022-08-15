package kiteTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(xpath="//span[@class='user-id']")private WebElement uID;
	@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
	
	//2. Initialize within a constructor with access level public using pagefactory 
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3. Utilize within a method with access level public
	
	public void validateUserID(String expectedUID )
	{
		String actualUserID=uID.getText();
		
		if(actualUserID.equals(expectedUID))
		{
			System.out.println("Actual and Expected User IDs are match, Test-case is pass");
		}
		else
		{
			System.out.println("Actual and Expected User IDs are not match, Test-case is Fail");
		}
	}
	
	public String getActualUserID()
	{
		String actualUserID=uID.getText();
		return actualUserID;
		
	}
	
	public void logout() throws InterruptedException
	{
		uID.click();
		Thread.sleep(100);
		logoutButton.click();
	}
	
	

}
