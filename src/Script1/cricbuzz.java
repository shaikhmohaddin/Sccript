package Script1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cricbuzz {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//li[@class='cb-view-all-ga cb-match-card cb-bg-white'][3]")).click();
		Thread.sleep(3000);
         driver.findElement(By.xpath(".//a[text()='Scorecard']")).click();	
         Thread.sleep(3000);
          //List<WebElement> pname = driver.findElements(By.xpath(".//a[@class='cb-text-link']"));
         List<WebElement> pname = driver.findElements(By.xpath(".//div[@class='cb-col cb-col-25 ']"));
          Thread.sleep(3000);
          System.out.println(pname.size());
          Thread.sleep(3000);
          List<WebElement> runs = driver.findElements(By.xpath(".//div[@class='cb-col cb-col-25 ']/ancestor::div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']"));
          Thread.sleep(3000);
          int sum =0;
          for (int i = 0; i < 11; i++) {
        	  String pnametext = pname.get(i).getText();
        	  
        	  String runstext = runs.get(i).getText();
        	 int runss = Integer.parseInt(runstext);
        	  System.out.println(pnametext + "-------------" +runstext);
        	  sum=sum + runss;
		}
          WebElement extra = driver.findElement(By.xpath(".//div[text()='Extras']"));
          String extratext = extra.getText();
          WebElement extraruns = driver.findElement(By.xpath("(.//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right'])[1]"));
          String extraruns1 = extraruns.getText();
          int extraruns2 = Integer.parseInt(extraruns1);
          System.out.println(extratext + "---------" + extraruns2);
          int sum2=extraruns2 + sum;
          System.out.println(sum2);
          WebElement totalrun = driver.findElement(By.xpath("(.//div[@class='cb-col cb-col-8 text-bold text-black text-right'])[1]"));
          String totalrun1 = totalrun.getText();
          int totalrun2 = Integer.parseInt(totalrun1);
          if (sum2==totalrun2) {
        	  System.out.println("run of all playyer sum && total runs are same");
		} else {
			System.out.println("run of all playyer sum && total runs are not same");
		}
         }
}
