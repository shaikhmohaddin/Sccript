package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class parameter5 {
@org.testng.annotations.Parameters({"email","pwd"})
@Test
public void fblogin(String email,String pwd)
{
	WebDriver rv=new FirefoxDriver();
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	rv.get("https://www.facebook.com/");
	rv.findElement(By.id("email")).sendKeys(email);
	rv.findElement(By.id("pass")).sendKeys(pwd);
}
}
