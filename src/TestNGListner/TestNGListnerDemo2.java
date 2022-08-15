package TestNGListner;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGListner.Listener.class)
public class TestNGListnerDemo2
{
  @Test
  public void myMethod4()
  {
	  Reporter.log("myMethod4-->execution is started",true);
  }
  
  @Test
  public void myMethod5()
  {
	  Assert.fail();
	  Reporter.log("myMethod5-->execution is started",true);
  }
  
  @Test(dependsOnMethods={"myMethod5"})
  public void myMethod6()
  {
	  Reporter.log("myMethod6-->execution is started",true);
  }
  
}
