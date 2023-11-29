package Script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activeElementSwitchTO {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new FirefoxDriver();
		rv.get("http://www.facebook.com");
		Thread.sleep(3000);
		WebElement tgt = rv.switchTo().activeElement();
		Thread.sleep(3000);
		tgt.sendKeys("asif");
		rv.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		rv.switchTo().newWindow(WindowType.WINDOW);
	}

}
