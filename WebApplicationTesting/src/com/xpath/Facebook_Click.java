package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Click 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		//x path is based on singla Property
		//WebElement email=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		// xpath is based on multiple properties
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("mv.sailaja666");
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		//WebElement password=driver.findElement(By.xpath("[//inputdata-testid='royal_pass']"));
		WebElement password=driver.findElement(By.xpath("//*[@class='inputtext'and@data-testid='royal_pass']"));
		password.sendKeys("sailajasweety");
	}

}
