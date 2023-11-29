package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class buildAndPauseMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	rv.navigate().to("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
    WebElement us = rv.findElement(By.xpath(".//input[@id='username']"));
    Thread.sleep(3000);
    Actions a=new Actions(rv);
    Thread.sleep(3000);
    a.keyDown(Keys.SHIFT).sendKeys(us, "admin").keyUp(Keys.SHIFT).build().perform();
}
}
