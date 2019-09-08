package com.KeyBoardOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Facebook_LogInTest 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://facebook.com";
		System.setProperty("webdriver.gecko.driver","./driverfiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mv.sailaja666@gmail.com");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("sailajachowdary").perform();
		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.HOME).perform();
	}
	
}
