package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if the element is not found. wait maximum 10 seconds.
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
	}

}
