package Script1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class js5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv= new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)rv;
		Thread.sleep(4000);
		js.executeScript("window.location='https://www.myntra.com/'");
		Thread.sleep(4000);
		WebElement tgt = rv.findElement(By.xpath("(.//a[contains(text(),'Men')])[1]"));
		Thread.sleep(4000);
		Actions a = new Actions(rv);
		Thread.sleep(4000);
		a.moveToElement(tgt).perform();
		Thread.sleep(6000);
		WebElement tgt1 = rv.findElement(By.xpath("(.//a[contains(text(),'Sweatshirts')])[1]"));
		Thread.sleep(6000);
		js.executeAsyncScript("arguments[0].click()",tgt1);
		Thread.sleep(4000);
		WebElement tgt2 = rv.findElement(By.xpath(".//div[contains(@class,'brand-more')]"));
		Thread.sleep(4000);
		js.executeAsyncScript("arguments[0].click()",tgt2);
	}
}
