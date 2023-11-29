package Script1;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv=new FirefoxDriver();
		Thread.sleep(3000);
		rv.navigate().to("http://www.facebook.com");
		System.out.println(rv.getTitle());
		Thread.sleep(3000);
		WebElement s1 = rv.findElement(By.id("email"));
		int s2 =s1.getRect().getHeight();
		int s3 =s1.getSize().getHeight();
System.out.println(s2+"----"+s3);
	}

}
