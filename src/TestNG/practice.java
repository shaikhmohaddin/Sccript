package TestNG;

import org.testng.annotations.DataProvider;

public class practice {
	@DataProvider
	public Object testdata()
	{
		Object[][] rv = new Object[1][2];
		rv[0][0]="asif@123.com";
		rv[0][1]="asif123";
		return rv;
	}
	
}
