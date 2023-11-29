package Script1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class authentatinpopup {
public static void main(String[] args) throws AWTException {
	WebDriver rv=new FirefoxDriver();
	rv.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	/*rv.get("https://the-internet.herokuapp.com/basic_auth");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);*/
}
}
