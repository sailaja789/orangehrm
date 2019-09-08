package com.webtablerowofcolumntimeanddate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class OrangeHrm_Login_Employeelist_WebTable 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("sailaja");
		driver.findElement(By.id("txtPassword")).sendKeys("jayaansh");
		driver.findElement(By.id("btnLogin")).click();
		WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions action=new Actions(driver);
		action.moveToElement(PIM).perform();
		/*WebElement addemployee=driver.findElement(By.id("menu_pim_addEmployee"));
		addemployee.click();
		String employeeid= addemployee.getText();
		System.out.println("the employeeid is : "+employeeid);
	    driver.findElement(By.id("btnSave")).click();*/
		driver.findElement(By.linkText("Employee List")).click();
		////*[@id="resultTable"]/tbody
		WebElement EmployeeListElement=driver.findElement(By.xpath("//*[@id='resultTable']/tbody"));
		 String EmployeeList=EmployeeListElement.getText();
		 System.out.println("the employeelist is : "+EmployeeList);
	}

	
	
}
