package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rediff {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	Thread.sleep(3000);
	driver.navigate().to("https://www.rediff.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//a[text()='Create Account']"));
	Thread.sleep(5000);
	 WebElement un = driver.findElement(By.tagName("input"));
	 un.sendKeys("asif");
	

	}
}
