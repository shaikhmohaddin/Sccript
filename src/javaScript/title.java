package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class title {
	public static void main(String[] args) throws InterruptedException {
		
WebDriver rv =new FirefoxDriver();
	JavascriptExecutor js=(JavascriptExecutor)rv;
	Thread.sleep(3000);
	js.executeScript("window.location='https://demo.actitime.com/login.do'");
	Thread.sleep(3000);
	String title = js.executeScript("return document.title").toString();
	Thread.sleep(3000);
	System.out.println(title);
	Thread.sleep(3000);
	String url = js.executeScript("return document.URL").toString();
	Thread.sleep(3000);
	System.out.println(url);
	}
}
