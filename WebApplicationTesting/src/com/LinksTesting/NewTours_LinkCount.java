package com.LinksTesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LinkCount
{
	public static void main (String args[])
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int linkcount=Links.size();
		System.out.println("the total no of links on the webpage is : "+linkcount);
		for(int i=0;i<linkcount;i++)
		{
			String LinkName=Links.get(i).getText();
			System.out.println(i+"the linkName is : "+ LinkName);
		}
		driver.quit();
	}

}
