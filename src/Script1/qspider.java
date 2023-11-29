package Script1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qspider {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver rv=new FirefoxDriver();
		rv.get("http://demoapps.qspiders.com/");
		Thread.sleep(3000);
		//enter username
		WebElement tgt = rv.findElement(By.xpath(".//input[contains(@id,'name')]"));
		tgt.sendKeys("asif");
		Thread.sleep(3000);
		String tgt2 = tgt.getAttribute("value");
		System.out.println(tgt2);
		Thread.sleep(3000);
		//enter emailid
		rv.findElement(By.xpath(".//input[contains(@id,'email')]")).sendKeys("asf60@gmail.com");
		Thread.sleep(3000);
		//enter password
		rv.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys("sss12");
		Thread.sleep(3000);
		//click login
		rv.findElement(By.xpath(".//span[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		//check present value in palaceholder not and check enabled or not
		WebElement email = rv.findElement(By.xpath(".//input[contains(@id,'email')]"));
		email.sendKeys("asf60@gmail.com");
		Thread.sleep(4000);
		String ss1 = email.getAttribute("placeholder");
		System.out.println("placeholder value is="+ss1);
		if (email.isEnabled()) {
			 System.out.println("Enabled");
		} else {
		    System.out.println("disabled");
		}
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//li[contains(@class,'w-[100%] flex justify-between items-center')])[2]")).click();
		Thread.sleep(3000);
		WebElement email2 = rv.findElement(By.xpath(".//input[contains(@id,'email')]"));
		Thread.sleep(000);
		String ss2 = email2.getAttribute("placeholder");
		System.out.println("placeholder value is="+ss2);
		if (email.isEnabled()) {
		    System.out.println("Enabled");
		} else {
			 System.out.println("disabled");
		}
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//p[contains(text(),'Disabled Mode')]")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//li[contains(@class,'w-[100%] flex justify-between items-center')])[1]")).click();
		Thread.sleep(3000);
		WebElement un= rv.findElement(By.xpath("(.//input[contains(@class,'bg-gray-50 border')])[1]"));
		Thread.sleep(3000);
		String ss3= un.getAttribute("placeholder");
		System.out.println("placeholder value is="+ss3);
		Thread.sleep(3000);
		if (email.isEnabled()) {
		    System.out.println("Enabled");
		} else {
			 System.out.println("disabled");
		}
}
}