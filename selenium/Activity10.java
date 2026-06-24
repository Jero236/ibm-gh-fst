package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println(driver.getTitle());
		
		Actions builder = new Actions(driver);
		
		WebElement element1  = driver.findElement(By.xpath("//h1[text() = 'Cargo.lock']"));
		WebElement element2  = driver.findElement(By.xpath("//h1[text() = 'Cargo.toml']"));
		WebElement element3  = driver.findElement(By.xpath("//h1[text() = 'src']"));
		WebElement element4  = driver.findElement(By.xpath("//h1[text() = 'target']"));
		
		builder.click(element1).pause(1000).moveToElement(element2).pause(5000)
		.click(element2).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		builder.doubleClick(element3).pause(3000).pause(5000)
        .contextClick(element4).pause(3000).build().perform();
		
		builder.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]")))
		.pause(5000).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
	}

}
