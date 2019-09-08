package com.Orange_HRM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Welcom_Logout_close 
{
	public static void main(String[] args) throws Exception 
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
		WebElement text=driver.findElement(By.id("welcome"));
		String Expected_text="Welcome";
		System.out.println("the expected text of the orange hrm loginpage is : "+Expected_text);
		String Actual_text=text.getText();
		System.out.println("the actual text of the orange hrm login page is : "+Actual_text);
		if(Actual_text.contains(Expected_text))
		{
			System.out.println("the text is matched - PASS");
		}
		else{
			System.out.println("the text is not matched - FAIL");
		}
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);//synchronization error explicit wait
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		}
	}
/*some times in any programing language script or code executing the elements on the webpage maynot load very quickly 
and the webdriver will wait for sometime so that the element may get loaded on the webpage and then get automated this
is called Synchronization(a wait time is included)which is explicit wait webdriver will wait for the time given and 
after which it executes the very next line it will applicable for only very next line not rest of the code*/
