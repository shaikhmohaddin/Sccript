package Script1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelementsgogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);  
		driver.get("https://www.google.co.in");
		int count =0;
		List<WebElement> str = driver.findElements(By.tagName("a"));
		
		 for (int i = 0; i < str.size(); i++) {
			 WebElement sr = str.get(i);
			 String link = sr.getText();
			 count++;
			 
			String attr = sr.getAttribute("href");
			System.out.println(attr+link);
			
			
		}
		 System.out.println(count);
		 int visiblelinks=0;
		 int invisiblelinks =0;
		 for (WebElement sr : str) {
			 if (sr.isDisplayed()) {
				 visiblelinks++;
			} else {
				invisiblelinks++;
			}
			
		}
		 System.out.println("Number of visible links=="+visiblelinks);
		 System.out.println("Number of invisible links=="+invisiblelinks);
		 
		
		 
	}
}
