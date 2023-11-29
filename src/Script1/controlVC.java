package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class controlVC {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		un.sendKeys("asif");
		Thread.sleep(3000);
		un.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		un.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(3000);
		un.sendKeys(Keys.TAB+" "+Keys.CONTROL+"v"); 
		Thread.sleep(3000);
		System.out.println("TASK COMLETED");
	}
}
