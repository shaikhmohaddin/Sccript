package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameto {
	public static void main(String[] args) {
		WebDriver rv=new FirefoxDriver();
		rv.get("https://www.yatra.com/");
		WebDriverWait wait=new WebDriverWait(rv, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("webpush-prompt")));
		rv.findElement(By.id("allow")).click();
	}

}
