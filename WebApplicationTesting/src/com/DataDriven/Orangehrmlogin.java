package com.DataDriven;
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
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Orangehrmlogin extends BaseTest2
{
	@Test(priority=1)
	public Orangehrmlogin() throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/orangehrmlogin.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//Identifying the particular sheet in the above workbook
		XSSFSheet sheet=workbook.getSheet("sheet1");
		//Identifying a particular row in the sheet
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			//Identifying the particular row of a cell
			WebElement userName=driver.findElement(By.id("txtUsername"));
			userName.sendKeys(row.getCell(0).getStringCellValue());
			
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(row.getCell(1).getStringCellValue()); 
			
			WebElement login=driver.findElement(By.id("btnLogin"));
			login.click();
			String Expected_url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/dashboard";
			System.out.println("the expected login url is : "+Expected_url);
			String Actual_url=driver.getCurrentUrl();
			System.out.println("the actual login url is : "+Actual_url);
			
			if(Actual_url.contains(Expected_url))
			{
				System.out.println("login successfull - PASS");
				row.createCell(2).setCellValue("login - PASS");
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Logout")).click();
				
			}
			else
			{
				System.out.println("login failed - FAIL");
				row.createCell(2).setCellValue("login failed - FAIL");
			 //String orangehrmlogin=row.getCell(2).getStringCellValue();
			File orangehrmlogin_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(orangehrmlogin_screenshot,new File("./screenshots/orangehrm.png"));
			}
		}
			FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestDataFiles/orangehrmlogin.xlsx");
			workbook.write(file1);
	
       }

	}