package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.xpath("//button[@class='svelte-sfj3o4']"));
		element.click();
		System.out.println(element.isDisplayed());
		element.click();
		System.out.println(element.isDisplayed());
		driver.close();
	}
	
	/ Find the checkbox
    WebElement checkbox = driver.findElement(By.id("checkbox"));
    // Find the toggle button and click it
    driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
    // Check if it is displayed on the page
    System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
    // Click the button again
    driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
    // Check if it is displayed on the page
    System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

}
