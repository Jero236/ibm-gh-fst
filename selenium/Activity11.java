package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println(driver.getTitle());
		builder.sendKeys("I am Beacame Death and Destroyer of World")
		.sendKeys(Keys.RETURN).build().perform();
		
		String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pageText);
        
        driver.close();
	}

}
