package Script1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class praScreenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver rv=new FirefoxDriver();
	Thread.sleep(3000);
	rv.get("http://www.google.com");
	Thread.sleep(3000);
	TakesScreenshot s=(TakesScreenshot)rv;
	Thread.sleep(3000);
	File tgt = s.getScreenshotAs(OutputType.FILE);
	Thread.sleep(3000);
	String loc="../asif/ss/img_4.png";
	Thread.sleep(3000);
	File f=new File(loc);
	FileUtils.copyFile(tgt, f);
}
}
