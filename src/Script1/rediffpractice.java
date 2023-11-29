package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rediffpractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.rediff.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//a[text()='Create Account']")).click();
		Thread.sleep(5000);
		WebElement un = driver.findElement(By.tagName("input"));
		Thread.sleep(5000);
		un.sendKeys("asi");
		WebElement em = driver.findElement(By.xpath(".//input[starts-with(@name,'login')]"));
		Thread.sleep(3000);
		em.sendKeys("asi@123");
		Thread.sleep(3000);
	    WebElement pwd = driver.findElement(By.id("newpasswd"));
	    pwd.sendKeys("fgf@123");
		pwd.sendKeys((Keys.CONTROL+"a"));
		Thread.sleep(5000);
		pwd.sendKeys((Keys.CONTROL+"c"));
		Thread.sleep(3000);
		pwd.sendKeys((Keys.TAB)+(Keys.CONTROL+"v"));
		Thread.sleep(3000);
	    em.sendKeys((Keys.CONTROL+"a"));
		Thread.sleep(3000);
		 em.sendKeys((Keys.CONTROL+"c"));
		 Thread.sleep(6000);
	    Thread.sleep(3000);
		System.out.println("TASK COMPLETED");
		
		
	}


}
