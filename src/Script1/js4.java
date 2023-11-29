package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv= new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)rv;
		Thread.sleep(4000);
		js.executeScript("window.location='https://www.saucedemo.com/v1/'");
		Thread.sleep(4000);
		js.executeScript("document.getElementById(\"user-name\").value='standard_user'");
		Thread.sleep(4000);
		js.executeScript("document.getElementById(\"password\").value='secret_sauce'");
		Thread.sleep(4000);
		WebElement tgt = rv.findElement(By.xpath(".//input[@id='login-button']"));
		tgt.click();
		Thread.sleep(4000);
		//js.executeAsyncScript("arguments[0].click()",tgt);
	}
}


