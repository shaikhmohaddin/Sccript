package QspiderApplication;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver rv=new FirefoxDriver();
	rv.get("http://demoapps.qspiders.com/");
	Thread.sleep(3000);
	TakesScreenshot s=(TakesScreenshot)rv;
	Thread.sleep(3000);
	File tgt = s.getScreenshotAs(OutputType.FILE);
	Thread.sleep(3000);
	String loc="../asif/ss/img_3.png";
	Thread.sleep(3000);
	File f=new File(loc);
	Thread.sleep(3000);
	FileUtils.copyFile(tgt, f);
	}
}
