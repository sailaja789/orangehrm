package com.ValidateTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_Bing 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Sailaja/Desktop/testing/WebApplicationTesting/driverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		String expected_BingHomepage="Bing";
		System.out.println("The expected title of big application homepage is : "+expected_BingHomepage);
		String actual_BingHomepage=driver.getTitle();
		System.out.println("The actual title of big application homepage is : "+actual_BingHomepage);
		if(actual_BingHomepage.equals(expected_BingHomepage))
		{
			System.out.println("Title Matched-PASS");
		}
		else
		{
			System.out.println("Title not Matched-FAIL");
		}
		

	}

}
