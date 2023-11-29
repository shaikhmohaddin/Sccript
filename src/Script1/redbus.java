package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redbus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new FirefoxDriver();
		Thread.sleep(3000);
		rv.get("https://www.redbus.in");
		Thread.sleep(5000);
		//rv.findElement(By.xpath("(.//li[@id='bus_tickets_vertical'])")).click();
		Thread.sleep(4000);
		rv.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(4000);
		rv.findElement(By.id("dest")).sendKeys("latur");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//div[@class='labelCalendarContainer']")).click();
		Thread.sleep(3000);
	     String mo=".//div[contains(@class,'DayTiles__')]//span[contains(text(),'27')]";
	    rv.findElement(By.xpath(mo)).click();
	    Thread.sleep(3000);
	    rv.findElement(By.xpath(".//button[contains(@id,'search_button')]")).click();
		
		
	}

}
