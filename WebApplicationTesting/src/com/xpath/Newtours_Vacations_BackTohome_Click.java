package com.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours_Vacations_BackTohome_Click
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//<a href="mercuryunderconst.php">Vacations</a>
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		vacations.click();
		//<img src="/images/forms/home.gif" width="118" height="23" border="0">
		//WebElement BackToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		WebElement BackToHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
		BackToHome.click();
	}

}
