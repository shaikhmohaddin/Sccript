package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtub2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		 driver.findElement(By.xpath(".//input[@name='search_query']")).sendKeys("latest song");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath(".//a[@id='video-title']"));
			while (1>0) {
				Thread.sleep(3000);
		List<WebElement> videoname = driver.findElements(By.xpath(".//a[@id='video-title']"));
		Thread.sleep(2000);
	    List<WebElement> views = driver.findElements(By.xpath(".//a[@id='video-title']/ancestor::div[@id='dismissible']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		 List<WebElement> day = driver.findElements(By.xpath(".//a[@id='video-title']/ancestor::div[@id='dismissible']//span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		 Thread.sleep(3000);
		 System.out.println(videoname.size());
		 for (int i = 0; i < 10; i++) {
			 driver.findElement(By.tagName("body")).sendKeys(Keys.END);
			 Thread.sleep(2000);
		}
				Thread.sleep(2000);
		for (int i = 0; i < videoname.size(); i++) {
			 Thread.sleep(3000);
			System.out.println(videoname.get(i).getText() + "-----------" +views.get(i).getText()+ "-----------"+day.get(i).getText()); 
		}
        }
	}

}
