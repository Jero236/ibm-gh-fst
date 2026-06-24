package FST_SELENIUM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println(driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.xpath("//html/body/div/main/div/div/div/div/section/div[1]/select"));
		Select singleSelect = new Select(dropdown);
		
		singleSelect.selectByVisibleText("Two");
		System.out.println("Second option: " + singleSelect.getFirstSelectedOption().getText());
		
		singleSelect.selectByIndex(3);
		System.out.println("third index : " + singleSelect.getFirstSelectedOption().getText());
		
		singleSelect.selectByValue("four");
		System.out.println("Fourth value : " + singleSelect.getFirstSelectedOption().getText());
		
		System.out.println();
		List<WebElement> allop = singleSelect.getOptions();
		for(WebElement web : allop) {
			System.out.println(web.getText());
		}
		
		driver.close();

	}

}
