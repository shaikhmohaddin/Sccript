package Script1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots {
public static void main(String[] args) throws IOException {
	WebDriver rv =new FirefoxDriver();
	rv.get("https://www.google.com/");
	TakesScreenshot s=(TakesScreenshot)rv;
	//takenscreenshots
	 File sr = s.getScreenshotAs(OutputType.FILE);
	 //define loc
	 String loc="../asif/ss/image01.png";
	 File s1=new File(loc);
	 //save file in loc
	 FileUtils.copyFile(sr, s1);
}
}
