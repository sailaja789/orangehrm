package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogInTest 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		//<input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys("tutorial");
		//<input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=1ead38dd5ca057840bc914eaa82963c9" width="58" height="17" alt="Sign-In" border="0">
		driver.findElement(By.name("login")).click();
		String expected_Title="Find";
		System.out.println("The expected Title of successfull login page is : "+expected_Title);
		String actual_Title=driver.getTitle();
		System.out.println("The actual Title of current web page is : "+actual_Title);
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("Login Successfull-PASS");
		}
			else
			{
				
				System.out.println("Login Failed-FAIL");
		    }
		
			driver.close();
		}
		
	}


