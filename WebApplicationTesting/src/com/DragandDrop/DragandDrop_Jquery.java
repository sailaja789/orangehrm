package com.DragandDrop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop_Jquery 
{
	public static void main(String[] args) 
	{
		 WebDriver driver=null;
		 String url="http://jqueryui.com/droppable/";
		 System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 WebElement dragElement=driver.findElement(By.id("draggable"));
		 System.out.println("-----Identified Drag me to to my Target Element----");
		 WebElement dropElement=driver.findElement(By.id("droppable"));
		 System.out.println("-----Identified Drop here Element-----");
		 Actions act=new Actions(driver);
		 act.dragAndDrop(dragElement,dropElement).perform();
	}

}
