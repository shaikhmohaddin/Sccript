package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input(name='pwd')")).sendKeys("AAA");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("pass123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button(name='login')")).click();
		Actions a=new Actions(driver);
		

}
}
