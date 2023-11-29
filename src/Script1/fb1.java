package Script1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fb1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("account")).click();
		Thread.sleep(5000);
	      WebElement rv = driver.findElement(By.id("month"));
	      Select s = new Select(rv);
	      List<WebElement> rv1 = s.getOptions();
	      Thread.sleep(3000);
	 String arr[]= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	     ArrayList<String> ref = new ArrayList<>();
	     Thread.sleep(3000);
	      for (int i = 0; i < rv1.size(); i++) {
	    	  Thread.sleep(3000);
	    	 String ss=rv1.get(i).getText();
	    	 Thread.sleep(3000);
	    	 if (arr[i].contains(ss)) {
	    		 System.out.println(ss);
			} else {
                 System.out.println("wrong");
			}
	    	  ref.add(ss);
		}
	      Thread.sleep(3000);
	      Collections.sort(ref);
	      System.out.println(ref);
	}
}
