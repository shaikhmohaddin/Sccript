package Script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yatra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.yatra.com");
		Thread.sleep(3000);
	}

}
