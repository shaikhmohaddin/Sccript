package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class tests02 {
	@DataProvider
	public Object invalidlogin()
	{
		Object[][] rv = new Object[1][2];
		rv[0][0]="asif123";
		rv[0][1]="Asif@123";
	    
		return rv;
	}
		@Test(dataProvider = "invalidlogin")
		public void test(String email,String pwd)
		{
		   WebDriver rv=new FirefoxDriver();
		   rv.get("https://www.saucedemo.com/");
		   
		   rv.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(email);
		   rv.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(pwd);
		   rv.findElement(By.xpath(".//input[contains(@id,'login-button')]")).click();
		   WebElement tgt = rv.findElement(By.xpath(".//h3[contains(text(),'Epic sadface:')]"));
		   if (tgt.isDisplayed()) {
			Reporter.log("un and pass is invalid",true);
		} else {
			Reporter.log("un and pass is valid",true);
		}
		}

}


