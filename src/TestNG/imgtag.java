package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class imgtag {
	@DataProvider
public  Object testdata() {
	Object [][] rv=new Object[1][2];
	rv [0][0]="img";
	rv[0][1]="asif";
	return rv;
}
	@Test(dataProvider = "testdata")
	public void test(String str,String str2) {
		SoftAssert s=new SoftAssert();
		WebDriver dr=new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("https://testautomationpractice.blogspot.com/");
		WebElement tagnam = dr.findElement(By.xpath(".//img[contains(@class,'wikipedia-icon')]"));
		String tgt = tagnam.getTagName();
		s.assertEquals(str, tgt);
		s.assertAll();
		
	}
}
