package Script1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopups {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
    opt.addArguments("Start-maximized");
    Thread.sleep(3000);
    opt.addArguments("disable-notifications");
    Thread.sleep(3000);
    opt.addArguments("Incognito");
    Thread.sleep(3000);
    WebDriver rv=new ChromeDriver(opt);
    rv.get("http://www.yatra.com");
}
}
