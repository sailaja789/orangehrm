package com.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailAutomation
{
	WebDriver driver=null;
@BeforeTest
public void setup() throws Exception
{
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://gmail.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
@Test
public void login() throws InterruptedException
{
	driver.findElement(By.id("identifierId")).sendKeys("mv.sailaja666@gmail.com");
	driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("sailajasweety");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=':9l']/div/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=':fi']")).sendKeys("shirishachinthakuntla@gmail.com");
	driver.findElement(By.xpath("//*[@id=':je']")).sendKeys("GmailAutomation");
	driver.findElement(By.xpath("//*[@id=':j4']")).sendKeys("Welcome To Selenium Class");
	driver.findElement(By.xpath("//*[@id=':jo']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='gb_71']")).click();
	Thread.sleep(2000);
}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
