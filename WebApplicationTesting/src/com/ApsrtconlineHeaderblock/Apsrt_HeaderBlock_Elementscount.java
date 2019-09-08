package com.ApsrtconlineHeaderblock;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrt_HeaderBlock_Elementscount
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://www.apsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//class="menu-wrap"
		WebElement headerblock=driver.findElement(By.className("menu-wrap"));
		List<WebElement>headerblocklinks=headerblock.findElements(By.tagName("a"));
		int headerblocklinkscount=headerblocklinks.size();
		System.out.println("the total no of links in the links are : "+headerblocklinkscount);
		for(int k=0;k<headerblocklinkscount;k++)
		{
			String headerblocklinkName=headerblocklinks.get(k).getText();
			System.out.println(k+"the headerblocklinkName is : "+headerblocklinkName);
		}
		    driver.quit();

	}

}
