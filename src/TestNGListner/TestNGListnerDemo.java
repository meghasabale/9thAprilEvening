package TestNGListner;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGListner.Listener.class)
public class TestNGListnerDemo
{
  @Test
  public void myMethod1()
  {
	  Reporter.log("myMethod1-->execution is started",true);
  }
  
  @Test
  public void myMethod2()
  {
	  Assert.fail();
	  Reporter.log("myMethod2-->execution is started",true);
  }
  
  @Test(dependsOnMethods={"myMethod2"})
  public void myMethod3()
  {
	  Reporter.log("myMethod3-->execution is started",true);
  }
  
}
