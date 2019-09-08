package com.Orange_HRM_Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_linkcount
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//<input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys("sailaja");
		//<input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("jayaansh");
		//<input name="Submit" class="button hover" id="btnLogin" type="submit" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		int linkscount=Links.size();
		System.out.println("the total no of links in orange hrm login page is : "+linkscount);
		for(int i=0;i<linkscount;i++)//for displaing text contained links
		{
			if(Links.get(i).isDisplayed())
			{	
			String linkName=Links.get(i).getText();
			System.out.println(i+"the linkName is : "+linkName);
		}
			}
		   driver.quit();
		
		}
		
	}
/*output 61 links in orange hrm page but only few of links were displayed instead of all
 * why because selenium cant display the hidden elements but it will possible
 *  when the hidden elements are come on to visible 
 *  isDisplayed method is used to display the links which have the text 
 */


