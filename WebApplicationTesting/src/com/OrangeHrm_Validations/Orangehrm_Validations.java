package com.OrangeHrm_Validations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm_Validations 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("txtUsername")).sendKeys("sailaja");
		driver.findElement(By.name("txtPassword")).sendKeys("jayaansh");
		driver.findElement(By.name("Submit")).click();
		WebElement login=driver.findElement(By.id("wrapper"));
		String Expected_login="OrangeHRM";
		System.out.println("the Expected text is login : "+Expected_login);
		String Actual_login=driver.getTitle();
		System.out.println("the Actual text is login  : "+Actual_login);
		if(Actual_login.equals(Expected_login))
		{
			System.out.println("login is successfull - PASS");
		}
		else
		{
			System.out.println("the text is not successfull - FAIL");
		}
		WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions action=new Actions(driver);
		action.moveToElement(PIM).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		String Expected_webpage=" http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/pim/addEmployee";
		System.out.println("the expected webpage is add emplye webpage : "+Expected_webpage);
		String Actual_webpage=driver.getCurrentUrl();
		System.out.println("the actual webpage is add employee webpage : "+Actual_webpage);
		if(Actual_webpage.contains(Expected_webpage))
		{
			System.out.println("webpage is add employee webpage");
		}
		else{
			System.out.println("webpage is not add employee webpage");
		}
		String first_name = "sailaja";
		String last_name = "marina";
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.sendKeys(first_name);
		WebElement middlename=driver.findElement(By.id("middleName"));
		middlename.sendKeys("venkata");
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.sendKeys(last_name);
		WebElement employeeid=driver.findElement(By.id("employeeId"));
		String expected_emp_id = employeeid.getAttribute("value");
		System.out.println("the employeeid is : "+employeeid);
		driver.findElement(By.id("btnSave")).click();
	    String actual_nextpage=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		System.out.println("expected webpage is navigate to next webpage is : "+actual_nextpage);
		String Actual_Nextwebpge=driver.getCurrentUrl();
		System.out.println("actual webpage is navigated to next webpage is : "+Actual_Nextwebpge);
		if(actual_nextpage.contains(first_name) && actual_nextpage.contains(last_name))
		{
			System.out.println("it navigate to next webpage");
		}
		else
		{
			System.out.println("it is not navigate to next webpage");
		}
		//<input name="firstName" class="formInputText" id="firstName" type="text" maxlength="30">
		String Actual_Name =driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
		String Expected_Name="sailaja";
		if(Actual_Name.equals(Expected_Name))
		{
			System.out.println("both names are equal");
		}
		else
		{
			System.out.println("both names are not equal");
		}
		WebElement empid=driver.findElement(By.id("personal_txtEmployeeId"));
		String Actual_empid=empid.getAttribute("value");
		System.out.println(Actual_empid);
		System.out.println(expected_emp_id);
		if( Actual_empid.equals(expected_emp_id))
		{
			System.out.println("both employee IDs are equal");
		}
		else
		{
			System.out.println("both employee IDs are not equal");
		}
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}

	

//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document