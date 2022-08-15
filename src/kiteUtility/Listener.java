package kiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import kiteBase.BaseNew;

public class Listener extends BaseNew implements ITestListener
{
	//ontest ctrl+spacebar===> becomes ITestlistner interface methods to override
	
	BaseNew b=new BaseNew();
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
  public void onTestFailure(ITestResult result)
  {
	  Reporter.log("TC execution is Failed "+result.getName(),true);
	  try {
		b.captureScreenShots(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
  
  @Override
	public void onTestSuccess(ITestResult result)
  {
	  Reporter.log("TC execution is successfull "+result.getName(),true);
	}
}