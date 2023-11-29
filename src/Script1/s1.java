package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.ForStubValue;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class s1 {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver(); 
	driver.get("http://www.facebook.com");
   driver.findElement(By.id("email")).sendKeys("asif");
   driver.findElement(By.id("pass")).sendKeys("pass123");
   driver.findElement(By.name("login")).click();
}
}
