package Script1;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("file:///D:/html/table.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[1]//input[1]")).sendKeys("shaikh");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[1]//input[2]")).sendKeys("Asif");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[2]//input[1]")).sendKeys("shaikhasif123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[3]//input[1]")).sendKeys("maharashtra");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Link_1")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Link_5")).click();
		Thread.sleep(3000);
	    driver.close();
		
		}
}
