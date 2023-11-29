package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class parametres {
@org.testng.annotations.Parameters({"un","email"})
@Test
public void test(String un,String email)
{
	Reporter.log(un, true);
	Reporter.log(email, true);
}
}
