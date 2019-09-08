package com.ExcelOperrions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Excel_Orangehrm_addemployee_WriteOperations 
{
	public static void main(String[] args)
	{
		
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("txtUsername")).sendKeys("sailaja");
		driver.findElement(By.name("txtPassword")).sendKeys("jayaansh");
		driver.findElement(By.name("Submit")).click();
		WebElement login=driver.findElement(By.id("wrapper"));
		String Expected_login="OrangeHRM";
		System.out.println("the Expected text is login : "+Expected_login);
		String Actual_login=driver.getTitle();
		System.out.println("the Actual text is login  : "+Actual_login);
		if(Actual_login.equals(Expected_login))
		{
			System.out.println("login is successfull - PASS");
		}
		else
		{
			System.out.println("the text is not successfull - FAIL");
		}
		WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions action=new Actions(driver);
		action.moveToElement(PIM).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		String Expected_webpage=" http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/pim/addEmployee";
		System.out.println("the expected webpage is add emplye webpage : "+Expected_webpage);
		String Actual_webpage=driver.getCurrentUrl();
		System.out.println("the actual webpage is add employee webpage : "+Actual_webpage);
		if(Actual_webpage.contains(Expected_webpage))
		{
			System.out.println("webpage is add employee webpage");
		}
		else{
			System.out.println("webpage is not add employee webpage");
		}

	}

}
