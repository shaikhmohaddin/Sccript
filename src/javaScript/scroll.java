package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	Thread.sleep(3000);
	rv.get("http://www.abhibus.com");
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)rv;
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,300)");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0,0)");
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		js.executeScript("window.scrollTop(0,document.body.scrollTop)");
}
}
