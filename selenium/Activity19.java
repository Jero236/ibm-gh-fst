package FST_SELENIUM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
		
		driver.close();

	}

}
