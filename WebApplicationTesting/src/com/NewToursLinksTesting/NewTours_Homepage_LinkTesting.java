package com.NewToursLinksTesting;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Homepage_LinkTesting 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("the no of links on the newtours homepage is : "+linkscount);
		for(int i=0;i<linkscount;i++)
		{
		  String linkName=links.get(i).getText();
		  System.out.println(i+"the linkName is"+linkName);
		  links.get(i).click();
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  System.out.println();
		   driver.navigate().back();
		   links=driver.findElements(By.tagName("a"));
		
	     }
	       driver.quit();
      }
}


