package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class con_05 {
	@Test(invocationCount = 5)
	public void test_01()
	{
		Reporter.log("Test_01 method executed",true);
	}
}
