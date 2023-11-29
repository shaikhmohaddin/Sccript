package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zingbus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv =new FirefoxDriver();
		Thread.sleep(3000);
		rv.navigate().to("https://www.zingbus.com");
		Thread.sleep(4000);
		WebElement ss = rv.findElement(By.xpath(".//input[@placeholder='From City']"));
	    ss.sendKeys("latur,maharashtra");
	    ss.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		WebElement ss1 = rv.findElement(By.xpath(".//input[@placeholder='To City']"));
		ss1.sendKeys("pune,maharashtra");
		ss1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		rv.findElement(By.xpath(".//input[contains(@class,'DateInput_input')]")).click();
		Thread.sleep(3000);
		String exp_month="December 2023";
		while (true) {
			Thread.sleep(3000);
			String exp_01="(.//div[contains(@class,'CalendarMonthGrid_month')])[2]/div/div/strong";
			Thread.sleep(4000);
			String exp_months1 = rv.findElement(By.xpath(exp_01)).getText();
			if (exp_months1.equals(exp_month)) {
				break;
			} else {
				rv.findElement(By.xpath(".//div[contains(@class,'_rightButton')]")).click();

			}
			Thread.sleep(3000);
			String exp_day= "25";
			String exp_day1="(.//table[contains(@class,'CalendarMonth_table')])[2]//tr/td[text()='25']";
			rv.findElement(By.xpath(exp_day1)).click();
			System.out.println("TASK COMPLETED");
		}
	
	}
}
