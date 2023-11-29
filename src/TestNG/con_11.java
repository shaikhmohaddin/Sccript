package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class con_11 {
	//failed test_01
	@Test
public void test_01()
{
	String str1="Hi";
	String str2="Hello";
	//Assert.assertEquals(str1, str2);
	Assert.assertNotEquals(str1, str2);
	//Assert.assertTrue(true);
	Assert.assertNotNull(str2);
}
	//passed test_02
	@Test
public void test_02()
{
	String str1="Hi";
	String str2="Hi";
	Assert.assertEquals(str1, str2);
}

}
