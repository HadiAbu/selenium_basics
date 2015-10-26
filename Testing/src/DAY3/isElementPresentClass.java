package DAY3;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isElementPresentClass {

	static WebDriver driver = null;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		
		
	}
	public static boolean isElementPresent(String xpath){
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		if(list.size()==0)
			return false;
		else
			return true;
	}
	public static void getResponseCode(String url) throws ClientProtocolException, IOException
	{
		int res_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Response code fort url "+url+" is: "+res_code);
	}
	

}
