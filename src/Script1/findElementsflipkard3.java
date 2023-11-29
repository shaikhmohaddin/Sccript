package Script1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementsflipkard3 {
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
	   System.out.println("Total iphone 14 mobile displayed count =" + iphone14.size());
	   System.out.println("==============================================================");
	   List<WebElement> iphone14_series = driver.findElements(By.xpath(".//div[@class='_4rR01T']"));
	   List<WebElement> iphoneprice = driver.findElements(By.xpath(".//div[@class='_4rR01T']/ancestor::a[@class='_1fQZEK']//div[@class='_30jeq3 _1_WHN1']"));
	   for (int i = 0; i < iphone14.size(); i++) {
		String iphone14text = iphone14.get(i).getText();
		System.out.println( iphone14text);
	}
	   System.out.println("================================================================");
	   System.out.println("Total iphone 14 mobile series displayed count =" +iphone14_series.size());
	   ArrayList<Integer> ref = new ArrayList<>();
	   for (int i = 0; i < iphone14_series.size(); i++) 
	   {
		   String iphone14_seriestext = iphone14_series.get(i).getText();
		   String price1 = iphoneprice.get(i).getText().substring(1).replaceAll(",","");
		   int price=Integer.parseInt(price1);
		   System.out.println(iphone14_seriestext + price1);
		   ref.add(price);
		   
	}
	   System.out.println(ref);
	   System.out.println("====================================================================");
	   Collections.sort(ref);
	   System.out.println(ref);
	   System.out.println("Lowest Iphone 14 mobile price ="+ ref.get(0));
	   System.out.println("Highest Iphone 14 mobile price ="+ ref.get(ref.size()-1));
	   System.out.println("======================================================================");
	   //using set
	   TreeSet<Integer> ref1 = new TreeSet<>();
	   for (int i = 0; i < iphone14_series.size(); i++) 
	   {
		   String iphone14_seriestext = iphone14_series.get(i).getText();
		   String price1 = iphoneprice.get(i).getText().substring(1).replaceAll(",","");
		   int price=Integer.parseInt(price1);
		   ref1.add(price);
		   
	}
	   System.out.println(ref1);
	   System.out.println("Lowest Iphone 14 mobile price ="+ ref1.first());
	   System.out.println("Highest Iphone 14 mobile price ="+ ref1.last());
	   
	}

}
