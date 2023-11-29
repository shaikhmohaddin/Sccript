package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(4000);
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(6000);
		//driver.findElement(By.xpath(".//button [@class='_2KpZ6l _2doB4z']")).click();
	   WebElement search = driver.findElement(By.xpath(".//input[@name='q']"));
	   Thread.sleep(4000);
	   search.sendKeys("iphone 14");
	   search.sendKeys(Keys.ENTER);
	   //scroll action
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   for (int i = 1; i <=4; i++) {
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		}
	   for (int i = 1; i <=4; i++) {
			js.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(3000);
			}
	   Thread.sleep(3000);
	   //scroll bottom of page
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	   Thread.sleep(3000);
	   //scroll top of Webpage
	   //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");  
	   //js.executeScript("window.scrollBy(0,0)");
	   js.executeScript("window.scrollTo(0,document.body.scrollTop)");  
	}

}
