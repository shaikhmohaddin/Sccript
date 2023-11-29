package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class js2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv= new FirefoxDriver();
	JavascriptExecutor js=(JavascriptExecutor)rv;
	Thread.sleep(4000);
	js.executeScript("window.location='http://www.facebook.com'");
	Thread.sleep(4000);
	rv.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	js.executeScript("history.go(-1)");
	Thread.sleep(6000);
	js.executeScript("history.go(1)");
	Thread.sleep(6000);
	js.executeScript("history.go(0)");
	Thread.sleep(6000);
	String title = js.executeScript("return document.title").toString();
	Thread.sleep(4000);
	System.out.println("title of webpage"+title);
	Thread.sleep(4000);
	String url= js.executeScript("return document.URL").toString();
	Thread.sleep(4000);
	System.out.println("url of webpage"+url);
	String width= js.executeScript("return window.innerWidth").toString();
	Thread.sleep(4000);
	System.out.println("width of webpage"+width);
	String Height= js.executeScript("return window.innerHeight").toString();
	Thread.sleep(4000);
	System.out.println("Height of webpage"+Height);
	Thread.sleep(4000);
	js.executeScript("document.getElementById(\"username\").value='admin'");
	Thread.sleep(4000);
	js.executeScript("document.getElementsByName(\"pwd\")[0].value='manager'");
	Thread.sleep(4000);
	js.executeScript("document.getElementById('keepLoggedInCheckBox').checked=true");
	Thread.sleep(4000);
	//rv.findElement(By.xpath(".//a[@id='loginButton']")).click();
	WebElement login = rv.findElement(By.xpath(".//a[@id='loginButton']"));
	Thread.sleep(4000);
	js.executeAsyncScript("arguments[0].click()",login);
}
}
