package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new FirefoxDriver();
        rv.get("https://demo.actitime.com/login.do");
        rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        rv.findElement(By.id("loginButton")).click();
        String tgt = rv.findElement(By.xpath(".//span[contains(text(),'Username or Password')]")).getText();
	    System.out.println(tgt);
	    
	}
 
}
