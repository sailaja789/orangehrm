package com.DataDriven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest2 
{
	WebDriver driver=null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/dashboard";
@BeforeTest
public void login()
{
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
@AfterTest
public void teaDown()
{
driver.quit();
}
}


