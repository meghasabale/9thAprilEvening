package testKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountEX 
{
  @Test(invocationCount=5)
  public void myMethod() 
  {
	  Reporter.log("My method is running", true);
  }
}
