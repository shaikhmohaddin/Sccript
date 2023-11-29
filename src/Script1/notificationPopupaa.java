package Script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class notificationPopupaa {
public static void main(String[] args) {
	ChromeOptions rv=new ChromeOptions();
	rv.addArguments("Incognito");
	rv.addArguments("start-maximized");
	WebDriver rv1 =new ChromeDriver(rv);
	rv1.get("https://www.youtube.com/watch?v=Itntw6h2yEA");
	FirefoxOptions op=new FirefoxOptions();
	op.addPreference("dom.webnotifications.enabled",false);
	WebDriver driver=new FirefoxDriver(op);
	driver.get("https://www.yatra.com/");
}
}
