package testNGstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportLog
{
  @Test
  public void display()
  {
	  System.out.println("This is printing statement");
	  Reporter.log("Hi this is reporter without boolean value");//out put show only on reporter
	  Reporter.log("Hi this is reporter with boolean value", true);// show output on console as well as Reporter
  }
}
