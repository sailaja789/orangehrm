package com.GetText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_GetText 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String registerElement_text=register.getText();
		System.out.println("the text of Register Element is : "+registerElement_text);
		//driver.quit();

	}

}
