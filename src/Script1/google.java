package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
	public static void main(String[] args) throws InterruptedException{
		WebDriver rv = new FirefoxDriver();
		Thread.sleep(3000);
		rv.get("https://www.google.com/");
		Thread.sleep(3000);
		rv.findElement(By.xpath(".//textarea[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> ss = rv.findElements(By.xpath(".//div[@class='wM6W7d']"));
		System.out.println(ss.size());
		String ss1="maven";
		
		for (int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(i).getText());
			if (ss1.equals(ss.get(i).getText())) {
				System.out.println("selenium maven option present");
				ss.get(i).click();
				break;
			} else {
				System.out.println("");
			}
		
		}
		System.out.println("Task is COMPLETED");
		
	}
}
