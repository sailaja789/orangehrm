package com.CapturingTitle;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bing_CapturingTitle 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		String bing_Title=driver.getTitle();
		System.out.println("The Title Of Bing Application HomePage is :"+bing_Title);
		driver.close();
		

	}

}
