package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv =new FirefoxDriver();
		Thread.sleep(3000);
		rv.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
        WebElement us = rv.findElement(By.xpath(".//input[@id='username']"));
        us.sendKeys("admin");
        Thread.sleep(2000);
        WebElement pass = rv.findElement(By.xpath(".//input[@type='password']"));
        pass.sendKeys("manager");
        Thread.sleep(2000);
        rv.findElement(By.xpath(".//div[text()='Login ']")).click();
        Thread.sleep(10000);
       rv.findElement(By.xpath(".//div[@id='container_tasks']")).click();
       Thread.sleep(4000);
        List<WebElement> total = rv.findElements(By.xpath(".//div[@class='img']"));
        for (int i = 0; i <1; i++) {
			total.get(i).click();
		}
      
        System.out.println("Total no of checkbox are ="  +total.size());
        Thread.sleep(4000);
        List<WebElement> odd = rv.findElements(By.xpath("(.//div[@class='img'])[position()mod 2=1]"));
        System.out.println("odd no of checkbox are =" + odd.size());
        List<WebElement> even = rv.findElements(By.xpath("(.//div[@class='img'])[position()mod 2=0]"));
        System.out.println("even no of checkbox are =" + even.size());
        //List<WebElement> oddtxt = rv.findElements(By.xpath("(.//div[@class='img'])[position()mod 2=1]/ancestor::tr[@class='taskRow']//div[@class='title']"));
        Thread.sleep(4000);
        for (int i = 0; i <1; i++) {
        	Thread.sleep(4000);

      
		}
	}

}
