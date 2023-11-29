package Script1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class abhibuscalender {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.abhibus.com");
		Thread.sleep(3000);		
		WebElement form = driver.findElement(By.xpath("(.//div[@id='search-button']/ancestor::div[@id='search-container']//input[@type='text'])[1]"));
		Thread.sleep(4000);
		form.sendKeys("latur");
		Thread.sleep(3000);
		form.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("(.//div[@id='search-button']/ancestor::div[@id='search-container']//input[@type='text'])[2]"));
		Thread.sleep(4000);
		to.sendKeys("pune");
		Thread.sleep(3000);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[contains(@placeholder,'Onward Journey Date')]")).click();
		Thread.sleep(4000);
		String month="October";
		
		while (true) {
			Thread.sleep(6000);
			String s1="(.//span[contains(@style,'padding:')])[2]";
			Thread.sleep(3000);
			String month2 = driver.findElement(By.xpath(s1)).getText();
			Thread.sleep(5000);
			if (month.equals(month2)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//div[contains(@class,'container date ')]//span[text()='13']")).click();
			     break;
			} else {
				driver.findElement(By.xpath(".//span[contains(@class,'calender-month-change')]")).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//div[contains(@id,'search-button')]")).click();
		Thread.sleep(6000);
		WebElement sort = driver.findElement(By.xpath(".//span[text()='Price']"));
		Thread.sleep(2000);
		sort.click();
		Thread.sleep(3000);
		List<WebElement> busname = driver.findElements(By.xpath(".//h5[@class='title']"));
		Thread.sleep(4000);
		System.out.println(busname.size());
		List<WebElement> time = driver.findElements(By.xpath(".//h5[@class='title']/ancestor::div[@class='container  ']//span[@class='departure-time text-sm']"));
		Thread.sleep(4000);
		List<WebElement> price= driver.findElements(By.xpath(".//h5[@class='title']/ancestor::div[@class='container  ']//strong[@class='h5 fare']"));
		Thread.sleep(4000);
		ArrayList<Integer> ref = new ArrayList<>();
		ArrayList<Integer> ref1 = new ArrayList<>();
		for (int i = 0; i <busname.size(); i++) {
			String busnametext = busname.get(i).getText();
			String timetext = time.get(i).getText();
			String pricetext = price.get(i).getText().replaceAll(",", "");
			int price1 = Integer.parseInt(pricetext);
			System.out.println(busnametext +"----------" + timetext +"-----------" +price1 );
		        ref.add(price1);
		        ref1.add(price1);
		}
		Collections.sort(ref);
		System.out.println(ref);
		System.out.println("================================================================================");
		System.out.println(ref1);
		Thread.sleep(4000);
		if (ref.equals(ref1)) {
			System.out.println("prices are assending order");
		} else {
			System.out.println("prices are not assending order");

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='AC']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[text()='AC']/ancestor::div[@class='container filter-list ']//span[text()='Sleeper']")).click();
		Thread.sleep(2000);
		WebElement acbus = driver.findElement(By.xpath("(.//h5[@class='title']/ancestor::div[@class='container  ']//p[@class='sub-title'])[1]"));
		System.out.println("======================================================================================");
		if (acbus.isDisplayed()) {
			System.out.println("AC BUS DISPLAYED");
		} else {
			System.out.println("AC BUS NOT DISPLAYED");

		}
	}
	}

