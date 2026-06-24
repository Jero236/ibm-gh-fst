package FST_SELENIUM;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println("Current Tab :"+driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		System.out.println(driver.getWindowHandles());
		String parentHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/button")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("Currently open windows: " + driver.getWindowHandles());
		
		Set<String> handles = driver.getWindowHandles();
		// Loop through the Set and switch to the window
		// whose handle doesn't match the parentHandle
		for(String handle : handles) {
		    if (handle != parentHandle) {
		        driver.switchTo().window(handle);
		    }
		}
		 
		// Wait for the page to actually load
		//wait.until(ExpectedConditions.titleIs("Newtab"));
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/h1")).getText());
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/h2")).getText());
		
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/button")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("Currently open windows: " + driver.getWindowHandles());
		
		Set<String> handles2 = driver.getWindowHandles();
		// Loop through the Set and switch to the window
		// whose handle doesn't match the parentHandle
		for(String handle : handles2) {
		    if (handle != parentHandle) {
		        driver.switchTo().window(handle);
		    }
		}
		
		//wait.until(ExpectedConditions.titleIs("Newtab"));
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/h1")).getText());
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/h2")).getText());
		
		driver.quit();
	}

}
