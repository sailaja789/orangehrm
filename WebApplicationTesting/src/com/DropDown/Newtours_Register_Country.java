package com.DropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Register_Country 
{
	public static void main(String[] args) 
	{
	  WebDriver driver=null;
	  String url="http://newtours.demoaut.com";
      System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
      driver=new ChromeDriver();
      driver.get(url);
      WebElement register=driver.findElement(By.linkText("REGISTER"));
      register.click();
      WebElement country=driver.findElement(By.name("country"));
      List <WebElement> countries=country.findElements(By.tagName("option"));
      int Countriescount=countries.size();
      System.out.println("the total number of countries are in country drop down "+Countriescount);
      for(int i=0;i<Countriescount;i++)
      {
    	  countries.get(i).click();
    	  if(countries.get(i).isDisplayed())
    	  {
    	  String countryName=countries.get(i).getText();
    	  System.out.println(i+" "+ countryName);
    	  }
      }
      driver.quit();
	}

}
