package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parctice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.actitime.com/login.do");
	     String logo = driver.findElement(By.xpath(".//div[@class='atLogoImg']")).getTagName();
		Thread.sleep(3000);
		String logo1 = "img";
		if (logo1.equals(logo)) {
			     System.out.println("logo is created using img tag");
			
		} else {
			System.out.println("logo is created using img tag");
		}
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("username"));
		String un1 = un.getAttribute("placeholder");
		if (un1.length()==0) {
			System.out.println("username field not having default text");
		} else {
			System.out.println("username field having default text");
		}
		Thread.sleep(3000);
		String text = un.getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath(".//div[text()='Login ']")).click();
		Thread.sleep(3000);
		WebElement errormsg = driver.findElement(By.xpath(".//span[@class='errormsg']"));
		Thread.sleep(3000);
		if (errormsg.isDisplayed()) {
			System.out.println("error msg is displayed");
			
		} else {
			System.out.println("error msg is not displayed");
		}
		}

}
