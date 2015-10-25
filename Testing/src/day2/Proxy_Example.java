package day2;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Proxy_Example {
	public static void main(String[] args) {
		Proxy p = new Proxy();
		p.setProxyAutoconfigUrl( "http://proxfree.com/proxy/");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.PROXY,p);
		
		WebDriver driver = new FirefoxDriver(cap);
	}
}
