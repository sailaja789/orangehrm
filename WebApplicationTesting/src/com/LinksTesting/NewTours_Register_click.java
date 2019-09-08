package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_click
{
	public static void main(String args[])
	{
		WebDriver driver=null;
		 String url="http://newtours.demoaut.com";
		 System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 //<a href="mercuryregister.php?osCsid=eeba89217756366166dba0ca517ddb7e">REGISTER</a>
		 //element is type of link
		 driver.findElement(By.linkText("REGISTER")).click();
		
	}

}
