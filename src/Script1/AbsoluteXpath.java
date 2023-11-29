package Script1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver =new FirefoxDriver();
	driver.navigate().to("file:///D:/html/table.html");
	Thread.sleep(3000);
	driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("shaikh");
	Thread.sleep(3000);
	driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("Asif");
	Thread.sleep(3000);
	driver.findElement(By.xpath("./html/body/div[2]/input[1]")).sendKeys("shaikhasif123@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("./html/body/div[3]/input[1]")).sendKeys("maharashtra");
	Thread.sleep(3000);
	driver.findElement(By.xpath("file:///D:/html/Link_3")).click();
	}
}
