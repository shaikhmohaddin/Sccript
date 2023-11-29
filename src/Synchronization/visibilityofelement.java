package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class visibilityofelement {
public static void main(String[] args) {
	WebDriver rv=new FirefoxDriver();
	rv.navigate().to("https://demo.actitime.com/login.do");
	 WebDriverWait wait=new WebDriverWait(rv, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	 WebElement h = rv.findElement(By.id("username"));
	 h.sendKeys("admin");
	 String h1 = h.getAttribute("value");
	 System.out.println(h1);
	 WebElement checkbox = rv.findElement(By.id("keepLoggedInCheckBox"));
	 checkbox.click();
	 wait.until(ExpectedConditions.elementToBeSelected(checkbox));
	 System.out.println("checkbox selected");
	 wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));
	 System.out.println("loginButton enabled");
}
}
