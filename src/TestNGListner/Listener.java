package TestNGListner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listener implements ITestListener
{
	//ontest ctrl+spacebar===> becomes ITestlistner interface methods to override
	
	
  @Override
public void onTestStart(ITestResult result)
  {
	Reporter.log("TC execution is started "+result.getName(),true);
  }
  
  @Override
	public void onTestSkipped(ITestResult result)
  {
	  Reporter.log("TC execution is skipped "+result.getName(),true);
	}
  @Override
	public void onTestFailure(ITestResult result)
  {
	  Reporter.log("TC execution is failure "+result.getName(),true);
	}
  
  @Override
	public void onTestSuccess(ITestResult result)
  {
	  Reporter.log("TC execution is successfull "+result.getName(),true);
	}
}