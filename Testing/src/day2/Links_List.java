package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Links_List {
	public static void main(String []args)
	{
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://www.youtube.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links " + links.size());
		
	}
}
