package Script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class notificationpopup {
	public static void main(String[] args) {
FirefoxOptions opt=new FirefoxOptions();
opt.addPreference("dom.webnotifications.enabled",false);
WebDriver rv =new FirefoxDriver(opt);
rv.get("http://www.yatra.com");
}
}
