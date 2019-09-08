package com.mouseoperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hellosignin_mousehover 
{
	public static void main(String[] args) 
	{
	    WebDriver driver=null;
		String url="http://amazon.in";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//<span class="nav-line-1">Hello. Sign in</span>
		WebElement HellosingIn=driver.findElement(By.id("nav-link-accountList"));
		Actions action=new Actions(driver);
		action.moveToElement(HellosingIn).perform();
		driver.findElement(By.linkText("Your Wish List")).click();
	}

}
