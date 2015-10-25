package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLUnitDriver {

	public static void main(String[] args) {
//		HtmlUnitDriver driver = new HtmlUnitDriver();
//		driver.get("http://www.bbc.com");
//		System.out.println(driver.getTitle());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Galil1\\Desktop\\eclipse\\tempGit\\selenium-2.48.2\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
	}

}
