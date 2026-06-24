package FST_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=813766258703&hvpos=&hvnetw=g&hvrand=7711653860139546782&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062044&hvtargid=kwd-10573980&hydadcr=14453_2461882&gad_source=1");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 17 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
		driver.close();
	}
}