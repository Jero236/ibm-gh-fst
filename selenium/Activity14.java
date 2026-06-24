package FST_SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println(driver.getTitle());
		List<WebElement> row = driver.findElements(By.xpath("//html/body/div/main/div/div/div/div/div[2]/table/tbody/tr"));
		System.out.println(row.size());
		List<WebElement> col = driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th"));
		System.out.println(col.size());
		
		List<WebElement> fiv = driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]"));
		for(WebElement f : fiv ) {
			System.out.println(f.getText());
		}
		
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th[5]")).click();
		
		List<WebElement> fivagain = driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]"));
		for(WebElement f : fivagain ) {
			System.out.println(f.getText());
		}
		
		driver.close();
	}

}
