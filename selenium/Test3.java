package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(), '#3')]")));
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")));
		
		System.out.println(driver.findElement(By.xpath("//button[contains(text(), 'Purple')]")));
		
		
		driver.close();

	}

}
