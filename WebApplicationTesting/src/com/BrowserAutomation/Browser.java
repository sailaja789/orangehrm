package com.BrowserAutomation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser 
{

	public static void main(String[] args) 
	{
		//Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver",".\\driverFiles\\chromedriver.exe");
		ChromeDriver hello = new ChromeDriver();
		//Automating Firefox Browser
		System.setProperty("webdriver.gecko.driver",".\\driverFiles\\geckodriver.exe");
		FirefoxDriver hi = new FirefoxDriver();
		 //Automating Edge Browser
		System.setProperty("webdriver.edge.driver","c:\\MicrosoftWebDriver.exe");
		EdgeDriver ed = new EdgeDriver();
	}

}
