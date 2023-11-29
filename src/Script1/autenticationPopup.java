package Script1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autenticationPopup {
	public static void main(String[] args) throws AWTException {
		WebDriver rv=new FirefoxDriver();
		rv.get("https://demoapps.qspiders.com/");
		rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rv.findElement(By.xpath(".//section[contains(text(),'Popups')]")).click();
		rv.findElement(By.xpath(".//section[contains(text(),'Authentication')]")).click();
		rv.findElement(By.xpath(".//a[contains(text(),'Login')]")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
}
}