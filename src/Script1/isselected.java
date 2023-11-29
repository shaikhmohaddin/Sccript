package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isselected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement chk = driver.findElement(By.xpath("(.//label[@class='_58mt'])[1]"));
		Thread.sleep(3000);
		chk.click();
		Thread.sleep(3000);
		boolean value = chk.isSelected();
		Thread.sleep(3000);
		System.out.println(value);
		if (value) {
			System.out.println("Checkbox Selected");
		}
		else
		{
			System.out.println("Checkbox not Selected");
		}
		//driver.findElement(By.xpath("(.//label[@class='_58mt'])[2]")).click();
		Thread.sleep(3000);
		//deselect checkbox
		chk.click();
		Thread.sleep(3000);
		//verify checkbox deselected or not
		boolean value01 = chk.isSelected();
		Thread.sleep(3000);
		if (value01) {
			System.out.println("Checkbox not deSelected");
			
		} else {
			System.out.println("Checkbox  deSelected");

		}
	}

}
