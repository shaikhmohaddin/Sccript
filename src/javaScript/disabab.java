package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class disabab {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	JavascriptExecutor js=(JavascriptExecutor)rv;
	Thread.sleep(3000);
	js.executeScript("window.location='file:///D:/html/disabled.html'");
	Thread.sleep(4000);
	js.executeScript("document.getElementById('username').value=''");
}
}
