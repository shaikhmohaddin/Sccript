package Script1;

import java.time.Duration;
import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class asif {
public static void main(String[] args) {
	WebDriver rv =new FirefoxDriver();
	rv.get("https://demoapps.qspiders.com/");
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Point tgt = rv.manage().window().getPosition();
	int x = tgt.getX();
	int y = tgt.getY();
    System.out.println(tgt);
}
}