package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demopractice {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("asif");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("shaikh");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("9309587794");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass123");
		Thread.sleep(3000);
		driver.findElement(By.id("day")).sendKeys("09");
		Thread.sleep(3000);
		driver.findElement(By.name("birthday_month")).sendKeys("aug");
		Thread.sleep(3000);
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		Thread.sleep(3000);
		driver.findElement(By.className("_58mt")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
		
	}

}
