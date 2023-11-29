package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class qspider1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	rv.get("http://demoapps.qspiders.com/");
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//section[contains(text(),'Button')])[1]")).click();
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//button[contains(text(),'Yes')])[1]")).click();
	Thread.sleep(3000);
	WebElement botton = rv.findElement(By.xpath("(.//span[contains(text(),'You selected \"Yes\"')])[1]"));
	if (botton.isDisplayed()) {
	System.out.println("selected botton is visible");
	} else {
		System.out.println("selected botton is not visible");
	}
	rv.findElement(By.xpath("(.//button[contains(text(),'Yes')])[2]")).click();
	Thread.sleep(3000);
	WebElement bottony = rv.findElement(By.xpath("(.//span[contains(text(),'You selected \"Yes\"')])[2]"));
	if (bottony.isDisplayed()) {
		System.out.println("selected botton is visible");
		} else {
			System.out.println("selected botton is not visible");
		}
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//button[contains(text(),'2')])")).click();
	Thread.sleep(3000);
	rv.findElement(By.xpath(".//a[contains(text(),'Right Click')]")).click();
	Thread.sleep(3000);
	Actions a= new Actions(rv);
	Thread.sleep(3000);
	WebElement rightb1 = rv.findElement(By.xpath("(.//button[contains(@class,'relative active:bg-green-400')])[1]"));
	a.contextClick(rightb1).perform();
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//div[contains(text(),'Yes')])")).click();
	Thread.sleep(3000);
	WebElement rightb2 = rv.findElement(By.xpath("(.//button[contains(text(),'Right Click')])[2]"));
	a.contextClick(rightb2).perform();
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//div[contains(text(),'Yes')])")).click();
	Thread.sleep(3000);
	WebElement rightb3 = rv.findElement(By.xpath("(.//button[contains(text(),'Right Click')])[3]"));
	a.contextClick(rightb3).perform();
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//div[contains(text(),'2')])")).click();
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//a[contains(text(),'Double Click')])")).click();
	Thread.sleep(3000);
	WebElement dubleclick = rv.findElement(By.xpath("(.//button[contains(text(),'Yes')])[1]"));
	a.doubleClick(dubleclick).perform();
	Thread.sleep(3000);
	WebElement dubleclick1 = rv.findElement(By.xpath("(.//button[contains(text(),'Yes')])[2]"));
	a.doubleClick(dubleclick1).perform();
	Thread.sleep(3000);
	WebElement dubleclick2 = rv.findElement(By.xpath("(.//button[contains(text(),'1')])"));
	a.doubleClick(dubleclick2).perform();
	Thread.sleep(3000);
	rv.findElement(By.xpath(".//a[text()='Submit Click']")).click();
	Thread.sleep(2000);
	rv.findElement(By.xpath(".//input[@id='sat2']")).click();
	Thread.sleep(2000);
	rv.findElement(By.xpath("(.//button[text()='Submit'])[1]")).submit();
	Thread.sleep(2000);
	rv.findElement(By.xpath(".//input[@id='prob1']")).click();
	Thread.sleep(2000);
	rv.findElement(By.xpath("(.//button[text()='Submit'])[2]")).submit();
	Thread.sleep(2000);
	rv.findElement(By.xpath(".//input[@id='r2']")).click();
	Thread.sleep(2000);
	rv.findElement(By.xpath("(.//button[text()='Submit'])[3]")).submit();
	Thread.sleep(2000);
	rv.findElement(By.xpath(".//a[text()='Disabled']")).click();
	Thread.sleep(2000);
	rv.findElement(By.xpath("(.//button[text()='Yes'])[1]")).click();
	Thread.sleep(2000);
	rv.findElement(By.xpath("(.//button[text()='Yes'])[2]")).click();
	Thread.sleep(2000);
	rv.findElement(By.xpath("(.//button[text()='3'])")).click();
	Thread.sleep(4000);
	rv.findElement(By.xpath(".//input[@type='checkbox']")).click();
	Thread.sleep(3000);
	rv.findElement(By.xpath("(.//button[text()='Submit'])")).submit();
	
	
}
}

