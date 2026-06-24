package FST_SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println(driver.getTitle());
		List<WebElement> col = driver.findElements(By.xpath("//html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th"));
		System.out.println(col.size());
		List<WebElement> row = driver.findElements(By.xpath("//html/body/div/main/div/div/div/div/div[2]/table/tbody/tr"));
		System.out.println(row.size());
		
		
		List<WebElement> data = driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[3]/td"));
		for(WebElement ele : data) {
			System.out.println(ele.getText());
		}
		System.out.println();
		List<WebElement> sec = driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]"));
		for(WebElement ele : sec) {
			System.out.println(ele.getText());
		}
			
		
		
		driver.close();
	}

}
