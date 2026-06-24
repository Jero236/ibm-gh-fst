package FST_SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/popups");
		System.out.println(driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[@id=\"launcher\"]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[@id=\"signInForm\"]/button")).click();
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h1")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h2")).getText());

		driver.quit();
	}

}
