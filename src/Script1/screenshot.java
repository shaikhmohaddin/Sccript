package Script1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver rv=new FirefoxDriver();
		Thread.sleep(4000);
		rv.navigate().to("https://www.flipkart.com");
	   Thread.sleep(8000);
	   WebElement img = rv.findElement(By.xpath("(.//div[contains(@class,'_2GaeWJ')])"));
	   Thread.sleep(4000);
	   File str = img.getScreenshotAs(OutputType.FILE);
	   Thread.sleep(4000);
	   String loc="../asif/ss/image02.png";
	   File f=new File(loc);
	   FileUtils.copyFile(str, f);
	}

}
