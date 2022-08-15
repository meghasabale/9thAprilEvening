package kiteTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(id="userid")private WebElement userId;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement loginButton;
	
	//2. Initialize within a constructor with access level public using pagefactory 
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3. Utilize within a method with access level public
	
	public void sendUserId(String UN)
	{
		userId.sendKeys(UN);
	}
	public void sendPassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}


}
