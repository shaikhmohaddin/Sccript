package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
public static void main(String[] args) {
	WebDriver rv=new FirefoxDriver();
	rv.get("https://the-internet.herokuapp.com/javascript_alerts");
	rv.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();
	 WebDriverWait wait=new WebDriverWait(rv, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.alertIsPresent());
	 rv.switchTo().alert().accept();
}
}
