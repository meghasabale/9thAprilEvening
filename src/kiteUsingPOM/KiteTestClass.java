package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		KiteLoginPage login=new KiteLoginPage(driver);
		
		login.sendUserId();
		login.sendPassword();
		login.clickOnLoginButton();
		Thread.sleep(100);
		
		KitePinPageClass pin=new KitePinPageClass(driver);
		
		pin.sendPin();
		pin.clickOnContinue();
		Thread.sleep(100);
		
		KiteHomePage homepage=new KiteHomePage(driver);
		
			homepage.validateUserID();
			homepage.logout();
			Thread.sleep(100);
			driver.close();
		
		
	}

}
