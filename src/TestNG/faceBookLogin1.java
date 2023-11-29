package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class faceBookLogin1 extends baseclass {
@Test
public void testfacebook(){
rv.findElement(By.id("email")).sendKeys("asif123@gmail.com");
rv.findElement(By.id("pass")).sendKeys("asif123");
rv.findElement(By.name("login")).click();
}
}
