package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class paractise1 {
	@DataProvider
	public Object testdata()
	{
		Object[][] rv = new Object[1][2];
		rv[0][0]="img";
		return rv;
	}
	@Test(dataProvider = "testdata")
	public void test(String str) throws InterruptedException
	{
		SoftAssert s=new SoftAssert();
		WebDriver rs=new FirefoxDriver();
		Thread.sleep(3000);
		rs.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		WebElement tgt = rs.findElement(By.xpath(".//img[contains(@class,'wikipedia-icon')]"));
		Thread.sleep(3000);
		String str1 = tgt.getTagName();
		System.out.println(str1);
		Thread.sleep(3000);
		s.assertEquals(str, str1);
		s.assertAll();

		
}
}
