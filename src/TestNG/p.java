package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class p {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver rs=new FirefoxDriver();
	rs.get("https://testautomationpractice.blogspot.com/");
	rs.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}
}
