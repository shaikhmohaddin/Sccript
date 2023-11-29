package Script1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploadPopup {
	public static void main(String[] args) throws AWTException {
		WebDriver rv=new FirefoxDriver();
		rv.get("https://demoapps.qspiders.com/");
		rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rv.findElement(By.xpath(".//section[contains(text(),'Popups')]")).click();
		rv.findElement(By.xpath(".//section[contains(text(),'File Uploads')]")).click();
		WebElement tgt = rv.findElement(By.xpath(".//input[contains(@type,'file')]"));
		String relativpath ="../asif/ss/img8.png";
		File f=new File(relativpath);
		String absolutepath = f.getAbsolutePath();
		System.out.println(absolutepath);
		tgt.sendKeys(absolutepath);
}
}