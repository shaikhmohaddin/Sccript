package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class actitimegetText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[text()='Login ']")).click();
		Thread.sleep(3000);
		WebElement errormsg = driver.findElement(By.xpath(".//span[@class='errormsg']"));
		Thread.sleep(3000);
		if (errormsg.isDisplayed()) {
			System.out.println("error msg is displayed");
			
		} else {
			System.out.println("error msg is not displayed");
		}
		Thread.sleep(3000);
		String errortext = errormsg.getText();
		System.out.println(errortext);
	
	}

}
