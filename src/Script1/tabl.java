package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tabl {
	public static void main(String[] args) throws InterruptedException{
		WebDriver rv = new FirefoxDriver();
		Thread.sleep(3000);
		rv.get("file:///D:/html/table2.html");
		Thread.sleep(3000);
		List<WebElement> ss = rv.findElements(By.xpath(".//tr"));
		System.out.println(ss.size());
		List<WebElement> ss1 = rv.findElements(By.xpath(".//tr/td[2]"));
		System.out.println(ss1.size());
		List<WebElement> ss12 = rv.findElements(By.xpath(".//tr/td[3]"));
		WebElement ss123 = rv.findElement(By.xpath(".//th[text()=' 4500']"));
		 String s16 = ss123.getText();
		int s25 = Integer.parseInt(s16);
		int sum=0;
		for (int i = 0; i < ss1.size(); i++) {
			String s1 = ss12.get(i).getText();
			int s2 = Integer.parseInt(s1);
			System.out.println(ss1.get(i).getText()+ "-----"+s1);
			sum+=s2;
		}
		if (s25==sum) {
			System.out.println("same");
		} else {
            System.out.println("not same");
		}
	}
}
