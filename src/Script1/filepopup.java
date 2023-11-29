package Script1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filepopup {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver rv=new FirefoxDriver();
	rv.get("file:///D:/html/filepopup.html");
	Thread.sleep(3000);
	//approach-01
	WebElement tgt = rv.findElement(By.id("ele"));
	Thread.sleep(3000);
	String relativepath="../asif/ss/image01.png";
	Thread.sleep(3000);
	File f =new File(relativepath);
	Thread.sleep(3000);
	String absolutepath = f.getAbsolutePath();
	Thread.sleep(3000);
	tgt.sendKeys(absolutepath);
	System.out.println(absolutepath);
	//approach-02
	/*rv.get("https://www.freepdfconvert.com/");
	Thread.sleep(3000);
	rv.findElement(By.xpath(".//a[@class='btn-wrapper upload-btn']")).click();
	Thread.sleep(3000);
	Robot r=new Robot();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_C);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);*/
}
}
