package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get(" https://training-support.net/webelements/drag-drop");
		System.out.println(driver.getTitle());
		WebElement element1 = driver.findElement(By.xpath("//img[@id='ball']"));
		WebElement element2 = driver.findElement(By.id("dropzone1"));
		builder.dragAndDrop(element1, element2).build().perform();
		System.out.println(driver.findElement(By.id("dropzone1")).getText());
		WebElement element3 = driver.findElement(By.id("dropzone2"));
		builder.dragAndDrop(element1, element3).build().perform();
		System.out.println(driver.findElement(By.id("dropzone2")).getText());
		
		driver.close();
	}

}
