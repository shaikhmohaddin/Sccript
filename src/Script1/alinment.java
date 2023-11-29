package Script1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alinment {
	public static void main(String[] args) {
	WebDriver rv=new FirefoxDriver();
	rv.get("https://demoapps.qspiders.com/");
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement tgt = rv.findElement(By.xpath(".//input[contains(@id,'name')]"));
	int tgt2 = tgt.getRect().getHeight();
	int tgt3 = tgt.getRect().getY();
	int space=10;
	WebElement tgt4 = rv.findElement(By.xpath(".//input[contains(@id,'email')]"));
	int tgt5 = tgt4.getRect().getY();
	int total=tgt2+space+tgt3;
	if (total<tgt5) {
		System.out.println("user name field below");
	} else {
		System.out.println("user name field not below");
	}
	}

}
