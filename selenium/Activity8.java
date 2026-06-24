package FST_SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.xpath("//input[@id='checkbox']"));
		System.out.println("Check Box is displayed :" + element.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.invisibilityOf(element));
		System.out.println("Check Box is displayed :" +element.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		System.out.println("Check Box is displayed :" + element.isDisplayed());
		
		element.click();
		System.out.println("Check Box is selected :" +element.isSelected());
		driver.close();
	}

}
