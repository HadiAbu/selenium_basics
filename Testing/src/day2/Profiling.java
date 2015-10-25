package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile seleniumProfile = prof.getProfile("Selenium"); 
		WebDriver driver = new FirefoxDriver(seleniumProfile);
		
		//close current window
		driver.close();
		//close all windows and selenium session.
		driver.quit();

	}

}
