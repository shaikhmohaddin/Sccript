package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class faceBookLogin extends baseclass {
	@Test
	public void testlogin()
	{
		rv.findElement(By.partialLinkText("account")).click();
		rv.findElement(By.name("firstname")).sendKeys("asif");
		rv.findElement(By.name("lastname")).sendKeys("shaikh");
		rv.findElement(By.name("reg_email__")).sendKeys("9309587794");
		rv.findElement(By.name("reg_passwd__")).sendKeys("pass123");
		rv.findElement(By.name("birthday_day")).sendKeys("25");
		rv.findElement(By.id("month")).sendKeys("aug");
		rv.findElement(By.id("year")).sendKeys("1998");
		rv.findElement(By.className("_58mt")).click();
		rv.findElement(By.name("websubmit")).click();
	}

}
