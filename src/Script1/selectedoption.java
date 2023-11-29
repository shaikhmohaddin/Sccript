package Script1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectedoption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new FirefoxDriver();
		Thread.sleep(3000);
		rv.get("file:///D:/html/list.html");
		 WebElement s1 = rv.findElement(By.id("list"));
		Thread.sleep(3000);
		Select s2 = new Select(s1);
		Thread.sleep(3000);
		List<WebElement> op = s2.getOptions();
		int total = op.size();
		System.out.println("total option of listbox-------" +total);
		Thread.sleep(2000);
		for (int i = 0; i < total; i++) {
			Thread.sleep(2000);
			System.out.println(op.get(i).getText());
		}
		Thread.sleep(2000);
		for (int i = 0; i < total; i++) {
			Thread.sleep(2000);
			String str = op.get(i).getText();
			if (str.contains("Testing")) {
				s2.selectByIndex(i);
			}
		}
			Thread.sleep(2000);
			List<WebElement> sel = s2.getAllSelectedOptions();
			Thread.sleep(2000);
			System.out.println(sel.size());
			for (int j = 0; j <sel.size() ; j++) {
				System.out.println(sel.get(j).getText());
			}
			s2.deselectAll();
			for (int i = 0; i <total; i+=2) {
				Thread.sleep(2000);
				s2.selectByIndex(i);
			}
			List<WebElement> s5 = s2.getAllSelectedOptions();
			for (int i = 0; i < s5.size(); i++) {
				System.out.println(s5.get(i).getText());
			}
			for (int i = 0; i < s5.size(); i++) {
				String s8 = s5.get(i).getText();
				if (s8.contains("Testing")) {
					s2.deselectByIndex(i);
					
				}
			}
		
	}
}
	