package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbreinteremail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath(".//div[text()='Surname']/ancestor::div[@id='fullname_field']//input[@name='firstname']"));
		Thread.sleep(2000);
        name.sendKeys("asif");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("shaikh");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("9309587794");
		Thread.sleep(3000);
	}

}
