package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class usernameandpassSame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		 WebElement un = driver.findElement(By.id("email"));
		 String user="asif";
		 un.sendKeys(user);
		WebElement pass = driver.findElement(By.name("pass"));
		
		String password="asif123";
		pass.sendKeys(password);
		if (user==password) {
			System.out.println("username and pass is same");
			
		} else {
			System.out.println("username and pass is not same");

		}
		
	}
}
