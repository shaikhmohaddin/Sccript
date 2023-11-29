package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelementsflipkard2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(4000);
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//button [@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
	   WebElement search = driver.findElement(By.xpath(".//input[@name='q']"));
	   Thread.sleep(4000);
	   search.sendKeys("iphone 14");
	   search.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	   List<WebElement> iphone14 = driver.findElements(By.xpath(".//div[contains(text(),'APPLE iPhone 14 (')]"));
	   System.out.println(iphone14.size());
	   for (int i = 0; i < iphone14.size(); i++) {
		WebElement iphone14_count = iphone14.get(i);
		String iphone14text = iphone14_count.getText();
		System.out.println(iphone14text);
	}
	   int highest_price=0;
	   int lowest_price=129999;
	   System.out.println("========================================================");
	   List<WebElement> iphone14_series = driver.findElements(By.xpath(".//div[@class='_4rR01T']"));
	   List<WebElement> iphoneprice = driver.findElements(By.xpath(".//div[@class='_4rR01T']/ancestor::a[@class='_1fQZEK']//div[@class='_30jeq3 _1_WHN1']"));
	   System.out.println(iphone14_series.size());
	   Thread.sleep(3000);
	   for (int i = 0; i < iphone14_series.size(); i++) {
		   WebElement index = iphone14_series.get(i);
		   String iphone14_seriestext = index.getText();
		   WebElement iphone14_price = iphoneprice.get(i);
		   String iphone14_pricetext = iphone14_price.getText();
		   System.out.println(iphone14_seriestext + "=" +iphone14_pricetext);
		   String a = iphone14_pricetext.substring(1);
		   String a2 = a.replace(",", "");
		  int value =Integer.parseInt(a2);
		  if (highest_price <value) {
			  highest_price=value;
		}
		  if (lowest_price>value) {
			  lowest_price=value;
		}
		   
	}
	   System.out.println("=========================================================");
		System.out.println("highest price is =" + highest_price);
		System.out.println("lowest price is =" + lowest_price);
	}

}
