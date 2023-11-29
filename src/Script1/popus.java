package Script1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popus {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	rv.get("https://www.abhibus.com/");
	Thread.sleep(3000);
 	rv.findElement(By.xpath(".//span[contains(text(),'Login/SignUp')]")).click();
	Thread.sleep(8000);
	rv.findElement(By.xpath(".//span[contains(text(),'Sign in with google')]")).click();
	Thread.sleep(3000);
	Set<String> windows = rv.getWindowHandles();
	Thread.sleep(3000);
	Iterator<String> windows_opt = windows.iterator();
	Thread.sleep(3000);
	for (int i = 0; i < windows.size(); i++) {
		String str = windows_opt.next();
		WebDriver pag = rv.switchTo().window(str);
		String pagtitle = pag.getTitle();
		System.out.println(pagtitle);
		if (pagtitle.contains("Sign in - Google Accounts")) {
			rv.findElement(By.xpath(".//input[contains(@id,'identifierId')]")).sendKeys("shan600@gmail.com");
			Thread.sleep(3000);
			rv.findElement(By.xpath(".//span[contains(text(),'Next')]")).click();
		} else {
          System.out.println("error");
		}
	}
	
}
}
