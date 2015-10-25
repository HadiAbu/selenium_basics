package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Xpath_example {
	public static void main(String[] args)
	{
		
//		WebDriver driver = new FirefoxDriver();
		HtmlUnitDriver uni = new HtmlUnitDriver();
		
		uni.get("https://www.gmail.com/intl/en/mail/help/about.html");
		String text = uni.findElement(By.xpath("html/body/div[3]/div[2]/div[1]/div[1]/ul/li[1]/div/div/div/div/div/h1")).getText();
		System.out.println(text);
		
		/*
		 *    Xpath examples: 
		 *    //*[@id='Email']
		 *    //*[@name='Email']
		 *    //*[@placeholder='enter your Email']
		 *    //*[@id='Email' and @name='Email' and @placeholder='Email']
		 *    //div[@class='banner']/h1
		 *    //div[@class='banner']/div[@class='banner']/h1
		 * 
		 */
	}

}
