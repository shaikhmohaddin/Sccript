package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertpopup {
	public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	rv.get("https://www.abhibus.com/");
	Thread.sleep(3000);
	rv.findElement(By.xpath(".//a[contains(@id,'login-link')]")).click();
	
	
	}

}
