package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alinement {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.name("email"));
		Thread.sleep(3000);
		int un_yloc = un.getLocation().getY();
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.name("pass"));
		Thread.sleep(3000);
	    int pass_yloc = pass.getLocation().getY();
	    Thread.sleep(3000);
	    System.out.println(pass_yloc);
	    System.out.println(un_yloc);
	    Thread.sleep(3000);
	    if ((un_yloc +10)<pass_yloc) {
	    	System.out.println("possword field is present below");
			
		} else { 
			System.out.println("possword field is not present below");

		}
		
	}
}
