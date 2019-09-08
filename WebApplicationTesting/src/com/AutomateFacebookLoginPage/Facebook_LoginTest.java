package com.AutomateFacebookLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginTest 
{
     public static void main(String[] args) 
	 {
    	 WebDriver driver=null;
    	 String url="http://www.facebook.com";
    	  System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
    	   driver =new ChromeDriver();
    	   driver.get(url);
		driver.findElement(By.id("email")).sendKeys("mv.sailaja666@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sailajachowdary");
		driver.findElement(By.id("loginbutton")).click();
	 }

}
