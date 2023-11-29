package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlywait {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	rv.navigate().to("https://demo.actitime.com/login.do");
	rv.findElement(By.id("username")).sendKeys("admin");
	rv.findElement(By.xpath(".//input[@type='password']")).sendKeys("manager");
    rv.findElement(By.xpath(".//div[text()='Login ']")).click();
    //verify homepage displayed or not
    WebDriverWait wait=new WebDriverWait(rv, Duration.ofSeconds(30));
   wait.pollingEvery(Duration.ofMillis(250));
    wait.until(ExpectedConditions.titleContains("Time-Track"));
    System.out.println("home page displayed");
    
}
}
