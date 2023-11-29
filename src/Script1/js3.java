package Script1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv= new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)rv;
		Thread.sleep(4000);
		js.executeScript("window.location='https://www.yatra.com/'");
		
	}
}
