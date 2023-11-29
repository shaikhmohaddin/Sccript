package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class con_04 {
	@Test(priority = 1)
	public void createAccount()
	{
		Reporter.log("Create Account method executed",true);
	}
	
	@Test(priority = 2)
	public void editAccount()
	{
		Reporter.log("Edit Account method executed",true);
	}
	
	@Test(priority = 3)
	public void deleteAccount()
	{
		Reporter.log("delete Account method executed",true);
	}
}
