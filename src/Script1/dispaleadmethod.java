package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dispaleadmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(5000);
		WebElement em = driver.findElement(By.xpath(".//input[@name='reg_email__']"));
		em.sendKeys("asif@12354");
		Thread.sleep(5000);
		WebElement re_enter = driver.findElement(By.name("reg_email_confirmation__"));
		Thread.sleep(5000);
		if (re_enter.isDisplayed()) {
			System.out.println("displayed");
			
		} else {
                 System.out.println("not displayed");
		}
		Thread.sleep(5000);
		em.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		Thread.sleep(3000);
		
		WebElement re_enter1 = driver.findElement(By.name("reg_email_confirmation__"));
		Thread.sleep(5000);
		if (re_enter1.isDisplayed()) {
			System.out.println("not displayed");
			
		} else {
                 System.out.println("displayed");
		}
	}
}
