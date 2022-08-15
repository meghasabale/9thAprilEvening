import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\web driver\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless");
		opt.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		System.out.println("Head less Browser");

	}

}
