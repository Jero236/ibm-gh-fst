package FST_SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println(driver.getTitle());
		
		WebElement drop = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[2]/select"));
		Select singleSelect = new Select(drop);
		
		singleSelect.selectByVisibleText("HTML");
		System.out.println("Visible text : " + singleSelect.getFirstSelectedOption().getText());
		
		for(int i=3;i<=6;i++) {
			singleSelect.selectByIndex(i);
		}
		List<WebElement> every = singleSelect.getAllSelectedOptions();
		for(WebElement web : every) {
			System.out.println(web.getText());
		}
		System.out.println();
		singleSelect.selectByValue("nodejs");
		System.out.println();
		
		singleSelect.deselectByIndex(5);
		
		List<WebElement> everyele = singleSelect.getAllSelectedOptions();
		for(WebElement web : everyele) {
			System.out.println(web.getText());
		}
		
		driver.close();
		
	}

}
