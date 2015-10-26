package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_List {
	public static void main(String []args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youtube.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links in youtube: " + links.size());
		
		// a reference to 'the best of youtube' box xpath
		WebElement box = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[1]/div[1]/div/div/ul/li[2]/div"));
		List<WebElement> bestLinks = box.findElements(By.tagName("a"));

	}
}
