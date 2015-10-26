package DAY3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownSelectOption {

	static WebDriver driver = null;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://qtpselenium.com/home/contact_trainer");
		
		WebElement dropdown = driver.findElement(By.name("country_id"));
		dropdown.sendKeys("Egypt");
		
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		System.out.println("Number of countrys is: "+options.size());
	}

}
