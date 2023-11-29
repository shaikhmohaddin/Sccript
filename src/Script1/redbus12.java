package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redbus12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.redbus.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//li[@id='bus_tickets_vertical'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.id("dest"));
		Thread.sleep(3000);
		to.sendKeys("latur");
		Thread.sleep(3000);
		to.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[text()='18']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[text()='SEARCH BUSES']")).click();
		Thread.sleep(3000);
	     List<WebElement> searchbus = driver.findElements(By.xpath(".//div[@class='travels lh-24 f-bold d-color']"));
	     Thread.sleep(3000);
	    System.out.println(searchbus.size());
	    Thread.sleep(3000);
		for (int i = 0; i <searchbus.size(); i++) {
			WebElement index = searchbus.get(i);
			String bustext = index.getText();
			System.out.println(bustext);
			
		}
	}

}
