package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class con_12 {
	@Test
public void test_01() 
{
	SoftAssert s=new SoftAssert();
	Reporter.log("Test_01 method execution started",true);
	Reporter.log("verification_01 started",true);
	String str1="Hi";
	String str2="Hello";
	s.assertEquals(str1, str2);
	//Assert.assertEquals(str1, str2);     using a method to skips bellow part
	Reporter.log("verification_01 completed",true);
	Reporter.log("verification_02 started",true);
	String str3="Hi";
	s.assertEquals(str1, str3);
	//Assert.assertEquals(str1, str2);
	Reporter.log("verification_02 completed",true);
	Reporter.log("Test_01 method execution completed",true);
	s.assertAll();
}
	@Test
public void test_02()
{
	Reporter.log("Test_02 method execution completed",true);	
}
}
