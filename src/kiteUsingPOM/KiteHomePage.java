package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(xpath="//span[@class='user-id']")private WebElement myAccId;
	@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
	
	//2. Initialize within a constructor with access level public using pagefactory 
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3. Utilize within a method with access level public
	
	public void validateUserID()
	{
		String actualUserId = myAccId.getText();
		String expectedId="ELR321";
		if(actualUserId.equals(expectedId))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
	}
	
	public void logout() throws InterruptedException
	{
		myAccId.click();
		Thread.sleep(100);
		logoutButton.click();
	}

}
