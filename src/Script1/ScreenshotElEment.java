package Script1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotElEment {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver rv =new FirefoxDriver();
	Thread.sleep(3000);
	rv.get("https://demoapps.qspiders.com/");
	WebElement tgt = rv.findElement(By.xpath(".//img[contains(@class,'h-[50vh] w-[90%] filter hue-rotate-[16deg]')]"));
	Thread.sleep(3000);
	File tgt1 = tgt.getScreenshotAs(OutputType.FILE);
	Thread.sleep(3000);
    File f = new File("../asif/ss/img_5.png");
    Thread.sleep(3000);
    FileUtils.copyFile(tgt1, f);
}
}
