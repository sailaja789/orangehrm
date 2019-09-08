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

public class Excel_Newtours_login_write_validations 
{
    public static void main(String[] args) throws IOException
	{
	  WebDriver driver=null;
	  String url="http://newtours.demoaut.com";
	  System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		FileInputStream file=new FileInputStream("src/com/SingleTestDate/NewToursLogin.xlsx");
		//Identifying the workbook in the above file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//Identifying the particular sheet in the above workbook
		XSSFSheet sheet=workbook.getSheet("sheet1");
		//Identifying a particular row in the sheet
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			if(i!=0 && i<rowcount)
			{
			//Identifying the particular row of a cell
			WebElement userName=driver.findElement(By.name("userName"));
			userName.sendKeys(row.getCell(1).getStringCellValue());
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys(row.getCell(1).getStringCellValue());
			driver.findElement(By.name("login")).click();
			String Expected_url="http://newtours.demoaut.com/mercuryreservation.php";
			System.out.println("the expected title in the login page is : "+ Expected_url);
			String Actual_url=driver.getCurrentUrl();
			System.out.println("the actual title in the login page is : "+Actual_url);
			if(Actual_url.contains(Expected_url))
			{
				System.out.println("login successfull - PASS");
				row.createCell(2).setCellValue("login - PASS");
				driver.findElement(By.linkText("SIGN-OFF")).click();
				
			}
			else
			{
				System.out.println("login failed - FAIL");
				row.createCell(2).setCellValue("login failed - FAIL");
				File bing_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(bing_screenshot,new File("./screenshots/newtours5.png"));
			
			}
			}
			FileOutputStream file1=new FileOutputStream("src/com/SingleTestDate/NewToursLogin.xlsx");
			workbook.write(file1);
		   //driver.quit();
	 
	}
}
}
