package Script1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class rightsidepresentornot {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	Thread.sleep(3000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("account")).click();
	Thread.sleep(3000);
	WebElement firstN = driver.findElement(By.name("firstname"));
	Thread.sleep(3000);
	int first_xloc = firstN.getRect().getX();
	int first_yloc = firstN.getRect().getY();
	int first_width = firstN.getRect().getWidth();
	int space=2;
	int total =first_xloc+first_width+space;
	Thread.sleep(3000);
	WebElement surname = driver.findElement(By.xpath(".//input[@name='lastname']"));    
	int surname_xloc = surname.getRect().getX();
	int surname_yloc = surname.getRect().getY();
	if (surname_yloc==first_yloc && total<surname_xloc) {
		System.out.println("SurName is present Rightside ");
		
	} else {
		System.out.println("SurName is not present Rightside ");
	}
	
			
			
			
}

}
