package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_Basics {


//	FirefoxBinary driverBin = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
//	FirefoxDriver driver = new FirefoxDriver(driverBin,null);
	
//	FirefoxDriver driver = new FirefoxDriver();
	
	//chrome
	//System.setProperty("webdriver.chrome.driver","C:");
//	ChromeDriver cd = new ChromeDriver();
	
	//ie
//	InternetExplorerDriver ieDriver = new InternetExplorerDriver();
/*
	@Test
	public void test(){
//		driver.get("http://www.google.com");
//		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.id("lst-ib"));
//		element.clear();
//		element.sendKeys("Cisco");
//		WebElement element2 = driver.findElement(By.name("btnK"));
//		element2.click();
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://bbc.com");
		System.out.println(driver.getTitle());
		System.out.println();
		
	}//
	*/
	@Test(dataProvider = "getData")
	public void testApp(String browserName,String username, String pass)
	{		
		WebDriver driver = null; 
		if(browserName=="Mozilla")
		{
			driver = new FirefoxDriver();
		}
		else if(browserName == "Chrome")
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Galil1\\Desktop\\eclipse\\tempGit\\selenium-2.48.2\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName == "IE")
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Galil1\\Desktop\\eclipse\\tempGit\\selenium-2.48.2\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		try{
			driver.get("http://gmail.com/");
			System.out.println(driver.getTitle());
		}
		catch(Exception e)
		{
			System.out.println("driver is still null");
			e.setStackTrace(null);
		}
		finally{
			driver.quit();
		}
		
	}// 
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Mozilla";
		data[0][1] = "illa";
		data[0][2] = "fire";
		 
		data[1][0] = "Chrome";
		data[1][1] = "goo";
		data[1][2] = "gle";
		
//		data[2][0] = "IE";
//		data[2][1] = "net";
//		data[2][2] = "explorer";
		
		return data;
	}
}
