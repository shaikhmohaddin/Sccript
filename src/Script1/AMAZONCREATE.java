package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.Main;

import io.netty.util.internal.InternalThreadLocalMap;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class AMAZONCREATE {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.findElement(By.partialLinkText("account")).click();
	Thread.sleep(3000);
	//driver.findElement(By.linkText("createAccountSubmit")).click();
	driver.findElement(By.name("customerName")).sendKeys("mohaddin");
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys("9309587794");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("pass12");
	Thread.sleep(3000);
	driver.findElement(By.name("passwordCheck")).sendKeys("pass12");
	Thread.sleep(3000);
	driver.findElement(By.className("a-button-input")).click();
	Thread.sleep(3000);
	System.out.println("TASK COMPLITED");
	driver.close();
}
}
