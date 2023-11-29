package Script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pattrn1 {
	public static void main(String[] args) {
		WebDriver rv = new FirefoxDriver();
	rv.manage().window().minimize();
	rv.manage().window().fullscreen();
	}

}
