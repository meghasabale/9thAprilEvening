package testKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy 
{
	//1.  by default priority is 0 and it is run according to alphabetical order sequence of method defining no matter
	//2. if you set priority is same or duplicate then again priority set by alphabetical order
	//3. priority is 0, +,-,or duplicate and not decimal or variable====>largest negative number(lower priority execute 1st) having heighest priority
	
  @Test(priority=-2)
  public void b() 
  {
	  Reporter.log("b method running", true);
  }
  
  @Test(priority=3)
  public void c() 
  {
	  Reporter.log("c method running", true);
  }
  
  @Test(priority=0)
  public void d() 
  {
	  Reporter.log("d method running", true);
  }
  @Test(priority=-3)
  public void e() 
  {
	  Reporter.log("e method running", true);
  }
  @Test(priority=0)
  public void f() 
  {
	  Reporter.log("f method running", true);
  }
  
  @Test(priority=1)
  public void a() 
  {
	  Reporter.log("a method running", true);
  }
}
