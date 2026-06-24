package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.id("checkbox"));
		System.out.println(element.isSelected());
		element.click();
		System.out.println(element.isSelected());
		driver.close();
		
	}

}
