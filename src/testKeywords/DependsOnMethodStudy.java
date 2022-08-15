package testKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodStudy
{
	// 1. run c method 1st then run b because it depend on c if c method fail then b method going to be skip
	// 2. execution priority order is not taken alphabetically its taken sequentially after c method
  
  @Test(dependsOnMethods= {"c"})
  public void b() 
  {
	  Reporter.log("b method running", true);
  }
  
  @Test(timeOut=200)
  public void c() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  Reporter.log("c method running", true);
  }
  
  @Test
  public void d() 
  {
	  Reporter.log("d method running", true);
  }
  
  @Test
  public void e() 
  {
	  Reporter.log("e method running", true);
  }
  
  @Test
  public void a() 
  {
	  Reporter.log("a method running", true);
  }
}
