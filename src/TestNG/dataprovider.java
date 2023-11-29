package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dataprovider {
	@DataProvider
public Object testdata()
{
	Object[][] rv = new Object[1][2];
	rv[0][0]="asif@123.com";
	rv[0][1]="asif";
    
	return rv;
}
@Test(dataProvider = "testdata")
public void test(String email,String pwd) throws InterruptedException
{
	SoftAssert s=new SoftAssert();
	WebDriver rs=new FirefoxDriver();
	rs.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(3000);
	WebElement tgt = rs.findElement(By.id("field2"));
	tgt.sendKeys(email);
	Thread.sleep(3000);
	WebElement tgt1 = rs.findElement(By.id("field1"));
	Thread.sleep(3000);
	String str1 = tgt1.getAttribute("value");
	Thread.sleep(3000);
	String str2 = tgt.getAttribute("value");
	Thread.sleep(3000);
	Reporter.log(str2);
	Reporter.log(str1);
	Thread.sleep(3000);
	s.assertEquals(str1, str2);
	s.assertAll();
}
}
  