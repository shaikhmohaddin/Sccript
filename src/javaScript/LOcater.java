package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Script1.notificationpopup;

public class LOcater {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv= new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)rv;
		Thread.sleep(3000);
		js.executeScript("window.location='https://demo.actitime.com/login.do'");
		Thread.sleep(4000);
		js.executeScript("document.getElementById('username').value='admin'");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		Thread.sleep(3000);
	js.executeScript("document.getElementById('keepLoggedInCheckBox').checked=true");
	Thread.sleep(3000);
	WebElement loginbutton = rv.findElement(By.id("loginButton"));
	Thread.sleep(3000);
	js.executeScript("arguments[0].click()",loginbutton);
	//js.executeScript("document.getElementById('loginButton').click()");
	}

}
