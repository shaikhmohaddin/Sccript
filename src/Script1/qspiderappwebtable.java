package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qspiderappwebtable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv= new FirefoxDriver();
		rv.get("http://demoapps.qspiders.com/");
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//section[contains(text(),'Web Table')])")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//a[contains(text(),'Favourite Products')])")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//button[contains(text(),'Add To Favourite')])")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//select)[1]")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//option[text()='Trouser']")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//select)[2]")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//option[text()='2']")).click();
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[contains(@class,'outline transition')])[1]")).sendKeys("5");
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[contains(@class,'outline transition')])[2]")).sendKeys("10%");
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[contains(@class,'outline transition')])[3]")).sendKeys("1000");
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//input[contains(@class,'outline transition')])[4]")).sendKeys("900");
		Thread.sleep(3000);
		rv.findElement(By.xpath("(.//button[contains(text(),'Add')])[2]")).click();
	}

}
