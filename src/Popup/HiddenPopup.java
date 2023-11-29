package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Script1.notificationpopup;
import net.bytebuddy.asm.Advice.Enter;

public class HiddenPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new FirefoxDriver();
        rv.get("https://demo.actitime.com/login.do");
        rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        rv.findElement(By.id("loginButton")).click();
        String tgt = rv.findElement(By.xpath(".//span[contains(text(),'Username or Password')]")).getText();
	    System.out.println(tgt);
	}

}
