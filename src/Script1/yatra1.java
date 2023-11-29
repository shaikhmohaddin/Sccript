package Script1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yatra1 {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.com");
	Thread.sleep(3000);
     driver.findElement(By.xpath(".//input[@name='field-keywords']")).sendKeys("iphone 14");
     Thread.sleep(3000);
     driver.findElement(By.xpath(".//input[@id='nav-search-submit-button']")).click();
     Thread.sleep(3000);
     
     
     
}
}
