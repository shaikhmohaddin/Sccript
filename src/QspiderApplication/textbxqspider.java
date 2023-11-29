package QspiderApplication;

import java.awt.AWTException;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class textbxqspider {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver rv=new FirefoxDriver();
		rv.get("http://demoapps.qspiders.com/");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//li[contains(text(),'Resizable Text Area')]")).click();
		Thread.sleep(3000);
	    WebElement tgt = rv.findElement(By.xpath(".//textarea[contains(@id,'name')]"));
	    int xloc = tgt.getRect().getX();
	    int yloc = tgt.getRect().getY();
	    int height = tgt.getRect().getHeight();
	    int width = tgt.getRect().getWidth();
	   int x2=xloc+width-5;
	   int y2=yloc+height-8;
	   System.out.println("user name starting height--"+height);
	   Thread.sleep(3000);
	WebElement tgt2 = rv.findElement(By.xpath(".//textarea[contains(@id,'email')]"));
	   Thread.sleep(3000);
	  Actions a=new Actions(rv);
	  Thread.sleep(3000);
	  a.moveByOffset(x2, y2).perform();
	  Thread.sleep(3000);
	  a.clickAndHold().perform();
	  Thread.sleep(3000);
	  a.release(tgt2).perform();
	  Thread.sleep(3000);
	  int height_tgt = tgt.getRect().getHeight();
	  System.out.println("user name chenge height--"+height_tgt);
	  if (height==height_tgt) {
		System.out.println("Not Resizable Text Area");
	} else {
		System.out.println("Resizable Text Area");
	}
}
}