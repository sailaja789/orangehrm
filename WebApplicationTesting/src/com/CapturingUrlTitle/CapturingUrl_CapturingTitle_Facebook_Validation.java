package com.CapturingUrlTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_CapturingTitle_Facebook_Validation 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.gecko.driver","./driverFiles/geckodriver.exe" );
		driver=new FirefoxDriver();
		driver.get(url);
		String expected_url="facebook.com";
		System.out.println("the expected url of facebook home page is : "+expected_url);
		String actual_url=driver.getCurrentUrl();
		System.out.println("the actual url of facebook homepage is : "+actual_url);
		if(actual_url.contains(expected_url))
		{
			System.out.println("url matched - Pass");
		}
		else
		{
			System.out.println("url not matched - Fail");
		}
		String expected_Title="Facebook – log in or sign up";
		System.out.println("the expected Title of facebook homepage is : "+expected_Title);
		String actual_Title=driver.getTitle();
		System.out.println("the actual Title of facebook homepage is : "+actual_Title);
		if(actual_Title.equals(expected_Title))
		{
			System.out.println("Title matched - Pass");
		}
		else
		{
			System.out.println("Title not matched - Fail");
		}
		driver.quit();

	}

}
