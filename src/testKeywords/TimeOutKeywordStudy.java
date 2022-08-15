package testKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKeywordStudy 
{
  @Test
  public void a() 
  {
	 Reporter.log("a method running", true); 
  }
  
  @Test(timeOut=200)
  public void b() throws InterruptedException 
  {
	  Thread.sleep(1000);
	 Reporter.log("b method running", true); 
  }
  
  @Test
  public void c() 
  {
	 Reporter.log("c method running", true); 
  }
  
  @Test
  public void d() 
  {
	 Reporter.log("d method running", true); 
  }
}
