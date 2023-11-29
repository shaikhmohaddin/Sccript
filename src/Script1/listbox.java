package Script1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(5000);
		//approach 01----->findElement()
		//click on date listbox
        driver.findElement(By.id("day")).click();
        Thread.sleep(3000);  
        //Selected option
		driver.findElement(By.xpath(".//option[text()='9']")).click();
		Thread.sleep(3000);
		//approach 02----->using keysstrokes
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		month.click();
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		//approach--03 ------>select class
		Thread.sleep(3000);
		WebElement rv = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select s = new Select(rv);
		Thread.sleep(3000);
		s.selectByIndex(9);
		//s.selectByValue("2009");
		//s.selectByVisibleText("1997");
		
		
	}
}
