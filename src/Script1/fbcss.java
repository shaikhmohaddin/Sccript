package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbcss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input(type='email')")).sendKeys("AAA");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("pass123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button(name='login')")).click();
	}

}
