package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orangetest3 {
public static void main(String[] args)throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(3000);
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement un = driver.findElement(By.xpath(".//input[@name='username']"));
	int unlocx = un.getLocation().getX();
	int unlocy = un.getLocation().getY();
	Thread.sleep(3000);
	WebElement pass = driver.findElement(By.xpath(".//input[@name='password']"));
	int passlocx = pass.getLocation().getX();
	Thread.sleep(3000);
	int passlocy = pass.getLocation().getY();
	System.out.println("x"+unlocy +"y"+passlocy +"y"+unlocx +"X"+passlocx);
	if (unlocy<passlocy && passlocx==unlocx) {
		     System.out.println("possword field is present below");
		
	} else {
               System.out.println("possword field is not present below");
	}
	driver .findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	WebElement errormsg = driver.findElement(By.xpath(".//span[text()='Required']"));
	Thread.sleep(3000);
	if (errormsg.isDisplayed()) {
		System.out.println("error msg is displayed");
	} else {
		System.out.println("error msg is not displayed");
	}
	String size = errormsg.getCssValue("font-size");
	String color = errormsg.getCssValue("color");
	System.out.println("errormsg font size is =" + size);
	System.out.println("errormsg color is =" + color);
	}
}
