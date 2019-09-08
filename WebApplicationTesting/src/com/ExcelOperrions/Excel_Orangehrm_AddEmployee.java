package com.ExcelOperrions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Excel_Orangehrm_AddEmployee 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = null;
		String url ="https://opensource-demo.orangehrmlive.com";

		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		FileInputStream file=new FileInputStream("src/com/SingleTestDate/Excel_of_orangehrm_addemployee.xlsx");
		    XSSFWorkbook workbook= new XSSFWorkbook(file);
		    XSSFSheet sheet=workbook.getSheet("Sheet1");
		    int rowcount=sheet.getLastRowNum();
		    
		      Row row=sheet.getRow(1);	 
		       WebElement username =driver.findElement(By.id("txtUsername"));
		       username.sendKeys(row.getCell(0).getStringCellValue());
		 
		       WebElement Password= driver.findElement(By.id("txtPassword"));
		       Password.sendKeys(row.getCell(1).getStringCellValue());
		       driver.findElement(By.id("btnLogin")).click();
		       
		      String expected_login="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		       System.out.println("the expected login url is:"+expected_login);
		       String actual_url=driver.getCurrentUrl();
		       
		       if(actual_url.contains(expected_login))
		       {
		       	System.out.println("login is successful-Pass");
		       	row.createCell(2).setCellValue("Pass");
		       }
		       else
		       {
		       	System.out.println("login is Failed-Fail");
		       	row.createCell(2).setCellValue("Fail");
		       
		       }
		       WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		       Actions action=new Actions(driver);
		       action.moveToElement(pim).perform();
		        
		       Thread.sleep(1000);
		     driver.findElement(By.id("menu_pim_addEmployee")).click();;

		    WebElement  firstname= driver.findElement(By.name("firstName"));
		    firstname.sendKeys(row.getCell(3).getStringCellValue());
		    // <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		  WebElement middlename= driver.findElement(By.id("middleName"));
		  middlename.sendKeys(row.getCell(4).getStringCellValue());
		   WebElement lastname= driver.findElement(By.name("lastName"));
		   lastname.sendKeys(row.getCell(5).getStringCellValue());
		   driver.findElement(By.id("btnSave")).click();
		 
		String expected_text="Shirisha";
		 System.out.println("expected text in next webpage:"+expected_text);
		WebElement actual_element=driver.findElement(By.id("employee-details"));
		 String actual_text= actual_element.getText();
		 System.out.println("actual text in next webpage:"+actual_text);
		 
		 
		      if(actual_text.contains(expected_text))
		      {
		   System.out.println("employee name is correct-Pass:");
		   row.createCell(6).setCellValue("pass");
		        }
		      else
		      {
		   	  System.out.println("employee name is not correct-Fail");
		   row.createCell(6).setCellValue("Fail");
		 
		      }
		      FileOutputStream file1=new FileOutputStream("src/com/SingleTestDate/Excel_of_orangehrm_addemployee.xlsx");
		      workbook.write(file1);
		      
		      File Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(Screenshot, new File("./screenshots/AddEmployee1.png"));
		      
		      driver.quit();
		     
		    

		}


	}


