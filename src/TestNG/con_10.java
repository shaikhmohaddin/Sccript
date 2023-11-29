package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class con_10 {
	/*@Test(invocationTimeOut = 3000)
	public void signup() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("Signup method executed",true);
	}*/
	//handle Exception 
	@Test(invocationTimeOut = 3000,expectedExceptions = ThreadTimeoutException.class)
	public void signup() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("Signup method executed",true);
	}
}