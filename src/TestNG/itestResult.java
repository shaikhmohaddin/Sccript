package TestNG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class itestResult extends Assert {
@Test
public void TestcaseFail()
{
	fail("fail");
}
@Test
public void TestcasePass()
{
	assertTrue(true);
}
@AfterMethod
public void getStatus(ITestResult result)
{
	if(result.getStatus()==ITestResult.SUCCESS) {
	Reporter.log("Success =Method :" + result.getStatus()+"Method Name :" + result.getName(),true);	
	}
	if(result.getStatus()==ITestResult.FAILURE) {
		Reporter.log("Failures =Method :" + result.getStatus()+"Method Name :" + result.getName(),true);	
		}
}
}
