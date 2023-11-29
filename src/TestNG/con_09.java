package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class con_09 {
	@Test(description = "used to create Account")
	public void signup()
	{
		Reporter.log("Signup method executed",true);
	}
}
