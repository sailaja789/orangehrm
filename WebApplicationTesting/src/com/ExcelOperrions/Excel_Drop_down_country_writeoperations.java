package com.ExcelOperrions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class Excel_Drop_down_country_writeoperations
 {
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
			
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		  register.click();
		  
		 FileInputStream file=new FileInputStream("./src/com/SingleTestDate/ExcelDropdown.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		 XSSFSheet sheet=workbook.getSheet("sheet1");
			
		  WebElement country=driver.findElement(By.name("country"));
		  List<WebElement>countries=driver.findElements(By.tagName("option"));
		  
		  int countriescount=countries.size();
		  for(int i=0;i<countriescount;i++)
		  {
			 Row row=sheet.createRow(i);
			 Cell cell=row.createCell(0);
			 String countryName=countries.get(i).getText();
			 System.out.println(i+" "+countryName);
			 cell.setCellValue(countryName);
			}
			FileOutputStream file1=new FileOutputStream(".//src/com/SingleTestDate/ExcelDropdown.xlsx");
			 workbook.write(file1);
 			driver.quit();
         }
     }