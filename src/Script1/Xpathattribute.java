package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathattribute {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("shaikh");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[@name='pass']")).sendKeys("Asif");
		
	}
}
