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
public class NewtoursLoginTestData extends  BaseTest
{
 @Test(priority=1)
public void setup() throws IOException
{
	FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/NewtousTestData.xlsx");
	//Identifying the workbook in the above file
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	//Identifying the particular sheet in the above workbook
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	//Identifying a particular row in the sheet
	int rowcount=sheet.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
		Row row=sheet.getRow(i);
		if(i!=0 && i<rowcount)
		{
		driver.findElement(By.name("userName")).clear();
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.name("password")).clear();
		WebElement password=driver.findElement(By.name("password"));
		userName.sendKeys(row.getCell(1).getStringCellValue());
		driver.findElement(By.name("login"));
		String Expected_url="http://newtours.demoaut.com/";
		System.out.println("the expected title in the login page is : "+ Expected_url);
		String Actual_url=driver.getCurrentUrl();
		System.out.println("the actual title in the login page is : "+Actual_url);
	if(Actual_url.contains(Expected_url))
	{
		System.out.println("login successfull - PASS");
		row.createCell(0).setCellValue("login - PASS");
				
	}
	else
	{
	    System.out.println("login failed - FAIL");
	}
	
		row.createCell(0).setCellValue("login failed - FAIL");
		File Newtours_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Newtours_screenshot,new File("./screenshots/newtours.png"));
		FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestResult/newtourslogin.xlsx");
		workbook.write(file1);
     }
		
	}
			
   }
}


