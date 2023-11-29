package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {
	public static void main(String[] args) {
	WebDriver rv = new FirefoxDriver();
	rv.get("file:///D:/html/list.html");
	WebElement str = rv.findElement(By.id("list"));
	Select s = new Select(str);
	boolean value = s.isMultiple();
	if (value) {
		System.out.println("Listbox multi selectable");
	} else {
        System.out.println("Listbox single selectable");
	}
}
}
