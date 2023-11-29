package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class drag2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv =new FirefoxDriver();
		rv.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		WebElement drag = rv.findElement(By.id("draggable"));
		Thread.sleep(4000);
		WebElement drop = rv.findElement(By.id("droppable"));
		Thread.sleep(4000);
		 Actions a = new Actions(rv);
		 Thread.sleep(3000);
		 //a.dragAndDrop(drag, drop).perform();
		 a.clickAndHold(drag).perform();
		 a.release(drop).perform();
		 Thread.sleep(3000);
         rv.findElement(By.xpath("(.//input[contains(@class,'form-check-input')])[position()>2][4]")).click();
         Thread.sleep(3000);
		 List<WebElement> days = rv.findElements(By.xpath("(.//div[contains(@class,'form-check form-check-inline')])[position()>2]"));
		 Thread.sleep(3000);
		 for (int i = 0; i < days.size(); i++) {
			System.out.println(days.get(i).getText());
		}
		 System.out.println("------------------------------------------------------------");
		 Thread.sleep(3000);
		 WebElement country = rv.findElement(By.id("country"));
		 Thread.sleep(4000);
		 Select s = new Select(country);
		 Thread.sleep(4000);
            s.selectByVisibleText("India");
            List<WebElement> countrynames = s.getOptions();
            Thread.sleep(4000);
            for (int i = 0; i < countrynames.size(); i++) {
				System.out.println(countrynames.get(i).getText());
			}
            Thread.sleep(3000);
            rv.findElement(By.xpath(".//input[contains(@id,'datepicker')]")).click();
            Thread.sleep(3000);
            rv.findElement(By.xpath("(.//table[contains(@class,'ui-datepicker-calendar')])[1]//tr/td[4]")).click();
		
	}

}
