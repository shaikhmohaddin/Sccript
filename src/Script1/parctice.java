package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parctice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath(".//span[text()='Recruitment']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(.//div[@class='oxd-select-text-input'])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(.//div[@class='oxd-select-wrapper'])[1]")).click();
        		
	}

}
