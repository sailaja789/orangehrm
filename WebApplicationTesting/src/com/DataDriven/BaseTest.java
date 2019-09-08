package com.DataDriven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseTest
{
	WebDriver driver=null;
	String url="http://newtours.demoaut.com";
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