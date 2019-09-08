package com.webtablerowofcolumntimeanddate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_complete_Webtabledata
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock";
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//driver.manage().window().maximize();
		///html/body/div[1]/div[6]/section[1]/div/section
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section"));
		List<WebElement>rows=driver.findElements(By.tagName("tr"));
		    for(int i=0;i<rows.size();i++)
		    {
		List<WebElement>cols=driver.findElements(By.tagName("td"));	
		    for(int j=0;j<cols.size();j++)
		    {
		    	String data=cols.get(j).getText();
		    }
		    System.out.println();
		
	        }
		    driver.quit();
      }
}