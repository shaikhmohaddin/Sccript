package Script1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationstore {
	public static void main(String[] args) throws InterruptedException {
		WebDriver rv = new FirefoxDriver();
		Thread.sleep(3000);
		rv.get("https://automationteststore.com");
		Thread.sleep(3000);
		WebElement img1 = rv.findElement(By.xpath(".//img[@src='resources/image/18/7a/8.png']"));
		String img2 = img1.getTagName();
		String txt="img";
		Thread.sleep(3000);
		if (txt.equals(img2)) {
			System.out.println("every img using img tagname");
		} else {
			System.out.println("every img not using img tagname");
		}
		List<WebElement> productname = rv.findElements(By.xpath(".//a[@class='prdocutname']"));
		List<WebElement> productprice = rv.findElements(By.xpath(".//a[@class='prdocutname']/ancestor::div[@class='col-md-3 col-sm-6 col-xs-12']//div[@class='price']"));
		List<WebElement> discont = rv.findElements(By.xpath(".//a[@class='prdocutname']/ancestor::div[@class='col-md-3 col-sm-6 col-xs-12']//div[@class='priceold']"));
		for (int i = 0; i <productname.size() ; i++) {
			String productname1 = productname.get(i).getText();
			Thread.sleep(1000);
			String productprice1 = productprice.get(i).getText();
			//String discont1 = discont.get(i).getText();

			System.out.println(productname1+ "----------" + productprice1);
			
		}

	}
}
