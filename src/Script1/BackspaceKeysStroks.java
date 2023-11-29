package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackspaceKeysStroks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("username"));
		String txt ="Selenium";
		Thread.sleep(3000);
		un.sendKeys(txt);
		Thread.sleep(3000);
		for (int i = 0; i < txt.length(); i++) {
			Thread.sleep(3000);
			un.sendKeys(Keys.BACK_SPACE);
		}
		System.out.println("TASK COMPLETE44.");
	}
}
