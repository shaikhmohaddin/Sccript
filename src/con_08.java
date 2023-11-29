import org.testng.Reporter;
import org.testng.annotations.Test;

public class con_08 {
	@Test(groups = "s1")
	public void test_01()
	{
		Reporter.log("Test_01 method executed",true);
	}
	@Test(groups = "s1")
	public void test_02()
	{
		Reporter.log("Test_02 method executed",true);
	}
	@Test(groups = "s1")
	public void test_03()
	{
		Reporter.log("Test_03 method executed",true);
	}
}
