package com.getAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class New_Register_GetAttribute 
{
   public static void main(String[] args) 
    {
		WebDriver driver=null;
		String url="http://www.newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		/*driver.findElement(By.name("userName")).sendKeys("tutorials");
		driver.findElement(By.name("password")).sendKeys("tutorials");
		driver.findElement(By.name("login")).click();*/
		String Expected_register=register.getAttribute("href");
		System.out.println("the expected register of current webpage is : "+Expected_register);
		register.click();
		String Actual_register=driver.getCurrentUrl();
		System.out.println("the actual register of current web page is : "+Actual_register);
		if(Actual_register.equals(Expected_register))
		{
			System.out.println("the register url is matched - PASS");
		}
		else
		{
			System.out.println("the register url is not matched - FAIL");
		}

	}

}
