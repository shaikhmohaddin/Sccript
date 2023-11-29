package QspiderApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dragandrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver rv=new FirefoxDriver();
	rv.get("http://demoapps.qspiders.com/");
	Thread.sleep(3000);
	rv.findElement(By.xpath(".//section[contains(text(),'Dropdown')]")).click();
	Thread.sleep(3000);
    WebElement num = rv.findElement(By.xpath("(.//input[contains(@class,'border-0 px-3 py-3 placeholder-')])[2]"));
     num.sendKeys("309587794");
     Thread.sleep(3000);
     WebElement gender = rv.findElement(By.xpath("(.//select)[2]"));
     Thread.sleep(3000);
     Select s=new Select(gender);
     s.selectByIndex(1);
     WebElement tgt = rv.findElement(By.xpath("(.//select)[6]"));
     Thread.sleep(3000);
     Actions a =new Actions(rv);
     a.scrollToElement(tgt);
}
}
