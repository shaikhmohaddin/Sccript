package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qspiderLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new FirefoxDriver();
		rv.get("http://demoapps.qspiders.com/");
		Thread.sleep(3000);
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//section[contains(text(),'Link')])")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//a[contains(text(),'Privacy Policy.')])")).click();
		Thread.sleep(3000);
	     WebElement tgt = rv.findElement(By.xpath("(.//button[contains(text(),'Accept Our Policy')])"));
	     Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)rv;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()",tgt);
		Thread.sleep(3000);
	     tgt.click();
	}

}
