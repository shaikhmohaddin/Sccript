package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1actitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[text()='Login ']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//span[text()='New']" )).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//div[@class='dropdownButton'])[5]" )).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath(".//div[text()='- New Customer -']")).click();
        Thread.sleep(3000);
		
		
	}
}
