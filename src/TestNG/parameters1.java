package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class parameters1 {
@org.testng.annotations.Parameters({"bagname","color"})
@Test
public void test(String bagname,String color)
{
	Reporter.log(color,true);
	Reporter.log(bagname,true); 
}
}
