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

public class Excel_Orangehrm_Login_Write_Validations 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		//Automating ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		//maximize the Browser
		driver.manage().window().maximize();
		//login to Orangehrm Application
		//Identifying the file in the System
		FileInputStream file=new FileInputStream("src/com/SingleTestDate/ExcelOrangehrmWriteOperations1.xlsx");
		//Identifying the workbook in the above file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//Identifying the particular sheet in the above workbook
		XSSFSheet sheet=workbook.getSheet("sheet1");
		//Identifying a particular row in the sheetfffff
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			if(i!=0 && i<rowcount)
			{
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
				Thread.sleep(2000);//synchronization error explicit wait
				driver.findElement(By.linkText("Logout")).click();
				
			}
			else
			{
				System.out.println("login failed - FAIL");
				row.createCell(2).setCellValue("login failed - FAIL");
			
		FileOutputStream file1=new FileOutputStream("src/com/SingleTestDate/ExcelOrangehrmWriteOperations1.xlsx");
		workbook.write(file1);
		}
		}
		}
		File bing_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_screenshot,new File("./screenshots/orangehrmlogin.png"));
		
          driver.quit();

	}
}
