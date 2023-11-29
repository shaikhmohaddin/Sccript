package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alinementcheck {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		//driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.name("username"));
		Thread.sleep(3000);

		int unheight = un.getRect().getHeight();
		int unwidth = un.getRect().getWidth();
		System.out.println("username field height+width ="+(unheight+unwidth));
		Thread.sleep(3000);
		System.out.println("username field height ="+unheight);
		System.out.println("username field width ="+unwidth);
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.name("pwd"));
		Thread.sleep(3000);
		int passheight = pass.getRect().getHeight();
		int passwidth = pass.getRect().getWidth();
		Thread.sleep(3000);
		System.out.println("username field height+width ="+(passheight+passwidth));
		     
	}

}
