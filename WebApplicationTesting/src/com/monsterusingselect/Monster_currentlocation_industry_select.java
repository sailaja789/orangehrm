package com.monsterusingselect;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Monster_currentlocation_industry_select 
{
public static void main(String[] args) 
{
	WebDriver driver=null;
	String url="https://my.monsterindia.com/sponsered_popup.html";
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	//maximizing the window
	driver.manage().window().maximize();
	//class="border_grey1"
	WebElement currentlocation=driver.findElement(By.className("border_grey1"));
	List<WebElement>currentlocationcityNames=currentlocation.findElements(By.tagName("option"));
	System.out.println("the total no of city names are : "+currentlocationcityNames.size());
	for(int i=0;i<currentlocationcityNames.size();i++)
	{
		System.out.println(currentlocationcityNames.get(i).getText());
	}
	Select selection=new Select(currentlocation);
    selection.selectByVisibleText("Chennai");
	//Selection SelectByIndex(3);
	//Selection SelectByValue("5");
	WebElement industry = driver.findElement(By.id("id_industry"));
	Select selection1=new Select(industry);
	selection1.selectByVisibleText("Banking/Financial Services");
	 selection1.selectByValue("4");
	   /*selection1.deselectByIndex(3);
	   selection1.deselectByValue("64");
	   selection1.deselectByVisibleText("");
	   selection1.deselectByVisibleText("Construction & Engineering");*/
	   selection1.deselectAll();
	     driver.quit();
}

	
}
