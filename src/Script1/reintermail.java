package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reintermail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("as12@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__"));
	}
}
