package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.id("textInput"));
		System.out.println(element.isEnabled());
		driver.findElement(By.xpath("//button[@id='textInputButton']")).click();
		System.out.println(element.isEnabled());
		driver.close();
		
	}

}
