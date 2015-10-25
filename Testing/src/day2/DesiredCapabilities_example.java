package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_example {

	public static void main(String[] args) {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "Mozilla");
		cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		
		WebDriver driver = new FirefoxDriver(cap);
		
		driver.quit();
		
	}

}
