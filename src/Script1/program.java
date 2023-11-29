package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program {
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///D:/html/a1.html");
		driver.findElement(By.cssSelector("input[type'text]")).sendKeys("aa");
	}

}
