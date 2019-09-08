package com.NavigateToURL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_BingApplication 
{
     public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		ChromeDriver hi=new ChromeDriver();
		hi.get("http://bing.com");
		hi.get("http://facebook.com");
		hi.navigate().to("http://google.com");
		hi.close();
	}

}
