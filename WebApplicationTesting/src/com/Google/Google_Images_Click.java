package com.Google;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Google_Images_Click 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://google.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//<a class="gb_e" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;ogbl">Images</a>
		driver.findElement(By.linkText("Images")).click();
		System.out.println("the title of images web page is : "+driver.getTitle());
	}

}
