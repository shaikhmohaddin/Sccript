package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkardTextmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);        
		WebElement img1 = driver.findElement(By.xpath(".//img[@class='_2xm1JU']"));
		Thread.sleep(3000);
		String img2 = img1.getTagName();
		Thread.sleep(3000);
		if (img2.equals("img")) {
			System.out.println("tagname same as="+img2);
		} else {
			System.out.println("tagname not same as="+img2);
		}
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath(".//input[@class='_3704LK']"));
		Thread.sleep(3000);
		String search_field = search.getAttribute("placeholder");
		System.out.println(search_field);
		Thread.sleep(3000);
		if (search.isDisplayed()) {
			System.out.println("search field contain Default value");
			
		} else {
			System.out.println("search field not contain Default value");
		}
		Thread.sleep(3000);
		search.sendKeys("mobile");
		String text = search.getAttribute("value");
		System.out.println(text);
		
	}

}
	