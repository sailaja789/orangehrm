package com.RadioButtons;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class_Group1_RadioButtons
{
	public static void main(String[] args)
	{
		WebDriver driver=null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.gecko.driver","./driverfiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		//<input type="radio" name="group1" value="Milk">
		//<input type="radio" name="group2" value="Water">
WebElement radiobuttonsblock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List<WebElement>group1radiobuttons=radiobuttonsblock.findElements(By.name("group1"));
System.out.println("the total no of radio buttons related to group1 are : "+group1radiobuttons);
for(int i=0;i<group1radiobuttons.size();i++)
{
	group1radiobuttons.get(i).click();
for(int j=0;j<group1radiobuttons.size();j++)
{
	System.out.println(group1radiobuttons.get(j).getAttribute("value")+"-"+group1radiobuttons.get(j).isSelected());
	/*WebElement radiobuttonsblock1=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	List<WebElement>group2radiobuttons=radiobuttonsblock1.findElements(By.name("group2"));
	for(int k=0;k<group2radiobuttons.size();k++)
	{
		group2radiobuttons.get(k).click();
	for(int l=0;l<group2radiobuttons.size();l++)
	{
		System.out.println(group2radiobuttons.get(l).getAttribute("value")+"-"+group2radiobuttons.get(l).isSelected());
	}
		
}*/
	}

}
	}
}	
