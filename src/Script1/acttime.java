package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class acttime {
		public static void main(String[] args) throws InterruptedException {
			WebDriver rv =new FirefoxDriver();
			Thread.sleep(3000);
			rv.navigate().to("https://demo.actitime.com/login.do");
			Thread.sleep(3000);
	        WebElement us = rv.findElement(By.xpath(".//input[@id='username']"));
	        us.sendKeys("admin");
	        Thread.sleep(2000);
	        WebElement pass = rv.findElement(By.xpath(".//input[@type='password']"));
	        pass.sendKeys("manager");
	        Thread.sleep(2000);
	        rv.findElement(By.xpath(".//div[text()='Login ']")).click();
	        Thread.sleep(10000);
	       WebElement rv1 = rv.findElement(By.xpath(".//span[contains(text(),'New')]"));
	        rv1.click();
	        Thread.sleep(8000);
	       rv.findElement(By.xpath("(.//div[contains(@class,'emptySelection')])[2]")).click();
	       Thread.sleep(8000);
	       rv.findElement(By.xpath(".//div[contains(text(),'Big Bang Company')]")).click();
	       Thread.sleep(8000);
	       rv.findElement(By.xpath("(.//div[contains(@class,'emptySelection')])[3]")).click();
	       Thread.sleep(8000);
	       rv.findElement(By.xpath(".//div[contains(text(),'Accounting')]")).click();
	       
		}
}
